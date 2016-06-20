package cn.zhou.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStream {
	public static void main(String[] args) throws IOException {
		File f1 = new File("d://file1.txt");
		File f2 = new File("d://file2.txt");
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedInputStream bi = new BufferedInputStream(fis, 256);
		BufferedOutputStream bo = new BufferedOutputStream(fos, 256);
/*		int i=0;
		while((i=bi.read()) != -1) {
			bo.write(i);
		}*/
		byte[] b = new byte[60];
		while(bi.read(b) !=-1) {
//			bo.write(b);
			//offset(偏移量) length(byte)
			bo.write(b, 0, b.length);
		}
		/* 当我们使用输出流发送数据时，当数据不能填满输出流的缓冲区时，这时，数据就会被存储在输出流的缓冲区中.
		 * 如果，我们这个时候调用关闭(close)输出流，存储在输出流的缓冲区中的数据就会丢失
		 * flush防止数据丢失
		 */
		bo.flush();
		bi.close();
		bo.close();
	}
}	
