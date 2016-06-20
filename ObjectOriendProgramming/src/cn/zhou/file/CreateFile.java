package cn.zhou.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		new File("d:\\file").mkdir();
		File f = new File("d:\\file\\file.txt");
		
		if(!f.exists()) {
			f.createNewFile();
		}else {
			System.out.println("true");
		}
	}
}
