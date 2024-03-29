/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onda.personnel.rest.vo;

import com.onda.personnel.bean.Mission;
import com.onda.personnel.bean.Vacation;
import java.util.List;
import javax.persistence.OneToOne;

/**
 *
 * @author AMINE
 */
public class DayVo {

    private Long id;
    private String pan;
    private String hn;
    private String he;
    private List<DayDetailVo> dayDetails;
    private String date;
    private VacationVo vacation;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VacationVo getVacation() {
        return vacation;
    }

    public void setVacation(VacationVo vacation) {
        this.vacation = vacation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DayDetailVo> getDayDetails() {
        return dayDetails;
    }

    public void setDayDetails(List<DayDetailVo> dayDetails) {
        this.dayDetails = dayDetails;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getHn() {
        return hn;
    }

    public void setHn(String hn) {
        this.hn = hn;
    }

    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he;
    }

}
