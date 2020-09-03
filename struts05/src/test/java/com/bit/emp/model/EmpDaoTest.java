package com.bit.emp.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.bit.emp.model.entity.EmpVO;

import junit.framework.Assert;

public class EmpDaoTest {

	@Test
	public void testGetConnection() throws Exception {
		EmpDao dao = new EmpDao();
		Assert.assertNotNull(dao.getConnection());
	}
	@Test
	public void testSelectAll() throws Exception {
		EmpDao dao = new EmpDao();
		Assert.assertSame(5, dao.selectAll().size());
	}
	@Test
	public void testSelectOne() throws Exception{
		EmpDao dao = new EmpDao();
		EmpVO target = new EmpVO(1,"tester1","test1",null,1000);
		Assert.assertEquals(target, dao.selectOne(target.getSabun()));
	}
}
