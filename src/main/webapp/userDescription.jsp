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
                    <button type="button" class="btn mypage-button" onclick="location.href='userDescription.jsp'">What
                        is Helpee/Helper?</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='serviceDescription.jsp'">What kinds of service helper provide?</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='faq.jsp'">FAQ</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='terms.jsp'">Terms and
                        policy</button>
                </div>


                <div class="btn-group mypage-menu d-md-none pr-1">
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='userDescription.jsp'">Helpee/Helper</button>
                    <button type="button" class="btn mypage-button"
                        onclick="location.href='serviceDescription.jsp'">Service</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='faq.jsp'">FAQ</button>
                    <button type="button" class="btn mypage-button" onclick="location.href='terms.jsp'">Policy</button>
                </div>

            </div>
        </div>





        <div class="col-md-9 order-2 order-md-2">



            <div class="media service-post profile-box-container ml-md-1 read-more-wrap">
                <div class="media-body">

                    <h3 class="name-box">What is Helpee?</h3>


                    <div class="row profile-box-body">
                        <div class="col-12 p-0">
                            Ever experienced any hard time living in Korea?
                        </div>
                    </div>

                    <div class="self-desc">
                        <div class="d-flex justify-content-center">
                            <label class="read-more-trigger">Read more</label>
                        </div>

                        <div class="read-more-target">
                            <div>
                                Some may have struggled to do simple tasks such as making arrangments for moving,
                                scheduling appointment at a hospital or at an immigration office due to language
                                barriers.
                                Here at K:LPER, we call them "Helpee"!

                                If you are a "Helpee", all you need to do is just ask "Helper" for any help needed!
                                With a small fee, you can easily improve your quality of life in Korea.

                                Sign up now and write your first "Helpee" Request!

                            </div>
                        </div>
                    </div>

                </div>
            </div>


            <div class="media service-post profile-box-container ml-md-1 read-more-wrap">
                <div class="media-body">

                    <h3 class="name-box">What is Helper?</h3>


                    <div class="row profile-box-body">
                        <div class="col-12 p-0">
                            Fluent speaking foreign language? If so, please help "Helpee" who needs your help!
                        </div>
                    </div>

                    <div class="self-desc">
                        <div class="d-flex justify-content-center">
                            <label class="read-more-trigger">Read more</label>
                        </div>

                        <div class="read-more-target">
                            <div>
                                Our website is waiting for you to help "Helpee" with the work related to moving,
                                hospital, and immigration.

                                It's okay if you don't know much about these services.
                                You'll still be able to become the best "Helper" on our website as long as
                                You interpret the language "Helpee" speaks into Korean and vice versa.

                                Help "Helpee" and receive a small compensation in return for providing such services.

                                Sign up now and register as "Helper" now!
                            </div>
                        </div>
                    </div>

                </div>
            </div>


        </div>


    </div>
</div>




<%@ include file="Footer.jsp"%>