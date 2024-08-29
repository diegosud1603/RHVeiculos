package jp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    // Encontrar funcionários que nasceram em um mês específico e não têm penalizações
    @Query("SELECT f FROM Funcionario f WHERE MONTH(f.dataNascimento) = :month AND f.penalizacoes IS EMPTY")
    List<Funcionario> findByDataNascimentoMonthAndPenalizacoesIsEmpty(@Param("month") int month);

    // Encontrar funcionários que têm penalizações
    @Query("SELECT f FROM Funcionario f WHERE f.penalizacoes IS NOT EMPTY")
    List<Funcionario> findByPenalizacoesIsNotEmpty();
}
