package br.unifei.imc.util;

import br.unifei.imc.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Csvutils {

    public static List<Game> readGameCsv(Path csvFilePath){

        List gameList = new ArrayList<>();
                                                //csvFilePath e o caminho onde se encontra o arquivo
                                                //nesse exemplo e um instancia de Path do pacote java.nio
        try {

            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            gameList = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameList;
    }



}
