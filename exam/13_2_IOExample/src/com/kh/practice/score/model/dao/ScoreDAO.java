package com.kh.practice.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, double avg) {
		String filePath = "score.out";
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath))))
		{
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeDouble(avg);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException{
		String filePath = "score.out";
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
		return dis;
	}
	
}
