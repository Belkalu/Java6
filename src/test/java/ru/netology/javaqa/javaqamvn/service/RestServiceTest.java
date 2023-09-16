package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restMonths.csv")

    public void testRestMonths(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        int actual = service.culcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
