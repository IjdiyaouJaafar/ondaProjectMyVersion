/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onda.personnel.dao;

import com.onda.personnel.bean.Work;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AMINE
 */
@Repository
public interface WorkDao extends JpaRepository<Work, Long>{
    
    public Work findByEmployeeMatriculeAndWorkDetailWorkDetailDate(Integer matricule, Date workDetailDate);
    
    public Work findTopByEmployeeMatriculeOrderByWorkDetailWorkDetailDateDesc(Integer matricule);
    public List<Work> findByWorkDetailWorkDetailDate(Date workDetailDate);
}
