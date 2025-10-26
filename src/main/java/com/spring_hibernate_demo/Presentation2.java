package com.spring_hibernate_demo;

import com.spring_hibernate_demo.dao.IDao;
import com.spring_hibernate_demo.entities.Product;
import com.spring_hibernate_demo.util.HibernateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IDao<Product> productDao = context.getBean(IDao.class);

        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);

        productDao.create(product);

        System.out.println("Produit sauvegardé : " + product.getName());
    }
}
