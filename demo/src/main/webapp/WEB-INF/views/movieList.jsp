<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>영화 목록</title>
    <style>
    	body {
		    background-color: #999999 !important;
		}
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            padding: 8px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
            color: #333;
        }
        img {
            max-width: 200px;
            max-height: 100%;
        }
        .modal {
		  display: none; /* 기본적으로 모달 창을 숨긴다. */
		  position: fixed; /* 위치는 고정 */
		  z-index: 1; /* 가장 위쪽에 표시 */
		  left: 0;
		  top: 0;
		  width: 100%;
		  height: 100%;
		  overflow: auto;
		  background-color: rgba(0,0,0,0.5); /* 배경은 반투명한 검은색 */
		}
		
		/* 모달 창 스타일 */
		.modal-content {
		  background-color: #fefefe;
		  margin: 15% auto;
		  padding: 20px;
		  border: 1px solid #888;
		  width: 80%;
		  max-width: 600px;
		}

    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<link rel="stylesheet" href="https://unpkg.com/bootstrap-icons/font/bootstrap-icons.css">
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		getMovieList();
		function getMovieList(){
			$.ajax({
				url : "/getMovieList",
				type : "get",
				data: {},
				success : function(obj){
                
				},
				error : function(){
					alert('실패');
				}
			})			
		}
		function pageing(page){
			document.readFrm.nowPage.value=page;
			document.readFrm.submit();
		}
		function block(block){
			document.readFrm.nowPage.value=null*(block-1)+1;
			document.readFrm.submit();
		}
		
		function check() {
			if(document.searchFrm.keyWord.value==""){
				alert("검색어를 입력하세요.");
				document.searchFrm.keyWord.focus();
				return;
			}
			document.searchFrm.submit();
		}
		
		function list() {
			document.listFrm.action = "movieList.jsp";
			document.listFrm.submit();
		}
		
		function openModal() {
			document.getElementById("myModal").style.display = "block";
		}

		// 모달 닫기 함수
		function closeModal() {
			document.getElementById("myModal").style.display = "none";
		}
		
	</script>
</head>
<body>
<div align="center"><br/>
<header class="p-3 mb-3 border-bottom">
	<div style="display:flex; padding: 0px; justify-content: flex-end;">
              <button type="button" class="btn" onclick="javascript:location.href='../user/login.jsp'" >로그인</button>
              <button type="button" class="btn" onclick="javascript:location.href='../user/memberJoin.jsp'">회원가입</button>
              <button type="button" class="btn" onclick="javascript:location.href='../user/myPage1.jsp'" >null</button>
              <button type="button" class="btn" onclick="javascript:location.href='/movieProject/logoutServlet'">로그아웃</button>
    </div>
</header>
<div class = "container">
<form name="searchFrm" style="float: right;">
       <div class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3 d-flex align-items-center">
       	<select name="keyField" size="1" >
			<option value="title"> 제 목 </option>
			<option value="genre"> 장 르</option>
			<option value="director"> 감 독 </option>
			<option value="actor"> 배 우 </option>
			</select>
	  <input type="search" placeholder="Search" aria-label="Search" name="keyWord">
	  <button type="button" class="btn btn-primary" id="searchBtn" style="width:80px; margin-left: 10px;" onClick="javascript:check()">검색</button>
	</div>
	

	<i class="bi bi-question" onclick="openModal()" style="font-size: 1.5rem;"></i>


	<div id="myModal" class="modal">
		<div class="modal-content">
			<span onclick="closeModal()" class="close">&times;</span>
			<p>검색 가능한 장르</p>
			<p>액션, 모험, 애니메이션, 코미디, 범죄, 다큐멘터리, 드라마, 가족, 판타지, 역사, 공포, 음악, 미스터리, 로맨스, SF, TV 영화, 스릴러, 전쟁, 서부</p>
			
		</div>
	</div>
</form>
<table>
	<c:forEach items="${data}" var="movie" varStatus="status">
		<c:if test="${status.index % 6 == 0}">
			<tr>
		</c:if>
		<td align="center">
			<c:choose>
				<c:when test="${fn:contains(movie.poster, 'http')}">
					<a href="/detail">
						<img src="${movie.poster}">
						<p>${movie.title}</p>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/detail">
						<img src="${'https://image.tmdb.org/t/p/w500'}${movie.poster}">
						<p>${movie.title}</p>
					</a>
				</c:otherwise>
			</c:choose>
		</td>
		<c:if test="${status.index % 6 == 5 || status.last}">
			</tr>
		</c:if>
	</c:forEach>
	<td align="right">
		<a href="javascript:list()">[처음으로]</a>
	</td>
</table>
</div>
<hr width="750">

<form name="listFrm" method="post">
	<input type="hidden" name="reload" value="true">
	<input type="hidden" name="nowPage" value="1">
</form>


</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>