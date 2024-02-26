package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.WindowConstants;

import model.*;
import model.metodoak.JFrameSortu;
import model.sql.ConexioaSQL;
import view.*;

public class APP {
	public static void main(String[] args) {
		ConexioaSQL.datuakKargatu();
		JFrameSortu.hasieraAukera();
	}
}