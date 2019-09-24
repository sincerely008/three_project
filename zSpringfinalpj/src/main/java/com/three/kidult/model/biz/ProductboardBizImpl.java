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
	public List<ProductboardDto> boardList(int offset, int noOfRecords) {
		
		return dao.boardList(offset, noOfRecords);
	}

	@Override
	public ProductboardDto selectBoard() {
		
		return dao.selectBoard();
	}

	@Override
	public int insertBoard(ProductboardDto dto) {
		
		return dao.insertBoard(dto);
	}

	@Override
	public int updateBoard(ProductboardDto dto) {
		
		return dao.updateBoard(dto);
	}

	@Override
	public int deleteBoard(String id) {
		
		return dao.deleteBoard(id);
	}

	@Override
	public int getNoOfRecords() {
		
		return dao.getNoOfRecords();
	}

	@Override
	public List<ProductboardDto> searchFiled(int offset, int noOfRecords, String searchFiled, String searchValue) {
		
		return dao.searchFiled(offset, noOfRecords, searchFiled, searchValue);
	}

}
