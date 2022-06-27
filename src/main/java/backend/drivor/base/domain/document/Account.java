package backend.drivor.base.domain.document;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "account")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer chat_id;
    private String password;
    private String email;
    private String account_status;
    private String online_status;

}
