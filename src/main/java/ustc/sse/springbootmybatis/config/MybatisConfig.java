package ustc.sse.springbootmybatis.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author LRK
 * @project_name spring-boot-mybatis
 * @package_name ustc.sse.springbootmybatis.config
 * @date 2018/11/24 0:30
 * @description God Bless, No Bug!
 *  Mybatis自定义配置
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){

        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                // 下划线模式跟驼峰模式可以互转
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
