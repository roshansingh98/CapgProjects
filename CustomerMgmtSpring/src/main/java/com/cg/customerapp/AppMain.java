package com.cg.customerapp;

import com.cg.customerapp.UI.UIMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfiguration.class);
        context.refresh();
        UIMain ui = context.getBean(UIMain.class);
        ui.runApp();
    }

}
