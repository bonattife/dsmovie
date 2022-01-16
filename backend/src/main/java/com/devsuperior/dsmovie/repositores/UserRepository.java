package com.devsuperior.dsmovie.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePk;
import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<Score, ScorePk> {

	User findByEmail(String email);

}
