public class MovieManager {
    //global variables
    List<Movie> Movies = MovieManager.getMovies();
    @BeforeClass //method TODO
    @Before //method TODO
    @After //method TODO
    @AfterClass //method TODO
    @Test
    public void nameNullTest() {
        String name = null;
        String country = "Xy";
        int currentNumberOfMovies = Movies.size();
        try{
            Movie newMovie = MovieManager.createMovie(name, country);
            fail();
        } catch (Exception exception) {} }
    @Test
    public void nameEmptyTest() {
        String name = "";
        String country = "Xy";
        int currentNumberOfMovies = Movies.size();
        try{
            Movie newMovie = MovieManager.createMovie(name, country);
            fail();
        } catch (Exception exception) {} }
    @Test
    public void countryNullTest() {
        String name = "yX";
        String country = null;
        int currentNumberOfMovies = Movies.size();
        try{
            Movie newMovie = MovieManager.createMovie(name, country);
            fail();
        } catch (Exception exception) {} }
    @Test
    public void countryEmptyTest() {
        String name = "yX";
        String country = "";
        int currentNumberOfMovies = Movies.size();
        try{
            Movie newMovie = MovieManager.createMovie(name, country);
            fail();
        } catch (Exception exception) {} }
    @Test
    public void createMovieValidEquivalenceClassesTest() {
        String name = "yX";
        String country = "Xy";
        int currentNumberOfMovies = Movies.size();
        try{
            Movie newMovie = MovieManager.createMovie(name, country);
        } catch (Exception exception) {
            fail(); }
        int expectedNumberOfMovies = currentNumberOfMovies + 1;
        assertNotNull(newMovie);
        assertEquals(name, newMovie.getName());
        assertEquals(country, newMovie.getCountry());
        assertEquals(expectedNumberOfMovies, Movies.size()); }
}