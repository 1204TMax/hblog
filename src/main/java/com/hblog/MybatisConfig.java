package com.hblog;

import java.util.Properties;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.github.pagehelper.PageInterceptor;

/*
 * MyBatis的配置文件
 */
@SpringBootConfiguration
public class MybatisConfig {

	/*
	 * 创建一个SqlSessionFactoryBean
	 */
	@Bean
	@ConditionalOnMissingBean
	// 条件注解: 当spring容器里没有指定的Bean的情况下创建该对象
	public SqlSessionFactoryBean getSqlSessionFactory(DataSource ds) {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// 设置数据源
		
		sqlSessionFactoryBean.setDataSource(ds);
		// 设置mybatis的主配置文件----->当项目中有Mybatis总体配置文件时，使用这种方式加载
		//ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //Resource mybatisConfigXml = resolver.getResource("classpath:mybatis-config.xml");
        //sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
		//给实体类别名
		sqlSessionFactoryBean.setTypeAliasesPackage("com.hblog.bean");
		return sqlSessionFactoryBean;
	}
}
