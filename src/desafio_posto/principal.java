package desafio_posto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		//criando lista de modeloveiculo
		List<modeloVeiculo> modeloVeiculos = new ArrayList<modeloVeiculo>();
		
		// criar um maps para separa qual veiculo abasteceu com alcool e gasolina
		HashMap<String, List<modeloVeiculo>> maps = new HashMap<String, List<modeloVeiculo>>();		
		
		//criando variavel totalLitros abastecido com alcool
		double totalLitrosAlcool = 0;
		
		// criando variavel total Litros abastecido com gasolina
		double totalListrosGasolina = 0;
		
		String qtd = JOptionPane.showInputDialog("informe a quantidade de veiculos");
		
		for (int i = 0; i < Integer.parseInt(qtd); i++) {
			//entrada de dados
			String modelo = JOptionPane.showInputDialog("informe o modelo");
			String capacidade = JOptionPane.showInputDialog("capacidade do tanque");
			String combustivel = JOptionPane.showInputDialog("Qual  combustivel vai abastecer 1 alcool | 2 gasolina");
			//fim da entrada de dados
			
			//instanciar objeto veiculo
			modeloVeiculo veiculo = new modeloVeiculo();
			veiculo.setCapacidadeTanque(Double.valueOf(capacidade));
			
			//verificar qual combustivel foi escolhido
			
			int conb = Integer.parseInt(combustivel);
			if(conb == 1) {
			veiculo.setCombustivel("alcool");
			
			}else if(conb == 2) {
				
				veiculo.setCombustivel("gasolina");
			}
			veiculo.setModelo(modelo);
			
			//addicionando veiculos na lista 
			modeloVeiculos.add(veiculo);
		}
		//criar maps para cada combustivel
		maps.put("alcool", new ArrayList<modeloVeiculo>());
		maps.put("gasolina", new ArrayList<modeloVeiculo>());
		
		//for para separar os carros que foram abastecido com alcool e gasolina
		for (modeloVeiculo modeloVeiculo : modeloVeiculos) {
			if(modeloVeiculo.getCombustivel().equalsIgnoreCase("alcool")) {
				
				maps.get("alcool").add(modeloVeiculo);
				
				//somando quantidade do tanque para saber quantos litros foi abastecido 
				totalLitrosAlcool+= modeloVeiculo.getCapacidadeTanque();
				
			}else if(modeloVeiculo.getCombustivel().equalsIgnoreCase("gasolina")) {
				
				maps.get("gasolina").add(modeloVeiculo);
				
				//somando quantidade do tanque para saber quantos litros foi abastecido 
				totalListrosGasolina+= modeloVeiculo.getCapacidadeTanque();
				
			}
		}
		
		System.out.println("--------------------Lista veiculos alcool-------------------------------");
		
		for (modeloVeiculo modeloVeiculo : maps.get("alcool")) {
			
			System.out.println(modeloVeiculo);
		}
		
		
		System.out.println("--------------------Lista veiculos gasolina-------------------------------");
		
		for (modeloVeiculo modeloVeiculo : maps.get("gasolina")) {
			
			System.out.println(modeloVeiculo);
		}
		
		//------------------------campo das informações do abastecimento e adicionais
		
		System.out.println();
		System.out.println("Total abastecido  (GASOLINA): "+totalListrosGasolina+" litros");
		System.out.println("Total abastecido  ((ETANOL): "+totalLitrosAlcool+" litros");
		
		System.out.println("-----------------Informações adicionais:--------------------------------");
		System.out.println();
		
		System.out.println("O preço do litro da GASOLINA é R$ 2,90");
		System.out.println("O preço do litro do ETANOL é R$ 2,27");
		
		
		

	}

}
