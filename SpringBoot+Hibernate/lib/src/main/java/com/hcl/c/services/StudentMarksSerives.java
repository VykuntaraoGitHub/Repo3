package com.hcl.c.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.d.dao.StudentMarksDAO;
import com.hcl.e.entity.StundentMarksEntity;
import com.hcl.f.dto.StudentMarksDTO;

@Service
public class StudentMarksSerives implements IStudentMarksSerives {
	@Autowired
	StudentMarksDAO studentMarksDAO;
	@Override
	public int saveMarks(StudentMarksDTO dto) {
		
		System.out.println(" service---3 ");
		int totalMarks=0;
		float percentage=0;
		String result=null;
		StundentMarksEntity sme=new StundentMarksEntity();
		
		sme.setName(dto.getName());
		sme.setHallTicketNo(dto.getHallTicketNo());
		sme.setTelugu(dto.getTelugu());
		sme.setHindi(dto.getHindi());
		sme.setEnglish(dto.getEnglish());
		sme.setMathes(dto.getMathes());
		sme.setScience(dto.getScience());
		sme.setSocial(dto.getSocial());
		totalMarks=dto.getTelugu()+dto.getHindi()+dto.getEnglish()+dto.getMathes()+dto.getScience()+dto.getSocial();
		sme.setTotal(totalMarks);
		percentage=totalMarks/6;
		sme.setPercentage(percentage);
		if((dto.getTelugu()>=35)&&(dto.getHindi()>=35)&&(dto.getEnglish()>=35)&&(dto.getMathes()>=35)&&(dto.getScience()>=35)&&(dto.getSocial()>=35)) {
			result="Pass";
			sme.setResult(result);
		}else {
			result="Fail";
			sme.setResult(result);
		}
		
		int id= studentMarksDAO.saveMarks(sme);
		System.out.println("return id="+id);
		return id;
	}

}
