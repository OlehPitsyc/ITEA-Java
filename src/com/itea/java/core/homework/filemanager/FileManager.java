package com.itea.java.core.homework.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileManager {
	public static void copy(String firstFile, String secondFile) throws IOException {
		FileChannel sourceChannel = new FileInputStream(firstFile).getChannel();
		try {
			FileChannel destChannel = new FileOutputStream(secondFile).getChannel();
			try {
				destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			} finally {
				destChannel.close();
			}
		} finally {
			sourceChannel.close();
		}
	}
}
