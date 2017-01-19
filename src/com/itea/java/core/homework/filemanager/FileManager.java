package com.itea.java.core.homework.filemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;

public class FileManager {
	public static void copyByte(String firstFile, String secondFile) throws IOException {
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

	public static void copyReaderWriter(String firstFile, String secondFile) throws IOException {
		FileReader readFromFirstFille = new FileReader(new File(firstFile));
		FileWriter writeToTheSecondFile = new FileWriter(new File(secondFile));
		int a;
		while ((a = readFromFirstFille.read()) != -1) {
			writeToTheSecondFile.write(a);

		}
		writeToTheSecondFile.close();
		readFromFirstFille.close();
	}

	public static void copyBuffer(String firstFile, String secondFile) throws IOException {
		BufferedReader myReader = null;
		PrintWriter myWriter = null;

		try {
			myReader = new BufferedReader(new FileReader(firstFile));
			myWriter = new PrintWriter(new FileWriter(secondFile));

			String line;
			while ((line = myReader.readLine()) != null) {
				myWriter.write(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			myReader.close();
			myWriter.close();
		}
	}

}
