package com.spring_hibernate_demo.metier;

import com.spring_hibernate_demo.dao.IDao;
import com.spring_hibernate_demo.entities.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements IDao<Category> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean create(Category c) {
        sessionFactory.getCurrentSession().save(c);
        return true;
    }

    @Override
    public boolean delete(Category c) {
        sessionFactory.getCurrentSession().delete(c);
        return true;
    }

    @Override
    public boolean update(Category c) {
        sessionFactory.getCurrentSession().update(c);
        return true;
    }

    @Override
    public Category findById(int id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    @Override
    public List<Category> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category", Category.class).list();
    }
}
