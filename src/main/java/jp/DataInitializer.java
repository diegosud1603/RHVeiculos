package jp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner dataLoader(VeiculoRepository veiculoRepository, FuncionarioRepository funcionarioRepository) {
        return args -> {
            // Adicionando dados de teste para Veiculo
            Veiculo veiculo1 = new Veiculo("Fusca", "Volkswagen", "Hatchback", 1975, 1976, 
                    "Gasolina", 4, "B", "ABC1234", 120000, "ID001");
            Veiculo veiculo2 = new Veiculo("Civic", "Honda", "Sedan", 2020, 2021, 
                    "Álcool", 5, "B", "XYZ5678", 50000, "ID002");
            
            veiculoRepository.saveAll(Arrays.asList(veiculo1, veiculo2));

            // Adicionando dados de teste para Penalizacao
            Penalizacao penalizacao1 = new Penalizacao("Multa por excesso de velocidade", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 1, 30));
            Penalizacao penalizacao2 = new Penalizacao("Suspensão de habilitação", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 28));
            
            // Adicionando dados de teste para Funcionario
            Funcionario funcionario1 = new Funcionario("João da Silva", "123456789", LocalDate.of(1990, 5, 15), "AB", true, Arrays.asList(penalizacao1));
            Funcionario funcionario2 = new Funcionario("Maria Oliveira", "987654321", LocalDate.of(1985, 8, 20), "CD", false, Arrays.asList(penalizacao2));
            
            funcionarioRepository.saveAll(Arrays.asList(funcionario1, funcionario2));
        };
    }
}
