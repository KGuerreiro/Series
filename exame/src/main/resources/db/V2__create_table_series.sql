CREATE TABLE IF NOT EXISTS series (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,        
    nome VARCHAR(255) NOT NULL,                  
    genero VARCHAR(255) NOT NULL,                
    ano_lancamento INT NOT NULL,                 
    quantidade_temporadas INT NOT NULL,          
    classificacao_indicativa VARCHAR(50) NOT NULL, 
    created_at DATETIME NOT NULL,                
);
