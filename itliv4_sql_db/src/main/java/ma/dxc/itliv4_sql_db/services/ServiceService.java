package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.ServiceClass;
import ma.dxc.itliv4_sql_db.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceClass saveService(ServiceClass serviceClass) {
        return serviceRepository.save(serviceClass);
    }

    public List<ServiceClass> saveServices(List<ServiceClass> services) {
        return serviceRepository.saveAll(services);
    }

    public List<ServiceClass> getServices() {
        return serviceRepository.findAll();
    }

    public ServiceClass getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public String deleteService(Long id) {
        serviceRepository.deleteById(id);
        return "Service " + id + " was deleted";
    }

    public ServiceClass updateService(ServiceClass service) {
        ServiceClass existingService = serviceRepository.findById(service.getId()).orElse(null);
        Objects.requireNonNull(existingService).setDescription(service.getDescription());
        return serviceRepository.save(existingService);
    }
}
