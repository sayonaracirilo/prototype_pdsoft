public class OnixPrototype extends CarroPrototype {

	private OnixPrototype(OnixPrototype OnixPrototype) {
		this.valorCompra =OnixPrototype.getValorCompra();
	}

	public OnixPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Onix\n" + "Montadora: Chevrolet\n" + "Valor: R$"
				+ getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clonar() {
		return new OnixPrototype(this);
	}

}