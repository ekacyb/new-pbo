/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemlogic;

/**
 *
 * @author A-21
 */
public class SistemPerkuliahan {
    private perkuliahan[] dataPerkuliahan;
    private dosen[] dataDosen;
    private mahasiswa[] dataMahasiswa;
    private staff[] dataStaff;

    public SistemPerkuliahan() {
    }

    public SistemPerkuliahan(int maxPerku, int maxDos, mahasiswa[] dataMahasiswa, staff[] dataStaff) {
        this.dataPerkuliahan = dataPerkuliahan;
        this.dataDosen = dataDosen;
        this.dataMahasiswa = dataMahasiswa;
        this.dataStaff = dataStaff;
    }
    
    
    
}
