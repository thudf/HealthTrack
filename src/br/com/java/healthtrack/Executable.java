package br.com.java.healthtrack;

import java.util.ArrayList;
import java.util.Date;

public class Executable {

	public static void main(String[] args) {
		
		Usuario novoUsuario = new Usuario("Teste", "10/10/2005", "222.333.444-55", "22.333.444-5", "teste@teste.com", "senhaTeste", "https://upload.wikimedia.org/wikipedia/pt/8/86/Avatar_Aang.png");
		
		String codigoUsuario = novoUsuario.getCodigoUsuario();
		String nomeUsuario = novoUsuario.getNome();
		String dataNascimentoUsuario = novoUsuario.getDataNascimento();
		String cpfUsuario = novoUsuario.getCpf();
		String rgUsuario = novoUsuario.getRg();
		String emailUsuario = novoUsuario.getEmail();
		String senhaUsuario = novoUsuario.getSenha();
		String avatarUsuario = novoUsuario.getAvatar();
		
		System.out.println(String.format("Código do usuário: %s", codigoUsuario));
		System.out.println(String.format("Nome do usuário: %s", nomeUsuario));
		System.out.println(String.format("Data de Nascimento do usuário: %s", dataNascimentoUsuario));
		System.out.println(String.format("CPF do usuário: %s", cpfUsuario));
		System.out.println(String.format("Rg do usuário: %s", rgUsuario));
		System.out.println(String.format("Email do usuário: %s", emailUsuario));
		System.out.println(String.format("Senha do usuário: %s", senhaUsuario));
		System.out.println(String.format("Avatar do usuário: %s", avatarUsuario));
		System.out.println(String.format("Status do usuário: %s", novoUsuario.getStatus()));
		
		novoUsuario.setAtivo(false);
		System.out.println(String.format("Status do usuário: %s", novoUsuario.getStatus()));
		
		Alimento novoAlimento = new Alimento("Bisteca de porco", "Proteína animal", 50);
		
		String codigoAlimento = novoAlimento.getCodigoAlimento();
		String nomeAlimento = novoAlimento.getNome();
		String descricaoAlimento = novoAlimento.getDescricao();
		int caloriaPorGramaAlimento = novoAlimento.getCaloriaPorGrama();
		
		System.out.println(String.format("Código do alimento: %s", codigoAlimento));
		System.out.println(String.format("Nome do alimento: %s", nomeAlimento));
		System.out.println(String.format("Descrição do alimento: %s", descricaoAlimento));
		System.out.println(String.format("Calorias por grama do alimento: %s", caloriaPorGramaAlimento));
		
		RefeicaoItem novoItemDeRefeicao = new RefeicaoItem(novoAlimento, 10);
		
		String codigoNovoItemRefeicao = novoItemDeRefeicao.getCodigoRefeicaoItem();
		String codigoAlimentoNovoItemRefeicao = novoItemDeRefeicao.getAlimento().getCodigoAlimento();
		String nomeAlimentoNovoItemRefeicao = novoItemDeRefeicao.getAlimento().getNome();
		int quantidadeConsumidaNovoItemRefeicao = novoItemDeRefeicao.getQuantidadeConsumida();
		int caloriaConsumidaNovoItemRefeicao = novoItemDeRefeicao.getCaloriaConsumida();
		
		System.out.println(String.format("Código do novo item da refeição: %s", codigoNovoItemRefeicao));
		System.out.println(String.format("Código do alimento do novo item da refeição: %s", codigoAlimentoNovoItemRefeicao));
		System.out.println(String.format("Nome do alimento do novo item da refeição: %s", nomeAlimentoNovoItemRefeicao));
		System.out.println(String.format("Quantidade consumida em gramas do item da refeicao: %s", quantidadeConsumidaNovoItemRefeicao));
		System.out.println(String.format("Quantidade de calorias consumidas do item da refeicao: %s", caloriaConsumidaNovoItemRefeicao));
		
		novoItemDeRefeicao.setQuantidadeConsumida(12);
		System.out.println(String.format("Quantidade consumida em gramas do item da refeicao: %s", novoItemDeRefeicao.getQuantidadeConsumida()));
		System.out.println(String.format("Quantidade de calorias consumidas do item da refeicao: %s", novoItemDeRefeicao.getCaloriaConsumida()));
		
		RefeicaoTipo novoTipoRefeicao = new RefeicaoTipo("Almoço", "Refeição feita no meio do dia");
		
		System.out.println(String.format("Código do novo tipo de refeição: %s", novoTipoRefeicao.getCodigoRefeicaoTipo()));
		System.out.println(String.format("Nome do novo tipo de refeição: %s", novoTipoRefeicao.getNome()));
		System.out.println(String.format("Descrição do novo tipo de refeição: %s", novoTipoRefeicao.getDescricao()));
		
		Date dataNovaRefeicao = new Date();
		ArrayList<RefeicaoItem> itens = new ArrayList<RefeicaoItem>();
		itens.add(novoItemDeRefeicao);
		Refeicao novaRefeicao = new Refeicao(dataNovaRefeicao, novoTipoRefeicao, itens, novoUsuario);
		
		String codigoNovaRefeicao = novaRefeicao.getCodigoRefeicao();
		Date dataHoraNovaRefeição = novaRefeicao.getDataHora();
		RefeicaoTipo tipoNovaRefeicao = novaRefeicao.getTipo();
		int totalCaloriasNovaRefeicao = novaRefeicao.getTotalCalorias();
		
		System.out.println(String.format("Código da nova refeição: %s", codigoNovaRefeicao));
		System.out.println(String.format("Data e hora da nova refeição: %s", dataHoraNovaRefeição));
		System.out.println(String.format("Tipo da nova refeição: %s", tipoNovaRefeicao.getNome()));
		System.out.println(String.format("Total de calorias ingeridas na nova refeição: %s", totalCaloriasNovaRefeicao));
		
		for(int i = 0; i < novaRefeicao.getItens().size(); i++) {
			int pos = i + 1;
			RefeicaoItem item = novaRefeicao.getItens().get(i);
			System.out.println(String.format("Nome do item %s da nova refeição: %s", pos, item.getAlimento().getNome()));
		}

	}

}
