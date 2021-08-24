package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.ServiceClass;
import ma.dxc.itliv4_sql_db.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping("/addService")
    public ServiceClass saveService(@RequestBody ServiceClass service) {
        return serviceService.saveService(service);
    }

    @PostMapping("/addServices")
    public List<ServiceClass> saveServices(@RequestBody List<ServiceClass> services) {
        return serviceService.saveServices(services);
    }

    @GetMapping("/services")
    public List<ServiceClass> findAllServices() {
        return serviceService.getServices();
    }

    @GetMapping("/services/findById/{id}")
    public ServiceClass getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @PutMapping("/updateService")
    public ServiceClass UpdateService(@RequestBody ServiceClass service) {
        return serviceService.updateService(service);
    }

    @DeleteMapping("/deleteService/{id}")
    public String deleteService(@PathVariable Long id) {
        return serviceService.deleteService(id);
    }
}
