/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigital.com.service;

import indigital.com.domain.Empresa;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface BusinessServiceRemote {
    
    public List<Empresa> listBusiness();
    
    public Empresa findPersonById(Empresa empresa);
    
}
