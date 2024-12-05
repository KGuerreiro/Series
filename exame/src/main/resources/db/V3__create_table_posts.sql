CREATE TABLE IF NOT EXISTS posts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,        
    text TEXT NOT NULL,                            
    created_at DATETIME NOT NULL,                 
    user_id BIGINT NOT NULL,                      
    serie_id BIGINT NOT NULL,                    
    FOREIGN KEY (user_id) REFERENCES users(id),  
    FOREIGN KEY (serie_id) REFERENCES series(id) 
)