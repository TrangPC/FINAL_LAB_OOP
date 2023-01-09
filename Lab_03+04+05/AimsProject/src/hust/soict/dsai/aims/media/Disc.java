package hust.soict.dsai.aims.media;

public class Disc extends Media {
	
	protected String director;
	protected int length;
	
	public Disc() {}
	
	public Disc(int id, String title, String category, double cost, int length, String director) {
		super(id,title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public boolean isMatch(String title) {
		// TODO Auto-generated method stub
		return false;
	}

}
