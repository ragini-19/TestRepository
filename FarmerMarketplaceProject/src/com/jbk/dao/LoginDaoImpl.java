package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.model.Login;


	@Repository("UserDao")
	public class LoginDaoImpl implements LoginDao {
		@Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		
		@Override
		public boolean checkuserValidation(String username, String password) {
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY ="from Login as o where o.username=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,username);
			query.setParameter(1,password);
			List list  = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}
			{
			session.close();
			return userFound;             
	                    
			}
		}

		

		@Override
		public Login get(String username)  {
			
			Session session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Login.class);
			Criterion cr=Restrictions.eq("username",username);
			criteria.add(cr);
			Login login=(Login)criteria.uniqueResult();
			return login;
		}

	

		
}
