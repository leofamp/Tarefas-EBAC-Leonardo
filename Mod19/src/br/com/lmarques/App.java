package br.com.lmarques;

public class App {
    public static void main(String[] args) {
    	
        Class<?> tabelaAnnotation = TabelaAnnotation.class;
        ITabela annotations = tabelaAnnotation.getAnnotation(ITabela.class);
        System.out.println(annotations.value());
        System.out.println(TabelaAnnotation.class.getAnnotation(ITabela.class).value());
        
    }
    
}