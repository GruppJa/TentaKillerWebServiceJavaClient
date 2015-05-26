/**
 * WebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tentakiller.show;

public interface WebServiceSoap extends java.rmi.Remote {

    /**
     * Returns Students
     */
    public java.lang.String[][] getStudents() throws java.rmi.RemoteException;

    /**
     * Returns Exams
     */
    public org.tentakiller.show.GetExamsResponseGetExamsResult getExams() throws java.rmi.RemoteException;
}
