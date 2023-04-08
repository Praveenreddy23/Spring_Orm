package com.spring.orm.dao;



import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
//	save student
	@Transactional
	public int insert(Student student) {
//		insert
		int i  = (Integer) this.hibernateTemplate.save(hibernateTemplate);
		return i;
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
