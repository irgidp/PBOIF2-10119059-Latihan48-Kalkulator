/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Kalkulator
 */
package pboif2.pkg10119059.latihan48.kalkulator;
/**
 *
 * @author Corazon
 */
public class Kalkulator {
    private double value1;
    private double value2;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1 = value1;
    }
    
    public double getValue2(){
    return value2;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    public void setNamaProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(){
        System.out.println("This project shwon you how to manage method in java");
    }
    
    public double add(double val1, double val2){
        return val1 + val2;
    }
    
    public double minus(double val1, double val2){
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2){
        return val1 * val2;
    }
    
    public double division(double val1, double val2){
        return val1 / val2;
    }
    
}
