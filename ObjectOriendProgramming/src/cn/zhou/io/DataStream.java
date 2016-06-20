package cn.zhou.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d://file2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(1);
		dos.writeBoolean(true);
		dos.writeChar('z');
		dos.writeDouble(3.1415926);
		dos.writeLong(30L);
		byte[] b = {1 ,2};
		dos.write(b);
		dos.writeBytes("zhou");
		dos.writeUTF("zhous");
		
		FileInputStream fis = new FileInputStream("d://file2.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readLong());
		System.out.println(dis.readByte());
//		System.out.println(dis.readUTF());
		fos.close();
		dos.close();
		fis.close();
		dis.close();
	}
}
