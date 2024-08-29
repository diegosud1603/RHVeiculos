package jp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/ano-compra/{ano}")
    public List<Veiculo> listarPorAnoCompra(@PathVariable int ano) {
        return veiculoService.listarPorAnoCompra(ano);
    }

    @GetMapping("/modelo/{modelo}")
    public List<Veiculo> listarPorModelo(@PathVariable String modelo) {
        return veiculoService.listarPorModelo(modelo);
    }

    @GetMapping("/top3-km")
    public List<Veiculo> listarTop3PorKmRodada() {
        return veiculoService.listarTop3PorKmRodada();
    }
}
