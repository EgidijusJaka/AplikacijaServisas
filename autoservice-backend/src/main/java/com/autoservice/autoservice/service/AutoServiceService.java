package com.autoservice.autoservice.service;

import com.autoservice.autoservice.model.AutoService;
import java.util.List;
import java.util.Optional;

public interface AutoServiceService {
    public Optional<AutoService> getAutoService(Integer Id);

    public List<AutoService> getAllAutoService();

    public void deleteAutoService(Integer id);

    public AutoService updateAutoService(AutoService autoservice);

    public AutoService saveAutoService(AutoService autoservice);


}
