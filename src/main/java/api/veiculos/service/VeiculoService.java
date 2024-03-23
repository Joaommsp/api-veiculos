package api.veiculos.service;

import api.veiculos.model.VeiculoEntity;
import api.veiculos.repository.VeiculoRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        //TODO: CRIAR TRATAMENTO PARA MOSTRAR AO USUARIO UMA MENSAGEM DE ERRO QUANDO O VEICULO JÁ EXISTIR NO BANCO.
        return repository.save(veiculo);
    }

    public void deletar(UUID id) {
        repository.deleteById(id);
        //TODO: QUANDO DELETAR, RETORNAR UMA MENSAGEM DE "VEICULO DELETADO".
    }
}
