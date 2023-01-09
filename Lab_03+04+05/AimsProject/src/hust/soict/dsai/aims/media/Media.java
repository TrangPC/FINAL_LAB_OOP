package hust.soict.dsai.aims.media;

import java.util.Comparator;
public abstract class Media {

	 protected int id;
	 protected String title;
	 protected String category;
	 protected double cost;
	 
	 public static final Comparator<Media> COMPARE_BY_TITLE_COST =
	            new MediaComparatorByTitleCost();
	 public static final Comparator<Media> COMPARE_BY_COST_TITLE =
	            new MediaComparatorByCostTitle();

	 
	 
     public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Media () {}
     
     public Media(int id, String title, String category, double cost) {
	        this.id = id;
	        this.title = title;
	        this.category = category;
	        this.cost = cost;
	 }	
     
     public boolean equals(Media m) {
    	 if(m == this) return true; 
    	 else if (m instanceof Media) {
    		 Media m1 = (Media) m;
    		 return title == m1.getTitle();
    	 }
    	 else return false;
     }
     
     public abstract boolean isMatch(String title);

}
