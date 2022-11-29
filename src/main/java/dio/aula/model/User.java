package dio.aula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_user")
public class User {
    @Id                                                     // Identidica qual atributo será definido como "id" no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Gerenciado de forma automatica com estratégia "INDENTIFY" (Estrutura de identificação) com ID correspodente a cada inserção
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")                               // O campo no banco de dados será chamado de "user_id"
    private Integer id;
    @Column(length = 50, nullable = false)                  // Definindo tamanho de 50 e não poderá ser falso
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }
}
