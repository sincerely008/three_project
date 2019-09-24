package com.three.kidult.model.biz;

import java.util.List;

import com.three.kidult.model.dto.ProductboardDto;

public interface ProductboardBiz {
	
	public List<ProductboardDto> boardList(int offset, int noOfRecords);
	public ProductboardDto selectBoard();
	public int insertBoard(ProductboardDto dto);
	public int updateBoard(ProductboardDto dto);
	public int deleteBoard(String id);
	public int getNoOfRecords();
	public List<ProductboardDto> searchFiled(int offset, int noOfRecords, String searchFiled, String searchValue);

}
