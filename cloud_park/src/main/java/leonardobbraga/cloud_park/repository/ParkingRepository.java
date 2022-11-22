package leonardobbraga.cloud_park.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leonardobbraga.cloud_park.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
