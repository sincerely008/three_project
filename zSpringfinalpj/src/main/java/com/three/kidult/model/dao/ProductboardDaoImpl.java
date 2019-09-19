package com.three.kidult.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.three.kidult.model.dto.ProductboardDto;

@Repository
public class ProductboardDaoImpl implements ProductboardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ProductboardDto> boardList() {

		List<ProductboardDto> list = new ArrayList<ProductboardDto>();
		
		try {
			list = sqlSession.selectList(namespace + "boardList");

		} catch (Exception e) {
			System.out.println("select error");
		}
		
		return list;
	}

	@Override
	public ProductboardDto selectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(ProductboardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(ProductboardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
