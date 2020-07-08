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
						<h4 class="mypage-process-header">Sent Request</h4>
						<c:forEach items="${SendedRequestList}" var="matching_s">
							<div class="mypage-process-body">





								<div class="mypage-process">
									<h6 class="helpee-name-box">
										<c:if test="${loginUser.name eq matching_s.seName }">
											<h5 class="helpee-name-box">${matching_s.rcName}</h5>
										</c:if>
										<c:if test="${loginUser.name eq matching_s.rcName }">
											<h5 class="helpee-name-box">${matching_s.seName}</h5>
										</c:if>
									</h6>
									<div class="h-body">
										<c:if test="${matching_s.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_s.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_s.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_s.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_s.mservice ==1}">
												<td><a href="#" class="helpee-badge mt-2">Moving</a></td>
											</c:if>
											<c:if test="${matching_s.mservice ==2}">
												<td><a href="#" class="helpee-badge mt-2">Hospital</a></td>
											</c:if>
											<c:if test="${matching_s.mservice ==3}">
												<td><a href="#" class="helpee-badge mt-2">Immigration</a></td>
											</c:if>

										<div class="avDate mt-2">Available date <br><i class="fas fa-calendar-check"></i>
											${matching_s.mdate}</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_s.district }
										</div>
										</p>
										<div class="mypage-button-box">
											<a href="#" class="btn service-helpee-button">
												Awaiting Confirm

											</a>
											<form action="cancelRequest.do" method="post">
												<input type="hidden" name="mno" value="${matching_s.mno}">
												<button type="submit" class="btn service-helper-button mt-1">
													Cancel Request
												</button>
											</form>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>


				<div class="col-md-6">
					<div class="mypage-post">
						<h4 class="mypage-process-header">Incoming Request</h4>
						<c:forEach items="${ReceivedRequestList}" var="matching_r">
							<div class="mypage-process-body">
								<div class="mypage-process">
									<h6 class="helper-name-box">
										<c:if test="${loginUser.name eq matching_r.seName }">
											<h5 class="helper-name-box">
												${matching_r.rcName }
											</h5>
										</c:if>
										<c:if test="${loginUser.name eq matching_r.rcName }">
											<h5 class="helper-name-box">
												${matching_r.seName }
											</h5>
										</c:if>
									</h6>
									<div class="h-body">
										<c:if test="${matching_r.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_r.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_r.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_r.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_r.mservice ==1}">
												<td><a href="#" class="helper-badge mt-2">Moving</a></td>
											</c:if>
											<c:if test="${matching_r.mservice ==2}">
												<td><a href="#" class="helper-badge mt-2">Hospital</a></td>
											</c:if>
											<c:if test="${matching_r.mservice ==3}">
												<td><a href="#" class="helper-badge mt-2">Immigration</a></td>
											</c:if>

										<div class="avDate mt-2">Available date <br><i class="fas fa-calendar-check"></i>
											${matching_r.mdate}
										</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_r.district }
										</div>
										</p>

										<div class="mypage-button-box">
											<form action="updateState.do" method="POST">
												<input type="hidden" name="mstate" value="${matching_r.mstate}">
												<input type="hidden" name="mno" value="${matching_r.mno }">
												<button type="submit" class="btn service-helper-button ">Confirm offer</button>
											</form>
											<form action="rejectRequest.do" method="post">
												<input type="hidden" name="mno" value="${matching_r.mno}">
												<button type="submit" class="btn service-helper-button mt-1">
													Reject
												</button>
											</form>
										</div>


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