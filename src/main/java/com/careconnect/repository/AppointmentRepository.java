package com.careconnect.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.careconnect.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}