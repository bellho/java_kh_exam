package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	private ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String name, int kor, int eng, int math, double avg) {
		sd.saveScore(name, kor, eng, math, avg);
	}
	public DataInputStream readScore() throws FileNotFoundException{
		return sd.readScore();
	}
}
