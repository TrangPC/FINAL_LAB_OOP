package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	 private List<String> authors = new ArrayList<String>();
	 
	 public List<String> getAuthors() {
	        return authors;
	    }

	    public void setAuthors(List<String> authors) {
	        this.authors = authors;
	    }
	    
	 public Book() {}
	 
	 public Book(int id, String title, String category, float cost, List<String> authors) {
	        super(id, title, category, cost);
	        this.authors = authors;
	    }
	 
	 public void addAuthor(String name) {
	        if(authors.contains(name)){
	        	System.out.println(name + " existed!");
	            return;
	        } else {
	            authors.add(name);
	            System.out.println("Add successfully!");
	        }
	    }
	 
	 public void removeAuthor(String name) {
	        if(!authors.contains(name)){
	        	System.out.println(name + " don't exist!");
	            return;
	        } else {
	            authors.remove(name);
	            System.out.println("Remove successfully!");
	        }
	    }
	 
	 @Override
	    public String toString(){
	        StringBuffer displayBook = new StringBuffer();
	        displayBook.append(id+ " : ");
	        displayBook.append(title+ " : ");
	        displayBook.append(cost+ " : ");
	        displayBook.append(category);
	        
	        return  displayBook.toString();
	    }
	 
	 
	@Override
	public boolean isMatch(String title) {
		// TODO Auto-generated method stub
		return false;
	}

}
