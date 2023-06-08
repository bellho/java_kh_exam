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
//		Music result = null;
//		for(Music vo : list) {
//			if(vo.getTitle().equals(title)) {
//				list.remove(vo);
//				result = vo;
//				
//				int finIdx = list.indexOf(vo);
//				list.set(findIdx, music);
//				break; // 강사님이 한 방법
//			}
//		}
//		return result;
		
		Music result = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
		return result;
	}
	public int ascTitle() {
//		Collections.sort(list, new AscTitle());
		int result = 0;
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - (i + 1); j++) {
				if(list.get(j).getTitle().compareTo(list.get(j + 1).getTitle()) > 0) {
					Music tmp = list.get(j);
					list.set(j,  list.get(j + 1));
					list.set(j + 1, tmp);
				}
			}
		}
		return result;
	}
	public int descSinger() {
		// list 에서 singer 에서 singer는 없다.
		//list.get(0).getSinger;
		int result = 0;
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - (i + 1); j++) {
				if(list.get(j).getSinger().compareTo(list.get(j + 1).getSinger()) < 0) {
					Music tmp = list.get(j);
					list.set(j,  list.get(j + 1));
					list.set(j + 1, tmp);
				}
			}
		}
		return result;
	}
	public int ascTitle2() {
		int result = 0;
		
		return result;
	}
	public int descSinger2() {
int result = 0;
		
		return result;
	}
}
