/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigital.com.datos;

import indigital.com.domain.Empresa;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author cleve
 */
@Remote
public interface EmpresaJDBCRemote {
    
    public List<Empresa> listBusiness();
}
