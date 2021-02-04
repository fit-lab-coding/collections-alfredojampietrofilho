package fit.core;
import java.util.Map;
import java.util.HashMap;

public class AttendanceHelper {

    public static Map <String, Boolean> random(int alunos, int percent) {

		Map<String, Boolean> lista = new HashMap<String, Boolean>();
		
		int booleano = alunos * percent / 100;
		for(int v = 0; v < alunos; v++) {
			lista.put(String.valueOf(v), v < booleano ? true: false);
		}
		
		return lista;
	}
    
}
