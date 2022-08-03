public class CalculadorDeImpostos {
	
	public void realiazaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double icms = impostoQualquer.calcula(orcamento);
		System.out.print(icms);
	
	}

}
