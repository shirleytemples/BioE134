package org.bioe134.crispr;

import javafx.util.Pair;
import java.util.regex.*;

/**
 *
 * @author J. Christopher Anderson
 */
public class Design_CRISPR_Oligos {

    public void initiate() throws Exception {

        //TODO:  write this initiate (if needed)

    }

    public Pair<String,String> run(String cds) throws Exception {

        //TODO:  write this algorithm, put the oligo sequences in line below
    	for String cds = Pattern.matches("[A-Z]{20}", "GG");
    		"oligo1_here" = ACTAGT
    		"oligo2_here" = catcgccgcagcggtttcag
        	Pair<String,String> out = new Pair<>("oligo1_here", "oligo2_here");
        	return out;
    }

    public static void main(String[] args) throws Exception {
        //Create some exampole arguments, here the amilGFP coding sequence
        String cds = "ATGTCTTATTCAAAGCATGGCATCGTACAAGAAATGAAGACGAAATACCATATGGAAGGCAGTGTCAATGGCCATGAATTTACGATCGAAGGTGTAGGAACTGGGTACCCTTACGAAGGGAAACAGATGTCCGAATTAGTGATCATCAAGCCTGCGGGAAAACCCCTTCCATTCTCCTTTGACATACTGTCATCAGTCTTTCAATATGGAAACCGTTGCTTCACAAAGTACCCGGCAGACATGCCTGACTATTTCAAGCAAGCATTCCCAGATGGAATGTCATATGAAAGGTCATTTCTATTTGAGGATGGAGCAGTTGCTACAGCCAGCTGGAACATTCGACTCGAAGGAAATTGCTTCATCCACAAATCCATCTTTCATGGCGTAAACTTTCCCGCTGATGGACCCGTAATGAAAAAGAAGACCATTGACTGGGATAAGTCCTTCGAAAAAATGACTGTGTCTAAAGAGGTGCTAAGAGGTGACGTGACTATGTTTCTTATGCTCGAAGGAGGTGGTTCTCACAGATGCCAATTTCACTCCACTTACAAAACAGAGAAGCCGGTCACACTGCCCCCGAATCATGTCGTAGAACATCAAATTGTGAGGACCGACCTTGGCCAAAGTGCAAAAGGCTTTACAGTCAAGCTGGAAGCACATGCCGCGGCTCATGTTAACCCTTTGAAGGTTAAATAA";

        //Instantiate and initiate the Function
        Design_CRISPR_Oligos func = new Design_CRISPR_Oligos();
        func.initiate();

        //Run the function on the example
        Pair<String,String> oligos = func.run(cds);

        //Print out the result
        System.out.println("oligo1: " + oligos.getKey());
        System.out.println("oligo2: " + oligos.getValue());
    }
}