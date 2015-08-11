package dk.magenta.eark;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MyPath {

	public static void main(String[] args) throws IOException {
		Path path = FileSystems.getDefault().getPath("/tmp", "hurraFile.txt");
		System.out.println(path);
		Files.createFile(path);
		
		/*
		BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset(), StandardOpenOption.APPEND);
		writer.write("dette er en test");
		writer.close();
		*/
	}

}
