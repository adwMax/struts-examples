package org.apache.struts.edit;

import org.apache.struts.edit.service.EditController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
//@Import(MessageConfig.class)
public class SpringApplicationConfiguration {

    @Bean
    public EditController editController() {
        return new EditController();
    }
}