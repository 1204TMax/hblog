package com.hblog.util;
//获取当前时间

import java.net.URL;
import java.net.URLConnection;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.util.StringUtils;
@Configuration
public class gettime {
	 
	/**
	 * 默认时间格式
	 */
	private static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
 
	/**
	 * 根据URL和格式化类型获取时间
	 * 
	 * @param webuUrl
	 *            网络URL
	 * @param format
	 *            格式
	 * @return
	 */
	@Bean
	public static String getWebsiteDatetime() {
		try {
			// 判断当前是否传入URL
			String webuUrl = "http://www.taobao.com";
			String format = "yyyy-MM-dd HH:mm:ss";
			if (!StringUtils.isEmpty(webuUrl)) {
				URL url = new URL(webuUrl);// 获取url对象
				URLConnection uc = url.openConnection();// 获取生成连接对象
				uc.connect();// 发出连接请求
				long ld = uc.getDate();// 读取网站日期时间
				Date date = new Date(ld);// 转化为时间对象
				SimpleDateFormat sdf = new SimpleDateFormat(format != null ? format : DEFAULT_FORMAT, Locale.CHINA);// 输出北京时间
				return sdf.format(date);
			} else {
				System.out.println("URL Error!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
 
	}
 
	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String format = "yyyy-MM-dd HH:mm:ss";
		System.out.println(getWebsiteDatetime());
	}
}