public class Contador {
    public static void main(String[] args)  {

        int parametroUm = Integer.parseInt(args[0]);
        int parametroDois = Integer.parseInt(args[1]);

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois){
            int resultado = parametroDois - parametroUm;

            for(int i = 1; i <= resultado; i++){
                System.out.println(i);
            }
        } else{
            throw new  ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");


        }

    }

}
