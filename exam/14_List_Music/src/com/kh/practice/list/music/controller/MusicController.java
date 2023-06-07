package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private static final String ArrayList = null;
	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		int result = 0;
		if(list.add(music)) {
			result = 1;
		}
		return result;
		
	}
	public int addAtZero(Music music) {
		int result = 0;
		int cnt = list.size();
		((ArrayList<Music>)list).add(0 , music);
		int cntAfter = list.size();
		if(cnt < cntAfter) {
			result = cntAfter;
		}
		return result;
	}
	public List printAll() {
		return list;
		//TODO
	}
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return new Music();
		//TODO
	}
	public Music removeMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {
				list.remove(vo);
				result = vo;
				break;
			}
		}
		return result;
	}
	public Music setMusic(String title, Music music) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {
				result = music;
				break;
			}
		}
		return result;
	}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		int result = 0;
		//TODO
		return result;
	}
	public int descSinger() {
		Collections.sort(list);
		int result = 0;
		//TODO
		return result;
	}
	
}
