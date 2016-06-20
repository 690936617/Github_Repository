package cn.zhou.io;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrinterWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		
		String name = "zhangsan";
		int age = 23;
		int php = 80;
		int java = 100;
		PrintStream ps = new PrintStream("d:\\grade.txt");
		ps.println(name);
		ps.println(age);
		ps.println(java);
		
		/**
		 * %f 浮点类型
		 * %s 字符串
		 * %c 单个字符
		 * %
		 * 
		 */
		ps.printf("姓名:%s 年龄:%d php成绩:%d java成绩:%d", name,age,php,java);
	}
		
}
