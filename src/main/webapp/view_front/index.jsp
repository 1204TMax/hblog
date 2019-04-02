<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<title>首页</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/dianzan.css">
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
	<link rel="stylesheet" type="text/css" href="../css/button/build.css">
<style type="text/css">
li {
	list-style: none;
}
</style>
</head>
<body style="height: 2000px; background:url(../img/bg5.jpg)">
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

	<main role="main" class="container">
<!-- 这里放算法分发 -->
<div style="height:20px"></div>
	</main>
	<div class="m-5">
		<div class="row">
			<div class=" col-3      col-sm-2">
				<div class="card" style="">
					<div class="card-body" id="index_personal" style="height: 160px;">
						<div>
							<img src="<%=basePath%>image/${headimgsrc}" width="111px"
								height="111px " style="border-radius: 20px 20px;" />
							<h3
								style="position: relative; margin-left: 150px; margin-top: -100px;">${user.userName }</h3>
							<a href="../user/getpersonal?page=1" class="btn btn-primary"
								style="position: relative; margin-left: 140px; margin-top: 20px;">查看资料</a>
						</div>
					</div>
				</div>
			</div>
			<div class="  2  col-3  col-sm-8"
				style="width: 600px; opacity: 1; margin-top: -28px;">
				<div class="m-5"></div>
				<div class="m-5"></div>
				<nav aria-label="Page navigation example" style=""> </nav>
				<div class="m-5">
					<div class="card"
						style="height: 220px; margin-top: -20px; margin-bottom: 23px;background:url(../img/bg4.jpg)"
						id="card">
						<div class="form-group" style="margin-left: 100px">
							<h6 class="title111" style="font-family: "Arial","Microsoft YaHei","黑体","宋体",sans-serif;">分享点好东西……</h6>
								<div id="editor">
									<textarea rows="1" cols="40" name="blogContent" id="blogContent"
										style="width: 760px; height: 100px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
								</div>
								<br>
								<button type="submit" class="btn btn-primary" id="fabu"
									style="height: 38px; width: 68px;">发布</button>&nbsp&nbsp&nbsp&nbsp
								<div class="checkbox checkbox-success" style="margin-left:70px;margin-top:-26px">
		                        <input id="checkbox3" class="styled" type="checkbox" style="margin-top:5px" checked="true">
		                        <label for="checkbox3" id="weizhi">
		                            	
		                        </label>
		                    </div>
						</div>
						<div class="row" style="width: 472px;"></div>
					</div>
					<form id="cardform">
					
					
					
					
					
					
					
					<!-- 1 -->
						<div class="card" style="opacity: 0" id="card1">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[0].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[0].userName }&page=1"
													style="color: black; text-decoration: none">${userlist[0].userName}</a>
											<div style="font-size: 15px; margin-top: 0">${userlist[0].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 20px; margin-top: 10px;">&nbsp&nbsp&nbsp${bloglist[0].blogContent
									}</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(0)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan0" style="margin-left: 925px; margin-top: -50px;">${bloglist[0].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(0)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[0].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论1 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1" class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 2 -->
						<div class="card" style="opacity: 0" id="card2">
							<div class="card" style="opacity: 0" id="card1">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[1].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[1].userName }&page=1"
													style="color: black; text-decoration: none">${userlist[0].userName}</a>
											<div style="font-size: 15px; margin-top: 0">${userlist[1].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 20px; margin-top: 10px;">&nbsp&nbsp&nbsp${bloglist[1].blogContent
									}</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(1)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan1" style="margin-left: 925px; margin-top: -50px;">${bloglist[1].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(1)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[1].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论2-->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 3 -->
						<div class="card" style="opacity: 0" id="card3">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[2].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[2].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[2].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[2].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[2].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(2)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan2" style="margin-left: 925px; margin-top: -50px;">${bloglist[2].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(2)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[2].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论3 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 4 -->
						<div class="card" style="opacity: 0" id="card4">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[3].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[3].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[3].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[3].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[3].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(3)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan3" style="margin-left: 925px; margin-top: -50px;">${bloglist[3].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(3)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[3].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论4 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 5 -->
						<div class="card" style="opacity: 0" id="card5">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[4].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[4].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[4].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[4].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[4].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(4)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan4" style="margin-left: 925px; margin-top: -50px;">${bloglist[4].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(4)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[4].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论5 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 6 -->
						<div class="card" style="opacity: 0" id="card6">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[5].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[5].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[5].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[5].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[5].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(5)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan5" style="margin-left: 925px; margin-top: -50px;">${bloglist[5].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(5)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[5].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论6 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 7 -->
						<div class="card" style="opacity: 0" id="card7">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[6].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[6].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[6].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[6].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[6].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(3)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan6" style="margin-left: 925px; margin-top: -50px;">${bloglist[6].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(6)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[6].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论7 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 8 -->
						<div class="card" style="opacity: 0" id="card8">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[7].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[7].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[7].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[7].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[7].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(7)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan7" style="margin-left: 925px; margin-top: -50px;">${bloglist[7].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(7)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[7].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论8 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 9 -->
						<div class="card" style="opacity: 0" id="card9">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[8].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[8].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[8].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[8].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[8].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(8)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan8" style="margin-left: 925px; margin-top: -50px;">${bloglist[8].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(8)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[8].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论9 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
						
						
						
						
						
						
						
						<!-- 10 -->
						<div class="card" style="opacity: 0" id="card10">
							<div class="card-body">
								<h4 class="card-title">
									<div class="row" style="">
										<div class=" col-sm-1">
											<h3>
												<img
													src="<%=basePath%>image/${userinfolist[9].userHeadimageSrc}"
													height="128" width="128"
													style="width: 50px; height: 50px; border-radius: 20px 20px;">
											</h3>
										</div>
										<div class="col-sm-4 col-5 ">
											<p style="font-size: 18px">
												<a
													href="../user/goother?username=${userlist[9].userName}&page=1"
													style="color: black; text-decoration: none">${userlist[9].userName}</a>
											<div style="font-size: 15px; margin-top: 0px">${userlist[9].userSignature}</div>
											</p>
										</div>
									</div>
								</h4>
								<p class="card-text" style="font-size: 25px; margin-top: 10px">${bloglist[9].blogContent }</p>
							</div>
							<div style="margin-top: -30px">
								<div class="heart "  onclick="dianzan(9)" id="like1" rel="like"
									style="margin-left: 850px; margin-top: -10px"></div>
								<p id="dianzan9" style="margin-left: 925px; margin-top: -50px;">${bloglist[9].blogPraise }</p>
								<p id="pinglun" class="pinglun" onclick="pinglunmethod(9)"
									style="margin-left: 1000px; margin-top: -25px; color：gray; font-size: 15px; cursor: pointer;">评论(3)</p>
								<p
									style="margin-left: 20px; margin-top: -25px; color：gray; font-size: 15px">${bloglist[9].blogPublishTime }</p>
								<p style="margin-top: 15px;"></p>
							</div>
							<!-- 评论10 -->
							<div id="commentfather" class="commentfather">
								<div id="comment" class="comment">
									<textarea rows="1" cols="5" id="t1" class="t1"
										style="margin-left: 20px; margin-bottom: 20px; margin-top: 20px; width: 800px; height: 50px; outline: none; resize: none; border: 1px solid #ccc; border-radius: 3px; padding: 5px; color: #660000;"></textarea>
									<a class="btn btn-xs btn-success" id="btn11"
										style="color: white; margin-top: -55px; margin-bottom: 20px">发送</a>
									<ul id="u1"  class="u1"
										style="margin-top: 10px; width: 750px; bottom: 0; overflow-x: hidden; overflow-y: hidden; margin-left: 100px">
									</ul>
								</div>
							</div>
						</div>
						<div style="height: 15px"></div>
					</form>
					<ul class="pagination" style="margin-left: 240px">
						<li class="page-item"><a class="page-link"
							href="/blog/getList?page=1">首页</a></li>
						<li class="page-item"><a class="page-link"
							href="/blog/getList?page=${prepage }">上一页</a></li>
						<li class="page-item" id="it1"><a class="page-link"
							href="/blog/getList?page=${prepage }">${prepage }</a></li>
						<li class="page-item"><a class="page-link"
							href="/blog/getList?page=${indexpage }"
							style="font-weight: bold; color: DarkSlateGray">${indexpage }</a></li>
						<li class="page-item" id="it3"><a class="page-link"
							href="/blog/getList?page=${lastpage }">${lastpage }</a></li>
						<li class="page-item"><a class="page-link"
							href="/blog/getList?page=${lastpage }">下一页</a></li>
						<li class="page-item"><a class="page-link"
							href="/blog/getList?page=${reallastpage }">尾页</a></li> &nbsp&nbsp&nbsp
						<li class="page-item"><div class="p-1 bg-warning"
								style="height: 30px; margin-top: 4px; font-size: 14px; font-weight: bold">&nbsp总页数:${reallastpage
								}&nbsp&nbsp</div></li>

					</ul>
				</div>
			</div>
			<div class="  col-3  col-sm-2">
				<div class="card" style="">
					<div class="card-body" id="index_">
						<h4 class="card-title">
							<font style="vertical-align: inherit;"><font
								style="vertical-align: inherit;">公告栏</font></font>
						</h4>
						<p class="card-text">
							<font style="vertical-align: inherit;"> <font
								style="vertical-align: inherit;">测试维护ing</font>
							</font>
						</p>
					</div>
				</div>
				<h3 style="width: 12px;">
					<font style="vertical-align: inherit;"><font
						style="vertical-align: inherit;"></font></font>
				</h3>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/holderjs@2.9.4/holder.js"></script>
	<script src="../js/hblog.js"></script>
	<script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>  
	<script>
	//分页
	var pinglundiv = document.getElementsByClassName("comment");
	var pinglundivid = document.getElementById("comment");
	window.onload = function () {
		for(var pi= 0 ; pi<3;pi++){
			for(var i = 0;i<pinglundiv.length;i++){
				pinglundiv[i].parentNode.removeChild(pinglundiv[i]);
			}
		}
		pinglundiv[0].parentNode.removeChild(pinglundiv[0]);
	    var pagesize =
	        <%=session.getAttribute("pagesize")%> *
	        11;
	    var hiddendiv = 110 - pagesize;
	    var a = document.getElementById("cardform")
	    var b = a.getElementsByTagName("div");
	    for (var i = 0; i < pagesize; i++) {
	        b[i].style.opacity = "100";
	    }
	    var it1 = document.getElementById('it1');
	    var it3 = document.getElementById('it3');
	    if ('${indexpage}' == 1) {
	        it1.parentNode.removeChild(it1);
	    }
	    if ('${lastpage}' == '${reallastpage}')
	        it3.parentNode.removeChild(it3);
	}
	//点赞
	var blogid;
	var aa;
		function dianzan(a){
			aa = a;
			if(a==0){
				blogid = '${bloglist[0].blogId }'
			}else if(a==1){
				blogid = '${bloglist[1].blogId }'
			}else if(a==2){
				blogid = '${bloglist[2].blogId }'
			}else if(a==3){
				blogid = '${bloglist[3].blogId }'
			}else if(a==4){
				blogid = '${bloglist[4].blogId }'
			}else if(a==5){
				blogid = '${bloglist[5].blogId }'
			}else if(a==6){
				blogid = '${bloglist[6].blogId }'
			}else if(a==7){
				blogid = '${bloglist[7].blogId }'
			}else if(a==8){
				blogid = '${bloglist[8].blogId }'
			}else if(a==9){
				blogid = '${bloglist[9].blogId }'
			}
		}
		var dian1 = 1;
		 var dian2 = 1;
	        var dian3 = 1;
	        var dian4 = 1;
	        var dian5 = 1;
	        var dian6 = 1;
	        var dian7 = 1;
	        var dian8 = 1;
	        var dian9 = 1;
	        var dian10 = 1;
	$(document).ready(function () {
			$(".heart").on("click", function () {
	        var dianzan0 = $("#dianzan0");
	        var dianzan1 = $("#dianzan1").text();
	        var dianzan2 = $("#dianzan2").text();
	        var dianzan3 = $("#dianzan3").text();
	        var dianzan4 = $("#dianzan4").text();
	        var dianzan5 = $("#dianzan5").text();
	        var dianzan6 = $("#dianzan6").text();
	        var dianzan7 = $("#dianzan7").text();
	        var dianzan8 = $("#dianzan8").text();
	        var dianzan9 = $("#dianzan9").text();
	       
	            if(aa==0){
	            	dian1 = Number(dian1) + 1;
	        		console.log("dian1:"+dian1)
	            	if(dian1 % 2 == 0){
	            		var localdianzan = '${bloglist[0].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan0").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[0].blogPraise }';
			        	$("#dianzan0").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==1){
	            	dian2 = Number(dian2) + 1;
	            	if(dian2 % 2 == 0){
	            		var localdianzan = '${bloglist[1].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan1").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[1].blogPraise }';
			        	$("#dianzan1").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==2){
	            	dian3 = Number(dian3) + 1;
	            	if(dian3 % 2 == 0){
	            		var localdianzan = '${bloglist[2].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan2").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[2].blogPraise }';
			        	$("#dianzan2").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==3){
	            	dian4 = Number(dian4) + 1;
	            	if(dian4 % 2 == 0){
	            		var localdianzan = '${bloglist[3].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan3").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[3].blogPraise }';
			        	$("#dianzan3").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==4){
	            	dian5 = Number(dian5) + 1;
	            	if(dian5 % 2 == 0){
	            		var localdianzan = '${bloglist[4].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan4").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[4].blogPraise }';
			        	$("#dianzan4").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==5){
	            	dian6 = Number(dian6) + 1;
	            	if(dian6 % 2 == 0){
	            		var localdianzan = '${bloglist[5].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan5").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[5].blogPraise }';
			        	$("#dianzan5").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==6){
	            	dian7 = Number(dian7) + 1;
	            	if(dian7 % 2 == 0){
	            		var localdianzan = '${bloglist[6].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan6").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[6].blogPraise }';
			        	$("#dianzan6").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==7){
	            	dian8 = Number(dian8) + 1;
	            	if(dian8 % 2 == 0){
	            		var localdianzan = '${bloglist[7].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan7").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[7].blogPraise }';
			        	$("#dianzan7").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==8){
	            	dian9 = Number(dian9) + 1;
	            	if(dian9 % 2 == 0){
	            		var localdianzan = '${bloglist[8].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan8").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[8].blogPraise }';
			        	$("#dianzan8").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	            if(aa==9){
	            	dian10 = Number(dian10) + 1;
	            	if(dian10 % 2 == 0){
	            		var localdianzan = '${bloglist[9].blogPraise }';
	            		console.log(localdianzan)
			            nowdianzan = Number(localdianzan) + Number(1);
			        	$("#dianzan9").text(nowdianzan);
			        	var url = "../blog/addhert?blogid="+blogid;
			            $.post(url);
	            	}else{
	            		var dianzan = '${bloglist[9].blogPraise }';
			        	$("#dianzan9").text(dianzan);
			        	 var url1 = "../blog/minushert?blogid="+blogid;
				            $.post(url1);
	            	}
	            }
	        var A = $(this).attr("id");
	        var B = A.split("like");
	        var messageID = B[1];
	        var C = parseInt($("#likeCount" + messageID).html());
	        $(this).css("background-position", "")
	        var D = $(this).attr("rel");

	        if (D === 'like') {
	            $("#likeCount" + messageID).html(C + 1);
	            $(this).addClass("heartAnimation").attr("rel", "unlike");

	        } else {
	            $("#likeCount" + messageID).html(C - 1);
	            $(this).removeClass("heartAnimation").attr("rel", "like");
	            $(this).css("background-position", "left");
	        }

	    });
	});
	/* 评论部分的js */
	var pingluns = document.getElementsByClassName("pinglun");
	var oUls = document.getElementsByClassName("u1");
	var oTextareas = document.getElementsByClassName("t1");
	var oBtn = document.getElementById("btn11");
	var lis = oUls[0].getElementsByTagName("li");
	var i = 1;
	//选择出进行评论操作的blog
	/* var comments = document.getElementsByClassName("comment") */
		var aaa;
		var prevalue;
		var nowvalue;
		function pinglunmethod(a) {
		var blogid;
		aaa =a ;
		if(a==0){
			blogid = '${bloglist[0].blogId }'
		}else if(a==1){
			blogid = '${bloglist[1].blogId }'
		}else if(a==2){
			blogid = '${bloglist[2].blogId }'
		}else if(a==3){
			blogid = '${bloglist[3].blogId }'
		}else if(a==4){
			blogid = '${bloglist[4].blogId }'
		}else if(a==5){
			blogid = '${bloglist[5].blogId }'
		}else if(a==6){
			blogid = '${bloglist[6].blogId }'
		}else if(a==7){
			blogid = '${bloglist[7].blogId }'
		}else if(a==8){
			blogid = '${bloglist[8].blogId }'
		}else if(a==9){
			blogid = '${bloglist[9].blogId }'
		}
			 var pinglunfather = document.getElementsByClassName("commentfather");
		        i = Number(i) + 1;
		        /* i递增，从i==2开始  a 是为变量赋的值*/
		         if(i==2){
		        	preprevalue = a;
		        	prevalue = a;
		        	nowvalue = a;
		        	pinglunfather[a].appendChild(pinglundivid);
		        }else if(i==3){
		        	nowvalue = a;
		        	if(prevalue == nowvalue){
		        		pinglundiv[0].parentNode.removeChild(pinglundiv[0]);
		        	}else{
		        		pinglunfather[nowvalue].appendChild(pinglundivid);
		        	}
		        }else if(i==4){
		        	prevalue = nowvalue;
		        	nowvalue = a;
		        	if(prevalue == nowvalue&&preprevalue!==nowvalue){
		        		pinglundiv[0].parentNode.removeChild(pinglundiv[0]);
		        		pinglunfather[nowvalue].appendChild(pinglundivid);
		        	}else if(prevalue == nowvalue&&preprevalue==nowvalue){
		        		pinglunfather[nowvalue].appendChild(pinglundivid);
		        	}
		        }else{
		        	preprevalue = prevalue;
		        	prevalue = nowvalue;
		        	nowvalue = a;
		        }
		        if(i>3&&prevalue == nowvalue&&pinglundiv.length==0){
		        	pinglunfather[nowvalue].appendChild(pinglundivid);
		        }else if(i>3&&prevalue == nowvalue&&pinglundiv.length==1){
		        	pinglundiv[0].parentNode.removeChild(pinglundiv[0]);
		        } else if(i>3){
		        	if(pinglundiv.length == 1){
		        		pinglundiv[0].parentNode.removeChild(pinglundiv[0]);
		        	}
		        	pinglunfather[nowvalue].appendChild(pinglundivid);
		        }
		        //i==2?prevalue = a;nowvalue = a:i==3?nowvalue = a:prevalue = nowvalue;nowvalue = a; 三元表达式
	        //点击评论的时候先通过blogid获取当前blog的数据库的评论列表comments，从列表中按时间排序，每个评论包含username,userimg，content
	        var url = "../comment/getcomment?blogid="+blogid;
	        console.log("url:"+url)
	        /* 清空上次的评论 */
	        //下载新的评论
	        	$.ajax({
		            dataType:"json",
		            type:"POST",
		            url:url,
		            success:function(data){
		            	if(lis.length!==0){
		            		for(var aisd = 0;aisd<100;aisd++){
	        	        	for(var ilis=0;ilis<lis.length;ilis++){
	        	        		console.log(ilis)
	        	        		 oUls[0].removeChild(lis[ilis]);
	        	        	}
	        	        }
		            	}
		                var arr=data.comments;
		                 for(var i=0;i<data.comments.length;i++){
		                    var username=arr[i].username;
		                    var commentcontent=arr[i].blogCommentContent;
		                    var headimg=arr[i].userimg;
		                    var aLi = document.createElement("li");
			                var aSpan = document.createElement("span");
			                var userimg = "<img src=<%=basePath%>image/" + headimg + " id='prevView' height='12' width='12' style='width: 20px; height: 20px; border-radius: 5px 5px;'>";
							var commentuser = userimg+"&nbsp&nbsp" +username+"&nbsp:&nbsp&nbsp";
							aLi.innerHTML = commentuser + oTextareas[0].value;
									oUls[0].appendChild(aLi);
									aLi.appendChild(aSpan);
									oTextareas[0].value = commentcontent;
		                }  
		            },error:function(data){
		                alert(请重试);
		            }
		        });
	        var t = new Date();
	        var Year = t.getFullYear();
	        var Month = t.getMonth() + 1;
	        var Day = t.getDate();
	        var Hours = t.getHours();
	        var Minutes = t.getMinutes();
	        var Scondes = t.getSeconds();
	        var timers = toString(Year) + "年" + toString(Month) + "月" +
	            toString(Day) + "日" + toString(Hours) + ":" +
	            toString(Minutes) + ":" + toString(Scondes); //将获取到的日期对象拼接。
	        function toString(n) //数字转字符串
	        {
	            if (n < 9) {
	                n = "0" + n;
	            } else {
	                n = "" + n;
	            }
	            return n;
	        };
	        //发送按钮被点击
	        oBtn.onclick = function () {
	            if (oTextareas[0].value == "") {
	                alert("评论不能为空");
	            } else {
	        //上传评论
	        var url2 = "../comment/setcomment?blogid="+blogid+"&blogcomment="+oTextareas[0].value;
	        $.post(url2);
	                var aLi = document.createElement("li");
	                var aSpan = document.createElement("span");
	              var userimg = "<img src='<%=basePath%>image/${userinfolist[9].userHeadimageSrc}' id='prevView' height='12' width='12' style='width: 20px; height: 20px; border-radius: 5px 5px;'>";
				var commentuser = userimg + "&nbsp"+'${user.userName }'+": &nbsp ";
				aLi.innerHTML = commentuser + oTextareas[0].value;
				//插入时间
				/* aSpan.innerHTML=timers+"<a href='javascript:;' title='删除这条信息'>删除</a>"; */
				aSpan.innerHTML = "  <a href='javascript:;'>删除</a>"
				if (oUls[0].children.length > 0) {
					oUls[0].insertBefore(aLi, oUls[0].children[0]);
					aLi.appendChild(aSpan);
					oTextareas[0].value = "";
				} else {
					oUls[0].appendChild(aLi);
					console.log(oUl)
					aLi.appendChild(aSpan);
					oTextareas[0].value = "";
				}
				;
				var aLiHeight = parseInt(getStyle(aLi, "height"));
				//console.log(aLiHeight);
				aLi.style.height = "0";
				startMove(aLi, {
					height : aLiHeight
				}, function() {
					startMove(aLi, {
						opacity : 100
					});
				});
				delLi(); //添加数据后加载删除模块	
			}
		};
	}
		
		function delLi() {
			for(var oi = 0;oi<oUls.length;oi++){
				var oA = oUls[oi].getElementsByTagName("a");
				for (var i = 0; i < oA.length; i++) {
					oA[i].onclick = function() {
						liNode = this.parentNode.parentNode //获取到当前A标签的父节点，也就是LI
						var aLiHeight = parseInt(getStyle(liNode, "height")) + 1;
						//console.log(aLiHeight);
						//链式运动操作：先进行透明化，再进行高度变小，最后删除DOM元素
						startMove(liNode, {
							opacity : 0
						}, function() {
							startMove(liNode, {
								height : 0
							}, function() {
								oUl.removeChild(liNode);
							});
						});
					}
				}
			}
		};

		//运动框架
		function startMove(obj, json, endFn) {
			clearInterval(obj.timer);
			obj.timer = setInterval(function() {
				var iStop = true;
				for ( var curr in json) {
					var oNumber = 0;
					if (curr == "opacity") {
						oNumber = Math
								.round(parseFloat(getStyle(obj, curr)) * 100);
					} else {
						oNumber = parseInt(getStyle(obj, curr));
					}
					var speed = (json[curr] - oNumber) / 6;
					speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);
					if (oNumber != json[curr])
						iStop = false;
					if (curr == "opacity") {
						obj.style.filter = "alpha(opacity:" + (oNumber + speed)
								+ ")";
						obj.style.opacity = (oNumber + speed) / 100;
					} else {
						obj.style[curr] = oNumber + speed + "px";
					}
				}
				;
				if (iStop) {
					clearInterval(obj.timer);
					if (endFn)
						endFn();
				}
			}, 30);
		};

		//获取非行间样式
		function getStyle(obj, name) {
			if (obj.currentStyle) {
				obj = currentStyle[name];
			} else {
				obj = getComputedStyle(obj, false)[name];
			}
			return obj;
		};
		var city = returnCitySN.cname;
		var checkcityval = document.getElementById("weizhi");
		var checkcity = document.getElementById("checkbox3");
		checkcityval.onclick = function() {
			if(checkcity.checked){
				checkcityval.innerHTML="你在哪里"
			}else{
				checkcityval.innerHTML=city+"   (此动态将进入同城动态列表)"
			}
		}
		if(checkcity.checked){
			checkcityval.innerHTML=city+"   (此动态将进入同城动态列表)"
		}else{
			console.log("没有选中")
			checkcityval.innerHTML="你在哪里"
		}
		var samecity = document.getElementById("samecity");
		
		samecity.onclick = function() {
			window.location.href = '../blog/samecity?page=1&cityname='+city;
		}
		var fabu = document.getElementById("fabu");
		fabu.onclick = function() {
			var content = document.getElementById("blogContent");
			var val = content.value;
			window.location.href = '../blog/uploadblog?content='+val+'&cityname='+city;
		}
	</script>
	<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32"
		viewBox="0 0 32 32" preserveAspectRatio="none"
		style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;">
	<defs>
	<style type="text/css"></style>
	</defs> <text x="0" y="2"
		style="font-weight:bold;font-size:2pt;font-family:Arial, Helvetica, Open Sans, sans-serif">32x32</text></svg>

</body>

</html>