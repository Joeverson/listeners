package br.edu.ifpb.pdp.labirinty;

public class Door implements ElementLabirinty{
	private boolean door;
	private ElementLabirinty sala1;
	
		
	public boolean isDoor() {
		return door;
	}

	public void setDoor(boolean door) {
		this.door = door;
	}

	@Override
	public void entrar() {
		System.out.println("Opa, achou a porta kk boa sorte na proxima ;) \n\n");
		
	}

	public ElementLabirinty getSala1() {
		return sala1;
	}

	public void setSala1(ElementLabirinty sala1) {
		this.sala1 = sala1;
	}

}
