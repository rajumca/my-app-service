package com.raju.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.model.Album;
import com.raju.model.Song;

@RestController("/almubs")
public class SongController {
	@CrossOrigin
	@GetMapping
	public List<Album> getAll() {
		List<Album> albums = new ArrayList<>();
		File file = new File("G:/MUSIC");
		File[] files = file.listFiles();
		int i = 0;
		for (File albumFile : files) {
			Album album = new Album();
			album.setName(albumFile.getName());
			album.setId(++i);
			album.setPath(albumFile.getAbsolutePath());
			List<Song> songs = new ArrayList<>();
			File[] listFiles = albumFile.listFiles();
			if (listFiles != null) {

				for (File songFile : listFiles) {
					Song song = new Song();
					song.setName(songFile.getName());
					song.setPath(songFile.getAbsolutePath());
					songs.add(song);
				}
				album.setSongs(songs);
				albums.add(album);

			}
		}
		return albums;

	}

}
