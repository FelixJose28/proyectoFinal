package com.example.Usuarios;

import android.app.ProgressDialog;

public class Medico extends Usuario {

    private String exequatur;
    private String especialidad;
    private String ars;
    private String hospital;

    ProgressDialog dialog;

    public static void Registrar(){

    }

    public static void IniciarSesion(){

    }

    public static void LogOut(){

    }

    public String getExequatur() {
        return exequatur;
    }

    public void setExequatur(String exequatur) {
        this.exequatur = exequatur;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getArs() {
        return ars;
    }

    public void setArs(String ars) {
        this.ars = ars;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
