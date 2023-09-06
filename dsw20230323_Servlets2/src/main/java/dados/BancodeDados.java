package dados;

import java.util.ArrayList;
import java.util.List;

import entidades.Aluno;


public class BancodeDados  {
	private static List<Aluno> bd = new ArrayList<Aluno>();
	
	public static void insert(Aluno a) {
		bd.add(a);
	}
       
    public static List<Aluno> selectAll(){
    	return bd;
    }

}
