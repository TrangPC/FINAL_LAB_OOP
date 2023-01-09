package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

	@Override
	public int compare(Media m1, Media m2) {
		// TODO Auto-generated method stub
		
		if (m1.getTitle().compareTo(m2.getTitle())==0) return 0;
		if (m1.getCost() == m2.getCost()) return 1;
		return 0;
	}

}
