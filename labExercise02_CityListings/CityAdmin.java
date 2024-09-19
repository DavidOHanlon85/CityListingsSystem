/**
 * 
 */
package labExercise02_CityListings;

/**
 * This is CityAdmin - a test driver for the City Class
 */
public class CityAdmin {

	public static void main(String[] args) {

		// Create the cities
		
		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");
		
		// Add cities to an array
		
		City[] cities = new City[] {c1, c2, c3, c4, c5, c6};
		
		// Display all cities
		
		displayAllCities(cities);
		
		// Smallest population
		
		int smallestPopulation = smallestPopulation(cities);
		
		System.out.println("The smallest population : " +smallestPopulation + " million.");
		System.out.println();
		
		// Capital City Search
		
		System.out.println("Capital City Search : ");
		
		isItACapital(cities);
		
		System.out.println();
		
		// Cities in USA
		
		String targetCountry = "USA";
		
		System.out.println("Cities in " + targetCountry + " : ");
		
		citiesInACountry(cities, targetCountry);
		
		// Average Population (2 decimal places)
		
		double average;
		
		average = averagePopulation(cities);
		System.out.printf("Average population is : %.2f", average);
		
	}

	/**
	 * This method calculates the average population and returns this value
	 * @param cities
	 * @return
	 */
	public static double averagePopulation(City[] cities) {
		double average;
		double total = 0;
	
		for (int i = 0; i < cities.length; i++) {
			total += cities[i].getPopulation();
		}
		
		average = total / cities.length;
		return average;
	}

	/**
	 * This method prints the cities (in the array) in the target country
	 * @param cities
	 * @param targetCountry
	 */
	public static void citiesInACountry(City[] cities, String targetCountry) {
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].getCountry().equalsIgnoreCase(targetCountry)) {
				System.out.println(cities[i].getCityName());
			}
		}
		
		System.out.println();
	}

	/**
	 * This method identifies the capital cities and prints them to the console
	 * @param cities
	 */
	public static void isItACapital(City[] cities) {
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].isCountryCapital()) {
				System.out.println(cities[i].getCityName() + ", " + cities[i].getCountry());
			}
		}
	}

	/**
	 * This method returns the smallest population
	 * @param cities
	 * @return
	 */
	public static int smallestPopulation(City[] cities) {
		System.out.println("Outputting the smallest population : ");
		
		int smallestPopulation = cities[0].getPopulation();
		
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].getPopulation() < smallestPopulation) {
				smallestPopulation = cities[i].getPopulation();
			}
		}
		return smallestPopulation;
	}

	/**
	 * This method displays all city information for the cities in the array
	 * 
	 * @param cities
	 */
	public static void displayAllCities(City[] cities) {
		System.out.println("Displaying all city information");
		System.out.println();
		for (City city : cities) {
			System.out.println(city.toString());
		}
		System.out.println();
	}

}
