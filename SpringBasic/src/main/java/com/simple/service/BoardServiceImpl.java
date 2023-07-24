package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.simple.command.BoardVO;
import com.simple.mapper.BoardMapper;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardMapper.boardRegist(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		boardMapper.getList();
		return null;
	}

	@Override
	public void boardDelete(int num) {
		boardMapper.boardDelete(num);
		
	}

}
