package interfaceAPI;


import pojoExmo.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface MetodKotirovki {

    @GET("order_book/")
    Call<Exmo> getResponn(@Query("pair") String stre);

    @GET("order_book/")
    Call<Exmo2> getResponn2(@Query("pair") String stre);

    @GET("order_book/")
    Call<Exmo3> getResponn3(@Query("pair") String stre);

    @GET("order_book/")
    Call<Exmo4> getResponn4(@Query("pair") String stre);

    @GET("order_book/")
    Call<Exmo5> getResponn5(@Query("pair") String stre);
}
