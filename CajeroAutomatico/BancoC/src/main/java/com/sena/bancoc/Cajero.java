package com.sena.bancoc;

import java.util.Random;
import javax.swing.JOptionPane;
//REQISITOS FUNCIONALES

/* */
//REQUISITO NO FUNCIONAL
/*No permitir retiros que generen saldo -
            Validar que el cajero tenga dinero-
            No permitir retiros mayores a 2.100'000 -
            Genere mensaje. No ingreso de moneda
            ID por opcion-
            Multiplo de 10000   

Utilizar palabras simples
 */
public class Cajero {

    private int saldo = 7000000, saldoC = 20000000, retiroD = 2100000;
    private boolean continuar = true;  //para salir del programa
    int sumaretiro = 0, montonRetirar = 0, montonConsigna = 0;

    public Cajero() { // el constructor siempre debe ir, y es el metodo principal de la class, puede estar vacio o con informacion
    }

    public int getSaldo() { //get: traer datos
        return saldo;
    }

    public void setSaldo(int saldo) {//una variable dentro de un metodo () es un argumento
        this.saldo = saldo;
    }

    public int getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(int saldoC) { //set: cambiar, añadir, ingresar
        this.saldoC = saldoC;
    }

    public int getRetiroD() {
        return retiroD;
    }

    public void setRetiroD(int retiroD) {
        this.retiroD = retiroD;
    }

    public void cajeroAutomatico() {
        while (continuar) {
            try {
                StringBuilder menu = new StringBuilder("MENÚ CAJERO AUTOMÁTICO\n\n"); //StringBuilder es para poner  arios mensajes reducioendo el espacio de memoria, con el String normal por cada mensaje se crearia un espacio de memoria.
                menu.append("Seleccione una opción del 1 al 4 así: \n")
                        .append("1. Consultar saldo \n")
                        .append("2. Consignar dinero \n")
                        .append("3. Retirar dinero \n")
                        .append("4. Salir");
                String opcion = JOptionPane.showInputDialog(null, menu, "Cajero Automático", JOptionPane.QUESTION_MESSAGE);
                if (opcion == null) {
                    if (confirmarsalida()) {
                        continuar = false;
                    }
                    continue;
                }
                int opc = Integer.parseInt(opcion);
                switch (opc) {
                    case 1:
                        saldoActual();
                        break;
                    case 2:
                        consignarSal();
                        break;
                    case 3:
                        retirarD();
                        break;
                    case 4:
                        salir();
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error", "Ingrese numero de 1 a 4", JOptionPane.ERROR_MESSAGE);

            }

        }
    }

    public boolean confirmarsalida() {// void significa que no necesita recibir o enviar un dato.
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION);
        return confirmar == JOptionPane.YES_NO_OPTION;
    }

    public String idRamdom() {
        Random random = new Random();
        int numero = random.nextInt(9000) + 1000;  //el (9000) nos va a decir hasta donde va a llegar y el +1000 le va a sumar de forma aleatoria
        return "ID por operación #" + numero + "\n";  //quiere decir que se realiza la operacion internamente y cuando se termine envia la operacion realizada.

    }

    public void mostrarInformacion() {
        String validacion = idRamdom();
        StringBuilder mensaje = new StringBuilder("Aperación exitosa\n\n");
        mensaje.append(validacion)
                .append("Saldo: $")
                .append(String.format("%,d", saldo));
        JOptionPane.showMessageDialog(null, mensaje, "Nuevo saldo",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public void saldoActual() {//consultar, consignar, o retirar son con void
        String validacion = idRamdom();
        StringBuilder mensaje = new StringBuilder("Consultar saldo actual\n\n");
        mensaje.append(validacion)
                .append("Saldo actual: $")
                .append(String.format("%,d", saldo));
        JOptionPane.showMessageDialog(null, mensaje, "Consultar saldo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void consignarSal() {
        //no ingreso de monedas
        JOptionPane.showMessageDialog(null, "No se permite el ingreso de monedas\n", "Precausión", JOptionPane.WARNING_MESSAGE);
        try {
            StringBuilder menu = new StringBuilder("====Retirar Saldo====\n\n"); //StringBuilder es para poner  arios mensajes reducioendo el espacio de memoria, con el String normal por cada mensaje se crearia un espacio de memoria.
            menu.append("Seleccione una opción del 1 al 4 así: \n")
                    .append("1. 20.000 \n")
                    .append("2. 50.000 \n")
                    .append("3. 100.000 \n")
                    .append("4. 200.000\n")
                    .append("5. 300.000\n")
                    .append("6. 400.000\n")
                    .append("7. 500.000\n")
                    .append("8. 600.000\n")
                    .append("9. Saldo diferente");
            String opcion = JOptionPane.showInputDialog(null, menu, "Cajero Automático", JOptionPane.QUESTION_MESSAGE);
            if (opcion == null) {
                if (confirmarsalida()) {
                    continuar = false;
                    return;
                }
            }
            int opc = Integer.parseInt(opcion);

            switch (opc) {
                case 1:
                    saldo += 20000;
                    mostrarInformacion();
                    break;
                case 2:
                    saldo += 50000;
                    mostrarInformacion();
                    break;
                case 3:
                    saldo += 100000;
                    mostrarInformacion();
                    break;
                case 4:
                    saldo += 200000;
                    mostrarInformacion();
                    break;
                case 5:
                    saldo += 300000;
                    mostrarInformacion();
                    break;
                case 6:
                    saldo += 400000;
                    mostrarInformacion();
                    break;
                case 7:
                    saldo += 500000;
                    mostrarInformacion();
                    break;
                case 8:
                    saldo += 600000;
                    mostrarInformacion();
                    break;
                case 9:
                    String consigna = JOptionPane.showInputDialog(null, "Ingrese cuanto va a consignar: ", "Saldo diferente", JOptionPane.INFORMATION_MESSAGE);
                    montonConsigna = Integer.parseInt(consigna);
                    if (montonConsigna % 5000 == 0 && montonConsigna >= 10000) {
                        saldo += montonConsigna;
                        mostrarInformacion();
                    } else if (montonConsigna % 5000 != 0) {
                        JOptionPane.showMessageDialog(null, "No se permite monedas.\nTampoco consignas no multiplos de 5000.\nEs decir deben ser mayores de 10.000 pero multiplos de 5.000.");
                    } else if (montonConsigna < 10000) {
                        JOptionPane.showMessageDialog(null, "No se permiten consignas menores a 10.000.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error", "Ingrese una consigna mayor a $10.000", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void retirarD() {
        try {
            StringBuilder menu = new StringBuilder("====Retirar Saldo====\n\n"); //StringBuilder es para poner  arios mensajes reducioendo el espacio de memoria, con el String normal por cada mensaje se crearia un espacio de memoria.
            menu.append("Seleccione una opción del 1 al 4 así: \n")
                    .append("1. 20.000 \n")
                    .append("2. 50.000 \n")
                    .append("3. 100.000 \n")
                    .append("4. 200.000\n")
                    .append("5. 300.000\n")
                    .append("6. 400.000\n")
                    .append("7. 500.000\n")
                    .append("8. 600.000\n")
                    .append("9. Saldo diferente");
            String opcion = JOptionPane.showInputDialog(null, menu, "Cajero Automático", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) {
                if (confirmarsalida()) {
                    continuar = false;
                    return;
                }
            }

            int opc = Integer.parseInt(opcion);

            switch (opc) {
                case 1:
                    montonRetirar = 20000;
                    
                    break;
                case 2:
                    montonRetirar = 50000;

                    break;
                case 3:

                    montonRetirar = 100000;

                    break;
                case 4:

                    montonRetirar = 200000;

                    break;
                case 5:

                    montonRetirar = 300000;

                    break;
                case 6:

                    montonRetirar = 400000;

                    break;
                case 7:

                    montonRetirar = 500000;

                    break;
                case 8:

                    montonRetirar = 600000;

                    break;
                case 9:
                    String retirar = JOptionPane.showInputDialog(null, "Ingrese cuanto va a retirar", "Saldo diferente", JOptionPane.INFORMATION_MESSAGE);
                    montonRetirar = Integer.parseInt(retirar);
                    break;
            }
            sumaretiro += montonRetirar;
            montonaRetirar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error", "Ingrese un número entre las opciones del 1 al 9", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void montonaRetirar() {
        if (sumaretiro > retiroD) {
            JOptionPane.showMessageDialog(null, "Usted tiene un limite de retiros diarios de $" + (String.format("%,d", retiroD)), "Limite diario", JOptionPane.ERROR_MESSAGE);
        }
        if (montonRetirar % 5000 == 0 && montonRetirar >= 10000 && sumaretiro <= retiroD) {
            if (montonRetirar <= saldo) {
                saldo -= montonRetirar;

                mostrarInformacion();

            } else if (montonRetirar > saldo) {
                JOptionPane.showMessageDialog(null, "El valor a retirar es mayor al saldo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (montonRetirar % 5000 != 0) {
            JOptionPane.showMessageDialog(null, "No se permite monedas.\nTampoco retiros no multiplos de 5000.\nEs decir deben ser mayores de 10.000 pero multiplos de 5.000.");
        } else if (montonRetirar < 10000) {
            JOptionPane.showMessageDialog(null, "No se permiten retiros menores a 10.000.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void salir() {
        if (confirmarsalida()) {
            continuar = false;
        }
    }
}
