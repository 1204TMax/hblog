package com.hblog.util;

import javax.servlet.http.HttpServletRequest;

public class getIp {
	public static String getRequestRealIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip != null && ip.contains(",")) {
		ip = ip.split(",")[0];
		}

		if (!checkIp(ip)) {
		ip = request.getHeader("Proxy-Client-IP");
		}
		if (!checkIp(ip)) {
		ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (!checkIp(ip)) {
		ip = request.getHeader("X-Real-IP");
		}

		if (!checkIp(ip)) {
		ip = request.getRemoteAddr();
		}
		return ip;
		}

		private static boolean checkIp(String ip) {
		if (ip == null || ip.length() == 0 || "unkown".equalsIgnoreCase(ip) ) {
		return false;
		}
		return true;
		}
}
