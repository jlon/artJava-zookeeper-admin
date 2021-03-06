package org.artjava.zookeeper.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author artJava
 * @date 2017-01-05 19:49
 * @since JDK1.7
 */
@Component
public class TemplateConfigs {


    @Value("#{template.username}")
    private String username;


}
