package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media m1, Media m2) {
		// TODO Auto-generated method stub
		
		if (m1.getCost() != m2.getCost()) return 0;
		return (m1.getTitle().compareTo(m2.getTitle()));
	}

}
