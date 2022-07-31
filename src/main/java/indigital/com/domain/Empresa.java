package indigital.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa", schema = "KunderaExamples@cassandra_pu")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    private String uuid_empresa;
    
    @Column(name="razon_social")
    private String razon_social_empresa;
    
    @Column(name="ruc")
    private String ruc_empresa;    
}
