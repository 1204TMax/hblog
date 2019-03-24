<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>私信</title>
<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/chatmain.css" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
</head>
<body>
	<div class="box">
		<div class="wechat">

			<div class="sidestrip">
				<div class="am-dropdown" data-am-dropdown>
					<!--头像插件-->
					<div class="own_head am-dropdown-toggle"></div>
					<div class="am-dropdown-content">
						<div class="own_head_top">
							<div class="own_head_top_text">
								<p class="own_name">${user.userName }<img
										src="../img/icon/head.png" alt="" />
								</p>
							</div>
							<!-- 	<img src="images/own_head.jpg" alt="" /> -->
						</div>
						<div class="own_head_bottom">
							<p>
								<span>地区</span>江西 九江
							</p>
							<div class="own_head_bottom_img">
								<a href=""><img src="../img/icon/head_1.png" /></a> <a href=""><img
									src="../img/icon/head_2.png" /></a>
							</div>
						</div>
					</div>
				</div>
				<!--三图标-->
				<div class="sidestrip_icon">
					<a id="si_1"
						style="background: url(../img/icon/head_2_1.png) no-repeat;"></a>
					<a id="si_2"></a> <a id="si_3"></a>
				</div>

				<!--底部扩展键-->
				<div id="doc-dropdown-justify-js">
					<div class="am-dropdown" id="doc-dropdown-js"
						style="position: initial;">
						<div class="sidestrip_bc am-dropdown-toggle"></div>
						<ul class="am-dropdown-content" style="">
							<li><a href="#"
								data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 225}">意见反馈</a>
								<div class="am-modal am-modal-no-btn" tabindex="-1"
									id="doc-modal-1">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">
											Modal 标题 <a href="javascript: void(0)"
												class="am-close am-close-spin" data-am-modal-close>&times;</a>
										</div>
										<div class="am-modal-bd">Modal 内容。本 Modal 无法通过遮罩层关闭。</div>
									</div>
								</div></li>

							<li><a href="#">备份与恢复</a></li>
							<li><a href="#">设置</a></li>
						</ul>
					</div>
				</div>
			</div>

			<!--聊天列表-->
			<div class="middle on">
				<div class="wx_search">
					<input type="text" placeholder="搜索" />
					<button>+</button>
				</div>
				<div class="office_text">
					<ul class="user_list" id="user_list">

					</ul>
				</div>
			</div>

			<!--好友列表-->
			<div class="middle">
				<div class="wx_search">
					<input type="text" placeholder="搜索" />
					<button>+</button>
				</div>
				<div class="office_text">
					<ul class="friends_list">
						<li>
							<p>新的朋友</p>
							<div class="friends_box">
								<div class="user_head">
									<img src="<%=basePath%>image/${userinfos[0].userHeadimageSrc}" />
								</div>
								<div class="friends_text">
									<p class="user_name">新的朋友</p>
								</div>
							</div>
						</li>
						<li>
							<p>公众号</p>
							<div class="friends_box">
								<div class="user_head">
									<img src="<%=basePath%>image/${userinfos[0].userHeadimageSrc}" />
								</div>
								<div class="friends_text">
									<p class="user_name">公众号</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>

			<!--程序列表-->
			<div class="middle">
				<div class="wx_search">
					<input type="text" placeholder="搜索收藏内容" />
					<button>+</button>
				</div>
				<div class="office_text">
					<ul class="icon_list">
						<li class="icon_active">
							<div class="icon">
								<img src="../img/icon/icon.png" alt="" />
							</div> <span>全部收藏</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon1.png" alt="" />
							</div> <span>链接</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon2.png" alt="" />
							</div> <span>相册</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon3.png" alt="" />
							</div> <span>笔记</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon4.png" alt="" />
							</div> <span>文件</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon5.png" alt="" />
							</div> <span>音乐</span>
						</li>
						<li>
							<div class="icon">
								<img src="../img/icon/icon6.png" alt="" />
							</div> <span>标签</span>
						</li>
					</ul>
				</div>
			</div>

			<!--聊天窗口-->
			<div class="talk_window">
				<div class="windows_top">
					<div class="windows_top_box">
						<span>${user.userName }</span>
						<ul class="window_icon">
							<li><a href=""><img src="../img/icon/icon7.png" /></a></li>
							<li><a href=""><img src="../img/icon/icon8.png" /></a></li>
							<li><a href=""><img src="../img/icon/icon9.png" /></a></li>
							<li><a href=""><img src="../img/icon/icon10.png" /></a></li>
						</ul>
						<div class="extend" class="am-btn am-btn-success"
							data-am-offcanvas="{target: '#doc-oc-demo3'}"></div>
						<!-- 侧边栏内容 -->
						<div id="doc-oc-demo3" class="am-offcanvas">
							<div class="am-offcanvas-bar am-offcanvas-bar-flip">
								<div class="am-offcanvas-content">
									<p>
										<a href="http://music.163.com/#/song?id=385554"
											target="_blank">网易音乐</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!--聊天内容-->
				<div class="windows_body">
					<div class="office_text" style="height: 100%;">
						<ul class="content" id="chatbox">
							<li class="me"><img src="<%=basePath%>image/${headimgsrc}"
								title=${user.userName }><span>${otherchat[0][0].messageContent }</span></li>
							<li class="other"><img
								src="<%=basePath%>image/${userinfos[0].userHeadimageSrc}"
								title=${users[0].userName }><span>${userchat[0][0].messageContent }</span></li>
						</ul>
					</div>
				</div>

				<div class="windows_input" id="talkbox">
					<div class="input_icon">
						<a href="javascript:;"></a> <a href="javascript:;"></a> <a
							href="javascript:;"></a> <a href="javascript:;"></a> <a
							href="javascript:;"></a> <a href="javascript:;"></a>
					</div>
					<div class="input_box">
						<textarea name="" rows="" cols="" id="input_box"></textarea>
						<button id="send">发送（S）</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/amazeui.min.js"></script>
	<script type="text/javascript" src="../js/zUI.js"></script>
	<script type="text/javascript" src="../js/wechat.js"></script>

<script type="text/javascript">
//三图标
window.onload=function(){
	function a(){
		var si1 = document.getElementById('si_1');
		var si2 = document.getElementById('si_2');
		var si3 = document.getElementById('si_3');
		si1.onclick=function(){
			si1.style.background="url(images/icon/head_2_1.png) no-repeat"
			si2.style.background="";
			si3.style.background="";
		};
		si2.onclick=function(){
			si2.style.background="url(images/icon/head_3_1.png) no-repeat"
			si1.style.background="";
			si3.style.background="";
		};
		si3.onclick=function(){
			si3.style.background="url(images/icon/head_4_1.png) no-repeat"
			si1.style.background="";
			si2.style.background="";
		};
	};
	function b(){
		var text = document.getElementById('input_box');
		var chat = document.getElementById('chatbox');
		var btn = document.getElementById('send');
		var talk = document.getElementById('talkbox');
		btn.onclick=function(){
			if(text.value ==''){
				alert('不能发送空消息');
			}else{
				chat.innerHTML += '<li class="me"><img src="'+'images/own_head.jpg'+'"><span>'+text.value+'</span></li>';
				text.value = '';
				chat.scrollTop=chat.scrollHeight;
				talk.style.background="#fff";
				text.style.background="#fff";
			};
		};
	};

	a();
	b();
	c();
};
 window.onload=function b(){
	var text = document.getElementById('input_box');
	var chat = document.getElementById('chatbox');
	var btn = document.getElementById('send');
	var talk = document.getElementById('talkbox');
	
	btn.onclick=function(){
		if(text.value ==''){
            alert('不能发送空消息');
        }else{
        	 var url2 = "../message/insertchatrecord?messagecontent="+text.value+"&receiveid="+'${users[0].userId}';
        	$.post(url2);
        	var url = '${headimgsrc}';
			chat.innerHTML += '<li class="me"><img src="<%=basePath%>image/'+url+'"><span>'+text.value+'</span></li>';
			text.value = '';
			chat.scrollTop=chat.scrollHeight;
			talk.style.background="#fff";
			text.style.background="#fff";
		};
	};
 }

 window.onload=function c(){
		var conhtml= "<P></p>"; 
		var imglist = new Array();
		var namelist = new Array();
		var chatlist = new Array();
		var timelist = new Array();
		
		<c:forEach items="${userinfos}" var="userinfo">
			imglist.push("${userinfo.userHeadimageSrc}")
		</c:forEach>
		
		<c:forEach items="${users}" var="user">
			namelist.push("${user.userName}")
		</c:forEach>
			
		<c:forEach items="${userchat[0]}" var="userchat">
			chatlist.push("${userchat.messageContent}")
		</c:forEach>
			
		<c:forEach items="${otherchat[0]}" var="otherchat">
			timelist.push("${otherchat.messageTime}")
		</c:forEach>
	 for(var i = 0;i<'${fn:length(users)}';i++){
		var  contacts = '<li class="user_active1" id="user_active"><div class="user_head"><img src="<%=basePath%>image/'+imglist[i]+'" style="height:40px"/ ></div><div class="user_text" ><p class="user_name" id="user_name">'+namelist[i]+'</p><p class="user_message">'+chatlist[i]+'</p></div><div class="user_time">'+timelist[i]+' </div></li>'
		conhtml = conhtml += contacts;
			}
		$("#user_list").prepend(conhtml); 
		/* 这里就是聊天记录的内容了 */
			<%--  var userlist = document.getElementById("user_list");
			 var userlistli = userlist.getElementsByTagName("li");
			 
			 for(var i = 0;i<userlistli.length;i++){
				 userlistli[i].index=i;
				 userlistli[i].onclick=function(){
					 for(var j=0;j<userlistli.length;j++){
						 userlistli[j].className = "user_active1"
					 }
					 this.className = "user_active";
					var otherchatname = namelist[this.index];
					var otherchatimg = imglist[this.index];
					 var chathtml= "<P></p>"; 
					 var chatlist = new Array();
					 var userchat= new Array();
					 var otherchat= new Array();
					 for(var i=0;i<userchat.length;i++){
						 userchat2.push(userchat[this.index][i].messageContent);
						 var a = userchat[this.index][i].messageContent;
						 var b = userchat[0][0].messageContent;
						 console.log("你猜："+a);
						 console.log("我猜："+b);
					 } 
					 var  len = '${fn:length(otherchat[1])}'
						 for(var ij=0;ij<len;ij++){
						var mechats = '<li class="me"><img src="<%=basePath%>image/${headimgsrc}" title=${user.userName }><span>${otherchat[this.index][ij].messageContent }</span></li>'
						chatlist.push(mechats);
						var otherchats='<li class="other"><img src="<%=basePath%>image/${userinfos[0].userHeadimageSrc}"  title=${users[0].userName }><span>${userchat[this.index][ij].messageContent }</span></li>'
				 		chatlist.push(otherchats); 
						}
						for(var i=0;i<otherchat[this.index].length;i++){
							chathtml = chathtml+=chatlist[i];
						}
						$("#chatbox").prepend(chathtml); 
				 } 
			 } --%>
	}
	//插入自己的聊天记录
	
	//插入别人的聊天记录eyy
			</script>
		</body>
		</html>
	