</div>


<!--AUTH MODAL-->
<!--LOGIN-->
<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modalLabel">Login</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<div class="modal-body">
				<form class="login-form" action="login" method="post">
					<div class="form-group">
						<label for="inputEmail">Email address</label>
						<input id="inputEmail" name="email" type="email" class="form-control" autocomplete="username" required>
					</div>
					<div class="form-group">
						<label for="inputPassword">Password</label>
						<input id="inputPassword" name="pw" type="password" class="form-control" autocomplete="current-password"
							required>
					</div>
					<div class="form-check d-flex justify-content-between my-2">
						<input type="checkbox" class="form-check-input"> <label class="form-check-label" for="logInCheck">Keep me
							logged
							in </label> <a class="help-password " href="#">forgot your password?</a>
					</div>
					<button type="submit" class="btn helper-button-main">Login</button>
				</form>

			</div>
		</div>
	</div>
</div>





<!-- Chat popup -->


<div class="overlay-chat">

	<div class="chat-popup" id="myForm">
		<div class="chat-form-container">

			<div class="chat-card">
				<div class="chat-card-header d-flex row">
					<div class="col-8 m-0">
						<c:if test="${!empty msgno.mno}">
							<c:choose>
								<c:when test="${msgno.rno == sessionScope.userNumber }">
									<h5 class="chat-name"> Conversation with <strong>${msgno.ename }</strong></h5>
								</c:when>
								<c:when test="${msgno.eno == sessionScope.userNumber }">
									<h5 class="chat-name"> Conversation with <strong>${msgno.rname }</strong></h5>
								</c:when>
							</c:choose>
						</c:if>
					</div>
					<div class="col-4 d-flex justify-content-end">
						<button type="button" class="btn chat-button-round p-1" onclick="location.reload()">
							<i class="fas fa-redo"></i>
						</button>
						<button type="button" class="btn chat-button-round p-1" onclick="removeChat()">
							<i class=" fas fa-times"></i>
						</button>
					</div>

				</div>

				<div class="chat-room" id="chat-room">
					<!--챗룸 시작-->
					<div class="chat-room-body">
						<ul class="chat-list">
							<c:forEach items="${messengerList}" var="messenger">
								<c:choose>
									<c:when test="${sessionScope.userNumber eq messenger.rno}">
										<!-- 유저가 헬퍼인 경우임 -->
										<c:if test="${!empty messenger.emsg }">
											<li class="chat-in">
												<div class="chat-body">
													<div class="chat-message">
														<h5>${messenger.ename}</h5>
														<p>${messenger.emsg}</p>
													</div>
												</div>
											</li>
										</c:if>
										<c:if test="${!empty messenger.rmsg }">
											<li class="chat-out">
												<div class="chat-body">
													<div class="chat-message">
														<h5>${messenger.rname}</h5>
														<p>${messenger.rmsg}</p>
													</div>
												</div>
											</li>
										</c:if>
									</c:when>

									<c:when test="${sessionScope.userNumber eq messenger.eno}">
										<!-- 유저가 헬피인 경우임 -->
										<c:if test="${!empty messenger.rmsg }">
											<li class="chat-in">
												<div class="chat-body">
													<div class="chat-message">
														<h5>${messenger.rname}</h5>
														<p>${messenger.rmsg}</p>
													</div>
												</div>
											</li>
										</c:if>
										<c:if test="${!empty messenger.emsg }">
											<li class="chat-out">
												<div class="chat-body">
													<div class="chat-message">
														<h5>${messenger.ename}</h5>
														<p>${messenger.emsg}</p>
													</div>
												</div>
											</li>
										</c:if>
									</c:when>
									<c:otherwise>
										<h5>${messenger.rno}</h5>
										<p>${messenger.rmsg}</p>
										이렇게 되면 망한거임
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</ul>
					</div>

				</div>

				<div class="form-group chat-form-group">
					<c:choose>
						<c:when test="${sessionScope.userNumber eq msgno.rno}">
							<!-- 유저가 헬퍼인 경우 -->

							<div class="send-form">
								<form class="send-form-inner" action="sendHelperMsg.do" method="post">
									<input name="uno" type="hidden" value="${user.uno}" />
									<input name="rno" type="hidden" value="${sessionScope.userNumber}" />
									<input name="eno" type="hidden" value="${msgno.eno}" />
									<textarea name="rmsg" class="form-control form-chat" id="chatcomment" rows="2"></textarea>
									<button type="submit" class="btn chat-button">Send</button>
								</form>

							</div>

						</c:when>


						<c:when test="${sessionScope.userNumber eq msgno.eno}">
							<!-- 유저가 헬피인 경우 -->

							<div class="send-form">


								<form class="send-form-inner" action="sendHelpeeMsg.do" method="post">
									<input name="uno" type="hidden" value="${user.uno}" />
									<input name="eno" type="hidden" value="${sessionScope.userNumber}" />
									<input name="rno" type="hidden" value="${msgno.rno}" />
									<textarea name="emsg" class="form-control form-chat" id="chatcomment" rows="2"></textarea>
									<button type="submit" class="btn chat-button">Send</button>
								</form>

							</div>

						</c:when>



					</c:choose>
				</div>



			</div>
		</div>
	</div>

</div>


<!-- chat popup end -->


<!--FOOTER START-->
<div class="container-fluid footer">
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<h5>Account</h5>
				<ul>
					<li><a class="footer-link" data-toggle="modal" data-target="#loginModal">Login</a>
					</li>
					<li><a class="footer-link" href="signUp.jsp">Signup</a>
					</li>
				</ul>
			</div>
			<div class="col-sm">
				<h5>Our service</h5>
				<ul>
					<li><a class="footer-link" href="userDescription.jsp">What is K:lper?</a></li>
					<li><a class="footer-link" href="serviceDescription.jsp">Service</a></li>
					<li><a class="footer-link" href="faq.jsp">FAQ</a></li>
					<li><a class="footer-link" href="CS.jsp">Customer Service</a></li>
				</ul>
			</div>
			<div class="col-sm">
				<div>
					(c) 2020 Kelper LLC <br>
					<a class="footer-link" href="terms.jsp">Terms of Service | Privacy
						Policy</a>
				</div>

			</div>
		</div>

	</div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

<!-- Moment Js -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.2/moment.min.js"></script>
<script src="https://unpkg.com/lightpick@latest/lightpick.js"></script>



<!--D3 JS-->
<!-- SSL 보안해놔서 https:// 로 사이트가 시작하기 때문에 http:// 인 d3.js 주석 달았습니다. -->
<script src="https://d3js.org/d3.v3.min.js"></script>
<!-- <script src="https://d3js.org/d3.v5.min.js"></script> -->



<!-- <script src="http://d3js.org/topojson.v1.min.js"></script>  -->
<script src="https://d3js.org/topojson.v1.min.js"></script>
<script src="./js/d3Chart.js"></script>


<!-- costum Js -->
<script src="./js/app.js"></script>
<script src="./js/chat.js"></script>

</body>


</html>