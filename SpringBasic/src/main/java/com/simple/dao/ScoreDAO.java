package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreDAO {

	public void scoreRegist(ScoreVO vo);
	public ArrayList<ScoreVO> getScores();
	public void scoreDelete(int index);
}
