// Definindo as variáveis necessárias
Var
    despertador_celular: Inteiro
    escovar_dentes: Caractere
    vestir_roupa: Caractere
    tomar_cafe: Caractere

Inicio
    // Definindo os valores das variáveis
    despertador_celular <- 8
    escovar_dentes <- "Sim"
    vestir_roupa <- "Sim"
    tomar_cafe <- "Sim"
    
    // Exibindo os passos a serem feitos
    Escreva("Ao acordar, siga os seguintes passos:")
    Escreva("1. Abra os olhos")
    Escreva("2. Pegue o celular")
    Escreva("3. Desligue o despertador")
    Escreva("4. Levante da cama")

    Se vestir_roupa = "Sim" Então
        Escreva("5. Vista suas roupas")
    FimSe

    Se tomar_cafe = "Sim" Então
        Escreva("6. Prepare uma xícara de café")
        Escreva("7. Pegue uma torrada")
        Escreva("8. Tome seu café")
        Escreva("9. Coma sua torrada")
        Escreva("10. Lave a louça suja")
    FimSe
        
    Se escovar_dentes = "Sim" Então
        Escreva("11. Pegue sua escova")
        Escreva("12. Pegue a pasta de dente")
        Escreva("13. Passe a pasta de dente na escova")    
        Escreva("14. Escove os dentes")
        Escreva("15. Enxágue a boca")
    FimSe
    
FimAlgoritmo