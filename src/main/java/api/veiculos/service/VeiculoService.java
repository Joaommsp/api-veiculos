package api.veiculos.service;

import api.veiculos.model.VeiculoEntity;
import api.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired // Controle de Dependência automático
    private VeiculoRepository repository;

    public List<VeiculoEntity> listar() {
        return (List<VeiculoEntity>) repository.findAll();
    }

    public VeiculoEntity buscarVeiculo(Long id) {
        return repository.findById(id).get(); // retorno de um optional
    };

    public VeiculoEntity salvar(VeiculoEntity veiculo) {
        return  repository.save(veiculo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
