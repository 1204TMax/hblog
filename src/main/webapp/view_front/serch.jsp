<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
    <title>Offcanvas template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../../css/editor.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="offcanvas.css" rel="stylesheet">
  </head>

  <body class="bg-light">

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

    

    <main role="main" class="container">
      <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
        <img class="mr-3" src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg" alt="" width="48" height="48">
        <div class="lh-100">
          <h6 class="mb-0 text-white lh-100"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">你的</font></font></h6>
          <small><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">搜索结果</font></font></small>
        </div>
      </div>

      

      <div class="my-3 p-3 bg-white rounded box-shadow">
        <h6 class="border-bottom border-gray pb-2 mb-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">建议</font></font></h6>
        <div class="media text-muted pt-3">
          <img data-src="holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1" alt="32×32" class="mr-2 rounded" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_16976138f2b%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_16976138f2b%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.546875%22%20y%3D%2216.9%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true" style="width: 32px; height: 32px;">
          <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
            <div class="d-flex justify-content-between align-items-center w-100">
              <strong class="text-gray-dark"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">全名</font></font></strong>
              <a href="#"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">关注</font></font></a>
            </div>
            <span class="d-block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">@用户名</font></font></span>
          </div>
        </div>
        <div class="media text-muted pt-3">
          <img data-src="holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1" alt="32×32" class="mr-2 rounded" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_16976138f2c%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_16976138f2c%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.546875%22%20y%3D%2216.9%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true" style="width: 32px; height: 32px;">
          <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
            <div class="d-flex justify-content-between align-items-center w-100">
              <strong class="text-gray-dark"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">全名</font></font></strong>
              <a href="#"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">关注</font></font></a>
            </div>
            <span class="d-block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">@用户名</font></font></span>
          </div>
        </div>
        <div class="media text-muted pt-3">
          <img data-src="holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1" alt="32×32" class="mr-2 rounded" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_16976138f2d%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_16976138f2d%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.546875%22%20y%3D%2216.9%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true" style="width: 32px; height: 32px;">
          <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
            <div class="d-flex justify-content-between align-items-center w-100">
              <strong class="text-gray-dark"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">全名</font></font></strong>
              <a href="#"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">关注</font></font></a>
            </div>
            <span class="d-block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">@用户名</font></font></span>
          </div>
        </div>
      </div>
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="../../js/vendor/popper.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/holderjs@2.9.4/holder.js"></script>
    <script src="offcanvas.js"></script>
  

<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="2" style="font-weight:bold;font-size:2pt;font-family:Arial, Helvetica, Open Sans, sans-serif">32x32</text></svg></body>
</html>