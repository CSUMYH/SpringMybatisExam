package com.mao.hand.DaoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

import com.mao.hand.Beans.Address;
import com.mao.hand.Dao.AddressDao;

public class AddressDaoImpl extends SqlSessionTemplate implements AddressDao {

	SqlSession sqlSession;
	public AddressDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
		this.sqlSession =sqlSessionFactory.openSession();
	}

	public List<Address> getAllAddress() {
		List<Address> list = sqlSession.selectList("findAllAddress");
		System.out.println(list);
		return list;
	}

	public void updateAddress() {

	}

	public void InsertAddress() {
		// TODO Auto-generated method stub

	}

	public void deleteAddress() {
		// TODO Auto-generated method stub

	}

}
