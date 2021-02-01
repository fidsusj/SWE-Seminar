Contract MovieManagment {
    Scalar Integer numberOfMovies;
    Observability Boolean HasMovie(Movie item);
    Responsibility AddMovie(Movie item) {
        Pre(HasMovie(item) == false);
        Execute();
        numberOfMovies = numberOfMovies + 1;
        Post(HasMovie(item) == true); }
    Responsibility RemoveMovie(Movie item) {
        Pre(HasMovie(item) == true);
        Execute();
        numberOfMovies = numberOfMovies - 1;
        Post(HasMovie(item) == false); }
    Exports {
        Type Movie { not context; } } 
}
