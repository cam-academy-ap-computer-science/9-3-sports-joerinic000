
public class Golfer extends Golf{
	private String club;
	public Golfer(String name, int height, int HI1s, String club) {
		super(name, height, HI1s);
		this.club = club;
	}
	
	public String Golfman() {
		return getName() + ", " + getHeight() + ", " + getHI1s() + ", " + club;
	}
	
	

}
