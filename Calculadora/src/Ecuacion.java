public class Ecuacion {
        Integer A;
        Integer B;
        Integer C;

        Ecuacion(int A,int B, int C){
            this.A=A;
            this.B=B;
            this.C=C;
        }
        public void calcularEcuacion(){
            double raizFinal=Math.sqrt((Math.pow(B,2))-(4*(A*C)));
            double raiz_uno=(-B-raizFinal)/(2*A);
            double raiz_dos=(-B+raizFinal)/(2*A);
            System.out.println("El valor de X1 es: "+raiz_uno+" y el valor de X2 es: "+raiz_dos);
        }

}
