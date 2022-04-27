package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Magazine;
import com.crud.crudbook.service.MagazineServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class MagazineController {

    @Autowired
    private MagazineServiceInterface service;

    @GetMapping("get/magazines")
    public List<Magazine> getAllMagazines(){
        return service.getAllMagazines();
    }

    @PostMapping("save/magazine")
    public Magazine saveMagazine(@RequestBody Magazine magazine){
        return service.saveMagazine(magazine);
    }

    @PutMapping("update/magazine")
    public Magazine updateMagazine(@RequestBody Magazine magazine) {
        return service.updateMagazine(magazine);
    }

    @DeleteMapping("delete/magazine/{id}")
    public void deleteMagazine(@PathVariable Long id) {
        service.deleteMagazine(id);
    }
}
