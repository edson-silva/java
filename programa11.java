
// Os efeitos colaterais podem ser importantes

class SideEffects {

public static void main(String args[]) {

int i;
i = 0;
/* Aqui i e incrementada mesmo que a instrução if seja falsa. */

if(false & (++i < 100))
System.out.println(" Este não será mostrado");

System.out.println("A aplicação irá executar: " + i); // exibe 1

/* nesse caso, i não é incrementada porque o operador de curto-curto circuito ignora o incremento. */

if(false && (++i < 100))

System.out.println("Este não será mostrado ");
System.out.println(" A aplicação irá executar: " + i); // continua exibindo 1 !! //

}

}