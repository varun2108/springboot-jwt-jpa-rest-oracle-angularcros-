package com.javainuse.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.Team;




@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {


}