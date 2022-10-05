package com.skill.java.Etc;


import org.junit.jupiter.api.Test;
import org.tensorflow.DataType;
import org.tensorflow.Graph;
import org.tensorflow.Operation;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

public class TensorFlowTest {
    
    @Test
    public void print() throws Exception {

        try (Graph graph = new Graph()){
            
            final String value = "Hello T " + TensorFlow.version();

            try (Tensor tensor = Tensor.create(value.getBytes("UTF-8"))){
                graph.opBuilder("Const", "MyConst").setAttr("dtype", tensor.dataType()).setAttr("value", tensor).build();
            }

            try (Session s = new Session(graph); Tensor output = s.runner().fetch("MyConst").run().get(0)){
                System.out.println(new String(output.bytesValue(), "UTF-8"));
            }

        } catch (Exception e) {
        }
    }

    @Test
    public void ConstantDefinition() throws Exception {
        Graph graph = new Graph();

        Operation ap = graph.opBuilder("Const", "a")
                            .setAttr("dtype", DataType.fromClass(Double.class))
                            .setAttr("value", Tensor.<Double>create(3.0, Double.class))
                            .build();		
        Operation bp = graph.opBuilder("Const", "b")
                            .setAttr("dtype", DataType.fromClass(Double.class))
                            .setAttr("value", Tensor.<Double>create(2.0, Double.class))
                            .build();

        System.out.println(ap);
        System.out.println(bp);
    }
}
