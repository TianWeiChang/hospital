package com.tian.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * @author tianwc  公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description Shiro配置类
 * @createTime 2022年09月16日
 */
@Configuration
public class ShiroConfig {
    /**
     * 第一个bean:realm  数据域
     * <p>
     * 第二个bean：SecurityManager 安全管理器
     * <p>
     * 第三个bean：shirofileterfactorybean
     * <p>
     * 第四个：密码匹配器
     * <p>
     * 第五个bean：ShiroDialect
     */

    // <bean id="">   name对应bean容器的id
    @Bean(name = "userRealm")
    public UserRealm getUserRealm(@Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher hashedCredentialsMatcher) {
        UserRealm userRealm = new UserRealm();
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        return userRealm;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> filtermap = new LinkedHashMap<String, String>();
        //toLogin/login界面可以未认证直接访问


        filtermap.put("/sel/login", "anon");
        filtermap.put("index.html", "anon");


        filtermap.put("/css/**", "anon");
        filtermap.put("/layui/**", "anon");
        filtermap.put("/js/**", "anon");
        filtermap.put("/images/**", "anon");
        filtermap.put("*.png", "anon");
        filtermap.put("*jpg", "anon");



        //未认证都不允许通过
        filtermap.put("/**", "authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        //如果访问的页面未认证   跳转到登陆页面
        shiroFilterFactoryBean.setLoginUrl("/sel/toLogin");

        return shiroFilterFactoryBean;
    }

    //用来跟加密的密码进行比对的bean

    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher getHashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //设置比较规则
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        //迭代2次
        hashedCredentialsMatcher.setHashIterations(2);
        return hashedCredentialsMatcher;
    }

    //shiro 与thymeleaf的整合
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }
}
