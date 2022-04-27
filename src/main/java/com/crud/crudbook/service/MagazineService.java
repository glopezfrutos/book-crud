package com.crud.crudbook.service;

import com.crud.crudbook.entity.Magazine;
import com.crud.crudbook.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MagazineService implements MagazineServiceInterface {
    @Autowired
    private MagazineRepository magazineRepository;

    @Override
    public List<Magazine> getAllMagazines() {
        return magazineRepository.findAll();
    }

    @Override
    public Magazine saveMagazine(Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    @Override
    public Magazine updateMagazine(Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    @Override
    public void deleteMagazine(Long id) {
        magazineRepository.deleteById(id);
    }
}