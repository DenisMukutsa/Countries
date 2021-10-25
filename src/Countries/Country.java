package Countries;

public class Country {
    private String name;
    private int square;
    private int population;
    private String capital;
    private int populationCapital;

    public Country(String name,  int square, int population) {
        try {
            setName(name);
            setSquare (square);
            setPopulation(population);
            this.capital = "столица отсутствует";
        }
        catch(NameCountryException e) {
            System.out.println("Укажите наименование страны.");
        }
        catch(SquareCountryException e) {
            System.out.println("Площадь страны не может быть менее 0.");
        }
        catch(PopulationCountryException e) {
            System.out.println("Население страны не может быть менее 0.");
        }
    }

    public Country(String name, int square, int population, String capital, int populationCapital) {
        try {
            setName(name);
            setSquare (square);
            setPopulation(population);
            setCapital(capital);
            setPopulationCapital(populationCapital);
        }
        catch(NameCountryException e) {
            System.out.println("Укажите наименование страны.");
        }
        catch(SquareCountryException e) {
            System.out.println("Площадь страны не может быть менее 0.");
        }
        catch(PopulationCountryException e) {
            System.out.println("Население страны не может быть менее 0.");
        }
    }


    public Country(String name, int square, String capital) {
        try{
            setName(name);
            setSquare(square);
            setCapital(capital);
        }
        catch(NameCountryException e) {
            System.out.println("Укажите наименование страны.");
        }
        catch(SquareCountryException e) {
            System.out.println("Площадь страны не может быть менее 0.");
        }
    }

    public Country(String name, int square, int population, String capital) throws NameCountryException, SquareCountryException, PopulationCountryException {
        try {
            setName(name);
            setSquare (square);
            setPopulation(population);
            setCapital(capital);
        }
        catch(NameCountryException e) {
            System.out.println("Укажите наименование страны.");
        }
        catch(SquareCountryException e) {
            System.out.println("Площадь страны не может быть менее 0.");
        }
        catch(PopulationCountryException e) {
            System.out.println("Население страны не может быть менее 0.");
        }
    }

    public Country(String name, int square, String capital, int populationCapital) {
        try {
            setName(name);
            setSquare(square);
            setCapital(capital);
            setPopulationCapital(populationCapital);
        }
        catch(NameCountryException e) {
            System.out.println("Укажите наименование страны.");
        }
        catch(SquareCountryException e) {
            System.out.println("Площадь страны не может быть менее 0.");
        }
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

    public void setName(String name) throws NameCountryException {
        if(name != null && !name.equals("")) {
            this.name = name;
        }
        else {
            throw new NameCountryException("Не указано наименование страны.");
        }
    }

    public void setSquare(int square) throws SquareCountryException {
        if (square > 0) {
            this.square = square;
        }
        else {
            throw new SquareCountryException("Площадь страны не может быть менее 0.");
        }
    }

    public void setPopulation(int population) throws PopulationCountryException {
        if(population > 0) {
            this.population = population;
        }
        else {
            throw new PopulationCountryException("Население страны не может быть менее 0.");
        }
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationCapital(int populationCapital) {
        this.populationCapital = populationCapital;
    }

    public static void print(Country country) {
        if(country.population == 0 && country.populationCapital == 0) {
            System.out.println("Название страны: " + country.name + ", площадь страны: " + country.square + " кв. км., размер населения страны: не известно, столица: " + country.capital + ", количество жителей столицы: не известно");
        }
        else if(country.population == 0) {
            System.out.println("Название страны: " + country.name + ", площадь страны: " + country.square + " кв. км., размер населения страны: не известно, столица: " + country.capital + ", количество жителей столицы:" + country.populationCapital + " чел.");
        }
        else if(country.populationCapital == 0) {
            System.out.println("Название страны: " + country.name + ", площадь страны: " + country.square + " кв. км., размер населения страны: " + country.population + " чел., столица: " + country.capital + ", количество жителей столицы не известно");
        }
        else {
            System.out.println("Название страны: " + country.name + ", площадь страны: " + country.square + " кв. км., размер населения страны: " + country.population + " чел., столица: " + country.capital + ", количество жителей столицы: " + country.populationCapital + " чел.");
        }
    }

    public static void printAll(Country[] countries) {
        for(int i = 0; i < countries.length; i++) {
            Country.print(countries[i]);
        }
    }
}
