package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	  private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	  
	  public void addMedia(Media m) {
		  if(itemsInStore.contains(m)) {
			  System.out.println(m+ " existed!");
			  return;
		  }else {
			  itemsInStore.add(m);
			  System.out.println("Add successfully!");
		  }
	  }
	  
	  public void removeMedia(Media m) {
		  if(!itemsInStore.contains(m)) {
			  System.out.println(m+ " don't exist!");
			  return;
		  }else {
			  itemsInStore.remove(m);
			  System.out.println("Remove successfully!");
		  }
	  }
	  
	  public Media findMedia(String title) {
		  for(Media m : itemsInStore )
			  if(m.isMatch(title)) return m;
		return null;
		  
	  }
	  public void displayStore() {
		  for(Media m : itemsInStore)
			  System.out.println(m.toString());
	  }

	public ArrayList<Media> getItemsInStore() {
		// TODO Auto-generated method stub
		return itemsInStore;
	}
}

