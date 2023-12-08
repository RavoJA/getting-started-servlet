package jar.dev.servlet.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private Long id;
    private String name;
    private String address;
    private String sexe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public User(Long id, String name, String address, String sexe) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sexe = sexe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(address, user.address) && Objects.equals(sexe, user.sexe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, sexe);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sexe='" + sexe + '\'' +
                '}';
    }
}
