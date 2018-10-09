package AbstractFactory;

public class TestaMastercardComunicadorFactory {

	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
		
		String transacao = "valor=560;senha=123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
