package jp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByAnoCompra(int anoCompra);
    List<Veiculo> findByModelo(String modelo);
    List<Veiculo> findTop3ByOrderByQuilometragemDesc();
}
