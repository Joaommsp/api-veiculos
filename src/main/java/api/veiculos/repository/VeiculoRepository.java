package api.veiculos.repository;

import api.veiculos.model.VeiculoEntity;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoEntity, UUID> {
    @Override
    Optional<VeiculoEntity> findById(UUID uuid);

    Optional<VeiculoEntity> findByPlaca(String placa);

}
