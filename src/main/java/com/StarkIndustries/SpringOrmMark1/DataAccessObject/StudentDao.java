package com.StarkIndustries.SpringOrmMark1.DataAccessObject;

import com.StarkIndustries.SpringOrmMark1.Model.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public StudentDao(){

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public  void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public  void insertStudent(Student student){
        this.hibernateTemplate.save(student);
    }
}
