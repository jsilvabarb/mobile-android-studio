package com.example.pizzariapalestra;

public class Pizza {

    private int imgFolderDrawable;
    private String pizza;
    private String preco;

    //Construtor da Classe
    public Pizza(int imgFolderDrawable, String pizza, String preco) {
        this.imgFolderDrawable = imgFolderDrawable;
        this.pizza = pizza;
        this.preco = preco;
    }

    public int getImgFolderDrawable() {
        return imgFolderDrawable;
    }

    public void setImgFolderDrawable(int imgFolderDrawable) {
        this.imgFolderDrawable = imgFolderDrawable;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
