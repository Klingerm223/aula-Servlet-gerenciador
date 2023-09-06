
import java.util.ArrayList;
import java.util.List;

import br.com.alura.gerenciador.Empresa;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();

    public void adiciona(Empresa empresa) { 
        lista.add(empresa);
    }
    public List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }

}