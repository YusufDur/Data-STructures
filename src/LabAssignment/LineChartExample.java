package LabAssignment;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChartExample extends JFrame {

    private static final long serialVersionUID = 1L;
    int [] length ;
    double [] time;

    public LineChartExample(String title , int[] length , double[] time) {
        super(title);
        this.length = length;
        this.time = time;
        // Create dataset  
        DefaultCategoryDataset dataset = createDataset();
        // Create chart  
        JFreeChart chart = ChartFactory.createLineChart(
                "Algorithm Comparison", // Chart title  
                "Length of Array", // X-Axis Label  
                "Running Time", // Y-Axis Label  
                dataset
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private DefaultCategoryDataset createDataset() {

        String series1 = "Algoritm Running Time";
//        String series2 = "Unique Visitor";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < length.length; i++) {
            dataset.addValue(time[i], series1, String.valueOf(length[i])); 
        }
        
        

        return dataset;
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            LineChartExample example = new LineChartExample("Line Chart Example");
//            example.setAlwaysOnTop(true);
//            example.pack();
//            example.setSize(600, 400);
//            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            example.setVisible(true);
//        });
//    }
}
