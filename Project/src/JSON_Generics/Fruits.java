package JSON_Generics;

public enum Fruits{
	APPLE("APPLE"), PINEAPPLE("PINEAPPLE"), ORANGE("ORANGE"), PEAR("PEAR"), PEACH("PEACH"), APRICOT("APRICOT"), CHERRY("CHERRY"), GRAPE("GRAPE"), PULM("PULM"), MANDARINE("MANDARINE");

	private String text;
	
	Fruits(String string) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public static Fruits fromString(String text) {
        for (Fruits b : Fruits.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
       return null;
    }
	
}
