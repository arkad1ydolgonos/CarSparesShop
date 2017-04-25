package com.gida.repositoriy;

import com.gida.models.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {
}
