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

			<div class="row">



				<div class="col-lg-4">
					<div class="mypage-post">


						<h4 class="mypage-process-header">Payment waiting </h4>
						<c:forEach items="${WaitingList}" var="matching_w">
							<div class="mypage-process-body">


								<div class="mypage-process">
									<c:choose>
										<c:when test="${matching_w.rcno eq loginUser.uno }">
											<h5 class="helpee-name-box">${matching_w.seName }</h5>
										</c:when>
										<c:when test="${matching_w.seno eq loginUser.uno }">
											<h5 class="helpee-name-box">${matching_w.rcName }</h5>
										</c:when>
									</c:choose>
									<div class="h-body">
										<c:if test="${matching_w.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_w.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_w.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_w.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>

										<p class="mypage-process-text">
											<c:if test="${matching_w.mservice ==1}">
												<td><a href="#" class="helper-badge mt-2">Moving</a></td>
											</c:if>
											<c:if test="${matching_w.mservice ==2}">
												<td><a href="#" class="helper-badge mt-2">Hospital</a></td>
											</c:if>
											<c:if test="${matching_w.mservice ==3}">
												<td><a href="#" class="helper-badge mt-2">Immigration</a></td>
											</c:if>

										<div class="avDate mt-2">Available date<br> <i class="fas fa-calendar-check"></i>
											${matching_w.mdate}
										</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_w.district }
										</div>
										</p>
										<!-- 이아래문장을 폼으로감싸서 submit하기 -->
										<form action="updateState.do" method="POST">
											<c:if test="${loginUser.uno eq matching_w.eno }">
												<input type="hidden" name="mstate" value="${matching_w.mstate}">
												<input type="hidden" name="mno" value="${matching_w.mno }">
												<input type="hidden" name="uno" value="${sessionScope.userNumber}">
												<input type="hidden" name="money" value="${sessionScope.userMoney }">
												<c:choose>
													<c:when test="${matching_w.mservice == 1}">
														<p><small>Service Charge : 100,000 WON</small></p>
														<input type="hidden" name="serviceCharge" value="100000">
														<c:choose>
															<c:when test="${sessionScope.userMoney < 100000 }">
																<p><small>* Payment is not possible,<br>
																		if the mileage is insufficient.</small></p>
															</c:when>
															<c:otherwise>
																<button type="submit" class="btn service-helper-button">Checkout</button>
															</c:otherwise>
														</c:choose>
													</c:when>
													<c:when test="${matching_w.mservice == 2}">
														<p><small>Service Charge : 50,000 WON</small></p>
														<input type="hidden" name="serviceCharge" value="50000">
														<c:choose>
															<c:when test="${sessionScope.userMoney < 50000 }">
																<p><small>* Payment is not possible,<br>
																		if the mileage is insufficient.</small></p>
															</c:when>
															<c:otherwise>
																<button type="submit" class="btn service-helper-button">Checkout</button>
															</c:otherwise>
														</c:choose>
													</c:when>
													<c:when test="${matching_w.mservice == 3}">
														<p><small>Service Charge : 30,000 WON</small></p>
														<input type="hidden" name="serviceCharge" value="30000">
														<c:choose>
															<c:when test="${sessionScope.userMoney < 30000 }">
																<p><small>* Payment is not possible,<br>
																		if the mileage is insufficient.</small></p>
															</c:when>
															<c:otherwise>
																<button type="submit" class="btn service-helper-button">Checkout</button>
															</c:otherwise>
														</c:choose>
													</c:when>
												</c:choose>
											</c:if>
										</form>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>





				<div class="col-lg-4">
					<div class="mypage-post">
						<h4 class="mypage-process-header">Completed payment</h4>
						<c:forEach items="${PaidList}" var="matching_p">
							<div class="mypage-process-body">
								<div class="mypage-process">
									<c:choose>
										<c:when test="${matching_p.rcno eq loginUser.uno }">
											<h5 class="helper-name-box">${matching_p.seName }</h5>
										</c:when>
										<c:when test="${matching_p.seno eq loginUser.uno }">
											<h5 class="helper-name-box">${matching_p.rcName }</h5>
										</c:when>
									</c:choose>
									<div class="h-body">
										<c:if test="${matching_p.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_p.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_p.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_p.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_p.mservice ==1}">
												<td><a href="#" class="helper-badge mt-2">Moving</a></td>
											</c:if>
											<c:if test="${matching_p.mservice ==2}">
												<td><a href="#" class="helper-badge mt-2">Hospital</a></td>
											</c:if>
											<c:if test="${matching_p.mservice ==3}">
												<td><a href="#" class="helper-badge mt-2">Immigration</a></td>
											</c:if>

										<div class="avDate mt-2">Available date<br> <i class="fas fa-calendar-check"></i>
											${matching_p.mdate}
										</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_p.district }
										</div>
										</p>
										<p><small>After the Available date, <br>you can no longer use the messenger.</small></p>
										<form action="myPageDetailProcess.do" method="get">
											<input type="hidden" name="mno" id="mno" value="${matching_p.mno}">
											<input type="hidden" name="messengerGO" value="GOGO">
											<button href="#" class="btn service-helper-button" type="submit">Messenger</button>
											<!-- 										<a href="myPageDetailProcess.do?mno=${matching_p.mno}" class="btn service-helper-button" onclick="toggleChat()">대화하기</a> -->
										</form>
										<c:if test="${!empty msgCHECK }">
											<input type="hidden" id="msgC" value="${msgCHECK}">
										</c:if>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>



				<div class="col-lg-4">
					<div class="mypage-post">
						<h4 class="mypage-process-header">Completed deal</h4>
						<c:forEach items="${EndedList}" var="matching_e">
							<div class="mypage-process-body">
								<div class="mypage-process">
									<c:choose>
										<c:when test="${matching_e.rcno eq loginUser.uno }">
											<h5 class="helpee-name-box">${matching_e.seName }</h5>
										</c:when>
										<c:when test="${matching_e.seno eq loginUser.uno }">
											<h5 class="helpee-name-box">${matching_e.rcName }</h5>
										</c:when>
									</c:choose>
									<div class="h-body">
										<c:if test="${matching_e.rcno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_e.seno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<c:if test="${matching_e.seno eq loginUser.uno }">
											<img class="profile-img-box" src="https://www.klper.com/images/${matching_e.rcno}.png"
												onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
										</c:if>
										<p class="mypage-process-text">
											<c:if test="${matching_e.mservice ==1}">
												<td><a href="#" class="helper-badge mt-2">Moving</a></td>
											</c:if>
											<c:if test="${matching_e.mservice ==2}">
												<td><a href="#" class="helper-badge mt-2">Hospital</a></td>
											</c:if>
											<c:if test="${matching_e.mservice ==3}">
												<td><a href="#" class="helper-badge mt-2">Immigration</a></td>
											</c:if>

										<div class="avDate mt-2">Available date <br><i class="fas fa-calendar-check"></i>
											${matching_e.mdate}
										</div>
										<div class="area mt-2">
											Placed in <br><i class="fas fa-map-marker-alt"></i> ${matching_e.district }
										</div>
										</p>

										<c:choose>
											<c:when test="${matching_e.seno == loginUser.uno }">
												<c:if test="${matching_e.eno == loginUser.uno }">
													<button class="btn service-helper-button" data-toggle="modal" data-target="#reviewModalr">To
														write
														a review</button>
												</c:if>
												<c:if test="${matching_e.rno == loginUser.uno }">
													<button class="btn service-helper-button" data-toggle="modal" data-target="#reviewModale">To
														write
														a review</button>
												</c:if>
											</c:when>
											<c:otherwise>
												<button class="btn service-helper-button">Waiting to write a review</button>
											</c:otherwise>
										</c:choose>
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
</div>



<!-- Additional Review Modal HELPEEE-->
<div class="modal fade" id="reviewModale" tabindex="-1" role="dialog" aria-labelledby="reviewModalLabel"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modalLabel">Reivew</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<div class="modal-body">
				<form class="review-form" action="insertE_Review.do" method="POST">
					<input type="hidden" name="rno" class="form-control" value="${sessionScope.userNumber}" />
					<div class="form-group">
						<label for="reviewScore">REVIEW POINT</label> <select name="escore" class="form-control" required>
							<option value="5">5</option>
							<option value="4">4</option>
							<option value="3">3</option>
							<option value="2">2</option>
							<option value="1">1</option>
						</select>
					</div>
					<div class="form-group">
						<label for="detailReview">Review your match</label>
						<textarea name="ecomment" class="form-control" rows="3"></textarea>
					</div>

					<button type="submit" class="btn service-helpee-button">Submit
						your review!</button>
				</form>
			</div>
		</div>
	</div>
</div>


<!-- Additional Review Modal HELPER-->
<div class="modal fade" id="reviewModalr" tabindex="-1" role="dialog" aria-labelledby="reviewModalLabel"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modalLabel">Reivew</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<div class="modal-body">
				<form class="review-form" action="r_review.do" method="POST">

					<div class="form-group">
						<label for="reviewScore">REVIEW POINT</label>
						<select name="rscore" class="form-control" required>
							<option value="5">5</option>
							<option value="4">4</option>
							<option value="3">3</option>
							<option value="2">2</option>
							<option value="1">1</option>
						</select>
					</div>
					<input type="hidden" name="eno" class="form-control" value="${sessionScope.userNumber}" />
					<div class="form-group">
						<label for="detailReview">Review your match</label>
						<textarea name="rcomment" class="form-control" rows="3"></textarea>
					</div>

					<button type="submit" class="btn service-helper-button">Submit
						your review!</button>
				</form>

			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	window.onload = function () {
		var check = $("#msgC").val();
		if (check != null) {
			addChat();
		}
	}
</script>

<%@ include file="Footer.jsp"%>