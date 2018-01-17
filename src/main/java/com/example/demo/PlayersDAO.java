package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
@RestResource(path="players", rel="players")
public interface PlayersDAO  extends CrudRepository<Players,Long>{

}
