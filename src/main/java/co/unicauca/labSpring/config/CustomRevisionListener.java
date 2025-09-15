/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.labSpring.config;

import co.unicauca.labSpring.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

/**
 *
 * @author crist
 */
public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
    
}
