package com.raju.model;

import java.util.List;

public class Album {
	private int id;
	private String name;
	private String composer;
	private int year;
	private List<Song> songs;
	private boolean favourite;
	private int rating;
	private int accessed;
	private int rank;
	private String path;
	private boolean show;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
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
	public int getAccessed() {
		return accessed;
	}
	public void setAccessed(int accessed) {
		this.accessed = accessed;
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
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	
	

}
