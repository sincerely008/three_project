package com.three.kidult.model.dao;

import java.util.List;

import com.three.kidult.model.dto.ProductboardDto;

public interface ProductboardDao {
	
	String namespace = "board.";
	
	public List<ProductboardDto> boardList(int offset, int noOfRecords);
	public ProductboardDto selectBoard();
	public int insertBoard(ProductboardDto dto);
	public int updateBoard(ProductboardDto dto);
	public int deleteBoard(String id);
	public int getNoOfRecords();
	public List<ProductboardDto> searchFiled(int offset, int noOfRecords, String searchFiled, String searchValue);

}
