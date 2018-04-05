package mvpproject.com.mbox.mvpproject.data;

import io.reactivex.Flowable;
import mvpproject.com.mbox.mvpproject.data.model.MovieNowPlayingModel;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDBApiInterface {

    String API_KEY = "api_key";

    @GET("movie/now_playing")
    Flowable<MovieNowPlayingModel> getMovieNowPlaying(@Query(API_KEY) String apiKey);

}
