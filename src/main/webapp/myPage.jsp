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
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='myPageDetailProcess.do'">Pending
                        requests</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='matchHistory.do'">History</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='myInfoEdit.do'">Edit my
                        info</button>
                </div>


                <div class="btn-group mypage-menu d-md-none pr-1">
                    <button type="button" class="btn mypage-button" onclick="location.href='myPage.do'">My
                        page</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='incomingRequest.do'">Req-uests</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='myPageDetailProcess.do'">Pend-ing</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='matchHistory.do'">Hi-story</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='myInfoEdit.do'">Edit
                        Info</button>
                </div>

            </div>
        </div>





        <div class="col-md-9 order-2 order-md-2">

            <div class="row mypage-post mx-1 pr-md-1">


                <div class="col-md-3 order-1 order-md-1 d-flex justify-content-center align-self-center">
                    <img class="profile-img-box" src="https://www.klper.com/images/${sessionScope.userNumber}.png"
                        onerror="javascript:src='https://www.klper.com/images/0.png'" alt="profileImage">
                </div>


                <div class="col-md-9 order-2 order-md-2">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="helper-name-box mt-2">
                                <c:forEach items="${helperCountList}" var="helperCount">
                                    <c:if test="${helperCount.rno == sessionScope.userNumber }">
                                        <c:if test="${helperCount.count > 0}">
                                            <span class="helper-badge">HELPER</span>
                                        </c:if>
                                    </c:if>
                                </c:forEach>
                                <c:forEach items="${helpeeCountList }" var="helpeeCount">
                                    <c:if test="${helpeeCount.eno == sessionScope.userNumber }">
                                        <c:if test="${helpeeCount.count > 0}">
                                            <span class="helpee-badge">HELPEE</span>
                                        </c:if>
                                    </c:if>
                                </c:forEach>
                                <h3>${sessionScope.userName}</h3>
                            </div>
                        </div>


                    </div>

                    <div class="wallet-box">
                        <div class="wallet-box-text">
                            I have <strong>${sessionScope.userMoney} Won</strong> in my
                            wallet
                        </div>
                        <div class="wallet-box-button">

                            <button onclick="location.href='withdrawRequest.do'" class="btn charge mt-1 ">Withdraw
                                money</button>
                            <button type="button" class="btn charge mt-1 " onclick="location.href='payment.do'">Charge
                                for the
                                deal
                            </button>

                            <form action="chargeHistory.do" method="post">
                                <input type="hidden" name="uno" value="${sessionScope.userNumber}" />
                                <button class="charge-history" type="submit">See all charge history
                                </button>
                            </form>
                        </div>

                    </div>

                </div>
            </div>






            <div class="row">
                <div class="col-md-6 col-lg-3">
                    <div class="mypage-process">
                        <div class="mypage-process-body">
                            <h5 class="mypage-process-title">Applying</h5>
                            <p class="mypage-process-text">Transactions<br>spending approval</p>
                            <a href="incomingRequest.do" class="btn  mypage-button-helpee-round">
                                <!--{mstate 0}-->${mstate1}</a><a href="incomingRequest.do"
                                class="btn mypage-button-round">
                                <!--{mstate 1}-->${mstate0}</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="mypage-process">
                        <div class="mypage-process-body">
                            <h5 class="mypage-process-title">Waiting<br>payment</h5>
                            <p class="mypage-process-text">Waiting payment</p>
                            <a href="myPageDetailProcess.do" class="btn mypage-button-round">
                                <!--거래{mstate 2}-->${mstate2}</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="mypage-process">
                        <div class="mypage-process-body">
                            <h5 class="mypage-process-title">Completed<br>payment</h5>
                            <p class="mypage-process-text">Waiting for service</p>
                            <a href="myPageDetailProcess.do" class="btn mypage-button-round">
                                <!--거래 {mstate3}-->${mstate3}</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="mypage-process">
                        <div class="mypage-process-body lastmypage-process">
                            <h5 class="mypage-process-title">Completed<br>deal</h5>
                            <p class="mypage-process-text">waiting for review</p>
                            <a href="myPageDetailProcess.do" class="btn mypage-button-round">
                                <!--<!--리뷰작성후 거래완료{mstate4, 5}-->${mstate4}</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%@ include file="Footer.jsp"%>