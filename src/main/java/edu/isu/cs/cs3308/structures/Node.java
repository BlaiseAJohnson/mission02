package edu.isu.cs.cs3308.structures;

/**
 * Represents the basic functionality of a Node ADT.
 * @author Blaise Johnson
 */
public interface Node {

    /**
     * @return The next sequential node.
     */
    Node next();

    /**
     * @return The previous sequential node.
     */
    Node prev();
}
