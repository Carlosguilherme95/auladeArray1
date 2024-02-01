public class Main {
    public static void main(String[] args) {
        double[] temperaturas = new double[5];

                temperaturas[0] = 30;
                temperaturas[1] = 25.5;
                temperaturas[2]= 23.3;
                temperaturas[3]= 24.5;
                temperaturas[4]= 30.1;
                for(int i = 0; i < temperaturas.length; i++){
                    System.out.println(temperaturas[i]);
                }
                for(double temp: temperaturas){
                    System.out.println(temp);
                }
    }
}