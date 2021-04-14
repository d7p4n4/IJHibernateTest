package com.sycompla.cap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sycompla.entity.Category;
import com.sycompla.entity.Product;

public class CategoryHibernateCap {

    private SessionFactory factory = null;

    public CategoryHibernateCap() {
        this.factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Category.class)
                .buildSessionFactory();

    }

    public List<Category> getList() {

        Session session = factory.openSession();

        List<Category> categories = new ArrayList<Category>();


        try {

            session.beginTransaction();

            Query<Category> theQuery =
                    session.createQuery("from Category",
                            Category.class);

            categories = theQuery.getResultList();

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            session.close();
            //factory.close();
        }

        return  categories;

    }

    public Category getOneRecord(int id) {

        Session session = factory.openSession();

        Category category = new Category();

        try {

            session.beginTransaction();

            category = session.get(Category.class, id);


        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            session.close();
            //factory.close();
        }

        return  category;

    }

}
