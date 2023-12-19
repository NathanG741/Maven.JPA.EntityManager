package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String instrument;

    @OneToMany
    private Set<CD> discography = new HashSet<>();

    public Artist() {
    }

    public Artist(Integer id, String firstName, String lastName, String instrument, Set<CD> discography) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.instrument = instrument;
        this.discography = discography;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Set<CD> getDiscography() {
        return discography;
    }

    public void setDiscography(Set<CD> discography) {
        this.discography = discography;
    }
}
