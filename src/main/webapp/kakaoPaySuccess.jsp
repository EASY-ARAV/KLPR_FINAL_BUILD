<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>
<!-- 본문 -->
<div class="mypage-navbar"></div>
<div class="mypage-board container">

	<div class="row d-flex justify-content-center">

		<div class="mypage-post mx-1 col-md-6">


			<h4>Successfully check your account</h4>

			<form action="kakaoPayApproval.do" method="post">
				<button type="submit" class="kakaoC btn-lg mt-4">Process your charging!</button>
			</form>


		</div>
	</div>
</div>





<%@ include file="Footer.jsp"%>