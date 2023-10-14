package com.example.MVC.Repository;

import com.example.MVC.model.Girl;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepository implements GirlRepositoryInter{

    public Girl getGirlByName(String name) {
        return new Girl(name);
    }
}
