package com.lti.repository;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.Routes;
@Repository
public interface RouteRepository extends JpaRepository<Routes, String> {

	@Query("select x from Routes x ORDER BY x.routeid")
	public List<Routes> getALLRoutes();
}
