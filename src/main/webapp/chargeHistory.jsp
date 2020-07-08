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
					<button type="button" class="btn mypage-button" onclick="location.href='myPage.do'">My page</button>
					<button type="button" class="btn mypage-button" onclick="location.href='incomingRequest.do'">View all
						requests</button>
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
			<button type="button" class="btn  helpee-button-main d-none d-md-block"
				onclick="location.href='myPage.do'">Confirm</button>

			<c:forEach items="${chargeHistoryList}" var="charge">
				<div class="row mypage-post">

					<!--차징내역-->
					Charge date: ${charge.approved_at } <br>Charge amount: ${charge.pay } <br>Charge method: KAKAOPAY


				</div>

			</c:forEach>
		</div>

	</div>



	<%@ include file="Footer.jsp"%>