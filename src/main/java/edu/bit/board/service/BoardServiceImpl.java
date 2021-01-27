package edu.bit.board.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	@Autowired	//mapper에 new해서 객체 생성했다는 뜻
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		// TODO Auto-generated method stub
		mapper.insert(boardVO);
	}
}
