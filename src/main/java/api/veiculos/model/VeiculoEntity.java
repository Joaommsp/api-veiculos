package api.veiculos.model;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "veiculos")
@Getter
@Setter
@NoArgsConstructor
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

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

}
