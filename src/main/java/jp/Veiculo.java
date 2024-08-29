package jp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String modelo;
    private String marca;
    private String categoria;
    private int anoFabricacao;
    private int anoCompra;
    private String tipoCombustivel;
    private int quantidadePassageiros;
    private String habilitacaoMinima;
    private String placa;
    @Column(name = "quilometragem")
    private int quilometragem;
    private String identificacao;

    public Veiculo(String modelo, String marca, String categoria, int anoFabricacao, int anoCompra, 
                   String tipoCombustivel, int quantidadePassageiros, String habilitacaoMinima, 
                   String placa, int quilometragem, String identificacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
        this.anoFabricacao = anoFabricacao;
        this.anoCompra = anoCompra;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadePassageiros = quantidadePassageiros;
        this.habilitacaoMinima = habilitacaoMinima;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.identificacao = identificacao;
    }

    public Veiculo() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public String getHabilitacaoMinima() {
        return habilitacaoMinima;
    }

    public void setHabilitacaoMinima(String habilitacaoMinima) {
        this.habilitacaoMinima = habilitacaoMinima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}
