package com.itea.java.core.homework.filemanager;

import java.io.IOException;

public class FileManagerTest {

	public static void main(String[] args) throws IOException {
		FileManager file = new FileManager();
		file.copy("first.txt", "second.txt");
	}

}
