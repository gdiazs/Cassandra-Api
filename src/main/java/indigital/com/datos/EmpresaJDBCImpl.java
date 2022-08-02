package indigital.com.datos;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import indigital.com.domain.Empresa;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


@Stateless
public class EmpresaJDBCImpl implements EmpresaJDBC {

    @Override
    public List<Empresa> listBusiness() {
        Session cn = Conexion.getSession("seguridad");
        ResultSet rs = cn.execute("select * from seguridad.empresa;");
        List<Empresa> empresas = new ArrayList<>();
        List<Row> empresasquery = rs.all();
        for (Row empre : empresasquery) {
            String uuid = empre.getString("id");
            String razon = empre.getString("razon_social");
            String ruc = empre.getString("ruc");
            Empresa empresa1 = new Empresa(uuid, razon, ruc);
            empresas.add(empresa1);
        cn.close();
//        List<Empresa> empresas = new ArrayList<>();
//        Empresa em1 = new Empresa("b0164312-180a-11ea-bef7-03401c99993c", "ruta de imagenes", "2020220022");
//        Empresa em2 = new Empresa("b0164312-180a-11ea-bef7-03401c99993c", "ruta de imagenes2", "2020220022");
//        Empresa em3 = new Empresa("b0164312-180a-11ea-bef7-03401c99993c", "ruta de imagenes3", "2020220022");
//        empresas.add(em1);
//        empresas.add(em2);
//        empresas.add(em3);
//        test d = new test();
//        List<Empresa> sd = d.listemp();
        }
        return empresas;
    }
}
