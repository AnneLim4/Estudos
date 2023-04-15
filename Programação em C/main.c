struct Lista* pilhaParaLista(struct Pilha* p) {

assert(p != NULL);

struct Pilha* aux = criar();

struct Lista* li = criar();

 

while(vazia(p) == false) {

empilhar(aux, desempilhar(p));

}

 

while(vazia(aux) == false) {

int elemento = desempilhar(aux);

empilhar(p, elemento);

inserir(li, 0, elemento);

}

 

liberar(aux);

return li;

}
