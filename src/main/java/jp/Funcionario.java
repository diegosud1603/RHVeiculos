package jp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String rg;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String habilitacao;
    private boolean autorizadoParaDirigir;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "funcionario_id") // Adiciona a coluna de junção para o relacionamento
    private List<Penalizacao> penalizacoes = new ArrayList<>(); // Inicializa a lista

    // Construtor
    public Funcionario(String nome, String rg, LocalDate dataNascimento, 
                       String habilitacao, boolean autorizadoParaDirigir, List<Penalizacao> penalizacoes) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.habilitacao = habilitacao;
        this.autorizadoParaDirigir = autorizadoParaDirigir;
        this.penalizacoes = penalizacoes != null ? penalizacoes : new ArrayList<>();
    }

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public boolean isAutorizadoParaDirigir() {
        return autorizadoParaDirigir;
    }

    public void setAutorizadoParaDirigir(boolean autorizadoParaDirigir) {
        this.autorizadoParaDirigir = autorizadoParaDirigir;
    }

    public List<Penalizacao> getPenalizacoes() {
        return penalizacoes;
    }

    public void setPenalizacoes(List<Penalizacao> penalizacoes) {
        this.penalizacoes = penalizacoes != null ? penalizacoes : new ArrayList<>();
    }
}
