/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import javaapplication30.views.*;

/**
 *
 * @author asrulsibaoel
 */
public class TugasBesar {

    private HasilNilai hasilNilai;
    private InputSoal inputSoal;
    private LembarKerja lembarKerja;
    private Login login;
    private RegistrasiSiswa registrasiSiswa;
    private HomePage homePage;
    private String[] session;
    private String[][] siswa;
    private String[][] soal;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TugasBesar tugas = new TugasBesar();
        tugas.init();
        tugas.getHomePage().setVisible(true);
    }
    
    public void init() {
        this.homePage = new HomePage(this);
        this.hasilNilai = new HasilNilai(this);
        this.inputSoal = new InputSoal(this);
        this.lembarKerja = new LembarKerja(this);
        this.login = new Login(this);
        this.registrasiSiswa = new RegistrasiSiswa(this);
        this.soal = new String[10][6];
        this.siswa = new String[10][3];
    }

    public HasilNilai getHasilNilai() {
        return hasilNilai;
    }

    public void setHasilNilai(HasilNilai hasilNilai) {
        this.hasilNilai = hasilNilai;
    }

    public InputSoal getInputSoal() {
        return inputSoal;
    }

    public void setInputSoal(InputSoal inputSoal) {
        this.inputSoal = inputSoal;
    }

    public LembarKerja getLembarKerja() {
        return lembarKerja;
    }

    public void setLembarKerja(LembarKerja lembarKerja) {
        this.lembarKerja = lembarKerja;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public RegistrasiSiswa getRegistrasiSiswa() {
        return registrasiSiswa;
    }

    public void setRegistrasiSiswa(RegistrasiSiswa registrasiSiswa) {
        this.registrasiSiswa = registrasiSiswa;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public String[] getSession() {
        return session;
    }

    public void setSession(String[] session) {
        this.session = session;
    }

    public String[][] getSiswa() {
        return siswa;
    }

    public void setSiswa(String[][] siswa) {
        this.siswa = siswa;
    }

    public String[][] getSoal() {
        return soal;
    }

    public void setSoal(String[][] soal) {
        this.soal = soal;
    }
    
}
