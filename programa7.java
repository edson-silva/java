
// Os efeitos colaterais podem ser importantes.

class SideEffects { 

public static void main(String args[]) {

int i;
i = 0;
/* aqui é incrementada mesmo que a instrução if seja falsa. */

if(false & (++i < 100))

System.out.println("Isto não será mostrado");

System.out.println(" Se a condição for executada:   " + i); // exibe 1

/*






}




}
