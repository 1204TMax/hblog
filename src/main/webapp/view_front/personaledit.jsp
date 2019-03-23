<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>个人资料更改</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 class="display-3">请在这里修改你的资料</h1>
			<p class="lead">个人资料修改会影响您的交友，请确保您输入的资料的真实性
			<p></p>
		</div>

		<div class="row marketing"></div>

	</div>
	<!-- /container -->
	<div class="container" style="">
		<main role="main" class="container">
		<div class="container" style="">
			<div class="m-5">
				<div class="row" style=""></div>
			</div>
		</div>
		<div class="container" style="">
			<form class="form-horizontal" action="<%=basePath%>user/edituserinfo"
				method="post">
				<fieldset>
					<div id="legend" class="">
						<legend class="">详细资料填写</legend>
					</div>

					<div class="control-group">

						<!-- Select Basic -->
						<label class="control-label">选择交友模式</label>
						<div class="controls">
							<select class="input-xlarge" name="userinfoMode">
								<option>强交友模式</option>
								<option>弱交友模式</option>
							</select>
						</div>
					</div>
					<P>
						<br>
					</P>
					<div class="control-group">

						<!-- Select Basic -->
						<label class="control-label">性别</label>
						<div class="controls" name="userinfoSex">
							<select class="input-xlarge">
								<option>男</option>
								<option>女</option>
								<option>暂时没想好</option>
							</select>
						</div>
					</div>



					<div class="control-group">
						<p>&nbsp</p>
						<!-- Select Basic -->
						<label class="control-label">年龄</label>
						<div class="controls">
							<select class="input-xlarge" name="userinfoAge">
								<option>1岁</option>
								<option>2岁</option>
								<option>3岁</option>
								<option>4岁</option>
								<option>5岁</option>
								<option>6岁</option>
								<option>7岁</option>
								<option>8岁</option>
								<option>9岁</option>
								<option>10岁</option>
								<option>11岁</option>
								<option>12岁</option>
								<option>13岁</option>
								<option>14岁</option>
								<option>15岁</option>
								<option>16岁</option>
								<option>17岁</option>
								<option>18岁</option>
								<option>19岁</option>
								<option>20岁</option>
								<option>21岁</option>
								<option>22岁</option>
								<option>23岁</option>
								<option>24岁</option>
								<option>25岁</option>
								<option>26岁</option>
								<option>27岁</option>
								<option>28岁</option>
								<option>29岁</option>
								<option>30岁</option>
								<option>31岁</option>
								<option>32岁</option>
								<option>33岁</option>
								<option>34岁</option>
								<option>35岁</option>
								<option>36岁</option>
								<option>37岁</option>
								<option>38岁</option>
								<option>39岁</option>
								<option>40岁</option>
								<option>41岁</option>
								<option>42岁</option>
								<option>43岁</option>
								<option>44岁</option>
								<option>45岁</option>
								<option>46岁</option>
								<option>47岁</option>
								<option>48岁</option>
								<option>49岁</option>
								<option>50岁</option>
								<option>51岁</option>
								<option>52岁</option>
								<option>53岁</option>
								<option>54岁</option>
								<option>55岁</option>
								<option>56岁</option>
								<option>57岁</option>
								<option>58岁</option>
								<option>59岁</option>
								<option>60岁</option>
								<option>61岁</option>
								<option>62岁</option>
								<option>63岁</option>
								<option>64岁</option>
								<option>65岁</option>
								<option>66岁</option>
								<option>67岁</option>
								<option>68岁</option>
								<option>69岁</option>
								<option>70岁</option>
								<option>71岁</option>
								<option>72岁</option>
								<option>73岁</option>
								<option>74岁</option>
								<option>75岁</option>
								<option>76岁</option>
								<option>77岁</option>
								<option>78岁</option>
								<option>79岁</option>
								<option>80岁</option>
								<option>81岁</option>
								<option>82岁</option>
								<option>83岁</option>
								<option>84岁</option>
								<option>85岁</option>
								<option>86岁</option>
								<option>87岁</option>
								<option>88岁</option>
								<option>89岁</option>
								<option>90岁</option>
								<option>91岁</option>
								<option>92岁</option>
								<option>93岁</option>
								<option>94岁</option>
								<option>95岁</option>
								<option>96岁</option>
								<option>97岁</option>
								<option>98岁</option>
								<option>99岁</option>
								<option>100岁</option>
								<option>101岁</option>
								<option>102岁</option>
								<option>103岁</option>
								<option>104岁</option>
								<option>105岁</option>
								<option>106岁</option>
								<option>107岁</option>
								<option>108岁</option>
								<option>109岁</option>
								<option>110岁</option>
								<option>111岁</option>
							</select>
						</div>

					</div>

					<div class="control-group">
						<p>&nbsp</p>
						<!-- Select Basic -->
						<label class="control-label">身高</label>
						<div class="controls">
							<select class="input-xlarge" name="userinfoHeight">
								<option>50cm</option>
								<option>51cm</option>
								<option>52cm</option>
								<option>53cm</option>
								<option>54cm</option>
								<option>55cm</option>
								<option>56cm</option>
								<option>57cm</option>
								<option>58cm</option>
								<option>59cm</option>
								<option>60cm</option>
								<option>61cm</option>
								<option>62cm</option>
								<option>63cm</option>
								<option>64cm</option>
								<option>65cm</option>
								<option>66cm</option>
								<option>67cm</option>
								<option>68cm</option>
								<option>69cm</option>
								<option>70cm</option>
								<option>71cm</option>
								<option>72cm</option>
								<option>73cm</option>
								<option>74cm</option>
								<option>75cm</option>
								<option>76cm</option>
								<option>77cm</option>
								<option>78cm</option>
								<option>79cm</option>
								<option>80cm</option>
								<option>81cm</option>
								<option>82cm</option>
								<option>83cm</option>
								<option>84cm</option>
								<option>85cm</option>
								<option>86cm</option>
								<option>87cm</option>
								<option>88cm</option>
								<option>89cm</option>
								<option>90cm</option>
								<option>91cm</option>
								<option>92cm</option>
								<option>93cm</option>
								<option>94cm</option>
								<option>95cm</option>
								<option>96cm</option>
								<option>97cm</option>
								<option>98cm</option>
								<option>99cm</option>
								<option>100cm</option>
								<option>101cm</option>
								<option>102cm</option>
								<option>103cm</option>
								<option>104cm</option>
								<option>105cm</option>
								<option>106cm</option>
								<option>107cm</option>
								<option>108cm</option>
								<option>109cm</option>
								<option>110cm</option>
								<option>111cm</option>
								<option>112cm</option>
								<option>113cm</option>
								<option>114cm</option>
								<option>115cm</option>
								<option>116cm</option>
								<option>117cm</option>
								<option>118cm</option>
								<option>119cm</option>
								<option>120cm</option>
								<option>121cm</option>
								<option>122cm</option>
								<option>123cm</option>
								<option>124cm</option>
								<option>125cm</option>
								<option>126cm</option>
								<option>127cm</option>
								<option>128cm</option>
								<option>129cm</option>
								<option>130cm</option>
								<option>131cm</option>
								<option>132cm</option>
								<option>133cm</option>
								<option>134cm</option>
								<option>135cm</option>
								<option>136cm</option>
								<option>137cm</option>
								<option>138cm</option>
								<option>139cm</option>
								<option>140cm</option>
								<option>141cm</option>
								<option>142cm</option>
								<option>143cm</option>
								<option>144cm</option>
								<option>145cm</option>
								<option>146cm</option>
								<option>147cm</option>
								<option>148cm</option>
								<option>149cm</option>
								<option>150cm</option>
								<option>151cm</option>
								<option>152cm</option>
								<option>153cm</option>
								<option>154cm</option>
								<option>155cm</option>
								<option>156cm</option>
								<option>157cm</option>
								<option>158cm</option>
								<option>159cm</option>
								<option>160cm</option>
								<option>161cm</option>
								<option>162cm</option>
								<option>163cm</option>
								<option>164cm</option>
								<option>165cm</option>
								<option>166cm</option>
								<option>167cm</option>
								<option>168cm</option>
								<option>169cm</option>
								<option>170cm</option>
								<option>171cm</option>
								<option>172cm</option>
								<option>173cm</option>
								<option>174cm</option>
								<option>175cm</option>
								<option>176cm</option>
								<option>177cm</option>
								<option>178cm</option>
								<option>179cm</option>
								<option>180cm</option>
								<option>181cm</option>
								<option>182cm</option>
								<option>183cm</option>
								<option>184cm</option>
								<option>185cm</option>
								<option>186cm</option>
								<option>187cm</option>
								<option>188cm</option>
								<option>189cm</option>
								<option>190cm</option>
								<option>191cm</option>
								<option>192cm</option>
								<option>193cm</option>
								<option>194cm</option>
								<option>195cm</option>
								<option>196cm</option>
								<option>197cm</option>
								<option>198cm</option>
								<option>199cm</option>
								<option>200cm</option>
								<option>201cm</option>
								<option>202cm</option>
								<option>203cm</option>
								<option>204cm</option>
								<option>205cm</option>
								<option>206cm</option>
								<option>207cm</option>
								<option>208cm</option>
								<option>209cm</option>
								<option>210cm</option>
								<option>211cm</option>
								<option>212cm</option>
								<option>213cm</option>
								<option>214cm</option>
								<option>215cm</option>
								<option>216cm</option>
								<option>217cm</option>
								<option>218cm</option>
								<option>219cm</option>
								<option>220cm</option>
								<option>221cm</option>
								<option>222cm</option>
								<option>223cm</option>
								<option>224cm</option>
								<option>225cm</option>
								<option>226cm</option>
								<option>227cm</option>
								<option>228cm</option>
								<option>229cm</option>
								<option>230cm</option>
								<option>231cm</option>
								<option>232cm</option>
								<option>233cm</option>
								<option>234cm</option>
								<option>235cm</option>
								<option>236cm</option>
								<option>237cm</option>
								<option>238cm</option>
								<option>239cm</option>
								<option>240cm</option>
								<option>241cm</option>
								<option>242cm</option>
								<option>243cm</option>
								<option>244cm</option>
								<option>245cm</option>
							</select>
						</div>

					</div>

					<div class="control-group">
						<p>&nbsp</p>
						<!-- Select Basic -->
						<label class="control-label">体重</label>
						<div class="controls">
							<select class="input-xlarge" name="userinfoWeight">
								<option>20kg</option>
								<option>21kg</option>
								<option>22kg</option>
								<option>23kg</option>
								<option>24kg</option>
								<option>25kg</option>
								<option>26kg</option>
								<option>27kg</option>
								<option>28kg</option>
								<option>29kg</option>
								<option>30kg</option>
								<option>31kg</option>
								<option>32kg</option>
								<option>33kg</option>
								<option>34kg</option>
								<option>35kg</option>
								<option>36kg</option>
								<option>37kg</option>
								<option>38kg</option>
								<option>39kg</option>
								<option>40kg</option>
								<option>41kg</option>
								<option>42kg</option>
								<option>43kg</option>
								<option>44kg</option>
								<option>45kg</option>
								<option>46kg</option>
								<option>47kg</option>
								<option>48kg</option>
								<option>49kg</option>
								<option>50kg</option>
								<option>51kg</option>
								<option>52kg</option>
								<option>53kg</option>
								<option>54kg</option>
								<option>55kg</option>
								<option>56kg</option>
								<option>57kg</option>
								<option>58kg</option>
								<option>59kg</option>
								<option>60kg</option>
								<option>61kg</option>
								<option>62kg</option>
								<option>63kg</option>
								<option>64kg</option>
								<option>65kg</option>
								<option>66kg</option>
								<option>67kg</option>
								<option>68kg</option>
								<option>69kg</option>
								<option>70kg</option>
								<option>71kg</option>
								<option>72kg</option>
								<option>73kg</option>
								<option>74kg</option>
								<option>75kg</option>
								<option>76kg</option>
								<option>77kg</option>
								<option>78kg</option>
								<option>79kg</option>
								<option>80kg</option>
								<option>81kg</option>
								<option>82kg</option>
								<option>83kg</option>
								<option>84kg</option>
								<option>85kg</option>
								<option>86kg</option>
								<option>87kg</option>
								<option>88kg</option>
								<option>89kg</option>
								<option>90kg</option>
								<option>91kg</option>
								<option>92kg</option>
								<option>93kg</option>
								<option>94kg</option>
								<option>95kg</option>
								<option>96kg</option>
								<option>97kg</option>
								<option>98kg</option>
								<option>99kg</option>
								<option>100kg</option>
							</select>
						</div>

					</div>

					<div class="control-group">
						<p>&nbsp</p>
						<!-- Select Basic -->
						<label class="control-label">学历</label>
						<div class="controls">
							<select class="input-xlarge" name="userinfoEducation">
								<option>高中中专及以下</option>
								<option>本科</option>
								<option>硕士</option>
								<option>博士</option>
							</select>
						</div>

					</div>

					<div class="control-group">
						<p>&nbsp</p>
						<label class="control-label">性取向</label>
						<div class="controls" name="userinfoSexChoice">
							<!-- Multiple Radios -->
							<label class="radio"> <input type="radio" value="男"
								name="userinfoSexChoice" checked="checked"> 男
							</label> <label class="radio"> <input type="radio" value="女"
								name="userinfoSexChoice"> 女
							</label> <label class="radio"> <input type="radio" value="都可以"
								name="userinfoSexChoice"> 都可以
							</label> <label class="radio"> <input type="radio" value="我也不知道"
								name="userinfoSexChoice"> 我也不知道
							</label>
						</div>

					</div>
					<div class="control-group">
						<p>&nbsp</p>
						<label class="control-label">婚姻状况</label>
						<div class="controls" name="userinfoMarriageState">
							<!-- Multiple Radios -->
							<label class="radio"> <input type="radio" value="已婚"
								name="userinfoMarriageState" checked="checked"> 已婚
							</label> <label class="radio"> <input type="radio" value="未婚"
								name="userinfoMarriageState"> 未婚
							</label> <label class="radio"> <input type="radio" value="恋爱中"
								name="userinfoMarriageState"> 恋爱中
							</label>
						</div>

					</div>

					<div class="control-group">
						<p>&nbsp</p>
						<!-- Text input-->
						<label class="control-label" for="input01">常住地</label>
						<div class="controls">
							<input type="text" placeholder="" class="input-xlarge"
								name="userinfoOftenPlace">
							<p class="help-block"></p>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label"></label>

						<!-- Button -->
						<div class="controls">
							<button class="btn btn-success">提交</button>
						</div>
					</div>

				</fieldset>
			</form>
		</div>


		<!-- Bootstrap core JavaScript
    ================================================== --> <!-- Placed at the end of the document so the pages load faster -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script> <script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/holderjs@2.9.4/holder.js"></script>
</body>
</html>