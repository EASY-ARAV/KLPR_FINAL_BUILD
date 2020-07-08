<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 본문 -->


<div class="jumbotron jumbotron-fluid helpee-jumbotron">
	<div class="container jt-text">
		<h1 class="display-4 ">I need your help!</h1>
		<p class="lead">Contact helpee to send help!</p>
		<div class="row float-right jt-btn m-1">
			<div class="dropdown">
				<button class="btn helpee-button dropdown-toggle" type="button" id="dropdownAddr" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false">I'm near..</button>
				<div class="dropdown-menu" aria-labelledby="dropdownAddr">
					<c:forEach items="${seoulList}" var="seoul">
						<button class="dropdown-item" onclick='location.href="seoulHelpeeList.do?dno=${seoul.dno}";'
							type="button">${seoul.district}</button>
					</c:forEach>
				</div>
			</div>
			<div class="btn-group" role="group" aria-label="SortBtn">
				<button type="button" class="btn  helpee-button btn-sm" onclick="fn_helpeeList()">Newest</button>
				<button type="button" class="btn  helpee-button btn-sm" onclick="fn_score()">Review Rating</button>
			</div>
		</div>
	</div>
</div>

<div class="container helpeeBoard">
	<div class="row">
		<div class="col-md-2 order-1 order-md-1 p-0 ">
			<div class="d-flex flex-column">
				<div class="btn-group-vertical d-none d-md-block service-tag-box">
					<button type="button" onclick="fn_helpeeList()" class="btn service-helpee-button">All</button>
					<button type="button" onclick="fn_moving()" class="btn service-helpee-button">Moving</button>
					<button type="button" onclick="javascript:fn_hospital()" class="btn service-helpee-button">Hospital</button>
					<button type="button" onclick="javascript:fn_immigration()"
						class="btn service-helpee-button">Immigration</button>
				</div>
				<div class="btn-group d-md-none mobile-service-tag-box">
					<button type="button" onclick="fn_helpeeList()" class="btn helpee-button">All</button>
					<button type="button" onclick="fn_moving()" class="btn helpee-button">Moving</button>
					<button type="button" onclick="javascript:fn_hospital()" class="btn helpee-button">Hospital</button>
					<button type="button" onclick="javascript:fn_immigration()" class="btn helpee-button">Immigration</button>
				</div>
				<c:if test="${!empty sessionScope.userName }">
					<button type="button" class="btn  helpee-button-main d-none d-md-block"
						onclick="location.href='helpeeWriteForm.do'">Pleas help
						me!</button>
				</c:if>


			</div>
			<c:if test="${!empty sessionScope.userName }">
				<button type="button" class="btn  helpee-button-main mobile-write-btn d-md-none"
					onclick="location.href='helpeeWriteForm.do'">
					<i class="fas fa-plus"></i>
				</button>
			</c:if>
		</div>



		<div class="col-md-10 order-2 order-md-2">

			<c:forEach items="${helpeeList}" var="helpee">

				<div class="row media helpeePost profile-box-container ml-md-1 read-more-wrap">
					<div class="col-md-3 order-1 order-md-1 d-flex justify-content-center">

						<img class="profile-img-box" src="https://www.klper.com/images/${helpee.uno}.png"
							onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
						<!-- <img class="profile-img-box"
                        src="http://localhost:9000/images/${helpee.uno}.png" 
                        onerror="javascript:src='http://localhost:9000/images/0.png'"
                         alt="profileImage">  -->
					</div>
					<div class="col-md-9 order-2 order-md-2">
						<div class="media-body">


							<div class="d-flex justify-content-between">


								<div class="sevice-tag-badge">
									<c:if test="${helpee.moving==1}">
										<span class="helpee-badge">Moving</span>
									</c:if>
									<c:if test="${helpee.hospital==1}">
										<span class="helpee-badge">Hospital</span>
									</c:if>
									<c:if test="${helpee.immigration==1}">
										<span class="helpee-badge">Immigration</span>
									</c:if>
								</div>
								<div class="edit-button float-right">
									<c:if test="${helpee.uno == sessionScope.userNumber}">
										<form class="d-inline" action="helpeeDelete.do" method="POST">
											<input name="eno" type="hidden" value="${helpee.eno}" />
											<button type="submit" class="btn helpee-badge">Delete</button>
										</form>
										<form class="d-inline" action="helpeeUpdate.do" method="GET">
											<input name="eno" type="hidden" value="${helpee.eno}" />
											<button type="submit" class="btn helpee-badge">Update</button>
										</form>

									</c:if>
								</div>
							</div>

							<div class="row profile-box-header d-flex justify-content-between">
								<div class="col-6 ">
									<h3 class="helpee-name-box">${helpee.name}</h3>
								</div>
								<div class="col-6 d-flex flex-row-reverse">

									<h5 class="star-rating">
										${helpee.avg}
									</h5>
								</div>
							</div>
							<div class="row profile-box-body">
								<div class="col-sm-6 order-2 order-sm-1 p-0">
									<div class="lang mt-2">Available language<br> <i class="fas fa-language"></i> ${helpee.language}</div>

									<div class="reviewNum mt-2">
										Total review<br>
										<i class="fas fa-th-list"></i></i> ${helpee.cnt}
									</div>
								</div>
								<div class="col-sm-6 order-1 order-sm-2 p-0">
									<div class="avDate mt-2">Available date <br><i class="fas fa-calendar-check"></i> ${helpee.edate}
									</div>
									<div class="area mt-2">
										Placed in <br><i class="fas fa-map-marker-alt"></i> ${helpee.district}
									</div>
								</div>
							</div>
							<div class="self-desc">
								<br>
								${helpee.e_intro}
								<br>
								<div class="d-flex justify-content-center">


									<label class="read-more-trigger">Read more</label>


								</div>

								<div class="read-more-target">
									<div class="boardReview">
										<ul class="list-group">
											<li class="list-group-item">Review</li>
											<c:set var="loop_index" value="1" />
											<c:forEach items="${e_reviewList}" var="e_review" varStatus="status">
												<c:if test="${e_review.eno eq helpee.uno}">
													<c:if test="${loop_index < 6}">

														<li class="list-group-item">
															${e_review.ecomment} <span class="float-right star-rating">
																${e_review.escore}.0</span>
														</li>
														<c:set var="loop_index" value="${loop_index + 1 }" />
													</c:if>
												</c:if>
											</c:forEach>
										</ul>
									</div>

									<!-- 여기 매칭임 다시 해보기 -->
									<div class="d-flex justify-content-center">
										<c:if test="${!empty sessionScope.userName }">
											<c:choose>
												<c:when test="${sessionScope.userNumber == helpee.uno }">
													<p><small><br>* You cannot send requests to yourself.</small></p>
												</c:when>
												<c:otherwise>
													<form class="d-inline" action="helpeeRequest.do" method="GET">
														<input name="eno" type="hidden" value="${helpee.eno}" />
														<button type="submit" class="btn  helpee-button-main">
															Send request</button>
													</form>
												</c:otherwise>
											</c:choose>
										</c:if>
									</div>
								</div>
							</div>

						</div>

					</div>

				</div>
			</c:forEach>




			<!--PAGING -->
			<div class="paging">
				<c:if test="${PaginationVO.curPage ne 1 }">
					<div class="paging-icon" onClick="PageMove(1)"><i class="fas fa-angle-double-left"></i></div>
				</c:if>
				<c:if test="${PaginationVO.curPage ne 1}">
					<div class="paging-icon" onClick="PageMove('${PaginationVO.prevPage }')"><i class="fas fa-angle-left"></i>
					</div>
				</c:if>
				<c:forEach var="pageNum" begin="${PaginationVO.startPage }" end="${PaginationVO.endPage }">
					<c:choose>
						<c:when test="${pageNum eq PaginationVO.curPage}">
							<div class="paging-icon" onClick="PageMove('${pageNum }')">${pageNum }</div>
						</c:when>
						<c:otherwise>
							<div class="paging-icon" onClick="PageMove('${pageNum }')">${pageNum }</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${PaginationVO.curPage ne PaginationVO.endPage && PaginationVO.curPage > 0}">
					<div class="paging-icon" onClick="PageMove('${PaginationVO.nextPage }')"><i class="fas fa-angle-right"></i>
					</div>
				</c:if>
				<c:if test="${PaginationVO.curPage ne PaginationVO.totalPage && PaginationVO.curPage > 0}">
					<div class="paging-icon" onClick="PageMove('${PaginationVO.totalPage }')"><i
							class="fas fa-angle-double-right"></i></div>
				</c:if>
			</div>




		</div>
	</div>
</div>




<script>
	function PageMove(curPage) {

		if (sessionStorage.getItem("service") === null) {
			window.sessionStorage.setItem("service", "0");
		}

		if (sessionStorage.getItem("service") === "0") {
			location.href = "getHelpeeList.do?curPage=" + curPage;
		} else if (sessionStorage.getItem("service") === "1") {
			location.href = "moveHelpee.do?curPage=" + curPage;
		} else if (sessionStorage.getItem("service") === "2") {
			location.href = "hospitalHelpee.do?curPage=" + curPage;
		} else if (sessionStorage.getItem("service") === "3") {
			location.href = "immigrationHelpee.do?curPage=" + curPage;
		} else if (sessionStorage.getItem("service") === "4") {
			location.href = "scoreHelpeeList.do?curPage=" + curPage;
		} else if (sessionStorage.getItem("service") === "5") {
			location.href = "seoulHelpeeList.do?curPage=" + curPage;
		}
	}

	function fn_helpeeList() {
		//alert("getHelpeeList");		
		sessionStorage.setItem("service", 0);
		//alert(sessionStorage.getItem("service"));		
		location.href = "getHelpeeList.do";
	}
	function fn_moving() {
		//alert("moving");				
		sessionStorage.setItem("service", 1);
		location.href = "moveHelpee.do";
	}
	function fn_hospital() {
		//alert("hospital");		
		sessionStorage.setItem("service", 2);
		location.href = "hospitalHelpee.do"
	}
	function fn_immigration() {
		//alert("immigration");	
		sessionStorage.setItem("service", 3);
		location.href = "immigrationHelpee.do"
	}
	function fn_score() {
		//alert("score");				
		sessionStorage.setItem("service", 4);
		location.href = "scoreHelpeeList.do";
	}
	function fn_seoul() {
		sessionStorage.setItem("service", 5);
		location.href = "seoulHelpeeList.do";
	}

</script>


<%@ include file="Footer.jsp"%>