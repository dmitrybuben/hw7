public class App {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        Report report = reportGenerator.generateReport(ReportType.CommonReport);
        System.out.println(report);
    }
}
