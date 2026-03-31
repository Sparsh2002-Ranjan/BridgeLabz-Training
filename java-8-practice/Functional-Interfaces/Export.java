interface Exportable {
    void export();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class CSVReport implements Exportable {
    public void export() {
        System.out.println("Exported to CSV");
    }
}

class PDFReport implements Exportable {
    public void export() {
        System.out.println("Exported to PDF");
    }
}

public class Export {
    public static void main(String[] args) {
        Exportable csv = new CSVReport();
        Exportable pdf = new PDFReport();

        csv.export();
        pdf.export();

        csv.exportToJSON();
        pdf.exportToJSON();
    }
}
