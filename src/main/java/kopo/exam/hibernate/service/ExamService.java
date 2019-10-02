package kopo.exam.hibernate.service;

import java.util.List;

import kopo.exam.hibernate.dto.ExamSIO;


public interface ExamService {
	//createDB & dropDB
	public void createDB() throws Exception;
	public void dropDB() throws Exception;
	public void allsetDB() throws Exception;
	//create
	public void insert(ExamSIO examSIO) throws Exception;
	//Read
	public ExamSIO selectOne(int id) throws Exception;
	public List<ExamSIO> selectAll() throws Exception;
	public List<ExamSIO> selectAllByName(String name) throws Exception;
	//update
	public void update(int id, ExamSIO examSIO) throws Exception;
	public void update(ExamSIO examSIO) throws Exception;
	//delete
	public void delete(int id) throws Exception;
	public void delete(ExamSIO examSIO) throws Exception;

}
