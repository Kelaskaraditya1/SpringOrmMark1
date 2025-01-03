package com.StarkIndustries.SpringOrmMark1.Main;

import com.StarkIndustries.SpringOrmMark1.DataAccessObject.StudentDao;
import com.StarkIndustries.SpringOrmMark1.Model.Student;
import com.mysql.cj.xdevapi.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.imageio.spi.ServiceRegistry;
import java.lang.module.Configuration;

@SpringBootApplication
public class SpringOrmMark1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmMark1Application.class, args);

		var context = new ClassPathXmlApplicationContext("com/StarkIndustries/SpringOrmMark1/Configuration/Configuration.xml");
		Student student = new Student(042,"Aditya","Computer","kelaskaraditya1@gmail.com","8591059220");
		StudentDao dao = context.getBean(StudentDao.class);
		dao.insertStudent(student);

	}

}
