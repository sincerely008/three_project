package com.three.kidult.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.kidult.model.dao.ProductboardDao;
import com.three.kidult.model.dto.ProductboardDto;

@Service
public class ProductboardBizImpl implements ProductboardBiz {

	@Autowired
	private ProductboardDao dao;
	
	@Override
	public List<ProductboardDto> boardList() {
		
		return dao.boardList();
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
