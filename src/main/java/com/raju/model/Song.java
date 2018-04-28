package com.raju.model;

import java.util.List;

public class Song {
	private String name;
	private String type;
	private List<String> singers;
	private String lyricist;
	private int accessed;
	private boolean favourite;
	private int rating;
	private int rank;
	private String path;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getSingers() {
		return singers;
	}

	public void setSingers(List<String> singers) {
		this.singers = singers;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public int getAccessed() {
		return accessed;
	}

	public void setAccessed(int accessed) {
		this.accessed = accessed;
	}

	public boolean isFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	

}
