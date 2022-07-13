package com.example.QrCode.repos;


import com.example.QrCode.model.QrEntity;
import org.springframework.data.repository.CrudRepository;

public interface XMLRepositiry extends CrudRepository<QrEntity, Integer>{
}
