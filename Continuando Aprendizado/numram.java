class numram{
    public static void main(String arg []){
        int valor=(int)(Math.random()*5);
        if(valor > 0){
            System.out.println("Valor maior que zero = " + valor);
        }
        else{
            System.out.println("Valor menor ou igual = " + valor);
        }
    }
}