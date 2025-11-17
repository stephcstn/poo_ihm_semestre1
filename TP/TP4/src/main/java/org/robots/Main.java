package org.robots;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot("real_steel");

        r1.switch_state();
        r1.to_string();
        }
    }