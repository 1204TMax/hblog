<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>个人主页</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light" style="background:url(../img/bg5.jpg)">

	<form style="border: 1px dashed rgb(66, 133, 244);"></form>
	<div class="container" style=""></div>
	<div class="container" style=""></div>

	<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark"
		id="index_top"> <a class="navbar-brand mr-auto mr-lg-0" href="#">
		<font style="vertical-align: inherit;"> <font
			style="vertical-align: inherit;">氢博客</font>
	</font>
	</a>
	<button class="navbar-toggler p-0 border-0" type="button"
		data-toggle="offcanvas">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="navbar-collapse offcanvas-collapse"
		id="navbarsExampleDefault">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="../message/getmessagefromindex"> <font
					style="vertical-align: inherit;"> <font
						style="vertical-align: inherit;">聊天</font>
				</font>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#"> <font
					style="vertical-align: inherit;"> <font
						style="vertical-align: inherit;">浏览更多</font>
				</font>
			</a></li>
			<li class="nav-item"><a class="nav-link"
				href="../user/getpersonal?page=1"> <font
					style="vertical-align: inherit;"> <font
						style="vertical-align: inherit;">我的</font>
				</font>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="http://example.com"
				id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <font style="vertical-align: inherit;">
						<font style="vertical-align: inherit;">设置</font>
				</font>
			</a>
				<div class="dropdown-menu" aria-labelledby="dropdown01">
					<a class="dropdown-item" href="#"> <font
						style="vertical-align: inherit;"> <font
							style="vertical-align: inherit;">动作</font>
					</font>
					</a> <a class="dropdown-item" href="#"> <font
						style="vertical-align: inherit;"> <font
							style="vertical-align: inherit;">另一个动作</font>
					</font>
					</a> <font style="vertical-align: inherit;"> <a
						class="dropdown-item" href="#"> <font
							style="vertical-align: inherit;">此处</font>
					</a> <a class="dropdown-item" href="#"> <font
							style="vertical-align: inherit;">还有其他动作</font>
					</a>
					</font> <a class="dropdown-item" href="#"> <font
						style="vertical-align: inherit;"></font>
					</a>
				</div></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="text" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				<font style="vertical-align: inherit;"><font
					style="vertical-align: inherit;">搜索</font></font>
			</button>
		</form>
	</div>
	</nav>



	<main role="main" class="container" id="main1"
		style="height: 2100px; margin-top: 70px; font-weight: 100; background-color: rgb(192, 192, 192);background:url(../img/bg5.jpg)">
	<div class="container"
		style="height: 10px; position: relative; background-color: rgb(192, 192, 192);background:url(../img/bg5.jpg)">
	</div>
	<div class="container"
		style="height: 200px; position: relative; margin-bottom: 20px; background-color: #FFFFFF; margin-top: 10px; padding-top: 10px;background:url(../img/bg4.jpg)">
		<div class="m-4">
			<form action="../user/editheadimg" method="post" name="uploadheadimg"
				enctype="multipart/form-data">
				<img src="<%=basePath%>image/${headimgsrc}" id="prevView"
					height="256" width="256"
					style="width: 120px; height: 120px; float: left; position: relative; margin-right: 30px; border-radius: 20px 20px;">
				<input type="file" name="asdasdasd" id="aasdasdsd"
					onchange="preva(this)"
					style="position: relative; margin-left: -150px; width: 111px; height: 120px; opacity: 0; cursor: pointer;" />
				<input type="file" name="qqqqqqqqq" id="asdddddddasdf"
					style="position: relative; margin-left: -5000px" ;opacity: 0;"/> <input
					type="submit" id="button2" ,name="button2"
					style="position: relative; margin-left: -3000px";opacity: 0;">
			</form>
		</div>
		<div
			style="position: relative; margin-left: 150px; margin-top: -130px; margin-bottom: 30px">
			<h2>
				${user.userName }&nbsp&nbsp<a href="/view_front/personaledit.jsp"
					style="font-size: 12px">更改资料</a></a>
			</h2>
		</div>
		<h6>${user.userSignature }</h6>
	</div>
	<div class="row"
		style="margin-top: 0px; height: 1800px; padding-bottom: 40px;">
		<div class="   col-sm-3">
			<ul class="list-group" style="">
				<li class="list-group-item" style="position: static;"><div
						class="row" style="">
						<div class="col-sm-4">
							<h5>
								关注
								<div>100</div>
							</h5>
						</div>
						<div class="col-sm-4 col-5">
							<h5>
								粉丝
								<div>200</div>
							</h5>
						</div>
						<div class="col-sm-4" style="text-decoration-style: dashed;">
							<small>最近三天浏览数量</small>

							<div>150</div>
						</div>
					</div> <span class="badge">个人信息</span></li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">个人资料：<a href="/view_front/personaledit.jsp"
						style="font-size: 12px；font-color:black">编辑</a></span></li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">性别&nbsp:</span> ${userinfo.userinfoSex}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">年龄&nbsp:</span> ${userinfo.userinfoAge}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">身高&nbsp:</span> ${userinfo.userinfoHeight}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">体重&nbsp:</span> ${userinfo.userinfoWeight}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">性取向&nbsp:</span> ${userinfo.userinfoSexChoice}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">婚姻状况&nbsp:</span> ${userinfo.userinfoMarriageState}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">学历&nbsp:</span> ${userinfo.userinfoEducation}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">常住地&nbsp:</span> ${userinfo.userinfoOftenPlace}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">真实姓名&nbsp:</span> ${userinfo.userinfoRealName}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">身份证号&nbsp:</span> ${userinfo.userinfoIdNumber}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">QQ&nbsp:</span> ${userinfo.userinfoQq}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">微信&nbsp:</span> ${userinfo.userinfoWechat}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">微博账号&nbsp:</span> ${userinfo.userinfoMicroblog}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">星座&nbsp:</span> ${userinfo.userinfoConstellation}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">血型&nbsp:</span> ${userinfo.userinfoBloodType}</li>

			</ul>
		</div>
		<div class=" col-5 col-sm-8" style="width: 720px;">
			<div class="card" style="" >
			<form id="cardform">
			<div><p></p></div>
			<ul class="pagination pull-right" id="it" style="margin-left:20px">
				<li class="page-item"><a class="page-link"
					href="/user/getpersonal?page=${pprepage }">上一页</a></li>
				<li class="page-item" id="it1"><a class="page-link"
					href="/user/getpersonal?page=${pprepage }">${pprepage }</a></li>
				<li class="page-item" ><a class="page-link"
					href="/user/getpersonal?page=${page }" style="font-weight:bold;color:DarkSlateGray">${page }</a></li>
				<li class="page-item" id="it3"><a class="page-link"
					href="/user/getpersonal?page=${plastpage }">${plastpage }</a></li>
				<li class="page-item"><a class="page-link"
					href="/user/getpersonal?page=${plastpage }">下一页</a></li>
			</ul>
				<div class="card-body" style="margin-top: 0px;opacity:0">
					<p class="card-text">${personalblogs[0].blogPublishTime}</p>
					<p class="card-text">${personalblogs[0].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[0].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[1].blogPublishTime}</p>
					<p class="card-text">${personalblogs[1].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[1].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[2].blogPublishTime}</p>
					<p class="card-text">${personalblogs[2].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[2].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[3].blogPublishTime}</p>
					<p class="card-text">${personalblogs[3].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[3].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[4].blogPublishTime}</p>
					<p class="card-text">${personalblogs[4].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[4].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[5].blogPublishTime}</p>
					<p class="card-text">${personalblogs[5].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[5].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[6].blogPublishTime}</p>
					<p class="card-text">${personalblogs[6].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[6].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[7].blogPublishTime}</p>
					<p class="card-text">${personalblogs[7].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[7].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[8].blogPublishTime}</p>
					<p class="card-text">${personalblogs[8].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[8].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				<div class="card-body" style="opacity:0">
					<p class="card-text">${personalblogs[9].blogPublishTime}</p>
					<p class="card-text">${personalblogs[9].blogContent}</p>
					<a href="../blog/delblogbyid?blogid=${personalblogs[9].blogId}" class="btn btn-xs btn-warning"><span class="glyphicon glyphicon-trash"></span> 删除</a>
				</div>
				</form>
				
			</div>
		</div>
	</div>
	<div class="container" style=""></div>
	</main>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/holderjs@2.9.4/holder.js"></script>
	<script src="offcanvas.js"></script>


	<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32"
		viewBox="0 0 32 32" preserveAspectRatio="none"
		style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;">
	<defs>
	<style type="text/css"></style>
	</defs> <text x="0" y="2"
		style="font-weight:bold;font-size:2pt;font-family:Arial, Helvetica, Open Sans, sans-serif">32x32</text></svg>
	<script id="chartjs-script"
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.bundle.min.js"></script>
	<script>
		$(document).ready(function() {
			$(".chartjs").each(function() {
				ctx = $("canvas", this).get(0).getContext("2d");
				config = JSON.parse(this.dataset.chart);
				chartjs = new Chart(ctx, config);
			});
		});
		function preva(event) {
			//获取展示图片的区域
			var img = document.getElementById("prevView");
			//获取文件对象
			let file = event.files[0];
			//获取文件阅读器
			let reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function() {
				//给img的src设置图片url
				img.setAttribute("src", this.result);
			}
			$('#button2').trigger("click");
		}
			window.onload = function() {
				var pagesize = '${pagesize}';
				var hiddendiv = 20 - pagesize;
				var a = document.getElementById("cardform")
				var b = a.getElementsByTagName("div");
				for (var i = 0; i < pagesize; i++) {
					console.log(b[i]);
					b[i].style.opacity = "100";
				}

				var it1 = document.getElementById('it1');
				var it2 = document.getElementById('it2');
				var it3 = document.getElementById('it3');
				var main1 = document.getElementById("cardform");
				var main = document.getElementById("main1");
				var it = document.getElementById('it');
				if ('${plastpage}' == 1) {
					it.parentNode.removeChild(it);
					if ('${pagesize}' == 1) {
						main1.style.height = "1200px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 2) {
						main1.style.height = "1200px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 3) {
						main1.style.height = "1200px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 4) {
						main1.style.height = "1200px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 5) {
						main1.style.height = "1200px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 6) {
						main1.style.height = "1500px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 7) {
						main1.style.height = "1600px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 8) {
						main1.style.height = "1700px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 9) {
						main1.style.height = "1800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 10) {
						main1.style.height = "2000px";
						main.style.height = "1200px";
					}
				} 
				if ('${plastpage}' == '${page}') {
					if ('${pagesize}' == 1) {
						main1.style.height = "800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 2) {
						main1.style.height = "800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 3) {
						main1.style.height = "800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 4) {
						main1.style.height = "800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 5) {
						main1.style.height = "800px";
						main.style.height = "1200px";
					} else if ('${pagesize}' == 6) {
						main1.style.height = "1100px";
						main.style.height = "1500px";
					} else if ('${pagesize}' == 7) {
						main1.style.height = "1200px";
						main.style.height = "1600px";
					} else if ('${pagesize}' == 8) {
						main1.style.height = "1300px";
						main.style.height = "1700px";
					} else if ('${pagesize}' == 9) {
						main1.style.height = "1400px";
						main.style.height = "1800px";
					} else if ('${pagesize}' == 10) {
						main1.style.height = "1500px";
						main.style.height = "2000px";
					}
				} 
				if ('${plastpage}' == 1) {
					it.parentNode.removeChild(it);
				} 
					if ('${page}' == 1) {
						it1.parentNode.removeChild(it1);
					}
					if ('${page}' == '${preallastpage}') {
						it3.parentNode.removeChild(it3);
					}
			}
		
	</script>
</body>
</html>