package controllersWeb;

import controller.ControllerRetrofit;
import interfaceAPI.MetodKotirovki;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OutPrise extends HttpServlet {
    List<List<Double>> postsBTCUSD;
    List<List<Double>> postsETHUSD;
    List<List<Double>> postsETHBTC;
    List<List<Double>> postsLTSUSD;
    List<List<Double>> postsLTCBTC;
    List<List<Double>> prAskBTSUSD;
    List<List<Double>> prAskETHUSD;
    List<List<Double>> prAskETHBTC;
    List<List<Double>> prAskLTCUSD;
    List<List<Double>> prAskLTCBTC;
    ControllerRetrofit controllerRetrofit;
    MetodKotirovki metodKotirovki;
    String valuta ="BTC_USD";
    String valuta2="ETH_USD";
    String valuta3="ETH_BTC";
    String valuta4="LTC_USD";
    String valuta5="LTC_BTC";
    String birga="EXmo";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        postsBTCUSD=new ArrayList<>();
        postsETHUSD=new ArrayList<>();
        postsETHBTC=new ArrayList<>();
        postsLTSUSD=new ArrayList<>();
        postsLTCBTC=new ArrayList<>();
        prAskBTSUSD=new ArrayList<>();
        prAskETHUSD=new ArrayList<>();
        prAskETHBTC=new ArrayList<>();
        prAskLTCUSD=new ArrayList<>();
        prAskLTCBTC=new ArrayList<>();
        controllerRetrofit=new ControllerRetrofit();
        metodKotirovki=controllerRetrofit.getCotirovki();

        resp.setIntHeader("Refresh", 1);
      //  resp.setContentType("text/html");
        Date currentDateTime = new Date();
        req.setAttribute("data1",currentDateTime);

        req.setAttribute("birga",birga);
      //---------------------Exmo BTCUSD
       postsBTCUSD.addAll( metodKotirovki.getResponn(valuta).execute().body().getBTCUSD().getAsk());
       for (int i=0;i<5;i++) {
            prAskBTSUSD.add(i,postsBTCUSD.get(i));
             }
      //  System.out.println(prAsk);
       // System.out.println(posts.toString());

        req.setAttribute("valuta",valuta);
        req.setAttribute("cont",prAskBTSUSD);
        //---------------------------------------
        //---------------------Exmo ETHUSD
        postsETHUSD.addAll( metodKotirovki.getResponn2(valuta2).execute().body().getETHUSD().getAsk());
        for (int i=0;i<5;i++) {
            prAskETHUSD.add(i,postsETHUSD.get(i));
        }
        //  System.out.println(prAsk);
        // System.out.println(posts.toString());


        req.setAttribute("valuta2",valuta2);
        req.setAttribute("cont2",prAskETHUSD);
        //---------------------------------------
        //---------------------Exmo ETH_BTC
        postsETHBTC.addAll( metodKotirovki.getResponn3(valuta3).execute().body().getETHBTC().getAsk());
        for (int i=0;i<5;i++) {
            prAskETHBTC.add(i,postsETHBTC.get(i));
        }
        //  System.out.println(prAsk);
        // System.out.println(posts.toString());


        req.setAttribute("valuta3",valuta3);
        req.setAttribute("cont3",prAskETHBTC);
        //---------------------------------------
        //---------------------Exmo LTC_USD
        postsLTSUSD.addAll( metodKotirovki.getResponn4(valuta4).execute().body().getLTCUSD().getAsk());
        for (int i=0;i<5;i++) {
            prAskLTCUSD.add(i,postsLTSUSD.get(i));
        }
        //  System.out.println(prAsk);
        // System.out.println(posts.toString());


        req.setAttribute("valuta4",valuta4);
        req.setAttribute("cont4",prAskLTCUSD);
        //---------------------------------------
        //---------------------Exmo LTC_BTC
        postsLTCBTC.addAll( metodKotirovki.getResponn5(valuta5).execute().body().getLTCBTC().getAsk());
        for (int i=0;i<5;i++) {
            prAskLTCBTC.add(i,postsLTCBTC.get(i));
        }
        //  System.out.println(prAsk);
        // System.out.println(posts.toString());


        req.setAttribute("valuta5",valuta5);
        req.setAttribute("cont5",prAskLTCBTC);
        //---------------------------------------

        req.getRequestDispatcher("/outPrise.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
