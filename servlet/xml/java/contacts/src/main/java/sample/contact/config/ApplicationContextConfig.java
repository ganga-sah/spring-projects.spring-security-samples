package sample.contact.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("sample.contact.config")
@ImportResource({
        "classpath:applicationContext-common-authorization.xml",
        "classpath:applicationContext-common-business.xml",
        "classpath:applicationContext-security.xml"
})
public class ApplicationContextConfig {
}