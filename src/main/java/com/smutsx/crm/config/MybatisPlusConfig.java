package com.smutsx.crm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * MybatisPlus配置
 * @author bill
 *
 */

@Configuration
@MapperScan("com.smutsx.crm.*.mapper")
public class MybatisPlusConfig {
	
	/**
     * mybatis-plus分页插件<br>
     * 
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}
