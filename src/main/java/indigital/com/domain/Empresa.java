package indigital.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String uuid_empresa;
    
    private String razon_social_empresa;
    
    private String ruc_empresa;    
}
