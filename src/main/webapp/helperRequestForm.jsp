<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>
    <!-- 본문 -->


<div class="mypage-navbar"></div>
    <div class="container">
        <div class="row writeForm ">
            <div class="col-md-3 order-1 order-md-1 d-flex justify-content-center">
                 <img class="profile-img-box" src="https://www.klper.com/images/${helper.uno }.png"
                        onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
            </div>
            <div class="col-md-9 order-2 order-md-2">
                <div class="media-body">
                    <div class="row">
                        <div class="col-md-6">
                            <h3 class="name-box">${helper.name}&nbsp;</h3>
                        </div>
                        <div class="col-md-6 d-flex flex-row-reverse">
                             ${sessionScope.userGender}&nbsp;
                        </div>
                    </div>
                    <div class="writeFormContainer">
                        <div>
                           ${sessionScope.userPhone}&nbsp;
                        </div>
                        
                    </div>
                    <form autocomplete="off" class="helper-write-form"  action="sendRequest.do" method="post">
                        <div class="row">
                            <div class="col-md-6 my-1">
                            <input name="seno" type="hidden" value="${sessionScope.userNumber }"/>
                            <input name="rcno" type="hidden" value="${helper.uno}"/>
                            <input name="rno" type="hidden" value="${helper.uno}"/>
                            <input name="eno" type="hidden" value="${sessionScope.userNumber}"/> 
                            <input name="mplace" type="hidden" value="${helper.dno }"/>
                            <input name="mdate" type="hidden" id="date-result-start" value="${helper.sta}"/>
                            <input type="text" id="datepicker1" class="form-control"
                                    placeholder="Select within ${helper.sta} ~ ${helper.end} " autocomplete="off">
                            </div>
                            <div class="col-md-6 my-1">
                                <select class="custom-select" disabled="disabled" name="lno" value="${helper.lno}">
                                    <option selected>Choose your language</option>
                               		<c:forEach items="${languageList}" var="language">
                                    <option value="${language.lno}"
											<c:if test="${helper.lno eq language.lno}">selected</c:if>>${language.language}</option>
									</c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 my-1">
                                <input class="custom-select" name="rplace" value="${helper.district}" disabled="disabled">
                            </div>
                            <div class="col-md-6 my-1">

                                    <select class="custom-select" name="mservice">
                                       <c:choose> 
                                       <c:when test="${helper.moving eq 1 }">
                                       		<c:choose>
                                       			<c:when test="${helper.hospital eq 0}">
                                       				<c:if test="${helper.immigration eq 0}">
                                       				<option value="1" selected>moving</option>
                                       				</c:if>
                                       				<c:if test="${helper.immigration eq 1}">
                                       					<option value="1">moving</option>
                                  						<option value="3">immigration</option>
                                       				</c:if>
                                       			</c:when>
                                       		<c:when test="${helper.hospital eq 1}">
                                       			<c:if test="${helper.immigration eq 0}">
                                       					<option value="1">moving</option>
                                       					<option value="2">hospital</option>
                                       			</c:if>
                                       			<c:if test="${helper.immigration eq 1}">
                                       				<option value="1">moving</option>
                                   					<option value="2">hospital</option>
                                   					<option value="3">immigration</option>
                                       			</c:if>
                                       		</c:when>
                                       	</c:choose>
                                       </c:when>
									   
									   <c:when test="${helper.moving eq 0 && helper.hospital eq 1}">
									   		<c:if test="${helper.immigration eq 0}">
									   		<option value="2" selected>hospital</option>
									   		</c:if>
									   		<c:if test="${helper.immigration eq 1}">
									   			<option value="2">hospital</option>
							   					<option value="3">immigration</option>
									   		</c:if>
									   </c:when>
									   
									   <c:otherwise>
									   		<option value="3" selected>immigration</option>
									   </c:otherwise>                                       
                                       </c:choose>
                                    </select>
                            </div>
                        </div>
                        <div class="form-group my-3">
                            <label for="detailReview">Additional Infomation</label>
                            <textarea id="detailReview" name="r_intro" class="form-control form-control-write"
                                rows="5" value="${helper.r_intro}" disabled="disabled">${helper.r_intro}</textarea>
                        </div>
                        <p><small>* If you do not choose one of the dates posted by the helper, it is automatically requested as the start date.</small></p>
                        <button type="submit" class="btn btn-primary helper-button-main">Submit!</button>
                    </form>
                </div>

            </div>

        </div>
    </div>

<%@ include file="Footer.jsp"%>

<script>
var staEndPicker = new Lightpick({
	  field: document.getElementById('datepicker1'),
	  singleDate: true,
	  selectForward: true,
	  onSelect: function (start, end) {
	    var str = '';
	    str += start ? start.format('YYYY-MM-DD') + '' : '';
	    document.getElementById('date-result-start').innerHTML = str;
	    document.getElementById('date-result-start').value = str;
	  }
	});
</script>