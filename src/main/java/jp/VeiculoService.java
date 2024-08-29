package jp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarPorAnoCompra(int anoCompra) {
        return veiculoRepository.findByAnoCompra(anoCompra);
    }

    public List<Veiculo> listarPorModelo(String modelo) {
        return veiculoRepository.findByModelo(modelo);
    }

    public List<Veiculo> listarTop3PorKmRodada() {
        return veiculoRepository.findTop3ByOrderByQuilometragemDesc();
    }
}
