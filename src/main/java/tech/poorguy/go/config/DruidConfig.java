//package tech.poorguy.go.config;
//
//import com.alibaba.druid.spring.boot.autoconfigure.properties.DruidStatProperties;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import javax.servlet.Servlet;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Date 2019/6/13 18:20
// * @Mail 494939649@qq.com
// **/
//@Configuration
//@Slf4j
//public class DruidConfig {
//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        log.info("init Druid Servlet Configuration ");
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
//        servletRegistrationBean.setServlet(new DruidStatProperties.StatViewServlet());
//        servletRegistrationBean.addUrlMappings("/druid/*");
//        Map<String, String> initParameters = new HashMap<String, String>();
//        initParameters.put("loginUsername", "admin");// 用户名
//        initParameters.put("loginPassword", "admin");// 密码
//        initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
//        initParameters.put("allow", ""); // IP白名单 (没有配置或者为空，则允许所有访问)
//        //initParameters.put("deny", "192.168.20.38");// IP黑名单 (存在共同时，deny优先于allow)
//        servletRegistrationBean.setInitParameters(initParameters);
//        return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter((Filter) new DruidStatProperties.WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterRegistrationBean;
//    }
//}
