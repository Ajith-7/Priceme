package org.lang;

public class LanguageInfo {
	public void tamilLanguage() {
		System.out.println("99%");
}
    public void englishLanguage_South() {
	    System.out.println("70%");    
}
    public void englishLanguage_North() {
	    System.out.println("40%");
    }
    public void hindiLanguage() {
	    System.out.println("100%");
	}    
  public static void main(String[] args) {
	LanguageInfo percentage = new LanguageInfo();
	percentage.tamilLanguage();
	percentage.englishLanguage_North();
	percentage.englishLanguage_South();
	percentage.hindiLanguage();
	
}
}
