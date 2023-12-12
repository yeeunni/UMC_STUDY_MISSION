package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Member;
import umc.study.domain.Region;

import java.util.Optional;

public interface RegionRepository  extends JpaRepository<Region, Long> {
    Optional<Region> findByName(String name);

}
