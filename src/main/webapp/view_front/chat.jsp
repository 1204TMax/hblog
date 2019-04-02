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
<body style="background: url(../img/bg5.jpg)">
	<div class="box">
		<div class="wechat">

			<div class="sidestrip">
				<div class="am-dropdown" data-am-dropdown>
					<!--头像插件-->
					<div class="own_head am-dropdown-toggle">
						<img src="<%=basePath%>image/${headimgsrc}" height="30" width="30" />
					</div>
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
								<span>地区</span>${userinfo.userinfoOftenPlace }
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
					<a id="si_2"></a>
				</div>

				<!--底部扩展键-->
				<div id="doc-dropdown-justify-js">
					<div class="am-dropdown" id="doc-dropdown-js"
						style="position: initial;"></div>
				</div>
			</div>

			<!--联系人-->
			<div class="middle on">
				<div class="wx_search">
					<input type="text" placeholder="${tang }" />
					<button>+</button>
				</div>
				<div class="office_text">
					<ul class="friends_list">
						<li id="chatlist"></li>
					</ul>
				</div>
			</div>
			<!--我的关注列表-->
			<div class="middle">
				<div class="wx_search">
					<input type="text" placeholder="搜索" />
					<button>+</button>
				</div>
				<div class="office_text">
					<ul class="friends_list">
						<li id="focuslist">
							<p>我关注的人</p>
							<div class="friends_box">
								<div class="user_head">
									<img src="<%=basePath%>image/${userinfo.userHeadimageSrc}" />
								</div>
								<div class="friends_text">
									<p class="user_name">${user.userName }</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
			<!--聊天窗口-->
			<div class="talk_window">
				<div class="windows_top">
					<div class="windows_top_box">
						<span id="chatusername"></span>
						<ul class="window_icon">
						</ul>
						<div class="extend" class="am-btn am-btn-success"
							data-am-offcanvas="{target: '#doc-oc-demo3'}"></div>
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
						<button id="send">发送</button>
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
window.onload=function(){
	var imglistc = new Array();
	var namelistc = new Array();
	var imglistf = new Array();
	var namelistf = new Array();
	var choiceuser;
	/* 查询联系人名单 */
	var chatlist = document.getElementById('chatlist');
	var focuslist = document.getElementById('focuslist');
	var chatbox = document.getElementById('chatbox');
	/* 获得左边联系人/关注的单个div */
	var chatli = document.getElementsByClassName("chatli");
	var focusli = document.getElementsByClassName("focusli"); 
	
	function a(){
		var si1 = document.getElementById('si_1');
		var si2 = document.getElementById('si_2');
		si1.onclick=function(){
			si1.style.background="url(../img/icon/head_2_1.png) no-repeat"
			si2.style.background="";
			g("chatuser")
		};
		si2.onclick=function(){
			si2.style.background="url(../img/icon/head_3_1.png) no-repeat"
			si1.style.background="";
			g("focususer")
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
				var messagecontent = $("#input_box").val();
				chat.innerHTML += '<li class="me"><img src="<%=basePath%>image/${headimgsrc}"><span>'+text.value+'</span></li>';
				text.value = '';
				chat.scrollTop=chat.scrollHeight;
				talk.style.background="#fff";
				text.style.background="#fff";
				var url = "../message/insertchatrecord?messagecontent="+messagecontent+"&recivename="+choiceuser;
				console.log("url:"+url)
				$.post(url);
				
			};
		};
	};
	/* 后台获取聊天的联系人列表并添加到页面 */
	function c(){
		var conhtml= ""; 
				<c:forEach items="${userinfos}" var="userinfo">
					imglistc.push("${userinfo.userHeadimageSrc}")
				</c:forEach>
				
				<c:forEach items="${users}" var="user">
					namelistc.push("${user.userName}")
				</c:forEach>
		for(var i = 0;i<'${fn:length(users)}';i++){
			var chatlist1 = "";
			if(i==0){
				 chatlist1 ="<p>联系人</p>"
					+"<div class='friends_box chatli'>"
					+"<div class='user_head'>"
					+"<img height=40px width=40px src=<%=basePath%>image/"+imglistc[i]+"/ >"
					+"</div>"
					+"<div class='friends_text'>"
					+"<p class='user_name'>"+namelistc[i]+"</p>"
					+"</div>"
					+"</div>" 
			}else{
				 chatlist1 ="<div class='friends_box chatli'>"
					+"<div class='user_head'>"
					+"<img height=40px width=40px src=<%=basePath%>image/"+imglistc[i]+"/ >"
					+"</div>"
					+"<div class='friends_text'>"
					+"<p class='user_name'>"+namelistc[i]+"</p>"
					+"</div>"
					+"</div>" 
			}
			conhtml = conhtml+chatlist1;
		}
		chatlist.innerHTML=conhtml;
	}
	/* 后台获取我的关注列表 */
	
function d(){
	var conhtml= ""; 
	<c:forEach items="${focusinfo}" var="userinfo">
		imglistf.push("${userinfo.userHeadimageSrc}")
	</c:forEach>
	<c:forEach items="${userfocus}" var="user">
		namelistf.push("${user.userName}")
	</c:forEach>
for(var i = 0;i<'${fn:length(userfocus)}';i++){
var chatlist1 = "";
if(i==0){
	 chatlist1 ="<p>我关注的人</p>"
		+"<div class='friends_box focusli'>"
		+"<div class='user_head'>"
		+"<img height=40px width=40px src=<%=basePath%>image/"+imglistf[i]+"/ >"
		+"</div>"
		+"<div class='friends_text'>"
		+"<p class='user_name'>"+namelistf[i]+"</p>"
		+"</div>"
		+"</div>" 
}else{
	 chatlist1 ="<div class='friends_box focusli'>"
		+"<div class='user_head'>"
		+"<img height=40px width=40px src=<%=basePath%>image/"+imglistf[i]+"/ >"
		+"</div>"
		+"<div class='friends_text'>"
		+"<p class='user_name'>"+namelistf[i]+"</p>"
		+"</div>"
		+"</div>" 
				}
		conhtml = conhtml+chatlist1;
			}
		focuslist.innerHTML=conhtml;
	}
	/* 选中某个联系人，联系人选项变灰色 ，并获得聊天记录*/
	function e(){
		/* 更改背景以及获得聊天记录 */
		/* 联系人 */
		for(var i=0;i<chatli.length;i++){
			(function attachchat(iichat,chatlii){
				chatlii.onclick = function() {
					for(var iii=0;iii<chatli.length;iii++){
						chatli[iii].style.background="#E5E2E2";
					}
					document.getElementById("chatusername").innerHTML=namelistc[iichat];
					this.style.background="#dedbdb";
					/* 插入聊天记录start */
					var url = "../message/getmessagetotwoman?othername="+namelistc[iichat];
					var otherimg = imglistc[iichat];
					var othername = namelistc[iichat];
					getchatdata.abort()
					f(url,othername,otherimg);
					choiceuser = namelistc[iichat];
				 }
			})(i,chatli[i]);
	}
		/* 关注 */
		for(var i=0;i<focusli.length;i++){
			(function attachfocus(iifocus,focuslii){
				focuslii.onclick = function(){
					for(var iii=0;iii<focusli.length;iii++){
						 focusli[iii].style.background="#E5E2E2";
					}
					this.style.background="#dedbdb";
					/* 插入聊天记录start */
					var url = "../message/getmessagetotwoman?othername="+namelistf[iifocus];
					var othername = namelistf[iifocus];
					var otherimg = imglistf[iifocus];
					getchatdata.abort()
					f(url,othername,otherimg);
					choiceuser = namelistf[iifocus];
				}
			 })(i,focusli[i]);
		} 
	}
	var getchatdata;
	/* f方法就是长轮询ajax 获得聊天记录*/
	function f(url,othername,otherimg){
		 getchatdata = $.ajax({
            dataType:"json",
            type:"POST",
            url:url,
            async: true,
            success:function(data){
            	var arr=data.messages;
            	var chathtml = "";
        		var conhtml = "";
        		var username = '${user.userName }';
        		var userimg = '${headimgsrc}';
            	if(data!=null){
                	for(var i=0;i<data.messages.length;i++){
                		var sendid = arr[i].sendId;
                		var receiveid = arr[i].receiveId;
                		var time = arr[i].messageTime;
                		var content = arr[i].messageContent
                		/* 我 */
                		if(sendid == '${user.userId }'){
                			chathtml = "<li class='me'>"
                			+"<img src='<%=basePath%>image/"+userimg+"' title="+username+"><span>"+content+"</span></li>"
                		/* 他 */
                		}else{
                			chathtml = "<li class='other'>"
    	            			+"<img src='<%=basePath%>image/"+otherimg+"' title="+othername+"><span>"+content+"</span></li>"
                		}
                		conhtml = conhtml + chathtml;
                	}
                	
            	}{
            		chathtml = "<li class='me'>"
            			+"<img src='<%=basePath%>image/"+userimg+"' title='我'><span>你还没有发任何消息呢</span></li>"
            	}
            	chatbox.innerHTML=conhtml
            	f(url,othername,otherimg)
            },error:function(jqXHR, error, errorThrown){
                console.log(jqXHR.status);
            }
        });
	}
	/* 切换联系人和关注的时候获得第一个聊天记录 */
	var ig = 0; /* 第二次开始才有中断，这里判断第一次 */
	function g(tabchoice){
		if(tabchoice=="chatuser"){
			chatli[0].style.background="#dedbdb";
			var url = "../message/getmessagetotwoman?othername="+namelistc[0];
			var otherimg = imglistc[0];
			var othername = namelistc[0];
			ig = ig + 1;
			if(ig!==1){
				getchatdata.abort(); /* 要先有才能中断 */
			}
			f(url,othername,otherimg);
			choiceuser = namelistc[0];
		}else{
			focusli[0].style.background="#dedbdb";
			var url = "../message/getmessagetotwoman?othername="+namelistf[0];
			var otherimg = imglistf[0];
			var othername = namelistf[0];
			getchatdata.abort();
			f(url,othername,otherimg);
			choiceuser = namelistf[0];
		}
	}
	a();
	b();
	c();
	d();
	e();
	g("chatuser");
};
	</script>


</body>
</html>
