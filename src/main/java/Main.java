import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map m = new HashMap();
        String str = "oi! como voce está? espero que esteja bem";

        for(char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x); // conta quantas letras tem. por ex dois b etc
                m.put(x, old+1);
            }
            else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        m.remove('!');
        m.remove('?');
        System.out.println(m);
    }
}
