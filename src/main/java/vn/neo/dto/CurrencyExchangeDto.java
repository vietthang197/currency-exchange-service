package vn.neo.dto;

/**
 * @author thanglv on 3/9/2022
 * @project currency-exchange-service
 */
public class CurrencyExchangeDto {
    private int id;
    private String from;
    private String to;
    private int conversionMultiple;
    private String environment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(int conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
