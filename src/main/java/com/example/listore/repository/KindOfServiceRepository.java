package com.example.listore.repository;

import com.example.listore.models.KindOfService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KindOfServiceRepository extends GeneralRepository<KindOfService>{
    @Override
        @Query("select K from KindOfService as K where K.service.id = :#{#kindOfService.service.id}")
    List<KindOfService> findByFilter(KindOfService kindOfService, Pageable page);
}
