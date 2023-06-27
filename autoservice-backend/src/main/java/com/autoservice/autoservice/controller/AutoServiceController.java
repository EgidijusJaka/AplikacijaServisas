package com.autoservice.autoservice.controller;

import com.autoservice.autoservice.model.AutoService;
import com.autoservice.autoservice.service.AutoServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AutoServiceController {

    AutoServiceService service;
    @GetMapping("/getautoservice")
    public List<AutoService> getAllAutoService(){
        return service.getAllAutoService();

    }
    @GetMapping("/getautoservice/{id}")
    public Optional<AutoService> getAutoService(@PathVariable Integer id){
        return service.getAutoService(id);
    }
    @PostMapping("/saveautoservice")
    public AutoService saveAutoService(@RequestBody AutoService autoservice) {
        return service.saveAutoService(autoservice);
    }

    @PutMapping("/updateautoservice")
    public AutoService updateAutoService(@RequestBody AutoService autoservice) {
        return service.updateAutoService(autoservice);
    }

    @DeleteMapping("/deleteautoservice/{id}")
    public String deleteAutoService(@PathVariable Integer id) {
        service.deleteAutoService(id);
        return "Has been delete";
    }
  

}
