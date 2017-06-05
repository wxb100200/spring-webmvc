package com.springstudy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avaje.ebean.Ebean;
import com.springstudy.model.Student;
import com.springstudy.util.ApiResult;
@Controller
@RequestMapping(value="/api")
public class ApiController {
	@ResponseBody
	@RequestMapping(value="/getString",method=RequestMethod.GET)
	public String getString(){
		return "wo shi String";
	}
	@ResponseBody
	@RequestMapping(value="/getStudent",method=RequestMethod.GET)
	public String getStudent(){
		Student st=Ebean.find(Student.class,1l);
		Student s=new Student();
		s.setId(1);
		s.setName("wang wang ");
		s.setAge(28);
		return ApiResult.single("/getStudent", st).toJson();
	}

	@ResponseBody
	@RequestMapping(value="/getStudents",method=RequestMethod.GET)
	public String getStudents(){
		List<Student> st=Ebean.find(Student.class).findList();
		return ApiResult.list("/getStudent", st).toJson();
	}
	
}
