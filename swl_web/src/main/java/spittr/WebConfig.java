package spittr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * create by songweiliang on 2018/8/26
 */
@Configuration
@EnableWebMvc  //启用springmvc
@ComponentScan("tuniu") //启动组件扫描
public class WebConfig extends WebMvcConfigurerAdapter{

    /**
     * jsp视图解析器
     * @return
     */
    @Bean
    public ViewResolver viewResolver(){
        //查找描述文件夹下面特定后缀的文件
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        //对静态资源的请求转发到容器默认的servlet中
        configurer.enable();
    }

}
