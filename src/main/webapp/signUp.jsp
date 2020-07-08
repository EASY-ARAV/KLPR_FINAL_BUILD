<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>

<!-- 본문 -->
<!--SIGNUP-->
<div class="mypage-navbar"></div>
<div class="container">

    <div class="row d-fex justify-content-center my-7">
        <div class="col-md-6">
            <div class="mypage-post">
                <h4>SIGN UP</h4>
                <hr>


                <div id="self-sign-up">
                    <form class="signup-form" action="join.do" method="post">
                        <div class="form-group">
                            <label for="signupEmail">Email address</label>
                            <input name="email" id="signupEmail" type="email" class="form-control"
                                autocomplete="username" required>
                        </div>
                        <div class="form-group">
                            <label for="signupPassword">Password</label>
                            <input name="pw" id="signupPassword" type="password" class="form-control"
                                autocomplete="new-password" required>
                        </div>
                        <div class="form-group">
                            <label for="passwordConfirm">Password confirm</label>
                            <input name="pw-confirm" id="passwordConfirm" type="password" class="form-control"
                                autocomplete="new-password" required>
                        </div>
                        <div class="form-group">
                            <label for="signupName">Name</label>
                            <input name="name" id="signupName" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="contactNumber">Contact number</label>
                            <input name="phone" id="contactNumber" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="gender">Are you..</label>
                            <select id="gender" name="gender" class="form-control" required>
                                <option value="0">None of both</option>
                                <option value="1">Female</option>
                                <option value="2">Male</option>
                            </select>
                        </div>
                        <button type="submit" class="btn helper-button-main">Signup</button>
                    </form>


                </div>
            </div>
        </div>
    </div>

</div>

<%@ include file="Footer.jsp"%>