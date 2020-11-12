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
public class PBOIF210119059Latihan48Kalkulator {

    public static void main(String[] args) {
        Kalkulator cal = new Kalkulator();
        
        cal.setValue1(7);
        System.out.println("Value 1 = " +cal.getValue1());
        cal.setValue2(5);
        System.out.println("Value 2 = " +cal.getValue2());
        cal.setNamaProject();
        cal.setNoteProject();
        System.out.println("Result Add is = " +cal.add(cal.getValue1(), cal.getValue2()));
        System.out.println("Result Minus is = " +cal.minus(cal.getValue1(), cal.getValue2()));
        System.out.println("Result Multiple is = " +cal.multiplication(cal.getValue1(), cal.getValue2()));
        System.out.println("Result Division is = " +cal.division(cal.getValue1(), cal.getValue2()));
    }
    
}
