package br.com.treinamento.singleton;

/**
 * Created by felansu on 10/05/2015.
 */
public class SingletonExemplo {
    static SingletonExemplo singleton = null;

    public synchronized static SingletonExemplo criacao(){
        if (singleton.equals(null)){
            singleton = new SingletonExemplo();
        }
        return singleton;
    }

}
