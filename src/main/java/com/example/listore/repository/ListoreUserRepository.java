package com.example.listore.repository;

import com.example.listore.models.Credential;
import com.example.listore.models.ListoreUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ListoreUserRepository extends GeneralRepository<ListoreUser>{

    @Query("SELECT u FROM ListoreUser u WHERE u.credential = :credential")
    public ListoreUser findByCredential(@Param("credential") Credential credential);
}
