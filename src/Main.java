import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nicolas");
        int menu = 0;
        int salir = 0;

        do {

            Scanner leer = new Scanner(System.in);
            System.out.println("*****BIENVENIDO*****");
            System.out.println("Seleccione una opción de ejercicios pares");
            menu = leer.nextInt();
            switch (menu) {
                case 2:
                    int c = 0;
                    double ganancia = 0;
                    do {
                        System.out.println("(2) Calculo de ganancia de capital a un mes a tasa de 2%");
                        System.out.println("Ingrese el monto del capital");
                        c = leer.nextInt();
                        ganancia = 1.02 * c;
                        System.out.println("El valor de la ganancia de $" + c + " es de: $" + ganancia);
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 4:
                    c = 0;
                    ganancia = 0;
                    do {
                        double total = 0;
                        System.out.println("(4) Valor total de la compra con el -15% de descuento");
                        System.out.println("Ingrese el valor de la compra");
                        c = leer.nextInt();
                        total = 0.85 * c;
                        System.out.println("El valor total de la compra es de $" + total);
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 6:
                    do {
                        int h = 0;
                        int m = 0;
                        double porHombres = 0;
                        double porMujeres = 0;
                        System.out.println("(6) Calculo de porcentaje de hombres y mujeres en un grupo");
                        System.out.println("Ingrese el número de hombres");
                        h = leer.nextInt();
                        System.out.println("Ingrese el número de mujeres");
                        m = leer.nextInt();
                        porHombres = ((double) h) / (h + m) * 100;
                        porMujeres = ((double) m) / (h + m) * 100;
                        System.out.println("El porcentaje de hombres es de: " + porHombres + "% y el porcentaje de mujeres es de: " + porMujeres + "%");

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 8:
                    do {
                        double a = 0;
                        double b = 0;
                        double cc = 0;
                        double p = 0;
                        double area = 0;
                        System.out.println("(8) Cálculo del área de un triángulo");
                        System.out.println("Ingrese el lado a:");
                        a = leer.nextDouble();
                        System.out.println("Ingrese el lado b:");
                        b = leer.nextDouble();
                        System.out.println("Ingrese el lado c:");
                        cc = leer.nextDouble();
                        p = (a + b + cc) / 2;
                        area = Math.sqrt(p * (p - a) * (p - b) * (p - cc));
                        System.out.println("El área del triangulo con lados " + a + ", " + b + " y " + cc + " es igual a " + area);
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 10:
                    do {
                        double ats = 0;
                        double grd = 0;
                        double esp = 0;
                        System.out.println("***Conversión ATS(Chelín austriaco) a ESP(Peseta)***");
                        System.out.println("Ingrese el valor ATS:");
                        ats = leer.nextDouble();
                        double ats_esp = 956.871 / 100 * ats;
                        System.out.println("El valor de " + ats + " ATS es de " + ats_esp + " ESP");
                        System.out.println("");

                        System.out.println("***Conversión de GRD(Dracma griego) a FRF(Franco francés)***");
                        System.out.println("Ingrese el valor de GRD:");
                        grd = leer.nextDouble();
                        double grd_frf = 88.607 / 100 / 20.11 * grd;
                        System.out.println("El valor de " + grd + " GRD es de " + grd_frf + " FRF");
                        System.out.println("");

                        System.out.println("***Conversión de ESP(Pesetas) a USD(Dólares) y ITL(Liras italinas)***");
                        System.out.println("Ingrese el valor de ESP:");
                        esp = leer.nextDouble();
                        double esp_usd = 1 / 122.499;
                        double esp_itl = 100 / 9.289;
                        System.out.println("El valor de " + esp + " ESP es de " + esp_usd + " USD y " + esp_itl + " ITL");
                        System.out.println("");


                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 12:
                    do {
                        double emath = 0;
                        double ephi = 0;
                        double echem = 0;
                        double tmath = 0;
                        double tphi = 0;
                        double tchem = 0;

                        System.out.println("MATERIA: MATEMÁTICAS");
                        System.out.println("Ingrese la nota del examen final: ");
                        emath = leer.nextDouble();
                        System.out.println("Ingrese la nota promedio de las tareas: ");
                        tmath = leer.nextDouble();
                        double fmath = emath * 0.9 + tmath * 0.1;
                        System.out.println("");
                        System.out.println("MATERIA: FISICA");
                        System.out.println("Ingrese la nota del examen final: ");
                        ephi = leer.nextDouble();
                        System.out.println("Ingrese la nota promedio de las tareas: ");
                        tphi = leer.nextDouble();
                        double fphi = ephi * 0.8 + tphi * 0.2;
                        System.out.println("");
                        System.out.println("MATERIA: QUÍMICA");
                        System.out.println("Ingrese la nota del examen final: ");
                        echem = leer.nextDouble();
                        System.out.println("Ingrese la nota promedio de las tareas: ");
                        tchem = leer.nextDouble();
                        double fchem = echem * 0.85 + tchem * 0.15;
                        System.out.println("");
                        System.out.println("Resultado de notas finales: ");
                        System.out.println("Matematicas: " + fmath);
                        System.out.println("Física: " + fphi);
                        System.out.println("Química: " + fchem);
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 14:
                    do {
                        double a = 0;
                        double b = 0;
                        c = 0;
                        double d = 0;
                        double e = 0;
                        double f = 0;

                        System.out.println("**(14)Solución de sistema de ecuaciones lineales 2x2**");
                        System.out.println("Tenga en cuenta los coeficientes: ");
                        System.out.println("aX+bY=c");
                        System.out.println("dX+eY=f");
                        System.out.println("Ingrese el valor de a: ");
                        a = leer.nextInt();
                        System.out.println("Ingrese el valor de b: ");
                        b = leer.nextInt();
                        System.out.println("Ingrese el valor de c: ");
                        c = leer.nextInt();
                        System.out.println("Ingrese el valor de d: ");
                        d = leer.nextInt();
                        System.out.println("Ingrese el valor de e: ");
                        e = leer.nextInt();
                        System.out.println("Ingrese el valor de f: ");
                        f = leer.nextInt();
                        double x = (c * e - b * f) / (a * e - b * d);
                        double y = (a * f - c * d) / (a * e - b * d);
                        System.out.println("El valor de X es de: " + x);
                        System.out.println("El valor de Y es de: " + y);

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 16:
                    do {
                        double area_lamina = 4 * 1.5;
                        double area_pieza = 0.5;
                        double num_piezas = area_lamina / area_pieza;
                        double desperdicio = area_lamina % area_pieza;
                        System.out.println("El número de piezas posibles a construir con una lámina de área "
                                + area_lamina + ", es de: " + num_piezas);
                        System.out.println("El desperdicio es de " + desperdicio);


                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 18:
                    do {
                        double gal = 0;
                        System.out.println("(18) Ingrese el valor de galones vendidos: ");
                        gal = leer.nextDouble();
                        double gal_lit = gal * 3.785;
                        double precio = gal_lit * 100;
                        System.out.println("El precio total es de " + precio + " bolivares");

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 20:
                    do {
                        double intereses = 0;
                        double capital = 0;
                        double anios = 0;
                        double razon = 0;
                        System.out.println("(20) Ingrese el tiempo en años: ");
                        anios = leer.nextDouble();
                        System.out.println("Ingrese el total de interese pagados: ");
                        intereses = leer.nextDouble();
                        System.out.println("Ingrese el valor de capital: ");
                        capital = leer.nextDouble();
                        razon = intereses / anios / capital * 100;
                        System.out.println("La tasa de interés fue del: " + razon + "% anual");
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 22:
                    do {
                        double cuota = 0;
                        double preciopc = 0;
                        double razon = 0;
                        System.out.println("22) Ingrese el valor del pc: ");
                        preciopc = leer.nextDouble();
                        System.out.println("Ingrese el valor de la cuota: ");
                        cuota = leer.nextDouble();
                        razon = (cuota * 12 - preciopc) / 12 / preciopc * 100;
                        System.out.println("La tasa de interés fue del: " + razon + "% mensual");

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                    } while (salir != 0);

                case 24:
                    do {
                        float interes = 0;
                        float tasa = 0;
                        float tiempo = 0;
                        float capital = 0;
                        System.out.println("24) Ingrese el valor del capital a invertir:");
                        capital = leer.nextFloat();
                        System.out.println("Ingrese el número de periodos: ");
                        tiempo = leer.nextFloat();
                        System.out.println("Ingrese la tasa de interes para el periodo de tiempo en porcentaje: ");
                        tasa = leer.nextFloat();
                        interes = capital * tiempo * tasa / 100;
                        if (interes > 7000) {
                            System.out.println("Sus intereses serán reinvertidos, su capital final será de: $" + (interes + capital));
                        } else {
                            System.out.println("Sus intereses no serán reinvertidos, su capital final será de: $" + (interes + capital));
                        }
                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();

                    } while (salir != 0);
                case 26:
                    do {
                        float a=0;
                        float b=0;
                        float ccc=0;
                        float d=0;
                        double r=0;

                        System.out.println("Ingrese el valor de A");
                        a=leer.nextFloat();
                        System.out.println("Ingrese el valor de B");
                        b=leer.nextFloat();
                        System.out.println("Ingrese el valor de C");
                        ccc=leer.nextFloat();
                        System.out.println("Ingrese el valor de D");
                        d=leer.nextFloat();
                        if (d==0) {
                            r=Math.pow(a-ccc,2);
                            System.out.println(r);
                        }else if(d>0) {
                            r=Math.pow(a-b, 3)/d;
                            System.out.println("El resultado es:"+r);
                        }else {}

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();

                    } while (salir != 0);

                case 28:
                    do {
                        double compra=0;
                        double banco=0;
                        double empresa=0;
                        double fabricante=0;
                        double intereses=0;

                        System.out.println("Ingrese el valor total de la compra: ");
                        compra=leer.nextFloat();
                        if(compra>500000) {
                            empresa=(float) (0.55*compra);
                            banco=0.3*compra;
                            fabricante=0.15*compra;
                        }else {
                            empresa=0.7*compra;
                            fabricante=0.3*compra;
                        }
                        intereses=fabricante*0.2;
                        System.out.println("La compra es de $"+compra+", por lo tanto el "
                                + "plan de pagos es el siguiente: ");
                        System.out.println("Empresa: $"+empresa);
                        System.out.println("Banco: $"+banco);
                        System.out.println("Fabricante: $"+fabricante+ " más intereses por $"+intereses);


                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();

                    } while (salir != 0);

                case 30:
                    do {
                        int a=0;
                        int b=0;
                        int cccc=0;
                        int d=0;
                        int n=0;
                        int nr=0;
                        System.out.println("Ingrese el valor de a: ");
                        a=leer.nextInt();
                        System.out.println("Ingrese el valor de b: ");
                        b=leer.nextInt();
                        System.out.println("Ingrese el valor de c: ");
                        cccc=leer.nextInt();
                        System.out.println("Ingrese el valor de d: ");
                        d=leer.nextInt();
                        String concatenacion= String.valueOf(a)+String.valueOf(b)+String.valueOf(cccc)+String.valueOf(d);
                        n=Integer.parseInt(concatenacion);
                        double u=n%100;

                        if (u>=50) {
                            nr=n;
                            nr+=(100-u);
                        }else {
                            nr=n;
                            nr-=u;
                        }
                        System.out.println("El numero inicial es "+n+" redondeado a "+nr);

                        System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();

                    } while (salir != 0);

                case 32:
                    do {
                        double p=0;
                        double q=0;
                        double v=0;

                        System.out.println("Ingrese el valor de P:");
                        p=leer.nextDouble();
                        System.out.println("Ingrese el valor de Q:");
                        q=leer.nextDouble();
                        v=Math.pow(p, 3)+Math.pow(q, 4)-2*Math.pow(p,2);
                        if(v>680) {
                            System.out.println("El valor de P es de "+p+" el valor de Q es de "
                                    +q +" y el valor de la operacion fue de "+v);
                        }else {
                            System.out.println("El valor fue menor o igual a 680 siendo de " + v);
                        }

                            System.out.println("[0]Regresar al menú  [1]Continuar ");
                        salir = leer.nextInt();
                        } while (salir != 0);
            }
            }while (!(menu % 2 == 0 && menu >= 1 && menu <= 100) || salir == 0) ;
        }
    }
