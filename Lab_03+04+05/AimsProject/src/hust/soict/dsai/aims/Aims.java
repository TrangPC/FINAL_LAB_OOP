package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
	public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("-----------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-----------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("-----------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) throws PlayerException {
    	
    	Scanner input = new Scanner(System.in);
    	int option, option1, option2, option3, option4;
    	
    	// Insert data from example of StoreTest
    	DigitalVideoDisc dvd1= new DigitalVideoDisc(1,"The Lion King", "Animation", 19.95f,87 , "Roger Aller");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", 24.95f, 87, "Gerge Lucas");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        
        Store store = new Store();
        
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        
     // Insert data from example of CartTest
        
        DigitalVideoDisc d1= new DigitalVideoDisc(1,"The Lion King", "Animation", 19.95f,87 , "Roger Aller");
        DigitalVideoDisc d2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", 24.95f, 87, "Gerge Lucas");
        DigitalVideoDisc d3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        Cart cart = new Cart();
        
        cart.addMedia(d1);
        cart.addMedia(d2);
        cart.addMedia(d3);
        
		do {
    		showMenu();
    		option = input.nextInt();
    		switch(option) // showMenu
    		{	
    		case 1: store.displayStore(); //View store
    		storeMenu();    		
    		do {
    			option1 = input.nextInt();
    			switch(option1) { // storeMenu
    			case 1: //See a media’s details
    				String title = input.nextLine();
    				Media m = store.findMedia(title);
    				if (m == null) System.out.println(title+ " don't exist!");
    				else { m.toString();
    					mediaDetailsMenu();
    					do {
    						option3 = input.nextInt();
    						switch(option3) {
    						case 1: // Add to cart
    							System.out.println("Enter the title of the media:");
    							String titleMedia = input.nextLine();
    							Media m1 = store.findMedia(titleMedia);
    							if(m1!=null) System.out.println(titleMedia+ " existed!"); 
    							else {
    								cart.addMedia(m1);
    								System.out.println("Number DVDs in cart: "+ cart.numberDVDs());
    							}
    							break;
    						case 2: // Play
    							String title2 = input.nextLine();
    		    				Media m2 = store.findMedia(title2);
    		    				if (m2 == null) System.out.println(title2+ " don't exist!");
    		    				else {
    		    					int check = 0;
    		    					if (m2 instanceof DigitalVideoDisc) {((DigitalVideoDisc)m2).play(); check = 1;}   		
    		    					if (check == 0) System.out.println("Can't play!");
    		    				}
    		    				break; 
    				}   						
    				}while(option3!=0);
    			}
    				break;
    				
    			case 2: // Add media to cart
    				System.out.println("Enter the title of the media:");
					String titleMedia = input.nextLine();
					Media m1 = store.findMedia(titleMedia);
					if(m1!=null) System.out.println(titleMedia+ " existed!"); 
					else {
						cart.addMedia(m1);
					}
    				break;
    				
    			case 3: // Play media
    				String title2 = input.nextLine();
    				Media m2 = store.findMedia(title2);
    				if (m2 == null) System.out.println(title2+ " don't exist!");
    				else {
    					int check = 0;
    					if (m2 instanceof DigitalVideoDisc) {((DigitalVideoDisc)m2).play(); check = 1;}   		
    					if (check == 0) System.out.println("Can't play!");
    				}
    				break;
    			case 4: // See current cart
    				cart.displayCart();
    				break;    				
    			}
    		}while(option != 0);    		
    		break;
    		
    		case 2: // Update store
    			cartMenu();
    			do {
    				option4 = input.nextInt();
    				switch(option4) {
    				case 1: //Filter medias in cart
    					System.out.println("1. Filter by id \t 2.Filter by title");
    					int x = input.nextInt();
    					if(x==1) {
    						System.out.println("Enter id: ");
    						int id = input.nextInt();
    						Media m = cart.findCart(id);
    						m.toString();
    					}
    					if(x==2) {
    						System.out.println("Enter title: ");
    						String title = input.nextLine();
    						Media m = cart.findCart(title);
    						m.toString();
    					}
    					break;
    				case 2: // Sort medias in cart
    					System.out.println("1. Sort by title \t 2.Sort by cost");
    					int x1 = input.nextInt();
    					if(x1==1) {
    						cart.sortByTitle();
    						cart.displayCart();
    					}
    					if(x1==2) {
    						cart.sortByCost();
    						cart.displayCart();
    					}
    					break;
    				case 3: //Remove media from cart
    					String title4;
    					title4 = input.nextLine();
    					Media m = store.findMedia(title4);
    					if(m==null) System.out.println("Don't exist!");
    					else {
    						cart.removeMedia(m);				
    					}
    					break;
    				case 4: //Play a media
    					String title2 = input.nextLine();
	    				Media m2 = store.findMedia(title2);
	    				if (m2 == null) System.out.println(title2+ " don't exist!");
	    				else {
	    					int check = 0;
	    					if (m2 instanceof DigitalVideoDisc) {((DigitalVideoDisc)m2).play(); check = 1;}   		
	    					if (check == 0) System.out.println("Can't play!");
	    				}
    					break;
    				case 5: // Place order
    					System.out.println("An order is created!");
    					cart = null;
    					break;
    				}
    			}
    			while(option4!=0);
    			break;
    			
    		case 3: // See current cart
    			cart.displayCart();
    			break;
    		}
    		
    		
    	}
    	while (option != 0);
    }
}
