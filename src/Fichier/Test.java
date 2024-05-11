package Fichier;

import java.io.File;
import java.io.*;
import static java.lang.System.*;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws IOException {
		out.println("Répertoire courant : "+System.getProperty("user.dir"));
		File rep = new File(".");
		System.out.println("Chemin relatif : "+ rep.getPath() );
		out.println("Chemin absolu : " + rep.getAbsolutePath());

		for (File element: rep.listRoots())
		out.println("Racine : "+element);

		for (File element : rep.listFiles() )
		if (element.isDirectory()) {
		out.print(element.getName()+"\t");
		if (element.getName().length()<8)
		out.print("\t");
		out.println("<REP>");
		}
		for (File element : rep.listFiles(new Filter('.')))
		if (element.isFile()){
		out.print(element.getName()+"\t");
		if (element.getName().length()<8) out.print("\t");
		out.printf("%tc", new Date(element.lastModified()));
		out.printf("\t%10d octets\n", element.length());
		}
		}



}
