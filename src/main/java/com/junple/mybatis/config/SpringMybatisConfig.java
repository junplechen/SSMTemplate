package com.junple.mybatis.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class SpringMybatisConfig {

	@Bean
	public BasicDataSource dataSource() {
		
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("com.mysql.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/db_daidai");
		source.setUsername("root");
		source.setPassword("159874");
		return source;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource( dataSource());
		bean.setConfigLocation(new ClassPathResource("junple/shundaiserver/config/springmybatis/mybatis-config.xml"));
		//bean.setMapperLocations( new ClassPathResource[]{new ClassPathResource("com/junple/mybatis/mapper/*.xml")});
		return bean;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		
		MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
		scannerConfigurer.setBasePackage("com.junple.mybatis.mappers");
		return scannerConfigurer;
	}
}
