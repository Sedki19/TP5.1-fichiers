package Fichier;

import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter {
	private char lettre;
	public Filter(char lettreDébut) {
	lettre = lettreDébut;
	}
	public boolean accept(File repFiltre, String nom) {
		return nom.charAt(0)==lettre;

	}
	}