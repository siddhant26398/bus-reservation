package com.lti.repository;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, String>  {
	@Query("select x from Feedback x ORDER BY x.busId")
	public List<Feedback> getbusFeedbacks();
}
