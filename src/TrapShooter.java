import java.util.*;
public class TrapShooter extends TrapShoot {
	private String ammo;
	private int shellsLeft = 7;
	public TrapShooter(String name, int height, String Shotgun, String ammoType) {
		super(name, height, Shotgun);
		ammo = ammoType;
	}
	
	public String Shoot() {
		shellsLeft--;
		return "BANG! You" + HoM() + " There are " + shellsLeft + " rounds left in your gun";
	}
	
	public String Reload() {
		shellsLeft = 7;
		return "Reloaded";
	}
	
	public String Shooter() {
		return getName() + ", " + getHeight() + ", " + getShotgun() + ", " + ammo;
	}
	
	private String HoM() {
		Random hM = new Random(2);
		int test = hM.nextInt() + 1;
		if(test == 1) {
			return "hit.";
		}
		else {
			return "missed.";
		}
	}
}
