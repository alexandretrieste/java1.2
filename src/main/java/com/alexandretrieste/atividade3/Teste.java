/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alexandretrieste.atividade3;

/**
 *
 * @author xande
 */
public class Teste {
    public static void main(String[] args) {

        Passeio veiculoPasseio1 = new Passeio();
        veiculoPasseio1.setMarca("Ford");
        veiculoPasseio1.setModelo("Mustang");
        veiculoPasseio1.setPlaca("ABC-23145");
        veiculoPasseio1.setVelocMax(250);
        veiculoPasseio1.setQtdRodas(4);
        veiculoPasseio1.setCor("Vermelho");
        veiculoPasseio1.setQtdPassageiros(4);
        veiculoPasseio1.getMotor().setPotencia(460);
        veiculoPasseio1.getMotor().setQtdPist(8);

        Passeio veiculoPasseio2 = new Passeio();
        veiculoPasseio2.setMarca("Chevrolet");
        veiculoPasseio2.setModelo("Camaro");
        veiculoPasseio2.setPlaca("DEF-8426");
        veiculoPasseio2.setVelocMax(300);
        veiculoPasseio2.setQtdRodas(4);
        veiculoPasseio2.setCor("Amarelo");
        veiculoPasseio2.setQtdPassageiros(2);
        veiculoPasseio2.getMotor().setPotencia(650);
        veiculoPasseio2.getMotor().setQtdPist(8);

        Passeio veiculoPasseio3 = new Passeio();
        veiculoPasseio3.setMarca("Audi");
        veiculoPasseio3.setModelo("A4");
        veiculoPasseio3.setPlaca("GHI-9012");
        veiculoPasseio3.setVelocMax(220);
        veiculoPasseio3.setQtdRodas(4);
        veiculoPasseio3.setCor("Azul");
        veiculoPasseio3.setQtdPassageiros(5);
        veiculoPasseio3.getMotor().setPotencia(190);
        veiculoPasseio3.getMotor().setQtdPist(4);

        Passeio veiculoPasseio4 = new Passeio();
        veiculoPasseio4.setMarca("Honda");
        veiculoPasseio4.setModelo("Civic");
        veiculoPasseio4.setPlaca("JKL-8984");
        veiculoPasseio4.setVelocMax(270);
        veiculoPasseio4.setQtdRodas(4);
        veiculoPasseio4.setCor("Preto");
        veiculoPasseio4.setQtdPassageiros(5);
        veiculoPasseio4.getMotor().setPotencia(150);
        veiculoPasseio4.getMotor().setQtdPist(4);

        Passeio veiculoPasseio5 = new Passeio();
        veiculoPasseio5.setMarca("Toyota");
        veiculoPasseio5.setModelo("Corolla");
        veiculoPasseio5.setPlaca("MNO-1212");
        veiculoPasseio5.setVelocMax(200);
        veiculoPasseio5.setQtdRodas(4);
        veiculoPasseio5.setCor("Prata");
        veiculoPasseio5.setQtdPassageiros(5);
        veiculoPasseio5.getMotor().setPotencia(140);
        veiculoPasseio5.getMotor().setQtdPist(4);

        Carga veiculoCarga1 = new Carga();
        veiculoCarga1.setMarca("Scania");
        veiculoCarga1.setModelo("R440");
        veiculoCarga1.setPlaca("DEF7890");
        veiculoCarga1.setVelocMax(120);
        veiculoCarga1.setQtdRodas(8);
        veiculoCarga1.setCor("Branco");
        veiculoCarga1.setCargaMax(25000);
        veiculoCarga1.setTara(8000);
        veiculoCarga1.getMotor().setPotencia(440);
        veiculoCarga1.getMotor().setQtdPist(6);

        Carga veiculoCarga2 = new Carga();
        veiculoCarga2.setMarca("Volvo");
        veiculoCarga2.setModelo("FH460");
        veiculoCarga2.setPlaca("GHI8901");
        veiculoCarga2.setVelocMax(110);
        veiculoCarga2.setQtdRodas(8);
        veiculoCarga2.setCor("Azul");
        veiculoCarga2.setCargaMax(30000);
        veiculoCarga2.setTara(9000);
        veiculoCarga2.getMotor().setPotencia(460);
        veiculoCarga2.getMotor().setQtdPist(6);

        Carga veiculoCarga3 = new Carga();
        veiculoCarga3.setMarca("Mercedes-Benz");
        veiculoCarga3.setModelo("Actros 2546");
        veiculoCarga3.setPlaca("JKL0123");
        veiculoCarga3.setVelocMax(100);
        veiculoCarga3.setQtdRodas(10);
        veiculoCarga3.setCor("Vermelho");
        veiculoCarga3.setCargaMax(35000);
        veiculoCarga3.setTara(10000);
        veiculoCarga3.getMotor().setPotencia(460);
        veiculoCarga3.getMotor().setQtdPist(6);

        Carga veiculoCarga4 = new Carga();
        veiculoCarga4.setMarca("Ford");
        veiculoCarga4.setModelo("Cargo 2428");
        veiculoCarga4.setPlaca("MNO3456");
        veiculoCarga4.setVelocMax(100);
        veiculoCarga4.setQtdRodas(6);
        veiculoCarga4.setCor("Amarelo");
        veiculoCarga4.setCargaMax(15000);
        veiculoCarga4.setTara(5000);
        veiculoCarga4.getMotor().setPotencia(280);
        veiculoCarga4.getMotor().setQtdPist(6);

        Carga veiculoCarga5 = new Carga();
        veiculoCarga5.setMarca("Iveco");
        veiculoCarga5.setModelo("Stralis");
        veiculoCarga5.setPlaca("PQR6789");
        veiculoCarga5.setVelocMax(130);
        veiculoCarga5.setQtdRodas(10);
        veiculoCarga5.setCor("Verde");
        veiculoCarga5.setCargaMax(28000);
        veiculoCarga5.setTara(8500);
        veiculoCarga5.getMotor().setPotencia(460);
        veiculoCarga5.getMotor().setQtdPist(6);


        System.out.println("============= VEICULO PASSEIO =============");
        System.out.println("\nMarca := "+veiculoPasseio1.getMarca());
        System.out.println("Modelo := "+veiculoPasseio1.getModelo());
        System.out.println("Placa := "+veiculoPasseio1.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoPasseio1.calcVel());
        System.out.println("Qtd Passageiros := "+veiculoPasseio1.getQtdPassageiros());
        System.out.println("Quantidade de Rodas := "+veiculoPasseio1.getQtdRodas());
        System.out.println("Cor := "+veiculoPasseio1.getCor());
        System.out.println("Potencia do Motor := "+veiculoPasseio1.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoPasseio1.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO PASSEIO =============");
        System.out.println("\nMarca := "+veiculoPasseio2.getMarca());
        System.out.println("Modelo := "+veiculoPasseio2.getModelo());
        System.out.println("Placa := "+veiculoPasseio2.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoPasseio2.calcVel());
        System.out.println("Qtd Passageiros := "+veiculoPasseio2.getQtdPassageiros());
        System.out.println("Quantidade de Rodas := "+veiculoPasseio2.getQtdRodas());
        System.out.println("Cor := "+veiculoPasseio2.getCor());
        System.out.println("Potencia do Motor := "+veiculoPasseio2.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoPasseio2.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO PASSEIO =============");
        System.out.println("\nMarca := "+veiculoPasseio3.getMarca());
        System.out.println("Modelo := "+veiculoPasseio3.getModelo());
        System.out.println("Placa := "+veiculoPasseio3.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoPasseio3.calcVel());
        System.out.println("Qtd Passageiros := "+veiculoPasseio3.getQtdPassageiros());
        System.out.println("Quantidade de Rodas := "+veiculoPasseio3.getQtdRodas());
        System.out.println("Cor := "+veiculoPasseio3.getCor());
        System.out.println("Potencia do Motor := "+veiculoPasseio3.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoPasseio3.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO PASSEIO =============");
        System.out.println("\nMarca := "+veiculoPasseio4.getMarca());
        System.out.println("Modelo := "+veiculoPasseio4.getModelo());
        System.out.println("Placa := "+veiculoPasseio4.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoPasseio4.calcVel());
        System.out.println("Qtd Passageiros := "+veiculoPasseio4.getQtdPassageiros());
        System.out.println("Quantidade de Rodas := "+veiculoPasseio4.getQtdRodas());
        System.out.println("Cor := "+veiculoPasseio4.getCor());
        System.out.println("Potencia do Motor := "+veiculoPasseio4.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoPasseio4.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO PASSEIO =============");
        System.out.println("\nMarca := "+veiculoPasseio5.getMarca());
        System.out.println("Modelo := "+veiculoPasseio5.getModelo());
        System.out.println("Placa := "+veiculoPasseio5.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoPasseio5.calcVel());
        System.out.println("Qtd Passageiros := "+veiculoPasseio5.getQtdPassageiros());
        System.out.println("Quantidade de Rodas := "+veiculoPasseio5.getQtdRodas());
        System.out.println("Cor := "+veiculoPasseio5.getCor());
        System.out.println("Potencia do Motor := "+veiculoPasseio5.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoPasseio5.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO CARGA =============");
        System.out.println("\nMarca := "+veiculoCarga1.getMarca());
        System.out.println("Modelo := "+veiculoCarga1.getModelo());
        System.out.println("Placa := "+veiculoCarga1.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoCarga1.calcVel());
        System.out.println("Carga Maxima := "+veiculoCarga1.getCargaMax());
        System.out.println("Tara := "+veiculoCarga1.getTara());
        System.out.println("Quantidade de Rodas := "+veiculoCarga1.getQtdRodas());
        System.out.println("Cor := "+veiculoCarga1.getCor());
        System.out.println("Potencia do Motor := "+veiculoCarga1.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoCarga1.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO CARGA =============");
        System.out.println("\nMarca := "+veiculoCarga2.getMarca());
        System.out.println("Modelo := "+veiculoCarga2.getModelo());
        System.out.println("Placa := "+veiculoCarga2.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoCarga2.calcVel());
        System.out.println("Carga Maxima := "+veiculoCarga2.getCargaMax());
        System.out.println("Tara := "+veiculoCarga2.getTara());
        System.out.println("Quantidade de Rodas := "+veiculoCarga2.getQtdRodas());
        System.out.println("Cor := "+veiculoCarga2.getCor());
        System.out.println("Potencia do Motor := "+veiculoCarga2.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoCarga2.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO CARGA =============");
        System.out.println("\nMarca := "+veiculoCarga3.getMarca());
        System.out.println("Modelo := "+veiculoCarga3.getModelo());
        System.out.println("Placa := "+veiculoCarga3.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoCarga3.calcVel());
        System.out.println("Carga Maxima := "+veiculoCarga3.getCargaMax());
        System.out.println("Tara := "+veiculoCarga3.getTara());
        System.out.println("Quantidade de Rodas := "+veiculoCarga3.getQtdRodas());
        System.out.println("Cor := "+veiculoCarga3.getCor());
        System.out.println("Potencia do Motor := "+veiculoCarga3.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoCarga3.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO CARGA =============");
        System.out.println("\nMarca := "+veiculoCarga4.getMarca());
        System.out.println("Modelo := "+veiculoCarga4.getModelo());
        System.out.println("Placa := "+veiculoCarga4.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoCarga4.calcVel());
        System.out.println("Carga Maxima := "+veiculoCarga4.getCargaMax());
        System.out.println("Tara := "+veiculoCarga4.getTara());
        System.out.println("Quantidade de Rodas := "+veiculoCarga4.getQtdRodas());
        System.out.println("Cor := "+veiculoCarga4.getCor());
        System.out.println("Potencia do Motor := "+veiculoCarga4.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoCarga4.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");

        System.out.println("============= VEICULO CARGA =============");
        System.out.println("\nMarca := "+veiculoCarga5.getMarca());
        System.out.println("Modelo := "+veiculoCarga5.getModelo());
        System.out.println("Placa := "+veiculoCarga5.getPlaca());
        System.out.println("Velocidade Maxima := "+veiculoCarga5.calcVel());
        System.out.println("Carga Maxima := "+veiculoCarga5.getCargaMax());
        System.out.println("Tara := "+veiculoCarga5.getTara());
        System.out.println("Quantidade de Rodas := "+veiculoCarga5.getQtdRodas());
        System.out.println("Cor := "+veiculoCarga5.getCor());
        System.out.println("Potencia do Motor := "+veiculoCarga5.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := "+veiculoCarga5.getMotor().getQtdPist()+"\n");
        System.out.println("===========================================");
    }
}
