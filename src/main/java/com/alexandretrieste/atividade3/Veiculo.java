/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.atividade3;

/**
 *
 * @author xande
 */
public abstract class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo() {
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.velocMax = 0;
        this.qtdRodas = 0;
        motor = new Motor();
    }

    public String getPlaca() {
        return placa;
    }
    public final void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public final void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public final void setCor(String color) {
        this.cor = color;
    }
    public float getVelocMax() {
        return velocMax;
    }
    public final void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }
    public int getQtdRodas() {
        return qtdRodas;
    }
    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public Motor getMotor() {
        return motor;
    }
    public abstract float calcVel();
}
