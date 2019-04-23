public class PalioPrototype extends CarroPrototype {

	protected PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
	}

	public PalioPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Palio\n" + "Montadora: Fiat\n" + "Valor: R$"
				+ getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clone()  throws CloneNotSupportedException{
		return (PalioPrototype)super.clone();
	}

}
