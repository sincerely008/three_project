package com.three.kidult.model.dao;

import java.util.List;

import com.three.kidult.model.dto.ProductboardDto;

public interface ProductboardDao {
	
	String namespace = "board.";
	
	public List<ProductboardDto> boardList();
	public ProductboardDto selectBoard();
	public int insertBoard(ProductboardDto dto);
	public int updateBoard(ProductboardDto dto);
	public int deleteBoard(String id);

}
