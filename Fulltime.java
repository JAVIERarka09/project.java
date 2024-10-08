package Projek;

public class Fulltime extends Teacher {
      int anualSalary;
      String Unit;
    
      public Fulltime(String n, int a, String s, int as, String u) {
        super(n, a, s);
        anualSalary = as;
        Unit = u;
      }

      public int getanualSalary() {
        return this.anualSalary;
      }

      public void setanualSalary(int anualSalary) {
        this.anualSalary = anualSalary ;

      }

      public String getunit() {
        return this.Unit;
      }

      public void setUnit(String Unit) {
        this.Unit = Unit;
      }
      public void setunit(String Unit) {
        this.Unit = Unit;
      }

      public void print() {
        super.print();
        System.out.println("gaji per tahun: " + anualSalary);
        System.out.println("unit: " + Unit);
      }
      
      }
    
