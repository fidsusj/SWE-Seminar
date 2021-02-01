Contract MovieManagment {
    Scalar Integer numberOfMovies;
    Scalar Timer add_timer;
    Scalar Timer remove_timer;
    Observability Boolean HasMovie(Movie item);
    Responsibility AddMovie(Movie item) {
        Pre(HasMovie(item) == false);
        add_timer.Start(item);
        Execute();
        add_timer.Stop(item);
        numberOfMovies = numberOfMovies + 1;
        Post(HasMovie(item) == true); }
    Responsibility RemoveMovie(Movie item) {
        Pre(HasMovie(item) == true);
        remove_timer.Start(item);
        Execute();
        remove_timer.Stop(item);
        numberOfMovies = numberOfMovies - 1;
        Post(HasMovie(item) == false); }
    Scenario AddRemoveMovie {
        once Scalar Movie x;
        Trigger(AddMovie(x)), Terminate(RemoveMovie(x)); }
    Scenario Lifetime {
        Trigger(new()), (Add(dontcare)|Remove(dontcare))*, 
        Terminate(finalize()); }
    Metric List Integer TimesToAddMovie() {
        add_timer.Values();  }
    Metric List Integer TimesToRemoveMovie() {
        remove_timer.Values(); }
    Reports {
        ReportAll("The average add time is: {0}", 
        AvgMetric(TimesToAddMovie()));
        ReportAll("The average remove Time is: {0}", 
        AvgMetric(TimesToRemoveMovie()));}
    Exports {
        Type Movie { not context; } }
}