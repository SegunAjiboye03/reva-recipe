package com.revature.domains;

/**
 * 
 * @author 
 * @version
 * @since
 *
 */
public class Recipe {

    //name the variables
    private String name;
    private String instructions;

    //Constructor

   public Recipe() {

    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String instructions) {
        this.name = name;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

}
