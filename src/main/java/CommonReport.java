public class CommonReport extends Report{
    @Override
    public ReportFormat getFormat() {
        return super.getFormat();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public ReportType getType() {
        return super.getType();
    }

    public CommonReport() {
        this.name = getName();
        this.format = getFormat();
        this.type = getType();
    }

    @Override
    public String toString() {
        return "CommonReport{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", format=" + format +
                '}';
    }
}
