import java.util.Date;

public abstract class Report {
    protected String name;
    protected ReportType type;
    protected ReportFormat format;

    public ReportFormat getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }

    public ReportType getType() {
        return type;
    }
}
