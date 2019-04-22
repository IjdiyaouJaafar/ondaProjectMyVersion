/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onda.personnel.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Xrio
 */
@Entity
public class Day implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer pan;
    private Integer hn;
    private Integer he;
    @OneToOne
    private List<Absence> absence;
    @OneToMany
    private List<DayDetail> dayDetails;

    /**
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @JsonIgnore
    public List<DayDetail> getDayDetails() {
        return dayDetails;
    }

    /**
     *
     * @param dayDetails
     */
    @JsonSetter
    public void setDayDetails(List<DayDetail> dayDetails) {
        this.dayDetails = dayDetails;
    }

    /**
     *
     * @return
     */
    public Integer getPan() {
        return pan;
    }

    /**
     *
     * @param pan
     */
    public void setPan(Integer pan) {
        this.pan = pan;
    }

    /**
     *
     * @return
     */
    public Integer getHn() {
        return hn;
    }

    /**
     *
     * @param hn
     */
    public void setHn(Integer hn) {
        this.hn = hn;
    }

    /**
     *
     * @return
     */
    public Integer getHe() {
        return he;
    }

    /**
     *
     * @param he
     */
    public void setHe(Integer he) {
        this.he = he;
    }

    /**
     *
     * @return
     */
    public List<Absence> getAbsence() {
        return absence;
    }

    /**
     *
     * @param absence
     */
    public void setAbsence(List<Absence> absence) {
        this.absence = absence;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Day)) {
            return false;
        }
        Day other = (Day) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "javaapplication1.DayNormal[ id=" + id + " ]";
    }

}
