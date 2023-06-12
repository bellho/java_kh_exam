package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		if(f.exists()) {
			return true;
		} else {
			return false;
		}
	}
	public void fileSave(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.append(s + "\n");
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder stb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String str = br.readLine();
			while(str != null) {
				stb.append(str + "\n");
				str = br.readLine();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stb;
	}
	
	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.append(s + "\n");
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
