package com.three.kidult.model.biz;

import java.util.List;

import com.three.kidult.model.dto.ProductboardDto;

public interface ProductboardBiz {
	
	public List<ProductboardDto> boardList();
	public ProductboardDto selectBoard();
	public int insertBoard(ProductboardDto dto);
	public int updateBoard(ProductboardDto dto);
	public int deleteBoard(String id);

}
