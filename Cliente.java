public class Cliente {
	public static void main(String[] args) {
		PalioPrototype prototipoPalio = new PalioPrototype();
		GolPrototype prototipoGol = new GolPrototype();
		FiestaPrototype prototipoFiesta = new FiestaPrototype();
		HB20prototype prototipoHB20 = new HB20prototype();
		OnixPrototype prototipoOnix = new OnixPrototype();
		
		CarroPrototype palioNovo = prototipoPalio.clonar();
		palioNovo.setValorCompra(27900.0);
		CarroPrototype palioUsado = prototipoPalio.clonar();
		palioUsado.setValorCompra(21000.0);
		
		CarroPrototype HB20Novo = prototipoHB20.clonar();
		HB20Novo.setValorCompra(40000.0);
		
		CarroPrototype OnixNovo = prototipoOnix.clonar();
		OnixNovo.setValorCompra(42000.0);
		
		
		CarroPrototype GolTunado = prototipoGol.clonar();
		GolTunado.setValorCompra(43500.0);
		CarroPrototype GolAcabado = prototipoGol.clonar();
		GolAcabado.setValorCompra(13000.0);
		
		int i=0;
		while(i<10) {
			System.out.println("Encomenda de 10 carros\n");
			CarroPrototype Fiesta = prototipoFiesta.clonar();
			Fiesta.setValorCompra(20000.0);
			System.out.println(Fiesta.exibirInfo());
			i++;
		}
		
		System.out.println(palioNovo.exibirInfo());
		System.out.println(palioUsado.exibirInfo());
		System.out.println(GolTunado.exibirInfo());
		System.out.println(GolAcabado.exibirInfo());
		System.out.println(HB20Novo.exibirInfo());
		System.out.println(OnixNovo.exibirInfo());
		
	
	}
}