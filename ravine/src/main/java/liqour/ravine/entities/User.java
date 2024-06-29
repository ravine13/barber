package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
    
    @Id
    @Column(name="user_id")
    private int user_id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
  
}

