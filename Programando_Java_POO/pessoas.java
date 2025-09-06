class pessoas {
    String nome;
    int idade;
    double peso;
    double altura;
    double imc;
 
    String calculoIMC() {
        imc = peso / (altura * altura);
        if(imc < 18.5){
            return "Você está abaixo do peso ideal";
        } else if(imc >= 18.5 && imc < 24.50){
            return "Você está em seu peso ideal";
        } else if(imc >= 25 && imc < 30){
            return "Você está acima do peso ideal";
        } else if(imc >= 30 && imc < 35){
            return "Obesidade grau I";
        } else if(imc >= 35 && imc < 40){
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}