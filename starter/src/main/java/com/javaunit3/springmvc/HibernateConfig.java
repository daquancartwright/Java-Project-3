package com.javaunit3.springmvc;

import com.javaunit3.springmvc.model.MovieEntity;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {

    // Define a spring bean method that returns a hibernate SessionFactory. The session factory should point to the "hibernate.cfg.xml" file
    @Bean
    public SessionFactory getFactory() {
        SessionFactory factory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(MovieEntity.class)
                .buildSessionFactory();

        return factory;
    }
}
