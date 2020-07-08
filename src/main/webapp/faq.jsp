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


      <ul class="faq-list">
        <li data-aos="fade-up" data-aos-delay="100" class="aos-init aos-animate">
          <a data-toggle="collapse" class="collapsed" href="#faq1" aria-expanded="false">I forgot my account name and
            password <i class="fas fa-arrow-up"></i></a>
          <div id="faq1" class="collapse" data-parent=".faq-list">
            <p><br>
              Please click "forgot your password?" at the bottom on the login page.<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="200" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq2" class="collapsed">I need help! What should I do?<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq2" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              1. Getting start!<br><br>
              In order for you to receive help from the Helper, you need to submit a Helpee Request Form on our
              website!<br>
              Log in and click 'HELPEE' tab located on left-top side of our website.<br>
              Click 'Please Help Me' located on the left side of the page.<br>
              Select the following then click 'Submit':<br>

              date and location<br>
              language you wish to use<br>
              services - moving, hospital, immigration (can choose more than one service)<br>
              additional information you wish to share<br>
              <br><br><br>

              2. Waiting response from Helper<br><br>
              - Notification icon will appear on the upper right corner of our website if you received an incoming
              request from a
              helper.<br>
              - Goto My Page and check the incoming request in detail.<br>
              - If you wish to accept the request, then click 'confirm offer' from view all requests on My Page. Once
              you confirm the
              offer sent by the Helper, the mileage from your account will be deducted and the chat will
              begin.<br><br><br>

              3. Sending Requests to Helper<br><br>
              - If you prefer to contact Helper, here are the steps!<br>
              - Log In and click 'HELPER' tab located on left-top side of our website.<br>
              - Take a look at Helpers listed on the page and select whom you may wish to receive help from. Click 'Read
              More' to see
              the detail info.<br>
              - If you have a helper you wish to ask for help, you may click 'Send Request' to send the request. The
              chat begins when
              the other party accepts the request.<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="300" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq3" class="collapsed">I want to help! What should I do?<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq3" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              1. Getting start!<br><br>
              - Log in and click 'HELPER' tab located on left-top side of our website.<br>
              - Click 'Let Me Help Someone' located on the left side of the page.<br>
              - Select the following then click 'Submit':<br>
              . date and location available for you to help<br>
              . language available<br>
              . services - moving, hospital, immigration (can choose more than one service)<br>
              . additional information you wish to share<br><br><br>

              2. Waiting response from Helpee<br><br>
              - Notification icon will appear on the upper right corner of our website if you receive incoming request
              from a helper.<br>
              - Goto My Page and check the incoming requests in detail.<br>
              - If you wish to accept the request, then click 'confirm offer' from View All Requests on My Page. Once
              you
              confirm the
              offer sent by the Helpee, the chat will begin.<br><br><br>

              3. Sening Requests to Helpee<br><br>
              - Log In and click 'HELPEE' tab located on left-top side of our website.<br>
              - Take a look at Helpees listed on the page and select whom you may wish to offer help. Click 'Read More'
              to
              see the
              detail info.<br>
              - If you have a helpee you wish to offer help, you may click 'Send Request' to send the request. The chat
              begins when
              the other party accepts the request.<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="400" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq4" class="collapsed">I'd like to charge my money.<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq4" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              - Click My Page in the top menu.<br>
              - Click the 'Charge' button on My Page.<br>
              - If you make a deposit to the K:LPER account, K:PLER billing team will then review the transaction. Once
              the
              transaction gets confirmed, your mileage will be charged and is ready to use!
              (Please note that the minimum amount to charge is 10,000 won and can be charged via KakaoPay only)<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="500" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq5" class="collapsed">I would like to edit my profile. <i
              class="fas fa-arrow-up"></i></a>
          <div id="faq5" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              - Goto My Page<br>
              - Click 'Edit My Info'<br>
              - Edit and save the account information, then it will be modified.<br>
              - (Some information cannot be modified)<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="600" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq6" class="collapsed">What should I do after getting help?<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq6" class="collapse" data-parent=".faq-list">
            <p><br>
              - After completing K:LPER mileage charging, did you receive service from the helper?<br>
              -The K:LPER mileage amount is not automatically delivered to the Helper on the service deadline.<br>
              - You have to press the confirm transaction button on My Page.<br>
              - You must press the confirm transaction button after the service is completed. In addition, please leave
              a
              review to
              help other users.<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="700" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq7" class="collapsed">The other party didn't fulfill the promise.<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq7" class="collapse" data-parent=".faq-list">
            <p><br>
              K:LPER does not directly serve as a help matching platform, nor does it intervene in services between
              helpers. Due to
              this, we ask for your understanding that it is difficult to directly compensate and resolve any problems
              that have
              occurred with the helpers or helpers we have met through K:LPER.<br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="800" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq8" class="collapsed">How do I contact HELPEE/HELPER?<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq8" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              If you accept each other's application, your mileage will be deducted and the chat room on the K:LPER
              homepage will be
              opened.
              It is safe to use K:LPER Chat for help and related conversations even if you exchange contacts with each
              other in the
              corresponding chat room.
              <br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="900" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq9" class="collapsed">Can I restore the chat room I left?<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq9" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              Unfortunately, expired chat rooms cannot be recovered again.<br>
              Please talk carefully and fully before the chat room expires.
              <br>
            </p>
          </div>
        </li>

        <li data-aos="fade-up" data-aos-delay="1000" class="aos-init aos-animate">
          <a data-toggle="collapse" href="#faq10" class="collapsed">An error occurred while using the K:LPER website.<i
              class="fas fa-arrow-up"></i></a>
          <div id="faq10" class="collapse" data-parent=".faq-list">
            <p>
              <br>
              The K:LPER homepage is optimized for Chrome browsers, so please use the Chrome browser whenever
              possible.<br>
              Also, please keep your browser version up to date.<br>
              In the event of a temporary error, it can be resolved in the following manner.
              <br>
              - Internet Explorer User<br>
              1. Click Settings or Alt + X<br>
              2. Click Internet Option<br>
              3. Go to: General Tab -> Search History then click Delete<br>
              4. Check Cookies and website data<br>
              5. Click Delete<br><br>

              - Chome User<br>
              1. Top right corner ፧ button<br>
              2. Click Settings<br>
              3. At the bottom, click Advanced<br>
              4. click Privacy and Security<br>
              5. Click Delete Internet History<br>
              6. Click Delete Cookie and Cache<br>
              7. If this doesn't work please contact our Customer Service.<br>
              <br>
            </p>
          </div>
        </li>
      </ul>
    </div>
  </div>
</div>

<%@ include file="Footer.jsp"%>