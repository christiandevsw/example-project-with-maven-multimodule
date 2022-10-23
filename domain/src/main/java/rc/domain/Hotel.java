package rc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer clasification;
    private Boolean isOpen;

    public Hotel() {
    }

    public Hotel(String name, Integer clasification, Boolean isOpen) {
        this.name = name;
        this.clasification = clasification;
        this.isOpen = isOpen;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClasification() {
        return clasification;
    }

    public void setClasification(Integer clasification) {
        this.clasification = clasification;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}





















