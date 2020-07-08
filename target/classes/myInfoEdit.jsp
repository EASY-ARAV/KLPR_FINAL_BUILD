<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp"%>

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
      <div class="row mypage-post mx-1">
        <form class="col-12" action="myInfoEdit.do" method="post" enctype="multipart/form-data">

          <div class="input-group d-flex justify-content-center">
            <div id="image_container">
              <img class="profile-img-box" src="http://www.klper.com/images/${sessionScope.userNumber}.png"
                onerror="javascript:src='http://www.klper.com/images/0.png'" alt="profileImage">
            </div>
            <div class="col-12 my-3">
              <div class="custom-file">
                <input type="file" class="custom-file-input" name="uploadfile" accept="image/*"
                  onchange="setThumbnail(event);" aria-describedby="inputGroupFileAddon01" />
                <label class="custom-file-label" for="inputGroupFile01">Add your picture</label>
              </div>
            </div>
          </div>
          <!-- 
          <h3 class="name-box" name="email" value="${loginUser.email }">${loginUser.email }</h3> -->

          <div class="form-group">
            <label for="signupName">Email</label>
            <input name="email" id="signupEmail" type="email" class="form-control" value="${loginUser.email}" readonly>
          </div>
          <div class="form-group">
            <label for="signupPassword">Password</label>
            <input name="pw" id="signupPassword" type="password" class="form-control" autocomplete="new-password"
              value="${loginUser.pw }" required>
          </div>
          <div class="form-group">
            <label for="passwordConfirm">Password confirm</label>
            <input name="pw-confirm" id="passwordConfirm" type="password" class="form-control" value="${loginUser.pw }"
              autocomplete="new-password" required>
          </div>
          <div class="form-group">
            <label for="signupName">Name</label>
            <input name="name" id="signupName" type="text" class="form-control" value="${loginUser.name }" readonly>
          </div>
          <div class="form-group">
            <label for="contactNumber">Contact number</label>
            <input name="phone" id="contactNumber" type="text" class="form-control" value="${loginUser.phone }"
              required>
          </div>
          <div class="form-group">
            <label for="gender">Are you..</label>
            <c:if test="${loginUser.gender == 0 }">
              <input type="text" class="form-control" value="None of both" readonly>
            </c:if>
            <c:if test="${loginUser.gender == 1 }">
              <input type="text" class="form-control" value="Female" readonly>
            </c:if>
            <c:if test="${loginUser.gender == 2 }">
              <input type="text" class="form-control" value="Male" readonly>
            </c:if>
          </div>
          <button type="submit" class="btn helper-button-main">Save update</button>

        </form>
      </div>
    </div>
  </div>




  <%@ include file="Footer.jsp"%>