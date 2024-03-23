package api.veiculos.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "veiculos")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "modelo", nullable = false, length = 25)
    private String modelo;

    @Column(name = "anoFabricacao", nullable = false, length = 4)
    private int anoFabricacao;

    @Column(name = "cor", nullable = false, length = 25)
    private String cor;

    // PADRÃO LLLNLNN
    @Column(name = "placa", nullable = false, length = 7)
    private String placa;

    @Column(name = "numeroChassi", nullable = false, length = 17)
    private String numeroChassi;

    @Column(name = "quilometragem", nullable = false, length = 25)
    private double quilometragem;

    @Column(name = "tipoCombustivel", nullable = false, length = 25)
    private String tipoCombustivel;

    @Column(name = "numeroPassageiros", nullable = false, length = 100)
    private int numeroPassageiros;

    @Column(name = "preco", nullable = false, length = 25)
    private double preco;

    @Column(name = "estadoManutencao", nullable = false, length = 25)
    private String estadoManutencao;

    @Column(name = "categoria", nullable = false, length = 25)
    private String categoria;

    @Column(name = "transmissao", nullable = false, length = 25)
    private String transmissao;

    @Column(name = "capacidadeCarga", nullable = false, length = 25)
    private double capacidadeCarga;

    @Column(name = "condicao", nullable = false, length = 25)
    private String condicao;

    public VeiculoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEstadoManutencao() {
        return estadoManutencao;
    }

    public void setEstadoManutencao(String estadoManutencao) {
        this.estadoManutencao = estadoManutencao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}
