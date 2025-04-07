package lb1;

public class ComputerEquipment {
	public ComputerEquipment(String CPU, int HDDCapacity) {
		
		this.CPU = CPU;
		this.HDDCapacity = HDDCapacity;
	}
	
	private String CPU;
	private int HDDCapacity;
	
	public void Show() {

		
		System.out.printf("""
                CPU - %s
                HDD capacity - %d
                
                """, CPU, HDDCapacity);
	}
	
	public String GetCPU() {
		return CPU;
	}
	
	public int GetHDDCapaciti() {
		return HDDCapacity;
	}
}