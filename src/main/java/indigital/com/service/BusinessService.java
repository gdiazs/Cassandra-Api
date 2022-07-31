package indigital.com.service;

import indigital.com.domain.Empresa;
import java.util.List;
import javax.ejb.Local;


@Local
public interface BusinessService {
    
    public List<Empresa> listBusiness();
    
    public Empresa findPersonById(Empresa empresa);
    
}
