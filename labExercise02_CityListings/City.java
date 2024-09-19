/**
 * 
 */
package labExercise02_CityListings;

/**
 * This is the City class
 */
public class City {

	// Instance variables

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public City() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param cityName
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.setPopulation(population);
		this.countryCapital = countryCapital;
		this.country = country;
	}

	// Getters and setters

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		if (population < 1 || population > 50) {
			System.out.println("Invalid input");
			this.population = 1;
		} else {
			this.population = population;
		}
	}

	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	// toString method

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}

}
