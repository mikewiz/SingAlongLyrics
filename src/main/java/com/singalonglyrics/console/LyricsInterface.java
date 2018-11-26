package com.singalonglyrics.console;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LyricsInterface {
	private boolean recursive = false;
	
	public LyricsInterface(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*String link = returnUrlFromConsole(br); 
		String fullRecursionLyrics = optionalFullRecursiveMode(br, 1); 
		String fileName =getFileNameFromLink(link); 
		String extension = getExtension(fileName);*/
		askToRunRecursive();
	}

	private void askToRunRecursive() {
		this.recursive = true;
	}
}
