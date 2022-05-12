package org.lang;

public class StatesDetails {
  private void southIndia() {
     System.out.println("tamilLanguage,englishLanguage");
}
  private void NorthIndia() {
  System.out.println("hindiLanguage,englishLanguage");
}
  public static void main(String[] args) {
    StatesDetails Bilingualpercentage = new StatesDetails();
	Bilingualpercentage.southIndia();
	
	LanguageInfo p= new LanguageInfo();
	p.tamilLanguage();
	p.englishLanguage_South();
	
	Bilingualpercentage.NorthIndia();
	LanguageInfo q= new LanguageInfo();
	
	p.hindiLanguage();
	p.englishLanguage_North();
}
}

