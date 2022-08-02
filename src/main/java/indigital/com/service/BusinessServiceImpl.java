package indigital.com.service;

import indigital.com.datos.EmpresaJDBC;
import indigital.com.domain.Empresa;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class BusinessServiceImpl implements BusinessService, BusinessServiceRemote {

    @EJB
    private EmpresaJDBC empresajdbc;
    
    @Override
    public List<Empresa> listBusiness() {
        return empresajdbc.listBusiness();
    }

    @Override
    public Empresa findPersonById(Empresa empresa) {

        return null;
    }

}
