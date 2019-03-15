package com.grace.dasbootupdate.repository

import com.grace.dasbootupdate.model.Shipwreck
import org.springframework.data.jpa.repository.JpaRepository

interface ShipwreckRepository : JpaRepository<Shipwreck, Long> {

}