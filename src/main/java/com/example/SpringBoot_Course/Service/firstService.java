package com.example.SpringBoot_Course.Service;

import com.example.SpringBoot_Course.bean.firstBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class firstService {

    private final firstBean firstBean;
    @Value("${spring.application.name}")
    private String nameSpring;
    @Value("${my.custom.name}")
    private String nameCustom;


    public firstService(@Qualifier("bean2") firstBean firstBean) {
        this.firstBean = firstBean;
    }
    public String tellAstory() {
        return "the dependency is saying: "+firstBean.hello();
    }

    public String getNameSpring() {
        return nameSpring;
    }

    public String getNameCustom() {
        return nameCustom;
    }
}
