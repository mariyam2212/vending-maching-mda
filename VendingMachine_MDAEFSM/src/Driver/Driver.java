package Driver;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

import AbstractFactory.*;
import DataStore.*;
import InputProcessor.*;
import MDAEFSM.*;
import OutputProcessor.*;

//	driver class for vending machine1 and vending machine 2
public class Driver {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int ch = 1;
        System.out.println(" ************* Choose Vending Machine ************");
        System.out.println(" 1) Vending Machine - 1");
        System.out.println(" 2) Vending Machine - 2");

        input = bufferedReader.readLine();

        if (input.equalsIgnoreCase("1")) {

            AbstractFactory af = new VM1Factory();
            DataStore ds = af.getDataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            VendingMachine1 vm1 = new VendingMachine1(mda, ds);

            int p;
            float v;
            int n;
            float x;

            System.out.print(" Available Operations for Vending Machine-1");
            System.out.print("\n");
            System.out.print(" 0) create(int)");
            System.out.print("\n");
            System.out.print(" 1) coin(float)");
            System.out.print("\n");
            System.out.print(" 2) sugar()");
            System.out.print("\n");
            System.out.print(" 3) tea()");
            System.out.print("\n");
            System.out.print(" 4) latte()");
            System.out.print("\n");
            System.out.print(" 5) insert_cups(int)");
            System.out.print("\n");
            System.out.print(" 6) set_price(float)");
            System.out.print("\n");
            System.out.print(" 7) cancel()");
            System.out.print("\n");
            System.out.print(" 8) Quit");
            System.out.print("\n");
            System.out.print(" Start...... ");
            System.out.print("\n");


            while (true) {
                System.out.print("\n");
                System.out.print("Select Operation: 0-create,   1-coin, 2-sugar,    3-tea,  4-latte,    5-insert_cups,  6-set_price,    7-cancel,   8-Quit");
                System.out.print("\n");

                input = bufferedReader.readLine();

                if (input.isEmpty())
                    continue;
                if (input.equalsIgnoreCase("8"))
                    break;
                try {
                    ch = Integer.parseInt(input);
                } catch (Exception e) {
//				    in.next();
                    System.out.print("Invalid operation. Try again:\n ");
                    continue;
                }

                switch (ch) {
                    case 0: //create
                        System.out.print(" Operation: create(int p)");
                        System.out.print("\n");
                        System.out.print(" Enter price p:");
                        System.out.print("\n");
                        try {
                            p = in.nextInt();
                            if (p > 0) {
                                vm1.create(p);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Invalid value. Try again:\n ");
                        }
                        break;
                    case 1: //coin
                        System.out.print(" Operation: coin(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter coins v:");
                        System.out.print("\n");
                        try {
                            v = in.nextFloat();
                            if (v > 0) {
                                vm1.coin(v);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Invalid value. Try again: \n");
                        }
                        break;
                    case 2: //sugar
                        System.out.print(" Operation: sugar()");
                        System.out.print("\n");
                        vm1.sugar();
                        break;
                    case 3: // tea
                        System.out.print(" Operation: tea()");
                        System.out.print("\n");
                        vm1.tea();
                        break;
                    case 4: // latte
                        System.out.print(" Operation:latte()");
                        System.out.print("\n");
                        vm1.latte();
                        break;
                    case 5: // insert_cups
                        System.out.print(" Operation: insert_cups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter cups n:");
                        System.out.print("\n");
                        try {
                            n = in.nextInt();
                            vm1.insert_cups(n);
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Invalid value. Try again: \n");
                        }
                        break;
                    case 6: // set_price
                        System.out.print(" Operation: set_price(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter price v:");
                        System.out.print("\n");
                        try {
                            v = in.nextFloat();
                            if (v > 0) {
                                vm1.set_price(v);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Invalid value. Try again: \n");
                        }


                        break;
                    case 7: // cancel
                        System.out.print(" Operation: cancel()");
                        System.out.print("\n");
                        vm1.cancel();
                        break;
                    case 8:
                        System.exit(0);

                    default: // Invalid case
                        System.out.println("Invalid Choice");
                        break;
                }
                ; // end of switch

            }
            ; //end while
        }// end if VendingMachine-1

        else if (input.equalsIgnoreCase("2")) {

            AbstractFactory af = new VM2Factory();
            DataStore ds = af.getDataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            VendingMachine2 vm2 = new VendingMachine2(mda, ds);

            float p;
            int v;
            int n;

            System.out.print(" Available Operations for Vending Machine - 2");
            System.out.print("\n");
            System.out.print(" 0. CREATE(float)");
            System.out.print("\n");
            System.out.print(" 1. COIN(int)");
            System.out.print("\n");
            System.out.print(" 2. SUGAR()");
            System.out.print("\n");
            System.out.print(" 3. CREAM()");
            System.out.print("\n");
            System.out.print(" 4. COFFEE()");
            System.out.print("\n");
            System.out.print(" 5. InsertCups(int)");
            System.out.print("\n");
            System.out.print(" 6. SetPrice(int)");
            System.out.print("\n");
            System.out.print(" 7) CARD(int)");
            System.out.print("\n");
            System.out.print(" 8. CANCEL()");
            System.out.print("\n");
            System.out.print(" 9. Quit");
            System.out.print("\n");
            System.out.print(" Start ...... ");
            System.out.print("\n");


            while (true) {
                System.out.print("\n");
                System.out.print("Select Operation: 0-CREATE,   1-COIN,  2-SUGAR,    3-CREAM,    4-COFFEE,   5-InsertCups,   6-SetPrice,  7-CARD,  8-CANCEL,  9-Quit");
                System.out.print("\n");

                input = bufferedReader.readLine();

                if (input.isEmpty())
                    continue;
                if (input.equalsIgnoreCase("9"))
                    break;
                try {
                    ch = Integer.parseInt(input);
                } catch (Exception e) {
//				    in.next();
                    System.out.print("Invalid Input. Try again:\n ");
                    continue;
                }
                switch (ch) {
                    case 0: //create
                        System.out.print(" Operation: CREATE(float)");
                        System.out.print("\n");
                        System.out.print(" Enter price p:");
                        System.out.print("\n");
                        try {
                            p = in.nextFloat();
                            if (p > 0) {
                                vm2.CREATE(p);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Enter a correct price value\n");
                        }
                        break;
                    case 1: //coin
                        System.out.print(" Operation: COIN(int)");
                        System.out.print("\n");
                        System.out.print(" Enter coin value v:");
                        System.out.print("\n");
                        try {
                            v = in.nextInt();
                            if (v > 0) {
                                vm2.COIN(v);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Enter correct value for coins inserted\n");
                        }
                        break;
                    case 2: //sugar
                        System.out.print(" Operation: SUGAR()");
                        System.out.print("\n");
                        vm2.SUGAR();
                        break;
                    case 3: // tea
                        System.out.print(" Operation: CREAM()");
                        System.out.print("\n");
                        vm2.CREAM();
                        break;
                    case 4: // chocolate
                        System.out.print(" Operation: COFFEE()");
                        System.out.print("\n");
                        vm2.COFFEE();
                        break;
                    case 5: // insert_cups
                        System.out.print(" Operation:InsertCups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter number of cups n:");
                        System.out.print("\n");
                        try {
                            n = in.nextInt();
                            if (n > 0) {
                                vm2.InsertCups(n);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Enter correct value type\n");
                        }
                        break;
                    case 6: // set_price
                        System.out.print(" Operation: SetPrice(int p)");
                        System.out.print("\n");
                        System.out.print(" Enter price p:");
                        System.out.print("\n");
                        try {
                            v = in.nextInt();
                            if (v > 0) {
                                vm2.SetPrice(v);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Enter correct value type\n");
                        }
                        break;
                    case 7: // card
                        System.out.print(" Operation: card(int x)");
                        System.out.print("\n");
                        System.out.print(" Enter card value x:");
                        System.out.print("\n");
                        try {
                            v = in.nextInt();
                            if (v > 0) {
                                vm2.card(v);
                            } else {
                                System.out.println("Enter a value greater then 0\n");
                            }
                        } catch (Exception e) {
                            in.next();
                            System.out.print("Enter correct card value\n");
                        }

                        break;
                    case 8: // cancel
                        System.out.print(" Operation: CANCEL()");
                        System.out.print("\n");
                        vm2.CANCEL();
                        break;
                    case 9:
                        System.exit(0);

                    default: // Invalid choice
                        System.out.println("Invalid Choice");
                        break;
                }
                ; // end switch
            }
            ; //end while
        }// end if Vending Machine-2
        else {
            System.out.println("No such Vending Machine. Choose from VM1 or VM2");
        }

    } //end main
} //end driver class
