package umg.edu.demo_spring.repository;

import umg.edu.demo_spring.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}