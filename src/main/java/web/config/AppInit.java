package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import web.controller.CarController;
import web.controller.HelloController;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Method pointing to configuration class
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // Adding a configuration in which we initialize ViewResolver to display jsp correctly.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* This method specifies the url on which the application will be based */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}