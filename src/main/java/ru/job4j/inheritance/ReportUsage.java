package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        //ввели объект
        TextReport report = new TextReport();
        HtmlReport report1 = new HtmlReport();

        //вызов метода из файла ТехтРепорт
        String text = report.generate("Блалала", "алаолвоаыдоадфоывдлао");
        System.out.println(text);
    }
}
