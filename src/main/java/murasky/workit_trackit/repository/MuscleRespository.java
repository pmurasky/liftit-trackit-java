package murasky.workit_trackit.repository;

import murasky.workit_trackit.entity.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleRespository extends JpaRepository<Muscle, Long> {
}
