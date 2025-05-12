package com.trioedge;

 class parent {
	  static class child extends parent {
		  child(){
			  super();
			  System.out.println("child arg 0");
		  }
	  }
	  public static void main(String args[]) {
		  child obj= new child();
	  }
	
	

}
