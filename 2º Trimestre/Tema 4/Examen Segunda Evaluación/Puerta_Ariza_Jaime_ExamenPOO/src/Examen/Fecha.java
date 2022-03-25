package Examen;

public class Fecha {

    private int dia;
    private int mes;
    private static int a�o;

    
    public Fecha() {
    }


    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

 
    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setA�o(int a) {
        a�o = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public static int getA�o() {
        return a�o;
    }

  
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, a�oCorrecto;
        a�oCorrecto = a�o > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && a�oCorrecto;
    }

   
    private boolean esBisiesto() {
        return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);
    }

    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                a�o++;
            }

        }
    }

                                                
    public boolean esMayorQue(Fecha f){
        if(a�o > f.a�o) {
            return true;
        }
        else if(a�o==f.a�o && mes > f.mes) {
            return true;
        }
        else if(a�o==f.a�o && mes == f.mes && dia > f.dia) {
            return true;
        }
        return false;
    }
   
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");

        sb.append(a�o);
        return sb.toString();
    }
} 
