package capitulo04topico14;

public class TesteCasa {
	public static void main(String[] args) {
		Casa casa = new Casa();
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		
		casa.porta1 = p1;
		casa.porta2 = p2;
		casa.porta3 = p3;
		
		casa.pintaCasa("Vermelho");
		
		casa.porta3.abrePorta();
		casa.porta2.abrePorta();
	
		System.out.println("Portas abertas:" + casa.quantasPortasEstaoAbertas());
	}
}
