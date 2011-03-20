package ea1;

class ZahlAusdenken {
	public static void main(String[] args) {
		int startzahl = Integer.parseInt(args[0]);
		int ergebnis = startzahl;
		if (ergebnis > 0) {
			ergebnis = ergebnis + 2;
		} else {
			ergebnis = ergebnis * (-1) + 2;
		}
		while (ergebnis > 2) {
			ergebnis = ergebnis - 2;
		}
		int arbeiten = 4;
		for (int i = 2; i <= 20; i = i + 2) {
			arbeiten = arbeiten + startzahl;
		}
		switch (ergebnis) {
		case 0:
			System.out.println("Das kann nicht sein!");
			break;
		case 1:
			System.out.println("Die urspruengliche Zahl war ungerade!");
			break;
		case 2:
			System.out.println("Die urspruengliche Zahl war gerade!");
			break;
		default:
			System.out.println("Fehler!");
		}
		System.out.println("startzahl = " + startzahl);
	}
}