package cn.zhou.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * 
 * @author Mr.Zh
 *
 * randomaccessfile
 * datainputstream
 */
public class ObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Students stu = new Students("zhangsan", 23, "man", 80);
		FileOutputStream fos = new FileOutputStream("d:\\students.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu);
		
//		FileInputStream fis = new FileInputStream("d:\\student.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		stu = (Students)ois.readObject();
	}
}
