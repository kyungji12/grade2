package kopo.exam.hibernate.dao;

import java.sql.Statement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kopo.exam.hibernate.domain.ExamRIO;

@Transactional
@Repository
public class ExamRepoImpl implements ExamRepo{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(ExamRepoImpl.class);
	
	private Session getSession() {
		logger.info("getSession.start");
		Session ss=null;
		try {
			ss = sessionFactory.getCurrentSession();
		}catch(org.hibernate.HibernateException he) {
			ss = sessionFactory.openSession();
		}
		return ss;
	}
	
	@Override
	public Long count() {
		logger.info("count().start");
		String hql = "SELECT COUNT(*) FROM ExamRIO";
		Query query = getSession().createQuery(hql);
		Long totalCount = (Long)query.uniqueResult();
		return totalCount;
	}
	@Override
	public ExamRIO selectOne(long id) {
		String hql = "FROM ExamRIO e WHERE e.studentid = " + id;
		Query query = getSession().createQuery(hql);
		return (ExamRIO) query.uniqueResult();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ExamRIO> selectAll() {
		String hql = "FROM ExamRIO";
		Query query = getSession().createQuery(hql);
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ExamRIO> selectAllByPagination(int page, int itemSizePerPage) {
		String hql = "FROM ExamRIO ORDER BY studentid";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((page - 1) * itemSizePerPage);
		query.setMaxResults(itemSizePerPage);
		return query.list();
	}
	
	@Override
	public int createOne(ExamRIO exam) {
		return (int) getSession().save(exam);
	}
	@Override 
	public void updateOne(ExamRIO exam) {
		getSession().saveOrUpdate(exam);
	}
	@Override
	public void deleteOne(ExamRIO exam) {
		getSession().delete(exam);
	}
	@Override
	public int deleteAll() {
		String hql = "DELETE FROM ExamRIO";
		Query query = getSession().createQuery(hql);
		return query.executeUpdate();
	}
	@Override
	public void createDB() {
		Statement stmt;
		try {
			stmt = ((SessionImpl) getSession()).connection().createStatement();
			stmt.execute("create table examtable(name varchar(20), studentid int not null primary key,"
					+" kor int, eng int, mat int) DEFAULT CHARSET=utf8;");
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void dropDB() {
		Statement stmt;
		try {
			stmt = ((SessionImpl) getSession()).connection().createStatement();
			stmt.execute("drop table examtable;");
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
