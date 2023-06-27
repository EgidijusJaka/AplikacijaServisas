package com.autoservice.autoservice.service;

import com.autoservice.autoservice.model.AutoService;
import com.autoservice.autoservice.repository.AutoServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
@Service
public class AutoServiceImpl implements AutoServiceService{
    @Autowired
    AutoServiceRepository repository;
    @Override
    public Optional<AutoService> getAutoService(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<AutoService> getAllAutoService() {
        return null;
    }

    @Override
    public void deleteAutoService(Integer id) {
        repository.deleteById(id);
    }
    @Override
    public AutoService updateAutoService(AutoService autoservice) {
        AutoService autoserviceTemp = repository.findById(autoservice.getAutoServiceId()).get();
        autoserviceTemp.setAutoServiceName(autoservice.getAutoServiceAddress());
        autoserviceTemp.setAutoServiceAddress(autoservice.getAutoServiceAddress());
        autoserviceTemp.setAutoServiceManager(autoservice.getAutoServiceManager());
        autoserviceTemp.setAutoServicePoint(autoservice.getAutoServicePoint());
        autoserviceTemp.setAutoServiceName(autoservice.getAutoServiceName());

        return repository.save(autoserviceTemp);

    }
    @Override
    public AutoService saveAutoService(AutoService autoservice) {

        return repository.save(autoservice);
    }

    @Override
    public List<AutoService> getAllAutoServices() {
        return null;
    }


}
