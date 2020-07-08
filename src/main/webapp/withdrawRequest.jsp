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
			<div class="row mypage-post mx-1 col-12 align-item-center">
				<div class="col-12 align-item-center">
					<div class="form-group">

						<div class="withdraw-header">

							<label for="withdraw">

								<h4><strong>Withdraw</strong></h4>

							</label>
							<hr>


							<lable name="usermoney" value="${sessionScope.userMoney}">Holding amount : ${sessionScope.userMoney } WON
							</lable><br><br>



							Select withdrawal amount<br><br>
							<select id="bankmoney1" name="wmoney" class="form-control">>

								<c:if test="${sessionScope.userMoney >= 10000}">
									<option value="10000">10,000</option>
								</c:if>
								<c:if test="${sessionScope.userMoney >= 20000}">
									<option value="20000">20,000</option>
								</c:if>
								<c:if test="${sessionScope.userMoney >= 30000}">
									<option value="30000">30,000</option>
								</c:if>
								<c:if test="${sessionScope.userMoney >= 50000}">
									<option value="50000">50,000</option>
								</c:if>
								<c:if test="${sessionScope.userMoney >= 100000}">
									<option value="100000">100,000</option>
								</c:if>
							</select>

							<input type="hidden" id="userNum1" name="uno" class="form-control" value="${sessionScope.userNumber}" />
							<input type="hidden" id="userAllMoney" class="form-control" value="${sessionScope.userMoney}" />

						</div>

						<div class="mypage-post my-5">
							<h5>Withdraw using BANK Account</h5>

							<hr>

							BANK <br> <input class="form-control" id="bankname1" name="wbank" required><br>
							Account <br><input class="form-control" id="bankaccount1" name="waccount" required><br>
							Account Holder <br><input class="form-control" id="withdrawname1" name="wname" required><br>

							<div class="withdraw-button d-flex">

								<c:if test="${sessionScope.userMoney >= 10000}">
									<button id="bankSS" class="btn charge">Withdraw the selected amount</button>

									<button id="bankSSAll" class="btn charge">Full withdrawal</button>
								</c:if>
							</div>
						</div>


						<div class="mypage-post my-5">

							<h5>Withdraw using KakaoPay</h5>
							<hr>


							Phone Number in use KakaoPay
							<br><input class="form-control" id="wphone1" name="wphone" required><br>
							<br>


							<div class="withdraw-button d-flex">
								<c:if test="${sessionScope.userMoney >= 10000}">
									<button id="kakaopay1" class="btn charge">Withdraw the selected amount</button>
									<button id="kakaopayall" class="btn charge">Full withdrawal</button>
								</c:if>
							</div>

						</div>


						<div class="withdraw-detail m-3">
							<ul>

								<li>Deposits are made from the requested amount, excluding certain fees.</li>
								<li>Payment will be completed to the customer within 2 days after confirming the amount.</li>
								<li>In case of problems, we will contact you by email.</li>
								<li>If the amount you have is less than 10000 won, you cannot withdraw it.</li>
								<li>For inquiries, please contact the customer center email.</li>

						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</div>

<script type="text/javascript">
	window.onload = function () {
		$("#bankSS").click(function () {
			var uno = $("#userNum1").val();
			var bankmoney = $("#bankmoney1").val();
			var bankaccount = $("#bankaccount1").val();
			var bankname = $("#bankname1").val();
			var withdrawname = $("#withdrawname1").val();

			var fo = document.createElement("form"); // form 생성
			fo.setAttribute("method", "post");	//method타입 post생성
			fo.setAttribute("action", "withdrawRequestUsingBANK.do");	// action하면 kakaoPay.do가 실행되게 함
			document.body.appendChild(fo);	// 현재페이지에 form 생성한 form 추가

			var iu = document.createElement("input"); // input 엘리멘트 생성 
			iu.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iu.setAttribute("name", "uno"); // name 속성을 'pay'으로 설정 
			iu.setAttribute("value", uno); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iu); // form 엘리멘트에 input 엘리멘트 추가 

			var im = document.createElement("input"); // input 엘리멘트 생성 
			im.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			im.setAttribute("name", "wmoney"); // name 속성을 'pay'으로 설정 
			im.setAttribute("value", bankmoney); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(im); // form 엘리멘트에 input 엘리멘트 추가 

			var ia = document.createElement("input"); // input 엘리멘트 생성 
			ia.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ia.setAttribute("name", "waccount"); // name 속성을 'pay'으로 설정 
			ia.setAttribute("value", bankaccount); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ia); // form 엘리멘트에 input 엘리멘트 추가 

			var ib = document.createElement("input"); // input 엘리멘트 생성 
			ib.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ib.setAttribute("name", "wbank"); // name 속성을 'pay'으로 설정 
			ib.setAttribute("value", bankname); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ib); // form 엘리멘트에 input 엘리멘트 추가 

			var iw = document.createElement("input"); // input 엘리멘트 생성 
			iw.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iw.setAttribute("name", "wname"); // name 속성을 'pay'으로 설정 
			iw.setAttribute("value", withdrawname); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iw); // form 엘리멘트에 input 엘리멘트 추가 

			fo.submit(); // form 태그 서브밋 실행
		});

		$("#bankSSAll").click(function () {
			var uno = $("#userNum1").val();
			var bankmoney = $("#userAllMoney").val();
			var bankaccount = $("#bankaccount1").val();
			var bankname = $("#bankname1").val();
			var withdrawname = $("#withdrawname1").val();

			var fo = document.createElement("form"); // form 생성
			fo.setAttribute("method", "post");	//method타입 post생성
			fo.setAttribute("action", "withdrawRequestUsingBANKAll.do");	// action하면 kakaoPay.do가 실행되게 함
			document.body.appendChild(fo);	// 현재페이지에 form 생성한 form 추가

			var iu = document.createElement("input"); // input 엘리멘트 생성 
			iu.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iu.setAttribute("name", "uno"); // name 속성을 'pay'으로 설정 
			iu.setAttribute("value", uno); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iu); // form 엘리멘트에 input 엘리멘트 추가 

			var im = document.createElement("input"); // input 엘리멘트 생성 
			im.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			im.setAttribute("name", "wmoney"); // name 속성을 'pay'으로 설정 
			im.setAttribute("value", bankmoney); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(im); // form 엘리멘트에 input 엘리멘트 추가 

			var ia = document.createElement("input"); // input 엘리멘트 생성 
			ia.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ia.setAttribute("name", "waccount"); // name 속성을 'pay'으로 설정 
			ia.setAttribute("value", bankaccount); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ia); // form 엘리멘트에 input 엘리멘트 추가 

			var ib = document.createElement("input"); // input 엘리멘트 생성 
			ib.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ib.setAttribute("name", "wbank"); // name 속성을 'pay'으로 설정 
			ib.setAttribute("value", bankname); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ib); // form 엘리멘트에 input 엘리멘트 추가 

			var iw = document.createElement("input"); // input 엘리멘트 생성 
			iw.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iw.setAttribute("name", "wname"); // name 속성을 'pay'으로 설정 
			iw.setAttribute("value", withdrawname); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iw); // form 엘리멘트에 input 엘리멘트 추가 

			fo.submit(); // form 태그 서브밋 실행
		});

		$("#kakaopay1").click(function () {
			var uno = $("#userNum1").val();
			var bankmoney = $("#bankmoney1").val();
			var kakaophone = $("#wphone1").val();

			var fo = document.createElement("form"); // form 생성
			fo.setAttribute("method", "post");	//method타입 post생성
			fo.setAttribute("action", "withdrawRequestUsingKakao.do");	// action하면 kakaoPay.do가 실행되게 함
			document.body.appendChild(fo);	// 현재페이지에 form 생성한 form 추가

			var iu = document.createElement("input"); // input 엘리멘트 생성 
			iu.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iu.setAttribute("name", "uno"); // name 속성을 'pay'으로 설정 
			iu.setAttribute("value", uno); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iu); // form 엘리멘트에 input 엘리멘트 추가 

			var im = document.createElement("input"); // input 엘리멘트 생성 
			im.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			im.setAttribute("name", "wmoney"); // name 속성을 'pay'으로 설정 
			im.setAttribute("value", bankmoney); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(im); // form 엘리멘트에 input 엘리멘트 추가 

			var ia = document.createElement("input"); // input 엘리멘트 생성 
			ia.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ia.setAttribute("name", "wphone"); // name 속성을 'pay'으로 설정 
			ia.setAttribute("value", kakaophone); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ia); // form 엘리멘트에 input 엘리멘트 추가 

			fo.submit(); // form 태그 서브밋 실행
		});

		$("#kakaopayall").click(function () {
			var uno = $("#userNum1").val();
			var bankmoney = $("#userAllMoney").val();
			var kakaophone = $("#wphone1").val();

			var fo = document.createElement("form"); // form 생성
			fo.setAttribute("method", "post");	//method타입 post생성
			fo.setAttribute("action", "withdrawRequestUsingKakaoAll.do");	// action하면 kakaoPay.do가 실행되게 함
			document.body.appendChild(fo);	// 현재페이지에 form 생성한 form 추가

			var iu = document.createElement("input"); // input 엘리멘트 생성 
			iu.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			iu.setAttribute("name", "uno"); // name 속성을 'pay'으로 설정 
			iu.setAttribute("value", uno); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(iu); // form 엘리멘트에 input 엘리멘트 추가 

			var im = document.createElement("input"); // input 엘리멘트 생성 
			im.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			im.setAttribute("name", "wmoney"); // name 속성을 'pay'으로 설정 
			im.setAttribute("value", bankmoney); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(im); // form 엘리멘트에 input 엘리멘트 추가 

			var ia = document.createElement("input"); // input 엘리멘트 생성 
			ia.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
			ia.setAttribute("name", "wphone"); // name 속성을 'pay'으로 설정 
			ia.setAttribute("value", kakaophone); // value 속성을 pay에 담겨있는 값으로 설정 
			fo.appendChild(ia); // form 엘리멘트에 input 엘리멘트 추가 

			fo.submit(); // form 태그 서브밋 실행
		});

	}

</script>


<%@ include file="Footer.jsp"%>