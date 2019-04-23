public class HB20prototype extends CarroPrototype {

	protected HB20prototype(HB20prototype HB20Prototype) {
		this.valorCompra = HB20Prototype.getValorCompra();
	}

	public HB20prototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: HB20\nMontadora: Hyundai\n" + "Valor: R$"
				+ getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clone() throws CloneNotSupportedException{
		return (HB20prototype)super.clone();
	}

}
