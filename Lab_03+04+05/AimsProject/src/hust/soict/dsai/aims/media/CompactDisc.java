package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Media implements Playable{
	    private String artist;
	    private List<Track> tracks = new ArrayList<Track>();

	    public CompactDisc(String artist, List<Track> tracks) {
	        this.artist = artist;
	        this.tracks = tracks;
	    }
	    
	    public void addTrack(Track t) {
	    	if(tracks.contains(t)) {
	    		System.out.println(t+ " existed!");
	    		return;
	    	}
	    	else {
	    		tracks.add(t);
	    		System.out.println("Add successfully!");
	    	}
	    }
	    
	    public void removeTrack(Track t) {
	    	if(!tracks.contains(t)) {
	    		System.out.println(t+ " don't exist!");
	    		return;
	    	}
	    	else {
	    		tracks.remove(t);
	    		System.out.println("Remove successfully!");
	    	}
	    }
	    
	    public int getLength() {
	    	int sum = 0;
	    	for(Track t : tracks)
	    		sum += t.getLength();
	    	return sum;
	    }
	    
	    
	@Override
	public void play() throws PlayerException{
		// TODO Auto-generated method stub
		
		if(this.getLength()>0)
			{
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				nextTrack.play();
			}
			}else {
				throw new PlayerException("ERROR: CD length is non-positive!");
			}
				
	}

	@Override
	public boolean isMatch(String title) {
		// TODO Auto-generated method stub
		int t =  title.compareTo(this.getTitle());
		if (t == 1) return true;
		return false;
	}

	}

	

