package br.unifei.imc;

import br.unifei.imc.model.Game;
import br.unifei.imc.model.Platform;
import br.unifei.imc.model.Publisher;
import br.unifei.imc.service.ServiceGame;
import br.unifei.imc.util.Csvutils;
import org.apache.commons.lang3.StringUtils;

import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Game> allGamesList = Csvutils.readGameCsv(Paths.get("vendas-games.csv"));

//        for(int i=0; i < allGamesList.size(); i++){
//            System.out.println(allGamesList.get(i).getName());
//        }

//        List<Game> Ps4Games = ServiceGame.getListByPlatform(allGamesList, Platform.PS4);
//        Ps4Games.forEach(g-> System.out.println(g.getName()));
//
//        List<Game> XboxGames = ServiceGame.getListByPlatform(allGamesList, Platform.XB);
//        XboxGames.forEach(g-> System.out.println(g.getName()));

        List<Game> Nintendo = ServiceGame.getListByPublisher(allGamesList, Publisher.Nintendo);
        Nintendo.forEach(g-> System.out.println(g.getName()));

//        allGamesList.forEach((g -> System.out.println(g.getName())));
//        System.out.println(allGamesList.size());

    }

}
