package service;

import java.util.List;

import Dao.studentDao;
import Model.Student;

public class studentService {
	studentDao studentDao=new studentDao();
	public Student querybyname(String name) {
		return studentDao.querybyname(name);
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
		if(studentDao.isExist(name)){
			return studentDao.deletebyname(name);
		}
		return false;
	}
	public boolean updatebyname(String name,Student student) {
		if(studentDao.isExist(name)){
			return studentDao.updatebyname(name, student);
		}
		return false;
	}
}
