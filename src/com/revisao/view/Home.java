package com.revisao.view;

import java.util.ArrayList;
import java.util.List;

import com.revisao.entity.Usuario;

public class Home {

	public static void main(String[] args) {
		List<Usuario> usu = new ArrayList<>();
		usu.add(new Usuario(1, "JOAO", true));
		usu.add(new Usuario(2, "Maria", false));

		usu.forEach(u -> {
			System.out.println(u);
		});
		
		
		//Removendo o primeiro da lista
		usu.remove(0);
		System.out.println("exibindo informações :"+usu);
	}

}
