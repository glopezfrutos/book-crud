package com.crud.crudbook.service;

import com.crud.crudbook.entity.Magazine;

import java.util.List;

public interface MagazineServiceInterface {

    List<Magazine> getAllMagazines();

    Magazine saveMagazine(Magazine magazine);

    Magazine updateMagazine(Magazine magazine);

    void deleteMagazine(Long id);
}
