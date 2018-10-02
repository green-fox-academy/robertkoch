package com.gf.log.repositories;

import com.gf.log.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log,Long> {
}
