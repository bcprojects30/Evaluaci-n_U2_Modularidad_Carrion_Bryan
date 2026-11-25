public class Carrion_P2 {
    static int pot(int b, int e) { if (e == 0) return 1; return b * pot(b, e - 1); }
    public static void main(String[] args) {
        System.out.println(pot(3, 4));
    }
}
//La traza de llamadas o bueno las llamadas que haria el metodo pot serian asi en orden ascendente
/*pirmera llamada: el pot retornaria 3 porque al llegar al caso base se multiplicaria 3*1 = 3
en la segunda llamada el metodo retornaria 9 porque se multiplica el valor de b que es 3 por el return de la llamda anterior que nos dio 3 
y en esta segunda llamda el return seria 9 porque 3*3 = 9
En la tercera llamada se multiplica 3*9 ya que nuestra b sigue siendo 3 y el return de la llamada anterior era 9 dandonos 3*9 = 27
y en la ultima llamada la funcion multiplica 3*27 dandonos 81 y aqui se detiene el metodo
el metodo solo realiza 4 llamadas porque es lo que le toma llegar al caso base ya que en cada llamada a 4 se le resta 1 hasta que se hace 0 cumpliendo la condicion del caso base */
