package test;


import indigital.com.datos.EmpresaJDBC;
import indigital.com.datos.EmpresaJDBCImpl;
import indigital.com.domain.Empresa;
import java.util.List;
import javax.inject.Inject;
import javax.naming.NamingException;

public class Test {

    public static void main(String[] args) throws NamingException {

        EmpresaJDBC em = new EmpresaJDBCImpl();
        
        List<Empresa> empresa = em.listBusiness();
        
        for (Empresa empresa1 : empresa) {
            System.out.println("empresa1 = " + empresa1);
        }
        
    }
}
