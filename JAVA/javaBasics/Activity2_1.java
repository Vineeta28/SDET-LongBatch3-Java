package javaBasics;

abstract class Book {
	String title;
	
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
		
	}
}

 class MyBook extends Book{
	 public void setTitle(String s) {
		 title = s;
	 }
 }
public class Activity2_1 {
	
	public static void main(String[] args) {
		Book newNovel = new MyBook();
		newNovel.setTitle("Harry Potter");
		System.out.println("Title of the book is "+newNovel.getTitle());
	}
	
	

}
