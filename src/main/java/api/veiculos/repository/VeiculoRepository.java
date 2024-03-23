package api.veiculos.repository;

import api.veiculos.model.VeiculoEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoEntity, UUID> {

  //TODO: CRIAR CONSULTA PARA BUSCAR UM VEICULO POR PLACA, USAR OPTIONAL.

}
