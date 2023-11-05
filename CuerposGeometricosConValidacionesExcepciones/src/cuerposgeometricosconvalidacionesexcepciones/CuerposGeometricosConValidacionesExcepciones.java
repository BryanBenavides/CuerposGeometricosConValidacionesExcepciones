package cuerposgeometricosconvalidacionesexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuerposGeometricosConValidacionesExcepciones {
    static Scanner lector = new Scanner(System.in);
    
    static int intentos;
    
    static double areaLateral;
    static double areaTotal;
    static double volumen;
    static double base;
    static double altura;
    static double apotema;
    static double perimetroBase;
    static double longitud;
    static double cantidadLados;
    static double resultado;
    static double radio;
    static double lados;
    static double longitudLados;
    static double generatriz;
    static double Radiomayor;
    static double Radio;
    static double radiomenor;
    static double radiosuperior;
    static double Area;
    static double Areazonaesferica;
    static double Volumenzonaesferica;
    static double Areacasqueteesferico;
    static double volumencasqueteesferico;
    static double Areadelacara;
    static double alfa;
    static double areaBase;
    static double perimetrosuperior;
    static double perimetroinferior;
    static double lado_base_superior;
    static double lado_base_inferior;
    static double angulo;
    static double profundidad;
    static double Diagonal;
    static double Altura;
    static double arista;
    
    static boolean reiniciar = true;
    
    static String entrada;
    static String entrada1;
    static String entrada2;

    public static void main(String[] args) {
        try {
            do {
                int elegir = Menu();
                Casos(elegir);
                
                System.out.println("¿Desea volver a utilizar el programa? (1 para sí, 0 para no)");
                
                int respuesta = lector.nextInt();
                if (respuesta == 0) {
                    System.out.println("Fin del programa");
                    break;
                }
            } while (true);

        } catch (Exception e) {
            if (e instanceof ArithmeticException || e instanceof InputMismatchException) {
                System.out.println(e.toString());
                System.out.println("Debe ingresar un número entero de 1 a 17");
            }
        }
    }

    public static int Menu() {
        System.out.println("Bienvenido al Programa");
        System.out.println("Se le dará a escoger qué figura geométrica desea efectuar con operaciones");
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("1) Prisma");
        System.out.println("2) Cilindro");
        System.out.println("3) Pirámide");
        System.out.println("4) Cono");
        System.out.println("5) Esfera");
        System.out.println("6) Zona esférica");
        System.out.println("7) Casquete Esférico");
        System.out.println("8) Tronco de cono");
        System.out.println("9) Tronco Pirámide");
        System.out.println("10) Huso Esférico");
        System.out.println("11) Ortoedro");
        System.out.println("12) Tetraedro");
        System.out.println("13) Hexaedro");
        System.out.println("14) Octaedro");
        System.out.println("15) Dodecaedro");
        System.out.println("16) Icosaedro");
        System.out.println("17) Fin");

        int intentos1 = 0;
        while (intentos1 < 3) {
            try {
                System.out.println("Ingrese el caso que desea utilizar");
                int elegir = lector.nextInt();

                if (elegir > 0 && elegir < 18) {
                    return elegir;
                } else {
                    System.out.println("Ingrese un caso entre 1 y 17");
                    intentos1++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero entre 1 y 17.");
                lector.next();
                intentos1++;
            }
        }

        System.out.println("Ha excedido el máximo de intentos");
        return 17;
    }

    public static void Casos(int elegir) {
    switch (elegir) {
        case 1:
            Prisma();
            ImprimirResultados("Prisma");
            break;
        case 2:
            Cilindro();
            ImprimirResultados("Cilindro");
            break;
        case 3:
            Piramide();
            ImprimirResultados("Pirámide");
            break;
        case 4:
            Cono();
            ImprimirResultados("Cono");
            break;
        case 5:
            Esfera();
            System.out.println("El Área de la Esfera es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen de la Esfera es: " + volumen + " Centímetro Cúbico");
            break;
        case 6:
            ZonaEsferica();
            System.out.println("Área de la Zona Esférica es: " + Areazonaesferica + " Centímetro Cuadrado");
            System.out.println("Volumen de la Zona Esférica es: " + Volumenzonaesferica + " Centímetro Cúbico");
            break;
        case 7:
            CasqueteEsferico();
            System.out.println("Área del Casquete Esférico es: " + Areacasqueteesferico + " Centímetro Cuadrado");
            System.out.println("Volumen del Casquete Esférico es: " + volumencasqueteesferico + " Centímetro Cúbico");
            break;
        case 8:
            Tronco_cono();
            ImprimirResultados("Tronco de Cono");
            break;
        case 9:
            Tonco_Piramide();
            ImprimirResultados("Tronco de Pirámide");
            break;
        case 10:
            Huso_Esferico();
            System.out.println("Área Total del Huso Esférico es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Huso Esférico es: " + volumen + " Centímetro Cúbico");
            break;
        case 11:
            Ortoedro();
            System.out.println("Área del Ortoedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Ortoedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área Diagonal del Ortoedro es: " + Diagonal + " Centímetro Cuadrado");
            break;
        case 12:
            Tetraedro();
            System.out.println("Área del Tetraedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Tetraedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área de la Cara del Tetraedro es: " + Areadelacara + " Centímetro Cuadrado");
            break;
        case 13:
            Hexaedro();
            System.out.println("Área del Hexaedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Hexaedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área de la Cara del Hexaedro es: " + Areadelacara + " Centímetro Cuadrado");
            break;
        case 14:
            Octaedro();
            System.out.println("Área del Octaedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Octaedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área de la Cara del Octaedro es: " + Areadelacara + " Centímetro Cuadrado");
            break;
        case 15:
            Dodecaedro();
            System.out.println("Área del Dodecaedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Dodecaedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área de la Cara del Dodecaedro es: " + Areadelacara + " Centímetro Cuadrado");
            break;
        case 16:
            Icosaedro();
            System.out.println("Área del Icosaedro es: " + Area + " Centímetro Cuadrado");
            System.out.println("Volumen del Icosaedro es: " + volumen + " Centímetro Cúbico");
            System.out.println("Área de la Cara del Icosaedro es: " + Areadelacara + " Centímetro Cuadrado");
            break;
        case 17:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Opción no válida.");
            break;
    }
}

   public static void ImprimirResultados(String figura) {
    System.out.println("Resultados para " + figura + ":");
    System.out.println("Área Lateral: " + areaLateral + " Centímetro Cuadrado");
    System.out.println("Área Total: " + areaTotal + " Centímetro Cuadrado");
    System.out.println("Volumen: " + volumen + " Centímetro Cúbico");
}


    public static void Prisma() {
        try {
            // Leer las entradas del usuario
            System.out.println("Área de la Base");
            base = lector.nextDouble();
            if (base <= 0) {
                throw new ArithmeticException("La base debe ser mayor que 0.");
            }

            System.out.println("Perímetro de la Base");
            perimetroBase = lector.nextDouble();
            if (perimetroBase <= 0) {
                throw new ArithmeticException("El perímetro de la base debe ser mayor que 0.");
            }

            System.out.println("Altura");
            altura = lector.nextDouble();
            if (altura <= 0) {
                throw new ArithmeticException("La altura debe ser mayor que 0.");
            }

            // Calcular el área lateral, área total y volumen del prisma
            areaLateral = perimetroBase * altura;
            areaTotal = (2 * base) + areaLateral;
            volumen = base * altura;

            // Calcular el perímetro superior
            double semilado = base / 2;
            double apotema = Math.sqrt(Math.pow(semilado, 2) + Math.pow(altura, 2));
            double perimetroSuperior = perimetroBase + 2 * semilado + 2 * apotema;
            System.out.println("Perímetro Superior: " + perimetroSuperior);
            
            // Calcular el área de la base superior
            double areaBaseSuperior = semilado * apotema * 2;
            System.out.println("Área de la Base Superior: " + areaBaseSuperior);

            // Mostrar los resultados
            System.out.println("Área Lateral: " + areaLateral);
            System.out.println("Área Total: " + areaTotal);
            System.out.println("Volumen: " + volumen);

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número válido.");
            lector.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Cilindro() {
        try {
            System.out.println("Radio");
            radio = lector.nextDouble();
            if (radio <= 0) {
                throw new ArithmeticException("El radio debe ser mayor que 0.");
            }

            System.out.println("Altura");
            altura = lector.nextDouble();
            if (altura <= 0) {
                throw new ArithmeticException("La altura debe ser mayor que 0.");
            }

            areaLateral = 2 * Math.PI * radio * altura;
            areaTotal = 2 * Math.PI * radio * (radio + altura);
            volumen = Math.PI * Math.pow(radio, 2) * altura;

            System.out.println("Área Lateral: " + areaLateral);
            System.out.println("Área Total: " + areaTotal);
            System.out.println("Volumen: " + volumen);

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número válido.");
            lector.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

public static double Piramide() {
    System.out.println("Se necesita base y altura");

    base = obtenerValor("base");
    altura = obtenerValor("altura");

    if (base > 0.1 && altura > 0.1) {
        apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        areaLateral = 4 * base * altura / 2;
        areaBase = Math.pow(base, 2);
        areaTotal = areaLateral + areaBase;
        volumen = areaBase * altura / 3;
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return areaLateral;
}

public static double Cono() {
    System.out.println("Se necesita la altura y el radio");

    altura = obtenerValor("altura");
    radio = obtenerValor("radio");

    if (altura > 0.1 && radio > 0.1) {
        generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        areaLateral = Math.PI * radio * generatriz;
        areaBase = Math.PI * Math.pow(radio, 2);
        areaTotal = areaLateral + areaBase;
        volumen = areaBase * altura / 3;
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return areaLateral;
}

public static double obtenerValor(String nombre) {
    double valor = 0;
    for (intentos = 0; intentos < 3; intentos++) {
        System.out.print("Digite " + nombre + ": ");
        if (lector.hasNextDouble()) {
            valor = lector.nextDouble();
            if (valor >= 0.1) {
                return valor;
            } else {
                System.out.println("No se aceptan valores menores a 0.1");
            }
        } else {
            System.out.println("Valor inválido. Ingrese un número");
            lector.next();
        }
    }

    if (intentos == 3) {
        System.out.println("Demasiados intentos fallidos");
    }
    return valor;
}

public static double Esfera() {
    System.out.println("Se necesita el radio");

    for (intentos = 0; intentos < 3; intentos++) {
        System.out.print("Digite el radio: ");

        if (lector.hasNextDouble()) {
            radio = lector.nextDouble();

            if (radio > 0.1) {
                Area = 4 * Math.PI * Math.pow(radio, 2);
                volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

                System.out.println("Área: " + Area + " cuadrados");
                System.out.println("Volumen: " + volumen + " cúbicos");
            } else {
                System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
            }
        } else {
            System.out.println("Valor inválido. Ingrese un número");
            lector.next();
        }
    }

    if (intentos == 3) {
        System.out.println("Demasiados intentos fallidos");
    }

    return Area;
}

public static double ZonaEsferica() {
    System.out.println("Se necesita radio, Radio Mayor, altura, radio superior");

    radio = obtenerValor("radio zona esférica");
    Radio = obtenerValor("Radio Mayor");
    altura = obtenerValor("altura");
    radiosuperior = obtenerValor("radio superior");

    if (radio > 0.1 && Radio > 0.1 && altura > 0.1 && radiosuperior > 0.1) {
        Areazonaesferica = 2 * Math.PI * Radio * altura;
        Volumenzonaesferica = (Math.PI * altura * (Math.pow(Radio, 2) + Math.pow(radiosuperior, 2) + Radio * radiosuperior)) / 6;
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return Areazonaesferica;
}

public static double obtenerValor2(String nombre) {
    double valor = 0;
    for (intentos = 0; intentos < 3; intentos++) {
        System.out.print("Digite " + nombre + ": ");
        if (lector.hasNextDouble()) {
            valor = lector.nextDouble();
            if (valor >= 0.1) {
                return valor;
            } else {
                System.out.println("No se aceptan valores menores a 0.1");
            }
        } else {
            System.out.println("Valor inválido. Ingrese un número");
            lector.next();
        }
    }

    if (intentos == 3) {
        System.out.println("Demasiados intentos fallidos");
    }
    return valor;
}

public static double CasqueteEsferico() {
    System.out.println("Se necesita la altura y el Radio Mayor");

    altura = obtenerValor("altura");
    Radio = obtenerValor("radio casquete esférico");

    if (altura > 0.1 && Radio > 0.1) {
        Areacasqueteesferico = 2 * Math.PI * Radio * altura;
        volumencasqueteesferico = (Math.PI * Math.pow(altura, 2) * (3 * Radio - altura)) / 3;
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return Areacasqueteesferico;
}

public static double Tronco_cono() {
    System.out.println("Se necesita Radio Mayor, Radio Menor y altura");

    Radiomayor = obtenerValor("Radio Mayor");
    radiomenor = obtenerValor("radio menor");
    altura = obtenerValor("altura");

    if (Radiomayor > 0.1 && radiomenor > 0.1 && altura > 0.1) {
        double base = Radiomayor - radiomenor;
        double generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        areaLateral = Math.PI * generatriz * (Radiomayor + radiomenor);
        areaTotal = Math.PI * generatriz * (Radiomayor + radiomenor) + Math.PI * Math.pow(Radiomayor, 2) + Math.PI * Math.pow(radiomenor, 2);
        volumen = (1.0 / 3.0) * Math.PI * altura * (Math.pow(Radiomayor, 2) + Math.pow(radiomenor, 2) + Radiomayor * radiomenor);
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return volumen;
}

   public static double Tonco_Piramide() {
      System.out.println("Se necesita perimetrosuperior, perimetroinferior, altura, lado base superior, lado base inferior");

      for (intentos = 0; intentos < 3; intentos++) {
          System.out.print("Digite perimetro superior: ");

          if (lector.hasNextDouble()) {
              perimetrosuperior = lector.nextDouble();

              if (perimetrosuperior < 0.1) {
                  System.out.println("No se aceptan valores menores a 0.1");
              } else {
                  intentos = 3;
              }
          } else {
              System.out.println("valor inválido. Ingrese un numero");
              lector.next();
          }
      }

      if (intentos == 3) {
          System.out.println("Demasiados intentos fallidos");
      } else {
          for (intentos = 0; intentos < 3; intentos++) {
              System.out.print("Digite perimetro inferior: ");

              if (lector.hasNextDouble()) {
                  perimetroinferior = lector.nextDouble();

                  if (perimetroinferior < 0.1) {
                      System.out.println("No se aceptan valores menores a 0.1");
                  } else {
                      intentos = 3;
                  }
              } else {
                  System.out.println("valor inválido. Ingrese un numero");
                  lector.next();
              }
          }

          for (intentos = 0; intentos < 3; intentos++) {
              System.out.print("Digite la altura: ");

              if (lector.hasNextDouble()) {
                  altura = lector.nextDouble();

                  if (altura < 0.1) {
                      System.out.println("No se aceptan valores menores a 0.1");
                  } else {
                      intentos = 3;
                  }
              } else {
                  System.out.println("valor inválido. Ingrese un numero");
                  lector.next();
              }
          }

          for (intentos = 0; intentos < 3; intentos++) {
              System.out.print("Digite el lado de la base superior: ");

              if (lector.hasNextDouble()) {
                  lado_base_superior = lector.nextDouble();

                  if (lado_base_superior < 0.1) {
                      System.out.println("No se aceptan valores menores a 0.1");
                  } else {
                      intentos = 3;
                  }
              } else {
                  System.out.println("valor inválido. Ingrese un numero");
                  lector.next();
              }
          }

          for (intentos = 0; intentos < 3; intentos++) {
              System.out.print("Digite el lado de la base inferior: ");

              if (lector.hasNextDouble()) {
                  lado_base_inferior = lector.nextDouble();

                  if (lado_base_inferior < 0.1) {
                      System.out.println("No se aceptan valores menores a 0.1");
                  } else {
                      intentos = 3;
                  }
              } else {
                  System.out.println("valor inválido. Ingrese un numero");
                  lector.next();
              }
          }

          base = perimetrosuperior - perimetroinferior;
          apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
          areaLateral = perimetrosuperior + perimetroinferior * apotema / 2;
          areaTotal = areaLateral + lado_base_superior + lado_base_inferior;
          volumen = (1.0 / 3.0) * altura * (lado_base_superior + lado_base_inferior + Math.sqrt(lado_base_superior + lado_base_inferior));
      }

      return areaLateral;
  }

   public static double Huso_Esferico() {
      System.out.println("Se necesita radio y ángulo");

      for (intentos = 0; intentos < 3; intentos++) {
          System.out.print("Digite el radio del huso esférico: ");

          if (lector.hasNextDouble()) {
              radio = lector.nextDouble();

              if (radio < 0.1) {
                  System.out.println("No se aceptan valores menores a 0.1");
              } else {
                  intentos = 3;
              }
          } else {
              System.out.println("valor inválido. Ingrese un numero");
              lector.next(); 
          }
      }

      if (intentos == 3) {
          System.out.println("Demasiados intentos fallidos");
      } else {
          for (intentos = 0; intentos < 3; intentos++) {
              System.out.print("Digite el ángulo del huso esférico: ");

              if (lector.hasNextDouble()) {
                  angulo = lector.nextDouble();

                  if (angulo < 0.1) {
                      System.out.println("No se aceptan valores menores a 0.1");
                  } else {
                      intentos = 3;
                  }
              } else {
                  System.out.println("valor inválido. Ingrese un numero");
                  lector.next(); 
              }
          }

          if (intentos == 3) {
              System.out.println("Demasiados intentos fallidos");
          } else {
              Area = Math.PI * Math.pow(radio, 2) * angulo / 90;
              volumen = Math.PI * Math.pow(radio, 3) * angulo / 270;
          }
      }

      return Area;
  }
  public static double Ortoedro() {
   System.out.println("Necesita altura, longitud y profundidad");

   for (intentos = 0; intentos < 3; intentos++) {
       System.out.print("Digite la altura: ");

       if (lector.hasNextDouble()) {
           altura = lector.nextDouble();

           if (altura < 0.1) {
               System.out.println("No se aceptan valores menores a 0.1");
           } else {
               intentos = 3;
           }
       } else {
           System.out.println("valor inválido. Ingrese un numero");
           lector.next();
       }
   }

   if (intentos == 3) {
       System.out.println("Demasiados intentos fallidos");
   } else {
       for (intentos = 0; intentos < 3; intentos++) {
           System.out.print("Digite la longitud: ");

           if (lector.hasNextDouble()) {
               longitud = lector.nextDouble();

               if (longitud < 0.1) {
                   System.out.println("No se aceptan valores menores a 0.1");
               } else {
                   intentos = 3;
               }
           } else {
               System.out.println("valor inválido. Ingrese un numero");
               lector.next();
           }
       }

       if (intentos == 3) {
           System.out.println("Demasiados intentos fallidos");
       } else {
           for (intentos = 0; intentos < 3; intentos++) {
               System.out.print("Digite la profundidad: ");

               if (lector.hasNextDouble()) {
                   profundidad = lector.nextDouble();

                   if (profundidad < 0.1) {
                       System.out.println("No se aceptan valores menores a 0.1");
                   } else {
                       intentos = 3;
                   }
               } else {
                   System.out.println("valor inválido. Ingrese un numero");
                   lector.next();
               }
           }

           if (intentos == 3) {
               System.out.println("Demasiados intentos fallidos");
           } else {
               Area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);
               Diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitud, 2) + Math.pow(profundidad, 2));
               volumen = altura * longitud * profundidad;
           }
       }
   }
   return volumen;
}

public static double Tetraedro() {
    System.out.println("Se necesita la arista");

    arista = obtenerValor("arista");

    if (arista > 0.1) {
        Area = Math.pow(arista, 2) * Math.sqrt(3);
        Altura = arista * Math.sqrt(6) / 3;
        volumen = Math.sqrt(2) / 12 * Math.pow(arista, 3);
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return Area;
}

public static double Hexaedro() {
    System.out.println("Se necesita la Arista");

    arista = obtenerValor("arista");

    if (arista > 0.1) {
        Areadelacara = Math.pow(arista, 2);
        areaTotal = 6 * Math.pow(arista, 2);
        volumen = Math.pow(arista, 3);
        Diagonal = arista * Math.sqrt(3);
        areaLateral = 4 * Areadelacara;
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return Areadelacara;
}

public static double Octaedro() {
    System.out.println("Se necesita la arista");

    arista = obtenerValor("arista");

    if (arista > 0.1) {
        areaTotal = 2 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = Math.sqrt(2) / 3 * Math.pow(arista, 3);
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return volumen;
}

public static double Dodecaedro() {
    System.out.println("Se necesita la arista y longitud de los lados");

    arista = obtenerValor("arista");
    longitudLados = obtenerValor("longitud de los lados");

    if (arista > 0.1 && longitudLados > 0.1) {
        areaTotal = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));
        volumen = 1 / 4 * 15 + 7 * Math.sqrt(5) * Math.pow(arista, 3);
        apotema = longitudLados / (2 * Math.tan(36));
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return volumen;
}

public static double Icosaedro() {
    System.out.println("Se necesita la Arista");

    arista = obtenerValor("arista");

    if (arista > 0.1) {
        areaTotal = 5 * Math.pow(arista, 2);
        volumen = (5.0 / 12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
    } else {
        System.out.println("Valores no válidos. No se aceptan valores menores a 0.1");
    }

    return volumen;
    
  }

    }


