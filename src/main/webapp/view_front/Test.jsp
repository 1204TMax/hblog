<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?ak=OqbGmGH7UqjklK0Qb0Ydl67holvoIp1L&v=2.0&services=false&sk=LzogErapGlm1D763B1KB5rlnGcjwOOZO"></script> 
<!-- <script type="text/javascript">
$(document).ready(function(){
	/* $.ajax({
		url:"http://api.go2map.com/engine/api/ipcity/json?cb=?",
		dataType:"json",
		success:function(data,status){
			if(data.status == "ok"){
				console,log(data.response);
				$("#geo").html(data.response.city);
			}
			else{
				console.log("失败");
			}
		}
		
	}) */
	
	document.write(returnCitySN["cip"]+','+returnCitySN["cname"]+','+returnCitySN.cname)
})
</script> -->
<script type="text/javascript">
    // 百度地图API功能
    var map = new BMap.Map("allmap");
    var geoc = new BMap.Geocoder(); 
    // var point = new BMap.Point(116.331398,39.897445);
    // map.centerAndZoom(point,12);

    var geolocation = new BMap.Geolocation();
    geolocation.getCurrentPosition(function(r){
        if(this.getStatus() == BMAP_STATUS_SUCCESS){
            var mk = new BMap.Marker(r.point);
            map.addOverlay(mk);
            // map.panTo(r.point);
            console.log(r.point)
            var pt = r.point;

            geoc.getLocation(pt, function(rs){
                var addComp = rs.addressComponents;
                alert(addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber);
            });    
        }
        else {
            alert('failed'+this.getStatus());
        }        
    },{enableHighAccuracy: true})
    //关于状态码
    //BMAP_STATUS_SUCCESS   检索成功。对应数值“0”。
    //BMAP_STATUS_CITY_LIST 城市列表。对应数值“1”。
    //BMAP_STATUS_UNKNOWN_LOCATION  位置结果未知。对应数值“2”。
    //BMAP_STATUS_UNKNOWN_ROUTE 导航结果未知。对应数值“3”。
    //BMAP_STATUS_INVALID_KEY   非法密钥。对应数值“4”。
    //BMAP_STATUS_INVALID_REQUEST   非法请求。对应数值“5”。
    //BMAP_STATUS_PERMISSION_DENIED 没有权限。对应数值“6”。(自 1.1 新增)
    //BMAP_STATUS_SERVICE_UNAVAILABLE   服务不可用。对应数值“7”。(自 1.1 新增)
    //BMAP_STATUS_TIMEOUT   超时。对应数值“8”。(自 1.1 新增)
</script>

</body>
</html>