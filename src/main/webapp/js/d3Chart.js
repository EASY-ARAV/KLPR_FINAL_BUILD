initMap(456, 300, "seoul-helpee", "seoul_municipalities_topo_simple.json", "seoul_helpee.csv", "circle1");
initMap(456, 300, "seoul-helper", "seoul_municipalities_topo_simple.json", "seoul_helper.csv", "circle2");

function initMap(width, height, chartId, mapJson, bubbleCsv, bubble) {

  var svg = d3.select("#" + chartId).append("svg")
    .attr("width", width)
    .attr("height", height)
    .attr("align", "center");

  var map = svg.append("g").attr("id", chartId + "-map"),
    places = svg.append("g").attr("id", chartId + "-places");

  var projection = d3.geo.mercator()
    .center([126.9895, 37.5651])
    .scale(48000)
    .translate([width / 2, height / 2]);

  var path = d3.geo.path().projection(projection);

  d3.json(mapJson, function (error, data) {
    var features = topojson.feature(data, data.objects.seoul_municipalities_geo).features;
    map.selectAll('path')
      .data(features)
      .enter().append('path')
      .attr('class', function (d) { console.log(); return 'municipality c' + d.properties.code })
      .attr('d', path);

    map.selectAll('text')
      .data(features)
      .enter().append("text")
      .attr("transform", function (d) { return "translate(" + path.centroid(d) + ")"; })
      .attr("dy", ".35em")
      .attr("class", "municipality-label")
      .text(function (d) { return d.properties.name_eng; })
  });

  d3.csv(bubbleCsv, function (data) {
    places.selectAll("id" + bubble)
      .data(data)
      .enter().append("circle")
      .attr("cx", function (d) { return projection([d.lon, d.lat])[0]; })
      .attr("cy", function (d) { return projection([d.lon, d.lat])[1]; })
      .attr("r", function (d) { if (d.size != null) return d.size });

    places.selectAll("text")
      .data(data)
      .enter().append("text")
      .attr("x", function (d) { return projection([d.lon, d.lat])[0]; })
      .attr("y", function (d) { return projection([d.lon, d.lat])[1] + 8; })
      .text(function (d) { if (d.size != 0) return d.size });
  });
}