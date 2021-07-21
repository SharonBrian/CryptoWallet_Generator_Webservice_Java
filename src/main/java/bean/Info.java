package bean;


import lombok.*;

@Data
@AllArgsConstructor
public class Info {
    /**
     * AddType
     */
    private String type;
    /**
     * wallet address
     */
    private String add;
    /**
     * wallet private key
     */
    private String priKey;
}
