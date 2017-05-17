package ru.pavlenty.retrofit17;

/**
 * Created by Acer on 21.04.2017.
 */
import java.util.List;

import ru.pavlenty.retrofit17.AnekdotModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliApi {
    @GET("/api/v1.5/tr.json/translate?key=trnsl.1.1.20170426T143701Z.5557cd4b1aca325d.724a862bb07c2a187c3ab41ceb1650408bf91a8b&lang=ru-en")
    Call<AnekdotModel > getIt(@Query("text") String text);
}
