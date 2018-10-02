package com.gf.log.services;

import com.gf.log.models.Log;
import com.gf.log.repositories.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class ImpLogService implements LogService {
    LogRepository logRepository;

    public ImpLogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void save(Log log) {

    }
}
