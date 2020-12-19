package git.jwang.oasys;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @PROJECT_NAME: oasys
 * @DESCRIPTION: 修改启动类，继承S并重写configure方法
 * @USER: jwang
 * @DATE: 2020/12/19
 */
public class SpringBootApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OAsysApplication.class);
    }
}
