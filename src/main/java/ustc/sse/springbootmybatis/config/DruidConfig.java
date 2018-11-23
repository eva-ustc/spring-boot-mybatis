package ustc.sse.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LRK
 * @project_name data-jdbc
 * @package_name ustc.sse.datajdbc.config
 * @date 2018/11/23 21:08
 * @description God Bless, No Bug!
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean("dataSource")
    public DataSource druid(){
        return new DruidDataSource();
    }

    // 配置Druid的监控
    // 1 配置一个惯例后台的Servlet
    // 参考ResourceServlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow",""); // 默认就是允许所有的访问
        initParams.put("deny","192.168.18.52"); // 禁止访问
        bean.setInitParameters(initParams);
        return bean;
    }

    // 2 配置一个web监控的Filter
    // 参考WebStatFilter
    public FilterRegistrationBean webStatFilter(){

        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        // 拦截所有请求
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}
