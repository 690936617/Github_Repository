package cn.zhou.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FilleRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:\\text1.txt");
		FileOutputStream fos = new FileOutputStream("d:\\text2.txt");
	/*	int b = 0;
		while((b=fis.read()) != -1) {
			fos.write(b);
		}*/
		byte[] b = new byte[60];
		while(fis.read(b) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
}
