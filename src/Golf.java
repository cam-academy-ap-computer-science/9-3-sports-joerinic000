
public class Golf extends Player {
	private String name;
	private int height;
	private int HI1s;
	
	public Golf(String name, int height, int HI1s) {
		super(name, height);
		this.setHI1s(HI1s);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHI1s() {
		return HI1s;
	}

	public void setHI1s(int hI1s) {
		HI1s = hI1s;
	}
} 
