package com.hcl.d.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.e.entity.StundentMarksEntity;
@Repository
public class StudentMarksDAO implements IStudentMarksDAO {
	@Autowired
    private SessionFactory sf;
	@Override
	public int saveMarks(StundentMarksEntity sm) {
		System.out.println("--------------------inside dao save method-----4-------");
		Session s = sf.getCurrentSession();
        
        s.beginTransaction();
        //Integer id = (Integer) s.save(sm);
        //Integer id = (Integer) s.save("sm", Object object);
        s.saveOrUpdate(sm);
        s.getTransaction().commit();
         
        return 10;
	}

}
