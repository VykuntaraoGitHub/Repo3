package com.hcl.b.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.c.services.StudentMarksSerives;
import com.hcl.f.dto.StudentMarksDTO;

@RestController 
@RequestMapping(value="/springhibernateapi")
public class StudentMarksController {
	
	@Autowired
    private StudentMarksSerives studentMarksSerives;
 
    @PostMapping(value= "/create")
    public ResponseEntity<StudentMarksDTO> create(@RequestBody StudentMarksDTO studentMarksDTO) {
    	System.out.println(" inside create method----2 ");
        int id = studentMarksSerives.saveMarks(studentMarksDTO);
        if(id != 0)
            return new ResponseEntity<StudentMarksDTO>(HttpStatus.CREATED);        
            return new ResponseEntity<StudentMarksDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
 // Fetch particular book from the database.
    @GetMapping(value= "/get/{hallTicketNo}")
    public ResponseEntity<StudentMarksDTO> getBookById(@PathVariable("hallTicketNo") int hallTicketNo) {
    	StudentMarksDTO book = new StudentMarksDTO(); 
    	System.out.println(" inside get  method----1-2 "+hallTicketNo);
        if(hallTicketNo!=0)
          return new ResponseEntity<StudentMarksDTO>(HttpStatus.NOT_FOUND);
 
       return new ResponseEntity<StudentMarksDTO>(book, HttpStatus.OK);
    }

}
