<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>
<!-- 본문 -->
<div class="mypage-navbar"></div>
<div class="mypage-board container">
	<div class="row">

		<div class="col-md-3 order-1 order-md-1">

			<div class="d-flex flex-column">
				<div class="btn-group-vertical mypage-menu d-none d-md-block">
					<button type="button" class="btn mypage-button" onclick="location.href='myPage.do'">My
						page</button>
					<button type="button" class="btn mypage-button" onclick="location.href='incomingRequest.do'">View
						all requests</button>
					<button type="button" class="btn mypage-button" onclick="location.href='myPageDetailProcess.do'">Pending
						requests</button>
					<button type="button" class="btn mypage-button" onclick="location.href='matchHistory.do'">History</button>
					<button type="button" class="btn mypage-button" onclick="location.href='myInfoEdit.do'">Edit my info</button>
				</div>


				<div class="btn-group mypage-menu d-md-none pr-1">
					<button type="button" class="btn mypage-button" onclick="location.href='myPage.do'">My
						page</button>
					<button type="button" class="btn mypage-button"
						onclick="location.href='incomingRequest.do'">Req-uests</button>
					<button type="button" class="btn mypage-button"
						onclick="location.href='myPageDetailProcess.do'">Pend-ing</button>
					<button type="button" class="btn mypage-button" onclick="location.href='matchHistory.do'">Hi-story</button>
					<button type="button" class="btn mypage-button" onclick="location.href='myInfoEdit.do'">Edit Info</button>
				</div>

			</div>
		</div>

		<div class="col-md-9 order-2 order-md-2">
			<div class="row ml-md-1">
				<div class="col-md-6">
					<div class="mypage-post">
						<h4 class="mypage-process-header">Matching History</h4>
						<c:forEach items="${CompletedList}" var="matching_c">
							<div class="mypage-process-body">
								<div class="mypage-process">
									<div>
										<!--if문 처리해서 헬퍼거래면 헬버버튼 헬피로 거래면 헬피버튼-->
										<c:if test="${matching_c.eno == sessionScope.userNumber }">
											<span class="helper-badge">
												HELPER
											</span>
										</c:if>
										<c:if test="${matching_c.rno == sessionScope.userNumber }">
											<span class="helpee-badge">
												HELPEE
											</span>
										</c:if>
									</div>

									<c:choose>
										<c:when test="${matching_c.rno eq loginUser.uno }">
											<h3 class="helpee-name-box">${matching_c.ename }</h3>
										</c:when>
										<c:when test="${matching_c.eno eq loginUser.uno }">
											<h3 class="helper-name-box">${matching_c.rname }</h3>
										</c:when>
									</c:choose>



									<div class="h-body">
										<c:if test="${matching_c.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_c.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_c.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_c.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_c.mservice==1}">
												<span class="helper-badge mt-2">Moving</span>
											</c:if>
											<c:if test="${matching_c.mservice==2}">
												<span class="helper-badge mt-2">Hospital</span>
											</c:if>
											<c:if test="${matching_c.mservice==3}">
												<span class="helper-badge mt-2">Immigration</span>
											</c:if>
										<div class="avDate mt-2">Date <br><i class="fas fa-calendar-check"></i> ${matching_c.mdate}</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_c.district }
										</div>
										</p>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>


				<div class="col-md-6">
					<div class="mypage-post">
						<h4 class="mypage-process-header">Reject History</h4>
						<c:forEach items="${RejectedList}" var="matching_rj">
							<div class="mypage-process-body">
								<div class="mypage-process">
									<div>
										<!--if문 처리해서 헬퍼거래면 헬버버튼 헬피로 거래면 헬피버튼-->
										<c:if test="${matching_rj.eno == sessionScope.userNumber }">
											<span class="helper-badge">
												HELPER
											</span>
										</c:if>
										<c:if test="${matching_rj.rno == sessionScope.userNumber }">
											<span class="helpee-badge">
												HELPEE
											</span>
										</c:if>
									</div>

									<c:choose>
										<c:when test="${matching_rj.rno eq loginUser.uno }">
											<h3 class="helpee-name-box">${matching_rj.ename }</h3>
										</c:when>
										<c:when test="${matching_rj.eno eq loginUser.uno }">
											<h3 class="helper-name-box">${matching_rj.rname }</h3>
										</c:when>
									</c:choose>



									<div class="h-body">
										<c:if test="${matching_rj.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_rj.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_rj.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_rj.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_rj.mservice==1}">
												<span class="helper-badge mt-2">Moving</span>
											</c:if>
											<c:if test="${matching_rj.mservice==2}">
												<span class="helper-badge mt-2">Hospital</span>
											</c:if>
											<c:if test="${matching_rj.mservice==3}">
												<span class="helper-badge mt-2">Immigration</span>
											</c:if>
										<div class="avDate mt-2">Date <br><i class="fas fa-calendar-check"></i>${matching_rj.mdate}</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_rj.district }
										</div>
										</p>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>





			</div>
		</div>
	</div>
</div>



<%@ include file="Footer.jsp"%>