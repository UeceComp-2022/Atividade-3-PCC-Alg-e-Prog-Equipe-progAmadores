-- Criação da tabela "Tarefa" para armazenar informações sobre tarefas
CREATE TABLE IF NOT EXISTS Tarefa (
    
    -- Coluna "id" que será a chave primária autoincrementada (sempre soma 1 a cada registro incluído)
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    
    -- Coluna "titulo" para armazenar o título da tarefa (não pode ser nulo)
    titulo TEXT NOT NULL,
    
    -- Coluna "descricao" para armazenar a descrição da tarefa (não pode ser nulo)
    descricao TEXT NOT NULL
);

