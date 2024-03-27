package api.veiculos.controller;

import api.veiculos.model.VeiculoEntity;
import api.veiculos.service.VeiculoService;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<VeiculoEntity> listarVeiculos() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public VeiculoEntity buscarVeiculoPorId(@PathVariable UUID id) {
        return service.buscarVeiculoPorId(id);
    }

    @GetMapping("/placa={placa}")
    public VeiculoEntity buscarVeiculoPorPlaca(@PathVariable String placa) {
    return service.encontrarPorPlaca(placa);
    }

    @PostMapping
    public VeiculoEntity salvarVeiculo(@RequestBody VeiculoEntity novoVeiculo) {
        return service.salvar(novoVeiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable UUID id) {
        service.deletar(id);
    }

}
