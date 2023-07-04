/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.samuelandrey.fuzzylogic;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.*;
/**
 *
 * @author samuel
 */
public class Ipk {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> createAndShowGUI());
//    }
    
    public Ipk() {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create dataset
        DefaultXYDataset dataset = new DefaultXYDataset();

        // Define the points for the left trapezoid
        double[] xLeftTrapezoid = {0, 2, 2.8, 0};
        double[] yLeftTrapezoid = {1, 1, 0, 0};
        double[][] dataLeftTrapezoid = {xLeftTrapezoid, yLeftTrapezoid};
        dataset.addSeries("Left Trapezoid", dataLeftTrapezoid);

        // Define the points for the triangle
        double[] xTriangle = {2, 2.8, 3.2, 2};
        double[] yTriangle = {0, 1, 0, 0};
        double[][] dataTriangle = {xTriangle, yTriangle};
        dataset.addSeries("Triangle", dataTriangle);

        // Define the points for the right trapezoid
        double[] xRightTrapezoid = {2.8, 3.2, 4, 4};
        double[] yRightTrapezoid = {0, 1, 1, 1};
        double[][] dataRightTrapezoid = {xRightTrapezoid, yRightTrapezoid};
        dataset.addSeries("Right Trapezoid", dataRightTrapezoid);

        // Create chart
        JFreeChart chart = ChartFactory.createXYLineChart("Fuzzy Logic Chart IPK", "X", "Y", dataset);

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
