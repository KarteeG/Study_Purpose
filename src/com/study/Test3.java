package com.study;
public class Test3 {
	public static void main(String[] args) {
		int a[] = new int[2];
		a[0] = 1;
		a[1] = 1;
		String s = null;
		try {
			// System.out.println(a[3]);
			System.out.println(s.indexOf(0));
		} catch (Error e){
			System.out.println("Error");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bond");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block Run");
		}
		System.out.println("After Finally run");

	}

}
