package main;

import controller.ControllerRetrofit;
import interfaceAPI.MetodKotirovki;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    static List<List<Double>> posts;
    static List<List<Double>> prAsk;


    public static void main(String[] args) throws IOException {
        String valuta2="ETH_USD";
        String valuta="BTC_USD";

        prAsk=new ArrayList<>();
        MetodKotirovki metodKotirovki;
        posts=new ArrayList<>();
        ControllerRetrofit controllerRetrofit=new ControllerRetrofit();

        metodKotirovki=controllerRetrofit.getCotirovki();


        // posledovatelno
       Response response = metodKotirovki.getResponn(valuta2).execute();
       System.out.println(response.body().toString());
        System.out.println("22222");

        posts.addAll( metodKotirovki.getResponn(valuta).execute().body().getBTCUSD().getAsk());
       // System.out.println(metodKotirovki.getResponn().execute().body().users.get(0).guid);
        System.out.println(posts.toString());

        for (int i=0;i<5;i++) {
            prAsk.add(i,posts.get(i));
        }
      //  System.out.println(prAsk);

        // parallelno
      /*   metodKotirovki.getResponn().enqueue(new Callback<List<Cotirovki>>() {
            @Override
            public void onResponse(Call<List<Cotirovki>> call, Response<List<Cotirovki>> response) {
                    posts.addAll( response.body());
            }

            @Override
            public void onFailure(Call<List<Cotirovki>> call, Throwable t) {
                t.printStackTrace();
            }

            });*/

          //  posts.addAll((Collection<? extends Exmo>) response.body());
          //  posts.addAll((Collection<? extends Exmo>) response.body());
       // System.out.println(response.body());
        //System.out.println(response);

       // posts.addAll((Collection<? extends Cotirovki>) response.body());

//      MetodKotirovki response = (MetodKotirovki) controllerRetrofit;
        System.out.println("111111");
       // System.out.println(response.body().toString());
      /*  if (posts.size()!=0) {
            System.out.println(posts.get(1).getDesc());
            System.out.println("1");
            System.out.println(posts.get(1).getElementPureHtml());
            System.out.println("2");
            System.out.println(posts.get(1).getLink());
            System.out.println("3");
            System.out.println(posts.get(1).getName());
            System.out.println("4");
            System.out.println(posts.get(1).getSite());
        } else System.out.println("Errors posts");*/
       // System.out.println(posts.get(0).);
    }


}
