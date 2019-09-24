package com.three.kidult.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.three.kidult.model.dto.ProductboardDto;

@Repository
public class ProductboardImpl implements ProductboardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	int noOfRecords;
	
	@Override
	public List<ProductboardDto> boardList(int offset, int noOfRecords) {
		List<ProductboardDto> list = new ArrayList<ProductboardDto>();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("offset", offset);
		params.put("noOfRecords", offset + noOfRecords);
		
		try {
			list = sqlSession.selectList(namespace + "boardlist", params);
			this.noOfRecords = sqlSession.selectOne(namespace + "totalCountList");
			
		} catch (Exception e) {
			System.out.println("list error");
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

	@Override
	public int getNoOfRecords() {
		
		return noOfRecords;
	}

	@Override
	public List<ProductboardDto> searchFiled(int offset, int noOfRecords, String searchFiled, String searchValue) {
		
		List<ProductboardDto> list = new ArrayList<ProductboardDto>();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("offset", offset);
		params.put("noOfRecords", offset + noOfRecords);
		params.put("searchFiled", searchFiled);
		params.put("searchValue", searchValue);
		
		list = sqlSession.selectList(namespace + "boardlist", params);
		this.noOfRecords = sqlSession.selectOne(namespace + "fileCount", params);
		
		return list;
	}

}
