package edu.bit.board.mapper;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardMapper {	//=DAO
	
	public List<BoardVO> getList();

	public void insert(BoardVO boardVO);
	
}
