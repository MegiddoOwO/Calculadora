public class Identidad {
    Integer A;
    Integer B;
    Integer potencia;

    Identidad(int A, int B, int potencia) {
        this.A = A;
        this.B = B;
        this.potencia = potencia;
    }

    public void obtenerCuadrado() {
        switch (potencia) {
            case 0:
                System.out.println("El exponente no puede ser 0");
                break;
            case 1:
                System.out.println("El resultado de tu suma es el mismo ya que el exponente es 1");
                break;
            case 2:
                System.out.println("La suma de de tus valores al cuadrado es: " + (int) Math.pow(A, 2) + "+" + 2 * (A * B) + "+" + (int) Math.pow(B, 2));
                break;
            case 3:
                System.out.println("La suma de de tus valores al cubo es: " + (int) Math.pow(A, 3) + "+" + (int) (3 * (Math.pow(A, 2) * B)) + "+" + (int) (3 * (A * Math.pow(B, 2))) + "+" + (int) Math.pow(B, 3));
                break;
            case 4:
                System.out.println("La suma de de tus valores a la potencia cuatro es: " + (int) Math.pow(A, 4) + "+" + (int) (4 * (Math.pow(A, 3) * B)) + "+" + (int) (6 * (Math.pow(A, 2) * Math.pow(B, 2))) + "+" + (int) (4 * (A * Math.pow(B, 3))) + "+" + (int) Math.pow(B, 4));
                break;
            default:
                System.out.println("El valor ingresado esta fuera del rango");
        }
    }
}
