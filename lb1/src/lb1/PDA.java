package lb1;

public class PDA extends ComputerEquipment{
	public PDA(String CPU, int HDDCapacity, String type) {
		super(CPU, HDDCapacity);
		
		this.type = type;
	}
	
	private String type;
	
	public void Show() {
		System.out.printf("Type - %s \n", type);
		super.Show();
	}
}
