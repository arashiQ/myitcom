package com.arashiq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Stream;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyitcomApplication.class)
@WebAppConfiguration
public class MyitcomApplicationTests {

	@Test
	public void contextLoads() throws IOException {
		Path path = Paths.get("C:\\png\\avator");

		getFiles(path);
	}

	private void getFiles(Path path) throws IOException {
		Files.walkFileTree(path, new FindJavaVisitor());

	}

	private static class FindJavaVisitor extends SimpleFileVisitor<Path> {
		int n = 0;
		String subPathStr = "";
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

			if(file.toString().endsWith(".png")){
				String subPath = file.toAbsolutePath().subpath(2, 6).toString().replace("\\", "");
				if(!subPathStr.equals(subPath)){
					n = 0;
					subPathStr = subPath;
				}

				subPath += String.format("%02d.png", n++);
				Files.copy(file, Paths.get("C:\\png\\myavator\\"  + subPath));
			}else{
				System.out.println(file.getFileName());
			}
			return FileVisitResult.CONTINUE;
		}

	}


}
