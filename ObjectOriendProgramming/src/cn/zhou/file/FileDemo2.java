package cn.zhou.file;
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//创建一级目录
		new File("D:\\File").mkdir();
		File file = new File("D:\\File\\ChildFile.txt");
		//创建二级目录
//		file.mkdirs();
		if(file.exists()) {
			file.delete();
		}else {
			file.createNewFile();
			System.out.println(file.canWrite());
		}
	}
}
