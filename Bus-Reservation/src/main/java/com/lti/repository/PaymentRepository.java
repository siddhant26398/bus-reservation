package com.lti.repository;
import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lti.entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

}
