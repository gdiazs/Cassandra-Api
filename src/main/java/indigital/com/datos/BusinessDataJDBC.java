package indigital.com.datos;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import indigital.com.domain.Empresa;
import java.util.ArrayList;
import java.util.List;

public class BusinessDataJDBC {

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
//        List<Empresa> empre = new ArrayList<>();
//        Empresa empresa = new Empresa("UUIDA", "data", "dasddasdasd");
//        empresas.add(empresa);
        }
        return empresas;
    }
}
