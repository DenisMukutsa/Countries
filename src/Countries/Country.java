package Countries;

public class Country {
    private String name;
    private int square;
    private int population;
    private String capital;
    private int populationCapital;

    public Country(String name,  int square, int population) {

        setName(name);
        setSquare(square);
        setPopulation(population);
        this.capital = "столица отсутствует";

    }

    public Country(String name, int square, int population, String capital) {

        this(name, square, population);
        setCapital(capital);

    }

    public Country(String name, int square, String capital) {

            setName(name);
            setSquare(square);
            setCapital(capital);

    }

    public Country(String name, int square, String capital, int populationCapital) {

            this(name, square, capital);
            setPopulationCapital(populationCapital);

    }


    public Country(String name, int square, int population, String capital, int populationCapital) {

            this(name, square, population, capital);
            setPopulationCapital(populationCapital);

    }

    public String getName() {
        return name;
    }

    public int getSquare() {
        return square;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationCapital() {
        return populationCapital;
    }

    public void setName(String name) {
        if(name != null && !name.equals("")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setSquare(int square) {
        if (square > 0) {
            this.square = square;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setPopulation(int population) {
        if(population > 0) {
            this.population = population;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setCapital(String capital) {
        if(capital != null && !capital.equals(" ")) {
            this.capital = capital;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setPopulationCapital(int populationCapital) {
        this.populationCapital = populationCapital;
    }

    public void print() {
        if(population == 0 && populationCapital == 0) {
            System.out.println("Название страны: " + name + ", площадь страны: " + square + " кв. км., размер населения страны: не известно, столица: " + capital + ", количество жителей столицы: не известно");
        }
        else if(population == 0) {
            System.out.println("Название страны: " + name + ", площадь страны: " + square + " кв. км., размер населения страны: не известно, столица: " + capital + ", количество жителей столицы:" + populationCapital + " чел.");
        }
        else if(populationCapital == 0) {
            System.out.println("Название страны: " + name + ", площадь страны: " + square + " кв. км., размер населения страны: " + population + " чел., столица: " + capital + ", количество жителей столицы не известно");
        }
        else {
            System.out.println("Название страны: " + name + ", площадь страны: " + square + " кв. км., размер населения страны: " + population + " чел., столица: " + capital + ", количество жителей столицы: " + populationCapital + " чел.");
        }
    }

    public static void printAll(Country[] countries) {
        for(Country country : countries) {
            country.print();
        }
    }
}
