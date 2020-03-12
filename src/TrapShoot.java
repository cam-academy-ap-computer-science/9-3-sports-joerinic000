
public class TrapShoot extends Player {
	private String name;
	private int height;
	private String Shotgun;
	
	public TrapShoot(String name, int height, String Shotgun) {
		super(name, height);
		this.setShotgun(Shotgun);
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

	public String getShotgun() {
		return Shotgun;
	}

	public void setShotgun(String shotgun) {
		Shotgun = shotgun;
	}
}
