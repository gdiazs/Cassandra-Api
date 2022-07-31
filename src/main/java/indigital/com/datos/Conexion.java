package indigital.com.datos;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Conexion {

    private static final String IP_RPC_CASSANDRA = "192.168.19.109";
    private static final int PORT_RPC_CASSANDRA = 9042;
    private static Cluster cluster;

    private static Cluster getConexion() {
        try {
            if (cluster == null) {
                cluster = Cluster.builder().addContactPoint(IP_RPC_CASSANDRA).withPort(PORT_RPC_CASSANDRA).build();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return cluster;
    }

    public static Session getSession(String keyspace) {
        Session sesion = getConexion().connect(keyspace);
        return sesion;
    }

}
