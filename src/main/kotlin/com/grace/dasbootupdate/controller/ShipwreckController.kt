package com.grace.dasbootupdate.controller

import com.grace.dasbootupdate.model.Shipwreck
import com.grace.dasbootupdate.repository.ShipwreckRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/")
class ShipwreckController {

    @Autowired
    lateinit var shipwreckRepository: ShipwreckRepository

    @RequestMapping( value = ["shipwrecks"], method = [RequestMethod.GET])
    fun list() : List<Shipwreck>{
        return shipwreckRepository.findAll();
    }

    @RequestMapping( value = ["shipwrecks"], method = [RequestMethod.POST])
    fun create(@RequestBody shipwreck: Shipwreck) : Shipwreck{
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping( value = ["shipwrecks/{id}"], method = [RequestMethod.GET])
    fun get(@PathVariable id : Long) : Shipwreck{
        return shipwreckRepository.getOne(id);
    }

    @RequestMapping( value = ["shipwrecks/{id}"], method = [RequestMethod.PUT])
    fun update(@PathVariable id: Long, @RequestBody shipwreck: Shipwreck) : Shipwreck{
        var existingShipwreck: Shipwreck = shipwreckRepository.getOne(id)
        BeanUtils.copyProperties(shipwreck, existingShipwreck)
        return shipwreckRepository.saveAndFlush(existingShipwreck)
    }

    @RequestMapping( value = ["shipwrecks/{id}"], method = [RequestMethod.DELETE])
    fun delete(@PathVariable id: Long) : Shipwreck{
        var existingShipwreck : Shipwreck = shipwreckRepository.getOne(id)
        shipwreckRepository.delete(existingShipwreck)
        return existingShipwreck;
    }
}