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
<title>${other.userName }的主页</title>
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
		id="index_top"> <a class="navbar-brand mr-auto mr-lg-0" href="../blog/getList?page=1">
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
						style="vertical-align: inherit;">私信</font>
				</font>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#" id="samecity"> <font
					style="vertical-align: inherit;"> <font
						style="vertical-align: inherit;">同城</font>
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
		<form class="form-inline my-2 my-lg-0" action="<%=basePath %>user/serchuser">
			<input class="form-control mr-sm-2" type="text" placeholder="Search"
				aria-label="Search" name="">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				<font style="vertical-align: inherit;"><font
					style="vertical-align: inherit;">搜索</font></font>
			</button>
		</form>
	</div>
	</nav>



	<main role="main" class="container" id="main1"
		style="height: 2600px; margin-top: 70px; font-weight: 100; background-color: rgb(192, 192, 192);background:url(../img/bg5.jpg)">
	<div class="container"
		style="height: 10px; position: relative; background-color: rgb(192, 192, 192);background:url(../img/bg5.jpg)">
	</div>
	<div class="container"
		style="height: 200px; position: relative; margin-bottom: 20px; background-color: #FFFFFF; margin-top: 10px; padding-top: 10px;background:url(../img/bg4.jpg)">
		<div class="m-4">
			<form action="../user/editheadimg" method="post" name="uploadheadimg"
				enctype="multipart/form-data">
				<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
					id="prevView" height="256" width="256"
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
				${other.userName }&nbsp&nbsp <a id="focusfont" style="font-size: 18px; cursor: pointer; color: blue;"><span>关注</span></a><a href="../message/getmessagelist?othername=other.userName" style="font-size: 18px; cursor: pointer; color: blue;margin-left:15px">私信</a>  
			</h2>
		</div>
		
		<h6>${other.userSignature }</h6>
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
					</div></li>
				<li class="list-group-item" style="position: static;"><span
					class="badge"><small >提示：只有双方都为强社交模式用户,</br></br>才可以查看对方全部资料</small><a
						href="/view_front/personaledit.jsp"
						style="font-size: 12px；font-color:black"></a></span></li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">性别&nbsp:</span> ${otherinfo.userinfoSex}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">年龄&nbsp:</span> ${otherinfo.userinfoAge}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">身高&nbsp:</span> ${otherinfo.userinfoHeight}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">体重&nbsp:</span> ${otherinfo.userinfoWeight}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">性取向&nbsp:</span> ${otherinfo.userinfoSexChoice}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">婚姻状况&nbsp:</span> ${otherinfo.userinfoMarriageState}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">学历&nbsp:</span> ${otherinfo.userinfoEducation}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">常住地&nbsp:</span> ${otherinfo.userinfoOftenPlace}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">真实姓名&nbsp:</span> ${otherinfo.userinfoRealName}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">身份证号&nbsp:</span> ${otherinfo.userinfoIdNumber}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">QQ&nbsp:</span> ${otherinfo.userinfoQq}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">微信&nbsp:</span> ${otherinfo.userinfoWechat}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">微博账号&nbsp:</span> ${otherinfo.userinfoMicroblog}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">星座&nbsp:</span> ${otherinfo.userinfoConstellation}</li>
				<li class="list-group-item" style="position: static;"><span
					class="badge">血型&nbsp:</span> ${otherinfo.userinfoBloodType}</li>

			</ul>
		</div>
		<div class=" col-5 col-sm-8" style="width: 720px;">
		<ul class="pagination pull-right" id="it" >
				<li class="page-item"><a class="page-link"
					href="/user/goother?username=${other.userName }&page=${pprepage }">上一页</a></li>
				<li class="page-item" id="it1"><a class="page-link"
					href="/user/goother?page=${pprepage }&username=${other.userName}">${pprepage }</a></li>
				<li class="page-item" ><a class="page-link"
					href="/blog/goother?page=2&username=${other.userName}" style="font-weight:bold;color:DarkSlateGray">${page }</a></li>
				<li class="page-item" id="it3"><a class="page-link"
					href="/user/goother?page=${plastpage }&username=${other.userName}">${plastpage }</a></li>
				<li class="page-item"><a class="page-link"
					href="/user/goother?username=${other.userName }&page=${plastpage }">下一页</a></li>
			</ul>
			<form id="cardform">
				<div class="card" style="opacity: 0" id="card1">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">

									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName }"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[0].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card2">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[1].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card3">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[2].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card4">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[3].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card5">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[4].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card6">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[5].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card7">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[6].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card8">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[7].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card9">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[8].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
				<div class="card" style="opacity: 0" id="card10">
					<div class="card-body">
						<h4 class="card-title">
							<div class="row" style="">
								<div class=" col-sm-1">
									<h3>
										<img src="<%=basePath%>image/${otherinfo.userHeadimageSrc}"
											height="128" width="128"
											style="width: 50px; height: 50px; border-radius: 20px 20px;">
									</h3>
								</div>
								<div class="col-sm-4 col-5 ">
									<p style="font-size: 18px">
										<a href="../user/goother?username=${other.userName}"
											style="color: black; text-decoration: none">${other.userName}</a>
									<div style="font-size: 15px; margin-top: -10px">${other.userSignature}</div>
									</p>
								</div>
							</div>
						</h4>
						<p class="card-text" style="font-size: 25px; margin-top: 10px">${personbloglist[9].blogContent }</p>
					</div>
				</div>
				<div style="height: 15px"></div>
			</form>
			
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
	<script src="../js/bootstrap-paginator.js"></script>
	<script>
		$("#focusfont").click(function() {
			$("#focusfont").css("color", "gray");
			$("#focusfont").text("已关注");
			var oAjax = new XMLHttpRequest();//创建ajax对象
			 oAjax.open("POST","../focus/focus",true);/* 加上t='+new Date().getTime()"的目的是为了消除缓存，每次的t的值不一样。 */
			 oAjax.send();
			 if(oAjax.readyState==4)
	            {
	                if(oAjax.status==200)//判断是否成功,如果是200，就代表成功
	                {
	                    alert("成功"+oAjax.responseText);//读取a.txt文件成功就弹出成功。后面加上oAjax.responseText会输出a.txt文本的内容
	                }
	                else
	                {
	                    alert("失败");
	                }
	            }
		});
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
			console.log("kaishi")
			
			var pagesize = '${pagesize}' * 7;
			var hiddendiv = 20 - pagesize;
			var a = document.getElementById("cardform")
			var b = a.getElementsByTagName("div");
			for (var i = 0; i < pagesize; i++) {
				b[i].style.opacity = "100";
			}

			var it1 = document.getElementById('it1');
			var it2 = document.getElementById('it2');
			var it3 = document.getElementById('it3');
			var main1 = document.getElementById("main1");
			var it = document.getElementById('it');
			if ('${plastpage}' == 1) {
				it.parentNode.removeChild(it);
				if ('${pagesize}' == 1) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 2) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 3) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 4) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 5) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 6) {
					main1.style.height = "1500px";
				} else if ('${pagesize}' == 7) {
					main1.style.height = "1600px";
				} else if ('${pagesize}' == 8) {
					main1.style.height = "1700px";
				} else if ('${pagesize}' == 9) {
					main1.style.height = "1800px";
				} else if ('${pagesize}' == 10) {
					main1.style.height = "2000px";
				}
			} 
			if ('${plastpage}' == '${page}') {
				if ('${pagesize}' == 1) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 2) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 3) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 4) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 5) {
					main1.style.height = "1200px";
				} else if ('${pagesize}' == 6) {
					main1.style.height = "1500px";
				} else if ('${pagesize}' == 7) {
					main1.style.height = "1600px";
				} else if ('${pagesize}' == 8) {
					main1.style.height = "1700px";
				} else if ('${pagesize}' == 9) {
					main1.style.height = "1800px";
				} else if ('${pagesize}' == 10) {
					main1.style.height = "2000px";
				}
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