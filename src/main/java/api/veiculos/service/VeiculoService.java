package api.veiculos.service;

import api.veiculos.model.VeiculoEntity;
import api.veiculos.repository.VeiculoRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired // Controle de Dependência automático
    private VeiculoRepository repository;

    public List<VeiculoEntity> listar() {
        return repository.findAll();
    }

    public VeiculoEntity buscarVeiculoPorId(UUID id) {
        Optional<VeiculoEntity> veiculo = repository.findById(id);
        if (veiculo.isEmpty()){
            throw new RuntimeException("Veiculo inexistente");
        }
       return veiculo.get();
    }

    public VeiculoEntity salvar(VeiculoEntity veiculo) {
        if(veiculo.getId() == null) {
            throw new IllegalArgumentException("O ID não pode ser NULO!");
        }

        if(repository.existsById(veiculo.getId())) {
            throw new RuntimeException("O veículo já existe no banco de dados");
        }
        return repository.save(veiculo);
    }

    public String deletar(UUID id) {
        repository.deleteById(id);
        //TODO: QUANDO DELETAR, RETORNAR UMA MENSAGEM DE "VEICULO DELETADO".
        return "Veículo Deletado";
    }

    public VeiculoEntity encontrarPorPlaca(String placa) {
        Optional<VeiculoEntity> veiculoEncontrado = repository.findByPlaca(placa);

        return veiculoEncontrado.get();
    }
}
