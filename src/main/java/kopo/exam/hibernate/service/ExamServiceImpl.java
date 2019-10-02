package kopo.exam.hibernate.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kopo.exam.hibernate.*;
import kopo.exam.hibernate.dao.ExamRepo;
import kopo.exam.hibernate.domain.ExamRIO;
import kopo.exam.hibernate.dto.ExamSIO;


@Service //서비스임을 선언
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamRepo repo; //ExamRepo는 Autowired->스프링 관련 특수 변수라고 선언 (repository니까)
	
	@Override
	public void createDB() throws Exception{
		repo.createDB();
	}
	@Override
	public void dropDB() throws Exception{
		repo.dropDB();
	}

	@Override
	public void allsetDB() throws Exception {
		this.insert(new ExamSIO("나연",209901,95,100,95)); 
		this.insert(new ExamSIO("정연",209902,95,95,95)); 
		this.insert(new ExamSIO("모모",209903,100,100,100)); 
		this.insert(new ExamSIO("사나",209904,100,95,90)); 
		this.insert(new ExamSIO("지효",209905,80,100,70));
		this.insert(new ExamSIO("미나",209906,100,100,70)); 	    
		this.insert(new ExamSIO("다현",209907,70,70,70)); 	    
		this.insert(new ExamSIO("채영",209908,100,90,80)); 
		this.insert(new ExamSIO("쯔위",209909,80,100,90)); 
	}

	@Override
	public void insert(ExamSIO examSIO) throws Exception{
		try{
			repo.createOne(
					new ExamRIO(examSIO.getName(), examSIO.getStudentid(),
							examSIO.getKor(), examSIO.getEng(), examSIO.getMat())
					);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Override
	public ExamSIO selectOne(int id) throws Exception {
		ExamRIO exam = null;
		try {
			exam = repo.selectOne(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ExamSIO(
				exam.getName(), exam.getStudentid(),
				exam.getKor(), exam.getEng(), exam.getMat());
	}
	@Override
	public List<ExamSIO> selectAll() throws Exception {
		List<ExamRIO> exams = null;
		try {
			exams = repo.selectAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		List<ExamSIO> examSIO = new ArrayList<ExamSIO>();
		for (int i=0; i<exams.size(); i++) {
			examSIO.add(new ExamSIO(
					exams.get(i).getName(),
					exams.get(i).getStudentid(),
					exams.get(i).getKor(),
					exams.get(i).getEng(),
					exams.get(i).getMat()
					));
		}
		return examSIO;
	}
	@Override
	public List<ExamSIO> selectAllByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(int id, ExamSIO examSIO) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(ExamSIO examSIO) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(ExamSIO examSIO) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
