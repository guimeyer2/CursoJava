import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AppHashMap {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.println("Insira o caminho do arquivo a ser lido:");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){


            String linha = br.readLine();

            while (linha != null){

                String[]fields = linha.split(" ");
                String nome = fields[0];
                int contagem = Integer.parseInt(fields[1]);

                if (votos.containsKey(nome)){
                    int votosPorAgora = votos.get(nome);
                    votos.put(nome,contagem + votosPorAgora);
                }
                else {
                    votos.put(nome, contagem);
                }
                linha = br.readLine();
            }
            for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}
}