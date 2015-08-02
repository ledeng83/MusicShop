package com.ldeng.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Instrument
 *
 */
@Entity
public class Instrument implements Serializable {

    private static final long serialVersionUID = 1L;

    public Instrument() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String type;

    @Column(columnDefinition = "FLOAT")
    private Float price;

    @Column(columnDefinition = "TEXT")
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Instrument [id=" + id + ", type=" + type + ", price=" + price + ", desc=" + desc + "]";
    }

}
