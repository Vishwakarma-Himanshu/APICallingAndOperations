package com.example.demo.model;

public class Country {

	private String name;
	private String capital;
	private String[] altSpellings;
	private String relevance;
	private String region;
	private String subregion;
	private String[] translation;
	private String population;
	private double[] latlng;
	
	private String demonyn;
	private double area;
	private String gini;
	private String[] timezones;
	private String[] callingCodes;
	private String[] topLevelDomain;
	private String alpha2Code;
	private String alpha3Code;
	private String[] currencies;
	private String[] languages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String[] getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRelevance() {
		return relevance;
	}
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public String[] getTranslation() {
		return translation;
	}
	public void setTranslation(String[] translation) {
		this.translation = translation;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	
	public String getDemonyn() {
		return demonyn;
	}
	public void setDemonyn(String demonyn) {
		this.demonyn = demonyn;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double[] getLatlng() {
		return latlng;
	}
	public String getGini() {
		return gini;
	}
	public void setGini(String gini) {
		this.gini = gini;
	}
	public String[] getTimezones() {
		return timezones;
	}
	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}
	public String[] getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(String[] callingCodes) {
		this.callingCodes = callingCodes;
	}
	
	public String[] getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(String[] topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public String[] getCurrencies() {
		return currencies;
	}
	public void setCurrencies(String[] currencies) {
		this.currencies = currencies;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	public void setLatlng(double[] latlng) {
		this.latlng = latlng;
	}
	
	
}
