package cn.zhou.exceptionandlog4j;
import org.apache.log4j.Logger;

public class ExceptionHandler {
	private static Logger logger = Logger.getLogger(ExceptionHandler.class);
	public static void main(String[] args) {
		int[] array = {1,2};
		try {
			System.out.println(array[2]);			
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("空指针异常...");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			logger.error(e.getMessage()+e.getStackTrace());
			System.out.println("数组下标越界...");
		}
		System.out.println("hello....");
		
	}
}
