
package indigital.com.datos;

import indigital.com.domain.Empresa;
import java.util.List;
import javax.ejb.Local;

@Local
public interface EmpresaJDBC {
    
    public List<Empresa> listBusiness();

}
