package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	ArrayList<BoardVO> list = new ArrayList<>();
	
	@Override
	public void boardRegist(BoardVO vo) {
		list.add(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		System.out.println(list.toString());
		return list;
	}

	@Override
	public void boardDelete(int num) {
		list.remove(num);
		
	}

}
