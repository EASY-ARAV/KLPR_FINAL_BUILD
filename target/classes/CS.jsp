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
          <button type="button" class="btn mypage-button" onclick="location.href='serviceDescription.jsp'">What kinds of
            service helper provide?</button>
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



      <div class="media service-post profile-box-container ml-md-1">
        <div class="media-body">

          <div class="policy">
            <h4><strong>Customer Service</strong></h4>
            <div class="row profile-box-body">
              <div class="col-12 p-0">
                Please click Zendesk icon for contacting us!<br>
                Type your name, email address and your concerns.<br>
                One of our staff members will contact you shortly!<br><br>

                Or please contact us via <a href="support@klper.zendesk.com">support@klper.zendesk.com</a>

              </div>
            </div>

          </div>
        </div>

      </div>
    </div>


  </div>


</div>
<!-- Start of klper Zendesk Widget script -->
<script id="ze-snippet"
  src="https://static.zdassets.com/ekr/snippet.js?key=001b4095-238c-4363-a151-2cad7ef408a0"> </script>
<!-- End of klper Zendesk Widget script -->



<%@ include file="Footer.jsp"%>