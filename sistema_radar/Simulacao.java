package sistema_radar;

public class Simulacao {
    public static void main(String[] args){
        System.out.println("Simulação");

        carro polo = new Carro();
        polo.ano = 2025;
        polo.modelo = "TSI";
        polo.placa = "RAVX200";
        polo.velocidade = 0;

        radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistão Sul";

        radar.avaliarVelocidade(polo);

        polo.acelerar(); // 10
        polo.acelerar();
        polo.acelerar();
        polo.acelerar();
        polo.acelerar();
        polo.acelerar();
        polo.acelerar(); // 70

        radar.avaliarVelocidade(polo);

    }
    
}
