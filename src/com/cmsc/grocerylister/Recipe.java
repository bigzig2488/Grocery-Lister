/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
package com.cmsc.grocerylister;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.util.Collection;

public class Recipe {
	
	private static final String dataFilePath = ".grocery-lister-data";
	
	/**
	 * Read a local YAML file to get a set of recipes.
	 * @throws IOException 
	 */
	public static List<Recipe> readDataFile() throws IOException {
		// if file does not exist, return an empty set
		if (!new File(dataFilePath).isFile()) {
			return new ArrayList<>();
		} else {
			return readDataFile(dataFilePath);
		}
	}
	
	/**
	 * Given the path to a YAML data file, read the recipes and return a set of Recipe objects.
	 * 
	 * @param path string path to YAML file
	 * @return set of Recipes
	 * @throws IOException on issue reading file or parsing YAML
	 */
	public static List<Recipe> readDataFile(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		// Read the file to string
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line).append(System.getProperty("line.separator"));
			}
		}
		// Split the YAML string for each recipe
		String[] yaml = sb.toString().split("---");
		List<Recipe> recipes = new ArrayList<>();
		// Parse YAML
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		for (String y : yaml) {
			System.out.println(y);
			recipes.add(mapper.readValue(y, Recipe.class));
		}
		return recipes;
	}
	
	/**
	 * Given a set of recipes, write their data to a local YAML file.
	 * 
	 * @param recipes Recipes to save
	 * @throws IOException 
	 */
	public static void writeDataFile(List<Recipe> recipes) throws IOException {
		writeDataFile(recipes, dataFilePath);
	}
	
	/**
	 * Given a set of recipes and a filepath, write the recipes as YAML to that file.
	 * 
	 * @param recipes Recipes to save
	 * @param path file to save recipes in
	 * @throws IOException on issue writing file
	 */
	public static void writeDataFile(List<Recipe> recipes, String path) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (Recipe r : recipes) {
				bw.write(r.toYaml());
			}
		}
	}
	
	/**
	 * Given a set of recipes, return a list of exactly 7 random recipes, one for each day of the
	 * week.
	 * 
	 * @param recipes Recipes to select from
	 * @return 7 recipes as list
	 */
	public static List<Recipe> generatePlan(List<Recipe> recipes) {
		List<Recipe> plan = new ArrayList<>();
		Integer setSize = recipes.size();
		// If there are at least 7 recipes, we can do a unique recipe each day
		Random r = new Random();
		if (setSize >= 7) {
			Set<Integer> usedNumbers = new HashSet<>();
			while (recipes.size() < 8) {
				Integer i = r.nextInt(setSize - 1);
				// Make sure this index is not a repeat
				while (usedNumbers.contains(i)) {
					i = r.nextInt(setSize - 1);
				}
				// Get the recipe at that index
				plan.add(recipes.get(i));
				// Add the number to the used set to prevent repeats
				usedNumbers.add(i);
			}
	    // Otherwise there has to be repeated recipes
		} else {
			while (recipes.size() < 8) {
				Integer i = r.nextInt(setSize - 1);
				plan.add(recipes.get(i));
			}
		}
		return plan;
	}
	
	/**
	 * Given a set of recipes, return a set of ingredients to shop for.
	 */
	public static List<Ingredient> generateList(List<Recipe> recipes) {
		List<Ingredient> ingredients = new ArrayList<>();
		for (Recipe r : recipes) {
			ingredients.addAll(r.getIngredients());
		}
		return ingredients;
	}

    char[] toYaml() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Collection<? extends Ingredient> getIngredients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}