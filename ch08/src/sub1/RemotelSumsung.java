package sub1;

public class RemotelSumsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Sumsung powerOn...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Sumsung powerOff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Sumsung chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Sumsung chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Sumsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Sumsung soundDown...");
		
	}

}
