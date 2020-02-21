package g_exception;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * << 예외 발생시키기 >>
		 * - Throw new Exception();
		 * - throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */

		
		IOException ioe = new IOException();
		
		try {
			throw ioe;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		RuntimeException의 자식들을 예외처리가 강제되지 않는다.
		throw new NullPointerException();
		
		
		
	}

}
