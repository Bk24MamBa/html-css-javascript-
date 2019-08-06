package service;

import java.util.List;

import Dao.studentDao;
import Model.Student;

public class studentService {
	studentDao studentDao=new studentDao();
	public Student querybyname(String name) {
		Student student= studentDao.querybyname(name);
		return student;
	}
	public List<Student> querybyAll() {
		return studentDao.querybyAll();
	}
	public boolean addstudent(Student student){
		if(!studentDao.isExist(student.getName())){
			return studentDao.addStudent(student);
		}
		return false;
	}
	public boolean deletebyname(String name){
			return studentDao.deletebyname(name);
	}
	public boolean updatebyname(String name,Student student) {
		if(studentDao.isExist(name)){
			return studentDao.updatebyname(name, student);
		}
		return false;
	}
}
