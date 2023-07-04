/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.samuelandrey.fuzzylogic;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;
/**
 *
 * @author samuel
 */
public class Kelayakan {
    
    public Kelayakan() {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create dataset
        DefaultXYDataset dataset = new DefaultXYDataset();

        // Define the points for the left trapezoid
        double[] xLeftTrapezoid = {0, 50, 70, 0};
        double[] yLeftTrapezoid = {1, 1, 0, 0};
        double[][] dataLeftTrapezoid = {xLeftTrapezoid, yLeftTrapezoid};
        dataset.addSeries("Kurang", dataLeftTrapezoid);

        // Define the points for the triangle
        double[] xTriangle = {50, 70, 80, 2};
        double[] yTriangle = {0, 1, 0, 0};
        double[][] dataTriangle = {xTriangle, yTriangle};
        dataset.addSeries("Lumayan", dataTriangle);

        // Define the points for the right trapezoid
        double[] xRightTrapezoid = {70, 80, 100, 100};
        double[] yRightTrapezoid = {0, 1, 1, 1};
        double[][] dataRightTrapezoid = {xRightTrapezoid, yRightTrapezoid};
        dataset.addSeries("Layak", dataRightTrapezoid);

        // Create chart
        JFreeChart chart = ChartFactory.createXYLineChart("Fuzzy Logic Chart Kelayakan Beasiswa", "X", "Y", dataset);

        // Create chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));

        // Create main frame
        JFrame frame = new JFrame("Fuzzy Logic GUI");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
