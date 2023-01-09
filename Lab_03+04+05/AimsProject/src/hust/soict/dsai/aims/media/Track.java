package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
		
		 private String title;
		 private int length;
		
		 public Track() {}
		
		public Track(String title, int length) {
			this.title = title;
			this.length = length;
		}
	    
	public String getTitle() {
			return title;
		}

		public int getLength() {
			return length;
		}
		
		public boolean equals(Track t) {
			if(this == t) return true;
			else if(t instanceof Track) {
				Track t1 = (Track) t;
				if(title.compareTo(t1.getTitle())==1  && length == t1.getLength())
					return true;
			}
			return false;
		}
	
	@Override
	public void play () throws PlayerException{
    	if (this.getLength()>0) {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    	else { throw new PlayerException("ERROR: DVD length is non-positive!");
    		}
    	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

