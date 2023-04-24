package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Futbolista futbolista[] = new Futbolista[5];

		futbolista[0] = new Futbolista(0, "Juan", 18, 2);
		futbolista[1] = new Futbolista(0, "Guan", 18, 2);
		futbolista[2] = new Futbolista(1, "Juan", 18, 2);
		futbolista[3] = new Futbolista(2, "Jaime", 7, 9999);
		futbolista[4] = new Futbolista(3, "Pablo", 80, 0);

		for (int i = 0; i < futbolista.length; i++) {
			Futbolista temp;
			for (int j = 0; j < futbolista.length; j++) {
				if (futbolista[i].compareTo(futbolista[j]) > 0) {
					temp = futbolista[i];
					futbolista[i] = futbolista[j];
					futbolista[j] = temp;
				}
			}
		}

		for (int i = 0; i < futbolista.length; i++) {
			System.out.println(futbolista[i]);
			System.out.println();
		}
	}

}
