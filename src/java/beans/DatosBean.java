/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Giovani
 */
public class DatosBean {

    private String CCT;
    private String NOMESC;
    private String CALLE;
    private String NUM_ESC;
    private String COLONIA;
    private String LOCALIDAD;
    private String CP;
    private String MUNICIPIOCCT;

    private String CURP;
    private String NOMBRE;
    private String APELLIDOP;
    private String APELLIDOM;
    private String FECNAC;
    private String CURPA;
    private String CURPAB;
    private String SEXO;
    private String CORREO;
    private String TIPO_CUENTA;
    private String STATUS;
    private String DESERROR;
    private String ID_CUENTA;
    private String FECHA_CONSTRUCCION;
    private String INDICE;
    private String MATRICULA;
    private String GRADO;
    private String DOMICILIOA;
    private String COLONIAA;
    private String TELEFONO;
    private String PROMEDIOGRAL;
    private String SITUACIONACA;
    private String CPA;
    private String CVE_MUNA;
    private String GRADO_CURSA;
    private String TIPO_ALUM;
    private String BECA;
    private String ID_TIPOALUM;
    private String NOM_TIPO;
            

    private String ID_CVE_CAR;
    private String CLAVECARRERA;
    private String NOMBRE_CARRERA;
    private String MODALIDAD;

    private String CVE_SER_PUB;
    private String CURP_RESPONSABLE;
    private String NOMBRER;
    private String APELLIDOPR;
    private String APELLIDOMR;
    private String CVE_CAR_RES;
    private String CARGO_RESPONSABLE;
    private String TELEFONO_RESPONSABLE;
    private String EMAIL_RESPONSABLE;
    
    
    private String CURP_ASESORI;
    private String NOMBREAI;
    private String APELLIDOPAI;
    private String APELLIDOMAI;


    //*******************************beans peter******************************************************
    private String FECHA_INICIO;
    private String FECHA_TERMINO;
    private String FECHA_REG;
    private String ID_ESTATUS;
    private String NOM_ESTATUS;
    private String ESTATUS_GENERAL;

    private String TOTAL_ALU_DUAL;
    private String TOTAL_ALU_ACTIVO;
    private String TOTAL_ALU_INACTIVO;
    private String TOTAL_ESTATUS;

    private String TOTAL_CCT;

    private String TOTAL_HOMBRE;
    private String TOTAL_MUJER;
     
    
    // ALUMNOS NUEVO INGRESO SE REFIERE A PROYECTOS  PRUEBA DE CONBINACION
    
    private String ALUMNOS_NUEVO_INGRESO;
    private String ALUMNOS_ACTIVOS_PERIODO;
     private String EGRESADOS;
     private String ALUMNOS_NUEVOS;
     
     private String TIPO_ALUMNO;
      private String TOTAL_TIPO_ALUMNO;
      
      
         private String FECHA_INGRESO_DUAL;

    public String getFECHA_INGRESO_DUAL() {
        return FECHA_INGRESO_DUAL;
    }

    public void setFECHA_INGRESO_DUAL(String FECHA_INGRESO_DUAL) {
        this.FECHA_INGRESO_DUAL = FECHA_INGRESO_DUAL;
    }


         
         
         
    public String getTOTAL_TIPO_ALUMNO() {
        return TOTAL_TIPO_ALUMNO;
    }

    public void setTOTAL_TIPO_ALUMNO(String TOTAL_TIPO_ALUMNO) {
        this.TOTAL_TIPO_ALUMNO = TOTAL_TIPO_ALUMNO;
    }

     
     
     
    public String getTIPO_ALUMNO() {
        return TIPO_ALUMNO;
    }

    public void setTIPO_ALUMNO(String TIPO_ALUMNO) {
        this.TIPO_ALUMNO = TIPO_ALUMNO;
    }
     
     
     

    public String getALUMNOS_NUEVOS() {
        return ALUMNOS_NUEVOS;
    }

    public void setALUMNOS_NUEVOS(String ALUMNOS_NUEVOS) {
        this.ALUMNOS_NUEVOS = ALUMNOS_NUEVOS;
    }

    
     
     

    public String getEGRESADOS() {
        return EGRESADOS;
    }

    public void setEGRESADOS(String EGRESADOS) {
        this.EGRESADOS = EGRESADOS;
    }

     
     
     
    public DatosBean() {
    }

    public DatosBean(String CLAVECARRERA, String NOMBRE_CARRERA, String STATUS) {
        this.CLAVECARRERA = CLAVECARRERA;
        this.NOMBRE_CARRERA = NOMBRE_CARRERA;
        this.STATUS = STATUS;

    }

    public String getMODALIDAD() {
        return MODALIDAD;
    }

    public void setMODALIDAD(String MODALIDAD) {
        this.MODALIDAD = MODALIDAD;
    }

    //PEDRO
    private String ID_ALUMNO;
    private String MUNICIPIO;
    private String ID;
    private String NOMBRE_COMPLETO;
    private String AVANCE;
    private String BUSCAR;
    private String CURPAUX;

    public String getID_ALUMNO() {
        return ID_ALUMNO;
    }

    public void setID_ALUMNO(String ID_ALUMNO) {
        this.ID_ALUMNO = ID_ALUMNO;
    }

    public String getCURPAUX() {
        return CURPAUX;
    }

    public void setCURPAUX(String CURPAUX) {
        this.CURPAUX = CURPAUX;
    }

    public String getBUSCAR() {
        return BUSCAR;
    }

    public void setBUSCAR(String BUSCAR) {
        this.BUSCAR = BUSCAR;
    }

    public String getAVANCE() {
        return AVANCE;
    }

    public void setAVANCE(String AVANCE) {
        this.AVANCE = AVANCE;
    }

    public String getMUNICIPIO() {
        return MUNICIPIO;
    }

    public void setMUNICIPIO(String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE_COMPLETO() {
        return NOMBRE_COMPLETO;
    }

    public void setNOMBRE_COMPLETO(String NOMBRE_COMPLETO) {
        this.NOMBRE_COMPLETO = NOMBRE_COMPLETO;
    }

    public String getCCT() {
        return CCT;
    }

    public void setCCT(String CCT) {
        this.CCT = CCT;
    }

    public String getNOMESC() {
        return NOMESC;
    }

    public void setNOMESC(String NOMESC) {
        this.NOMESC = NOMESC;
    }

    public String getCALLE() {
        return CALLE;
    }

    public void setCALLE(String CALLE) {
        this.CALLE = CALLE;
    }

    public String getNUM_ESC() {
        return NUM_ESC;
    }

    public void setNUM_ESC(String NUM_ESC) {
        this.NUM_ESC = NUM_ESC;
    }

    public String getCOLONIA() {
        return COLONIA;
    }

    public void setCOLONIA(String COLONIA) {
        this.COLONIA = COLONIA;
    }

    public String getLOCALIDAD() {
        return LOCALIDAD;
    }

    public void setLOCALIDAD(String LOCALIDAD) {
        this.LOCALIDAD = LOCALIDAD;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getMUNICIPIOCCT() {
        return MUNICIPIOCCT;
    }

    public void setMUNICIPIOCCT(String MUNICIPIOCCT) {
        this.MUNICIPIOCCT = MUNICIPIOCCT;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOP() {
        return APELLIDOP;
    }

    public void setAPELLIDOP(String APELLIDOP) {
        this.APELLIDOP = APELLIDOP;
    }

    public String getAPELLIDOM() {
        return APELLIDOM;
    }

    public void setAPELLIDOM(String APELLIDOM) {
        this.APELLIDOM = APELLIDOM;
    }

    public String getFECNAC() {
        return FECNAC;
    }

    public void setFECNAC(String FECNAC) {
        this.FECNAC = FECNAC;
    }

    public String getCURPA() {
        return CURPA;
    }

    public void setCURPA(String CURPA) {
        this.CURPA = CURPA;
    }

    public String getCURPAB() {
        return CURPAB;
    }

    public void setCURPAB(String CURPAB) {
        this.CURPAB = CURPAB;
    }
    
    

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getTIPO_CUENTA() {
        return TIPO_CUENTA;
    }

    public void setTIPO_CUENTA(String TIPO_CUENTA) {
        this.TIPO_CUENTA = TIPO_CUENTA;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getDESERROR() {
        return DESERROR;
    }

    public void setDESERROR(String DESERROR) {
        this.DESERROR = DESERROR;
    }

    public String getID_CUENTA() {
        return ID_CUENTA;
    }

    public void setID_CUENTA(String ID_CUENTA) {
        this.ID_CUENTA = ID_CUENTA;
    }

    public String getFECHA_CONSTRUCCION() {
        return FECHA_CONSTRUCCION;
    }

    public void setFECHA_CONSTRUCCION(String FECHA_CONSTRUCCION) {
        this.FECHA_CONSTRUCCION = FECHA_CONSTRUCCION;
    }

    public String getINDICE() {
        return INDICE;
    }

    public void setINDICE(String INDICE) {
        this.INDICE = INDICE;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(String MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public String getGRADO() {
        return GRADO;
    }

    public void setGRADO(String GRADO) {
        this.GRADO = GRADO;
    }

    public String getDOMICILIOA() {
        return DOMICILIOA;
    }

    public void setDOMICILIOA(String DOMICILIOA) {
        this.DOMICILIOA = DOMICILIOA;
    }

    public String getCOLONIAA() {
        return COLONIAA;
    }

    public void setCOLONIAA(String COLONIAA) {
        this.COLONIAA = COLONIAA;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getPROMEDIOGRAL() {
        return PROMEDIOGRAL;
    }

    public void setPROMEDIOGRAL(String PROMEDIOGRAL) {
        this.PROMEDIOGRAL = PROMEDIOGRAL;
    }

    public String getSITUACIONACA() {
        return SITUACIONACA;
    }

    public void setSITUACIONACA(String SITUACIONACA) {
        this.SITUACIONACA = SITUACIONACA;
    }

    public String getCPA() {
        return CPA;
    }

    public void setCPA(String CPA) {
        this.CPA = CPA;
    }

    public String getCVE_MUNA() {
        return CVE_MUNA;
    }

    public void setCVE_MUNA(String CVE_MUNA) {
        this.CVE_MUNA = CVE_MUNA;
    }

    public String getGRADO_CURSA() {
        return GRADO_CURSA;
    }

    public void setGRADO_CURSA(String GRADO_CURSA) {
        this.GRADO_CURSA = GRADO_CURSA;
    }

    public String getTIPO_ALUM() {
        return TIPO_ALUM;
    }

    public void setTIPO_ALUM(String TIPO_ALUM) {
        this.TIPO_ALUM = TIPO_ALUM;
    }

    public String getBECA() {
        return BECA;
    }

    public void setBECA(String BECA) {
        this.BECA = BECA;
    }

    public String getID_TIPOALUM() {
        return ID_TIPOALUM;
    }

    public void setID_TIPOALUM(String ID_TIPOALUM) {
        this.ID_TIPOALUM = ID_TIPOALUM;
    }

    public String getNOM_TIPO() {
        return NOM_TIPO;
    }

    public void setNOM_TIPO(String NOM_TIPO) {
        this.NOM_TIPO = NOM_TIPO;
    }
    
    
    

    public String getID_CVE_CAR() {
        return ID_CVE_CAR;
    }

    public void setID_CVE_CAR(String ID_CVE_CAR) {
        this.ID_CVE_CAR = ID_CVE_CAR;
    }

    public String getCLAVECARRERA() {
        return CLAVECARRERA;
    }

    public void setCLAVECARRERA(String CLAVECARRERA) {
        this.CLAVECARRERA = CLAVECARRERA;
    }

    public String getNOMBRE_CARRERA() {
        return NOMBRE_CARRERA;
    }

    public void setNOMBRE_CARRERA(String NOMBRE_CARRERA) {
        this.NOMBRE_CARRERA = NOMBRE_CARRERA;
    }

    public String getCVE_SER_PUB() {
        return CVE_SER_PUB;
    }

    public void setCVE_SER_PUB(String CVE_SER_PUB) {
        this.CVE_SER_PUB = CVE_SER_PUB;
    }

    public String getCURP_RESPONSABLE() {
        return CURP_RESPONSABLE;
    }

    public void setCURP_RESPONSABLE(String CURP_RESPONSABLE) {
        this.CURP_RESPONSABLE = CURP_RESPONSABLE;
    }

    public String getNOMBRER() {
        return NOMBRER;
    }

    public void setNOMBRER(String NOMBRER) {
        this.NOMBRER = NOMBRER;
    }

    public String getAPELLIDOPR() {
        return APELLIDOPR;
    }

    public void setAPELLIDOPR(String APELLIDOPR) {
        this.APELLIDOPR = APELLIDOPR;
    }

    public String getAPELLIDOMR() {
        return APELLIDOMR;
    }

    public void setAPELLIDOMR(String APELLIDOMR) {
        this.APELLIDOMR = APELLIDOMR;
    }

    public String getCVE_CAR_RES() {
        return CVE_CAR_RES;
    }

    public void setCVE_CAR_RES(String CVE_CAR_RES) {
        this.CVE_CAR_RES = CVE_CAR_RES;
    }

    public String getCARGO_RESPONSABLE() {
        return CARGO_RESPONSABLE;
    }

    public void setCARGO_RESPONSABLE(String CARGO_RESPONSABLE) {
        this.CARGO_RESPONSABLE = CARGO_RESPONSABLE;
    }

    public String getTELEFONO_RESPONSABLE() {
        return TELEFONO_RESPONSABLE;
    }

    public void setTELEFONO_RESPONSABLE(String TELEFONO_RESPONSABLE) {
        this.TELEFONO_RESPONSABLE = TELEFONO_RESPONSABLE;
    }

    public String getEMAIL_RESPONSABLE() {
        return EMAIL_RESPONSABLE;
    }

    public void setEMAIL_RESPONSABLE(String EMAIL_RESPONSABLE) {
        this.EMAIL_RESPONSABLE = EMAIL_RESPONSABLE;
    }

    public String getCURP_ASESORI() {
        return CURP_ASESORI;
    }

    public void setCURP_ASESORI(String CURP_ASESORI) {
        this.CURP_ASESORI = CURP_ASESORI;
    }

    public String getNOMBREAI() {
        return NOMBREAI;
    }

    public void setNOMBREAI(String NOMBREAI) {
        this.NOMBREAI = NOMBREAI;
    }

    public String getAPELLIDOPAI() {
        return APELLIDOPAI;
    }

    public void setAPELLIDOPAI(String APELLIDOPAI) {
        this.APELLIDOPAI = APELLIDOPAI;
    }

    public String getAPELLIDOMAI() {
        return APELLIDOMAI;
    }

    public void setAPELLIDOMAI(String APELLIDOMAI) {
        this.APELLIDOMAI = APELLIDOMAI;
    }
    
    
    

    //************************************beans peter**********************************************
    public String getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(String FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public String getFECHA_TERMINO() {
        return FECHA_TERMINO;
    }

    public void setFECHA_TERMINO(String FECHA_TERMINO) {
        this.FECHA_TERMINO = FECHA_TERMINO;
    }

    public String getFECHA_REG() {
        return FECHA_REG;
    }

    public void setFECHA_REG(String FECHA_REG) {
        this.FECHA_REG = FECHA_REG;
    }

    public String getID_ESTATUS() {
        return ID_ESTATUS;
    }

    public void setID_ESTATUS(String ID_ESTATUS) {
        this.ID_ESTATUS = ID_ESTATUS;
    }

    public String getNOM_ESTATUS() {
        return NOM_ESTATUS;
    }

    public void setNOM_ESTATUS(String NOM_ESTATUS) {
        this.NOM_ESTATUS = NOM_ESTATUS;
    }

    public String getESTATUS_GENERAL() {
        return ESTATUS_GENERAL;
    }

    public void setESTATUS_GENERAL(String ESTATUS_GENERAL) {
        this.ESTATUS_GENERAL = ESTATUS_GENERAL;
    }

    public String getTOTAL_ALU_DUAL() {
        return TOTAL_ALU_DUAL;
    }

    public void setTOTAL_ALU_DUAL(String TOTAL_ALU_DUAL) {
        this.TOTAL_ALU_DUAL = TOTAL_ALU_DUAL;
    }

    public String getTOTAL_ALU_ACTIVO() {
        return TOTAL_ALU_ACTIVO;
    }

    public void setTOTAL_ALU_ACTIVO(String TOTAL_ALU_ACTIVO) {
        this.TOTAL_ALU_ACTIVO = TOTAL_ALU_ACTIVO;
    }

    public String getTOTAL_ALU_INACTIVO() {
        return TOTAL_ALU_INACTIVO;
    }

    public void setTOTAL_ALU_INACTIVO(String TOTAL_ALU_INACTIVO) {
        this.TOTAL_ALU_INACTIVO = TOTAL_ALU_INACTIVO;
    }

    public String getTOTAL_ESTATUS() {
        return TOTAL_ESTATUS;
    }

    public void setTOTAL_ESTATUS(String TOTAL_ESTATUS) {
        this.TOTAL_ESTATUS = TOTAL_ESTATUS;
    }

    public String getTOTAL_CCT() {
        return TOTAL_CCT;
    }

    public void setTOTAL_CCT(String TOTAL_CCT) {
        this.TOTAL_CCT = TOTAL_CCT;
    }

    public String getTOTAL_HOMBRE() {
        return TOTAL_HOMBRE;
    }

    public void setTOTAL_HOMBRE(String TOTAL_HOMBRE) {
        this.TOTAL_HOMBRE = TOTAL_HOMBRE;
    }

    public String getTOTAL_MUJER() {
        return TOTAL_MUJER;
    }

    public void setTOTAL_MUJER(String TOTAL_MUJER) {
        this.TOTAL_MUJER = TOTAL_MUJER;
    }

    public String getALUMNOS_NUEVO_INGRESO() {
        return ALUMNOS_NUEVO_INGRESO;
    }

    public void setALUMNOS_NUEVO_INGRESO(String ALUMNOS_NUEVO_INGRESO) {
        this.ALUMNOS_NUEVO_INGRESO = ALUMNOS_NUEVO_INGRESO;
    }

    public String getALUMNOS_ACTIVOS_PERIODO() {
        return ALUMNOS_ACTIVOS_PERIODO;
    }

    public void setALUMNOS_ACTIVOS_PERIODO(String ALUMNOS_ACTIVOS_PERIODO) {
        this.ALUMNOS_ACTIVOS_PERIODO = ALUMNOS_ACTIVOS_PERIODO;
    }
    
    

    
    

}