package lb1;

public class Progaram {

	public static void main(String[] args) {
		ComputerEquipment ce1 = new ComputerEquipment("intel i3", 2048);
		Laptop l1 = new Laptop("AMD", 4096, "Laptop");
		Desktop d1 = new Desktop("intel i5", 8192, "Desktop");
		PDA pda1 = new PDA("intel pentium", 1024, "PDA");
		
		ComputerEquipment[] arr = new ComputerEquipment[]{
			ce1,
			l1,
			d1,					
			pda1
		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].Show();
		}
	}
}
