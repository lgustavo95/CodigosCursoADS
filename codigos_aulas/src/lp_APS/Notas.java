package lp_APS;

public class Notas {
		String notaAP1,notaAP2,notaAPS;
		
		public Notas() {
			
		}
	
		public Notas(String notaAP1,String notaAP2,String notaAPS) {
			setNotaAP1(notaAP1);
			setNotaAP2(notaAP2);
			setNotaAPS(notaAPS);
	}

	public String getNotaAP1() {
		return notaAP1;
	}
	public void setNotaAP1(String notaAP1) {
		this.notaAP1 = notaAP1;
	}

	public String getNotaAP2() {
		return notaAP2;
	}
	public void setNotaAP2(String notaAP2) {
		this.notaAP2 = notaAP2;
	}

	public String getNotaAPS() {
		return notaAPS;
	}
	public void setNotaAPS(String notaAPS) {
		this.notaAPS = notaAPS;
	}
		
}