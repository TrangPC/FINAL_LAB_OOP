package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	 public static final int MAX_NUMBERS_ORDERED = 20;
//	private static final Comparator MediaComparatorByTitleCost = null;
//	private static final Comparator MediaComparatorByCostTitle = null;
	 private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

	 
	 public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void addMedia(Media m) {
	        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
	            itemsOrdered.add(m);
	            System.out.println("Add successfully!");
	        } else {
	            System.out.println("Full cart!");
	        }
	    }
	 
	 public void addMedia(Media m1, Media m2) {
		 if(itemsOrdered.size()+2 <= MAX_NUMBERS_ORDERED) {
			 itemsOrdered.add(m1);
			 itemsOrdered.add(m2);
			 System.out.println("Add "+ m1.getTitle()+ ", "+ m2.getTitle()+"successfully!");
		 }
		 else if (itemsOrdered.size()+1<= MAX_NUMBERS_ORDERED) {
			 itemsOrdered.add(m1);
			 System.out.println("Add "+ m1.getTitle()+" successfuly! Cart is full!");
		 }
		 else System.out.println("Full cart!");
	 }
	 
	 public int numberDVDs() {
		 int count = 0;
		 for (Media m : itemsOrdered)
		 {if (m instanceof DigitalVideoDisc) count++;}
		 return count;
	 }
	 
	 public void removeMedia(Media m) {
	       if(itemsOrdered.contains(m)) {
	    	   itemsOrdered.remove(m);
	    	   System.out.println("Remove successfully!");
	       }
	       else {
	    	   System.out.println(m+ " don't exist!");
	       }
	    }
	 
	 public float totalCost() {
		 float sum = 0;
		 for(Media m : itemsOrdered)
		 sum += m.getCost();
		 return sum;
	 }
	 
	 public Media findCart(int id) {
		 for(Media m : itemsOrdered)
			 if(m.getId() == id) return m;
		 return null;
	 }
	 
	 public Media findCart(String title) {
		 for(Media m : itemsOrdered)
			 if(m.getTitle().compareTo(title)==1) return m;
		 return null;
	 }
	 
	 public void displayCart() {
		 for(Media m : itemsOrdered)
			 System.out.println(m.toString());
	 }
	 
	 public void sortByTitle() {
		 Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
	 }
	 public void sortByCost() {
		 Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
	 }
}






















