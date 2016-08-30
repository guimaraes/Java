class Programa{
	public static void main(String[] args){
		
		Conta guimaraes = new Conta();
		guimaraes.numero = 1234;
		guimaraes.agencia = 321;
		guimaraes.saldo = 1500000.00;

		guimaraes.titular = new Pessoa();
		guimaraes.titular.nome = "Guimaraes Neto";
		guimaraes.titular.cpf = "999.000.777-00";
		guimaraes.titular.dataNascimento = "07/09/1979";

		
		guimaraes.deposita(2000.00);		

		Conta fullcode = new Conta();
		fullcode.numero = 4321;
                fullcode.agencia = 123;
                fullcode.saldo = 1500000.00;

		fullcode.titular = new Pessoa();
                fullcode.titular.nome = "FullCodes";
                fullcode.titular.cpf = "00.999.888.222/0001-00";
                fullcode.titular.dataNascimento = "01/08/2008";


		fullcode.deposita(754000);

		fullcode.transfere(10.50, guimaraes);

		System.out.println("======================================");
                System.out.println("  Saldo cliente: "+guimaraes.titular);
	        System.out.println("======================================");
		System.out.println("");
		System.out.println("  Saldo FullCodes: "+fullcode.saldo);
		System.out.println("  Saldo Guimarães: "+guimaraes.saldo);
		System.out.println("");
		System.out.println("======================================");



	}
}
