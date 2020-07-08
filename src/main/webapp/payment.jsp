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
            <div class="row mypage-post mx-1 col-12 align-item-center">
                <div class="col-12 align-item-center">
                    <div class="form-group">


                        <label for="pay">
                            <strong>
                                <h4>Price</h4>
                            </strong>
                        </label>
                        <select id="pay1" name="pay" class="form-control">
                            <option value="10000">10,000</option>
                            <option value="20000">20,000</option>
                            <option value="30000">30,000</option>
                            <option value="50000">50,000</option>
                            <option value="100000">100,000</option>
                        </select>

                        <input id="uno1" type="hidden" name="uno" class="form-control"
                            value="${sessionScope.userNumber}" />


                    </div>
                    <button id="kakaoC" class="kakaoC btn-lg"><i class="fas fa-comment"></i> Pay with KakaoPay</button>

                </div>
            </div>
        </div>

    </div>
</div>

<script type="text/javascript">
    window.onload = function () {
        $("#kakaoC").click(function () {
            var pay = $("#pay1").val();
            var uno = $("#uno1").val();

            var fo = document.createElement("form"); // form 생성
            fo.setAttribute("method", "post");	//method타입 post생성
            fo.setAttribute("action", "kakaoPay.do");	// action하면 kakaoPay.do가 실행되게 함
            document.body.appendChild(fo);	// 현재페이지에 form 생성한 form 추가

            var ip = document.createElement("input"); // input 엘리멘트 생성 
            ip.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
            ip.setAttribute("name", "pay"); // name 속성을 'pay'으로 설정 
            ip.setAttribute("value", pay); // value 속성을 pay에 담겨있는 값으로 설정 
            fo.appendChild(ip); // form 엘리멘트에 input 엘리멘트 추가 

            var iu = document.createElement("input"); // input 엘리멘트 생성 
            iu.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
            iu.setAttribute("name", "uno"); // name 속성을 'pay'으로 설정 
            iu.setAttribute("value", uno); // value 속성을 pay에 담겨있는 값으로 설정 
            fo.appendChild(iu); // form 엘리멘트에 input 엘리멘트 추가 

            fo.submit(); // form 태그 서브밋 실행
        });
    }

</script>



<%@ include file="Footer.jsp"%>