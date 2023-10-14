package com.example.MVC.Service;

import com.example.MVC.Repository.GirlRepository;
import com.example.MVC.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getName(){
        String name = "Thu Thuỷ";
        return girlRepository.getGirlByName(name);
    }

}
