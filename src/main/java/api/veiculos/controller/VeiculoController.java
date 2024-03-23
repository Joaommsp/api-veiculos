package api.veiculos.controller;

import api.veiculos.model.VeiculoEntity;
import api.veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService service;

    @GetMapping
    public List<VeiculoEntity> listarVeiculos() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public VeiculoEntity buscarPorId(@PathVariable Long id) {
        return service.buscarVeiculo(id);
    }

    @PostMapping
    public VeiculoEntity salvarVeiculo(@RequestBody VeiculoEntity novoVeiculo) {
        return  service.salvar(novoVeiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        service.deletar(id);
    }

}
