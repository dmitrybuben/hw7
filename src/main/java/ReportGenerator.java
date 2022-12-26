class ReportGenerator {
    public Report generateReport(ReportType type){
        return switch (type){
            case CommonReport -> new CommonReport();
            case DetailedReport -> new DetailedReport();
        };
    }
}
