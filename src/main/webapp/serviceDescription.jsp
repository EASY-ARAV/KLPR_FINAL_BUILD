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
                        onclick="location.href='serviceDescription.jsp'">What types of services does helper
                        provide?</button>
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

                    <div class="d-flex justify-content-between">
                        <h3 class="name-box">Moving</h3>
                        <div class="edit-button float-right">
                            <!--svg아이콘 불러옴 -->
                            <div class="iconPreview no-attribution"
                                style="width: 30px; height: 30px; background-size: cover; background-image: url(&quot;data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9JzMwMHB4JyB3aWR0aD0nMzAwcHgnICBmaWxsPSIjNDc3ZWZmIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwIDAgMjQgMjQiIHg9IjBweCIgeT0iMHB4Ij48Zz48cGF0aCBkPSJNNyAyNGMtMS42NTQgMC0zLTEuMzQ2LTMtM3MxLjM0Ni0zIDMtMyAzIDEuMzQ2IDMgMy0xLjM0NiAzLTMgM3ptMC00Yy0uNTUxIDAtMSAuNDQ4LTEgMXMuNDQ5IDEgMSAxIDEtLjQ0OCAxLTEtLjQ0OS0xLTEtMXpNMTkgMjRjLTEuNjU0IDAtMy0xLjM0Ni0zLTNzMS4zNDYtMyAzLTMgMyAxLjM0NiAzIDMtMS4zNDYgMy0zIDN6bTAtNGMtLjU1MiAwLTEgLjQ0OC0xIDFzLjQ0OCAxIDEgMSAxLS40NDggMS0xLS40NDgtMS0xLTF6TTEzLjk5OCAyMGgtMTEuOTk2Yy0xLjEwNCAwLTIuMDAyLS44OTgtMi4wMDItMi4wMDJ2LTExLjk5NmMwLTEuMTA0Ljg5OC0yLjAwMiAyLjAwMi0yLjAwMmgxMS45OTZjMS4xMDQgMCAyLjAwMi44OTggMi4wMDIgMi4wMDJ2MTEuOTk2YzAgMS4xMDQtLjg5OCAyLjAwMi0yLjAwMiAyLjAwMnptLTExLjk5Ni0xNGwtLjAwMiAxMS45OTggMTIgLjAwMnYtMTEuOTk4bC0xMS45OTgtLjAwMnpNMjMgMjBoLTljLS41NTMgMC0xLS40NDctMS0xcy40NDctMSAxLTFoOHYtM2MwLTIuMjA2LTEuNzk0LTQtNC00LS41NTMgMC0xLS40NDgtMS0xcy40NDctMSAxLTFjMy4zMDkgMCA2IDIuNjkxIDYgNnY0YzAgLjU1My0uNDQ3IDEtMSAxek04IDE2Yy0uMjU2IDAtLjUxMi0uMDk4LS43MDctLjI5My0uMzkxLS4zOTEtLjM5MS0xLjAyMyAwLTEuNDE0bDEuMjkzLTEuMjkzaC0zLjU4NmMtLjU1MiAwLTEtLjQ0OC0xLTFzLjQ0OC0xIDEtMWg2Yy40MDQgMCAuNzY5LjI0NC45MjQuNjE3LjE1NS4zNzQuMDY5LjgwNC0uMjE3IDEuMDlsLTMgM2MtLjE5NS4xOTUtLjQ1MS4yOTMtLjcwNy4yOTN6TTExIDEzYy0uMjU2IDAtLjUxMi0uMDk4LS43MDctLjI5M2wtMy0zYy0uMzkxLS4zOTEtLjM5MS0xLjAyMyAwLTEuNDE0czEuMDIzLS4zOTEgMS40MTQgMGwzIDNjLjM5MS4zOTEuMzkxIDEuMDIzIDAgMS40MTQtLjE5NS4xOTUtLjQ1MS4yOTMtLjcwNy4yOTN6Ij48L3BhdGg+PC9nPjwvc3ZnPg==&quot;);">
                            </div>
                            <!--svg아이콘 불러옴 -->
                        </div>
                    </div>

                    <div class="row profile-box-body">
                        <div class="col-12 p-0">
                            Need help on arranging your move?<br>
                            Tell us when and how you would like to make your move, and we will arrange a custom move
                            plan that suits your needs.<br>
                            <em>(K:LPER does not provide assistance concerning real estate contracts.)</em><br>

                        </div>
                    </div>

                    <div class="self-desc">
                        <div class="d-flex justify-content-center">
                            <label class="read-more-trigger">Read more</label>
                        </div>

                        <div class="read-more-target">
                            <div class="boardReview">
                                3 Ways to Move in Korea <br>
                                <b>1. Full Packing Moving Service (포장이사: Po-Jang Isa)</b><br>
                                A professional moving company handles everything from packing, delivering and unpacking
                                your items.<br>
                                Since more worked is involved, the rates are higher.<br>
                                <b>2. Partial Packing Moving Service (반포장이사: Ban Po-Jang Isa)</b><br>
                                The company packs and delivers your items for you to unpack and settle into your new
                                home.<br>
                                <b>3. Standard Moving Service (일반이사: Il-Ban Isa)</b><br>
                                Once you’re done with packing, the company delivers your items for you to unpack and
                                settle into your new home.<br>
                                The company only provides the vehicle and delivery service.<br>
                                <br>
                                For smaller inventories, you may arrange a delivery van service instead of moving
                                through a professional company.<br>
                                The price may vary depending on the size of the van and distance, and you will have to
                                move your items yourself.<br>
                                <em>(Drivers are not required to help your move, but may be able assist with an extra
                                    charge.)</em><br>
                                There will be a limit of passengers available for every van, and extra charges may incur
                                for each party.
                            </div>
                        </div>
                    </div>

                </div>
            </div>


            <div class="media service-post profile-box-container ml-md-1 read-more-wrap">
                <div class="media-body">

                    <div class="d-flex justify-content-between">
                        <h3 class="name-box">Hospital</h3>
                        <div class="edit-button float-right">
                            <!--svg아이콘 불러옴 -->
                            <div class="iconPreview no-attribution"
                                style="width: 30px; height: 30px; background-size: cover; background-image: url(&quot;data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9JzMwMHB4JyB3aWR0aD0nMzAwcHgnICBmaWxsPSIjNDc3ZWZmIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwIDAgMjQgMjQiIHg9IjBweCIgeT0iMHB4Ij48cGF0aCBkPSJNMTIgMjNjLS4xODYgMC0uMzcxLS4wNTItLjUzNC0uMTU0LTMuMzUxLTIuMTE4LTYuMTYyLTQuNTY4LTguMzU1LTcuMjg1LS4zNDctLjQzLS4yOC0xLjA1OS4xNDktMS40MDYuNDI5LS4zNDcgMS4wNi0uMjggMS40MDYuMTUgMS45MzkgMi40IDQuNDA0IDQuNTg3IDcuMzMzIDYuNTA2IDMuOTE2LTIuNTY0IDYuOTkzLTUuNjA4IDkuMTUxLTkuMDUzLjU4OC0uOTM1Ljg1LTEuODIzLjg1LTIuODh2LS41OTVjMC0xLjEwNC0uNDM1LTIuMTQ2LTEuMjI1LTIuOTM0bC0uMzQ3LS4zMTdjLTEuMDE3LS44NTItMi4xNzQtMS4wMzEtMi45NjYtMS4wMzEtMS43NzkgMC0zLjUxNCAxLjEwMi00LjMxNCAyLjc0MmwtLjI1LjUxMmMtLjMzNS42ODctMS40NjMuNjg3LTEuNzk4IDBsLS4yNS0uNTEzYy0uODEyLTEuNjY1LTIuNTM2LTIuNzQyLTQuMzg5LTIuNzQyLTEuMTAxIDAtMi4wNzMuMzQ4LTIuODkxIDEuMDMzbC0uMzQ2LjMxN2MtLjc4OS43ODYtMS4yMjQgMS44MjgtMS4yMjQgMi45MzN2LjU5NWMwIC43NjQuMTQyIDEuNDUxLjQ0MSAyLjEyNGw0LjA3NC0uMDAyIDEuMDMzLTEuMzEyYy4yMDYtLjI2LjUzMS0uNDAzLjg1OS0uMzc4LjMzMi4wMjQuNjI5LjIxMS43OTQuNWwyLjA1MyAzLjU4MiAyLjgwNi01LjAzMmMuMTctLjMwNi40ODctLjUuODM3LS41MTMuMzgzLS4wMTguNjgxLjE1OS44NzMuNDUybDEuNzcgMi43MDFoLjQ2Yy41NTMgMCAxIC40NDggMSAxcy0uNDQ3IDEtMSAxaC0xYy0uMzM3IDAtLjY1MS0uMTctLjgzNy0uNDUybC0xLjE2LTEuNzcyLTIuODYzIDUuMTM0Yy0uMTc2LjMxNC0uNTA3LjUxMS0uODY4LjUxMy0uMzgyLS4wMzctLjY5NC0uMTktLjg3NC0uNTAzbC0yLjE5Ni0zLjgzMS0uNDE3LjUzYy0uMTg5LjI0LS40NzkuMzgxLS43ODUuMzgxaC01LjE3MWMtLjM1OSAwLS42OTEtLjE5My0uODY5LS41MDUtLjY0Ni0xLjEzNC0uOTYtMi4zMTctLjk2LTMuNjE3di0uNTk1YzAtMS42NC42NDQtMy4xODUgMS44MTItNC4zNS4xNTMtLjE1Mi4zMTEtLjI5Ni40NzItLjQzMyAxLjE3My0uOTgxIDIuNjE2LTEuNSA0LjE3Ny0xLjUgMi4xOTEgMCA0LjI1MyAxLjA2NyA1LjUzOCAyLjc5OCAxLjI3Ni0xLjcyOSAzLjMxMi0yLjc5NyA1LjQ2NC0yLjc5NyAxLjYxMSAwIDMuMDgyLjUxOCA0LjI1MiAxLjQ5OS4xNjMuMTM4LjMyMS4yODIuNDc0LjQzNSAxLjE2NyAxLjE2MyAxLjgxMSAyLjcwOCAxLjgxMSA0LjM0OHYuNTk1YzAgMS40MzUtLjM2NiAyLjY4OC0xLjE1NCAzLjk0Mi0yLjQxNiAzLjg1NS01Ljg4NiA3LjIyOS0xMC4zMTIgMTAuMDI1LS4xNjMuMTAzLS4zNDguMTU1LS41MzQuMTU1eiI+PC9wYXRoPjwvc3ZnPg==&quot;);">
                            </div>
                            <!--svg아이콘 불러옴 -->
                            <!-- svg아이콘 불러옴 -->
                        </div>
                    </div>

                    <div class="row profile-box-body">
                        <div class="col-12 p-0">
                            Having trouble with medical consultations, examinations and treatments at hospitals?<br>
                            Not all Korean hospitals provide foreign language services.<br>
                            Even when you speak decent Korean, things can easily get tricky with medical
                            terminologies.<br>
                            Tell us what kind of treatment you are seeking, along with the hospital location and date,
                            and we will assist you with scheduling appointments, translations while accompanying you
                            through the entire process.<br>

                        </div>
                    </div>

                    <div class="self-desc">
                        <div class="d-flex justify-content-center">
                            <label class="read-more-trigger">Read more</label>
                        </div>

                        <div class="read-more-target">
                            <div class="boardReview">
                                The standard rules while using medical facilities in Korea is:<br>
                                <br>
                                <b>1.</b> Make an appointment ahead, or register at the front desk at your day of
                                visit.<br>
                                If it is your first visit, submit your personal information.<br>
                                If you had prior visits, you may check your records at the front desk before
                                registering.<br>
                                <b>2.</b> Wait for your turn, and follow the medical worker’s direction for your medical
                                check up.<br>
                                (K:LPER Helpers can accompany you and translate your diagnosis.)<br>
                                <b>3.</b> After your examination, you may get prescription drugs. <br>
                                (K:LPER Helpers can help you with instructions on receiving the drugs or its usage.)<br>
                                <b>4.</b> Depending on your condition, you may have to make additional appointments for
                                follow ups or further treatments. <br>
                                <br>
                                For emergency situations we can help you through video chat or phone calls.<br>

                            </div>
                        </div>
                    </div>

                </div>
            </div>


            <div class="media service-post profile-box-container ml-md-1 read-more-wrap">
                <div class="media-body">

                    <div class="d-flex justify-content-between">
                        <h3 class="name-box">Immigration</h3>
                        <div class="edit-button float-right">
                            <!--svg아이콘 불러옴 -->
                            <div class="iconPreview no-attribution"
                                style="width: 30px; height: 30px; background-size: cover; background-image: url(&quot;data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9JzMwMHB4JyB3aWR0aD0nMzAwcHgnICBmaWxsPSIjNDc3ZWZmIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwIDAgMjQgMjQiIHg9IjBweCIgeT0iMHB4Ij48ZyBzdHJva2U9IiM0NzdlZmYiIHN0cm9rZS13aWR0aD0iMiIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIiBzdHJva2UtbGluZWpvaW49InJvdW5kIiBzdHJva2UtbWl0ZXJsaW1pdD0iMTAiIGZpbGw9Im5vbmUiPjxjaXJjbGUgY3g9IjEyIiBjeT0iMTIiIHI9IjExIj48L2NpcmNsZT48cGF0aCBkPSJNMTIgMjNjLTEuMDkgMC00LjUtMy45NjktNC41LTExIDAtNi45NjkgMy4zNC0xMSA0LjUtMTFNMiA4aDIwTTIgMTZoMjBNMTIgMjNjMS4wOSAwIDQuNS0zLjk2OSA0LjUtMTEgMC02Ljk2OS0zLjM0LTExLTQuNS0xMSI+PC9wYXRoPjwvZz48L3N2Zz4=&quot;);">
                            </div>
                            <!--svg아이콘 불러옴 -->
                        </div>
                    </div>

                    <div class="row profile-box-body">
                        <div class="col-12 p-0">
                            There are staff that speak foreign languages at immigration offices.<br>
                            <b>But!</b> Sometimes it’s difficult to prepare for certain paper work or just finding the
                            right office to go<br>
                            K:LPER can help you with paper work and accompany your visit to offices that will serve your
                            needs!

                        </div>
                    </div>

                    <div class="self-desc">
                        <div class="d-flex justify-content-center">
                            <label class="read-more-trigger">Read more</label>
                        </div>

                        <div class="read-more-target">
                            <div class="boardReview">
                                Find what you were looking for through our legislative information website that’s easy
                                to use.<br>
                                <a href="http://www.easylaw.go.kr/CSM/Main.laf"
                                    alt="easylaw.go.kr">easylaw.go.kr</a><br>
                                <em>
                                    (Through K:LPER services, our Helpers can provide consultation, research, paper work
                                    preparation assistance and company while visiting offices.)
                                </em>
                            </div>
                        </div>
                    </div>

                </div>
            </div>



        </div>


    </div>
</div>




<%@ include file="Footer.jsp"%>