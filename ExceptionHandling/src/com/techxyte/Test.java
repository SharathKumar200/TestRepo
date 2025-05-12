package com.techxyte;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws /* InterruptedException, */ IOException {

	// Exception : Root class of exception is throwable class

	/*
	 * UN-CHECKED Exception:which are not checked by compiler they call un-checked
	 * exception and also the exception which are child class of runtime-exception
	 */

	// System.out.println("Hlo World!");
	// System.out.println(10/0); //AE[Arithmetic exception]

	// int [] a= {10,20,30};
	// System.out.println(a[0]);
	// System.out.println(a[6]); //ArrayIndexoutofbound exception[AIOB]
	// System.out.println("hlo".charAt(4));//SIOB

	// Integer i=Integer.valueOf("ten");//NumberFormatException[NFE]

	// CHECKED Exception:Safe exception:Raised at runtime

	// System.out.println("hii ");
	// Thread.sleep(1000);//IE
	// System.out.println("hlo");
	// FileInputStream fis=new FileInputStream("abs.txt");//FileNotFoundException

	// ERRORS:due to lack of system resources[un-checked exception]

	// Stackoverflow(memory problem)
	// Outofmemory problem(memory not available)
	// Assertion error
	// Awt error

	// UN-CHECKED Exception:All the unchecked exception are child class of runtime
	// exception
	// CHECKED Exception:All the checked exception are child class of exception
	// class

	// Handling the exception using try-catch block

	/*
	 * System.out.println("Hlo World!"); try { System.out.println(10/0);}
	 * catch(ArithmeticException e) { System.out.println(10/2); }
	 * System.out.println("Rest of the App!");
	 */

	// Ex3:If the catch block is not matched the program will terminate abnormally
	// Ex4:there is no exception in try block then catch block is not going to
	// checked or executed
	// Ex5:only try blocks are not allowed,try-catch,try-finally,try-with resource
	// declaration is allowed
	// Ex6:In between the two blocks statement declaration are not allowed
	// Ex7:Exception raised other than try block it always abnormal termination(like
	// exception occur in catch block it's always abnormal termination)
	// Ex8:once the exception raised in the try block the rest of the code in the
	// try block will not going to execute

	/*
	 * Example:
	 * 
	 * try { // Code that might throw an exception } catch (SpecificException e) {
	 * // Handle the exception } finally { // Release resources and perform cleanup
	 * }
	 */
	// simple example for pipe
	/*
	 * System.out.println("Hlo World!"); try { System.out.println(10/0);
	 * System.out.println("hello world1".charAt(12)); } catch(ArithmeticException
	 * |NullPointerException | StringIndexOutOfBoundsException e) {
	 * System.out.println(10/2); } System.out.println("Rest of the App!");
	 */

	// CATEGORY 4 Try-with Resorces:

	/*
	 * try(Scanner sc=new Scanner(System.in)){
	 * System.out.println("Enter a number:"); int num=sc.nextInt();
	 * System.out.println("Entered value:" +num); }
	 */
	/*
	 * try(FileInputStream fis=new FileInputStream("abc.txt")){
	 * System.out.println("how are you");
	 * 
	 * } catch(FileNotFoundException fe) { System.out.println("meeeeeee"); }
	 */

	// FINALLY BLOCK

	// NT:normal termination ABT:abnormal termination
	// case1:
	// NT
	/*
	 * try { System.out.println("hiii"); } catch(ArithmeticException ae) {
	 * System.out.println("hloo");
	 * 
	 * } finally { System.out.println("finally"); }
	 */
	// case2:
	// NT
	/*
	 * try { System.out.println(10/0); } catch(ArithmeticException ae) {
	 * System.out.println("hloo");
	 * 
	 * } finally { System.out.println("finally"); }
	 */
	// case3:
	// ABT
	/*
	 * try { System.out.println(10/0); } catch(NullPointerException ae) {
	 * System.out.println("hloo");
	 * 
	 * } finally { System.out.println("finally"); }
	 */
	// case4:
	// ABT
	/*
	 * try { System.out.println(10/0); } catch(NullPointerException ae) {
	 * System.out.println(10/0);
	 * 
	 * } finally { System.out.println("finally"); }
	 */
	// case 5:
	// ABT
	/*
	 * try { System.out.println(10/0); } catch(ArithmeticException ae) {
	 * System.out.println(10/2);
	 * 
	 * } finally { System.out.println(10/0); }
	 */
	// case 6:

	/*
	 * try { System.out.println(10); }
	 * 
	 * finally { System.out.println(10); }
	 */

	// NESTED TRY-CATCH BLOCK

	/*
	 * Scanner sc=new Scanner(System.in); System.out.println("Enter num:"); int
	 * num=sc.nextInt();
	 * 
	 * 
	 * try { System.out.println(10/num); try {
	 * System.out.println("ratan".charAt(100));
	 * 
	 * }catch(StringIndexOutOfBoundsException e) { System.out.println("sharth");
	 * 
	 * } } catch(ArithmeticException ae) { System.out.println("kumar");
	 * 
	 * } finally { System.out.println("hiiiiiii"); }
	 */

	// Throws
	/*void m2() throws InterruptedException, FileNotFoundException {
		Thread.sleep(1000);
		FileInputStream fis = new FileInputStream("abc.txt");

	}

	void m1() throws InterruptedException, FileNotFoundException {
		m2();
	}

	Throweskeyword tk = new Throweskeyword();
	try
	{
		tk.m1();
	}catch(
	Exception e)
	{
		e.printStackTrace();

	}*/
	}
}
