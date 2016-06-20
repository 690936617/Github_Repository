package cn.zhou.file;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:"+File.separator+"TencentFile");
		System.out.println((double)(file.length())/1024/1024);
		File[] name = file.listFiles();
		//数组不建议用foreach集合推荐使用
		for(int i=0; i<name.length; i++) {
//			System.out.println("文件夹路径:"+name[i]);
//			System.out.println("文件夹名:"+name[i].getName());
			if(name[i].isDirectory()) {
				System.out.println(name[i].getAbsolutePath());
				if(name[i].getName().endsWith(".db")){
					System.out.println(name[i].getName());
				}
			}
		}
		String[] name2 = file.list();
		
	}
	class MyFileNameFilter implements FilenameFilter {

		@Override
		public boolean accept(File file, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(".txt");
		}
		
	}
}
