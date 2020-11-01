package com.cg.customerappboot;


import com.cg.customerappboot.UI.UIMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppMain.class, args);
        UIMain uiMain = context.getBean(UIMain.class);
        uiMain.runApp();
    }

}
