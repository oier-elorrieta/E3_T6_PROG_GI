package controller;

import model.metodoak.JFrameSortu;
import model.sql.ConexioaSQL;

public class APP {
	public static void main(String[] args) {
		ConexioaSQL.datuakKargatu();
		JFrameSortu.hasieraAukera();
	}
}
	