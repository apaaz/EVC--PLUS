import java.util.Scanner;

public class EVC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dial = "*770#";
        int pin = 1234;
        double haraa = 300;

        System.out.println("Garaac Dial:");
        String dial2 = input.next();

        if (dial.equals(dial2)) {
            System.out.println("-EVCPlus-");
            System.out.println("Fadlan geli Pin-kaaga:");
            int pin2 = input.nextInt();

            if (pin == pin2) {
                System.out.println("1. Itus Haraaga");
                System.out.println("2. Ku shubo Kaarka Hadalka");
                System.out.println("3. Bixi Bill");
                System.out.println("4. U wareeji EVCPLUS");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maaraynta");
                System.out.println("8. Taaj");
                System.out.println("0. ka bax");
                System.out.print("Fadlan dooro Number: ");
                int num = input.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("Haraagaagu waa $" + haraa);
                        break;

                    case 2:
                        System.out.println("1. Ku shubo");
                        System.out.println("2. Ugu shub");
                        System.out.print("Dooro: ");
                        int kaarka = input.nextInt();

                        if (kaarka == 1) {
                            System.out.print("Geli lacagta: ");
                            double lacag = input.nextDouble();
                            if (lacag > haraa) {
                                System.out.println("Haraagaagu kuguma filna!");
                            } else {
                                haraa -= lacag;
                                System.out.println("Waxaad ku shubatay $" + lacag);
                                System.out.println("Haraagaagu waa: $" + haraa);
                            }
                        } else if (kaarka == 2) {
                            System.out.print("Geli lambarka qofka: ");
                            String lambar = input.next();


                            if (lambar.length() == 9 && lambar.startsWith("61")) {
                                long l = Long.parseLong(lambar);
                                if (l >= 610000000L && l <= 619999999L) {
                                    System.out.print("Geli lacagta: ");
                                    double lacag = input.nextDouble();

                                    if (lacag > haraa) {
                                        System.out.println("Haraagaagu kuguma filna!");
                                    } else {
                                        haraa -= lacag;
                                        System.out.println("Waxaad $" + lacag + " ugu shubtay " + lambar);
                                        System.out.println("Haraagaagu waa: $" + haraa);
                                    }
                                } else {
                                    System.out.println("lambarkan wa qalad.");
                                }
                            } else {
                                System.out.println("lambarka aad so galisay mahan mid jira.");
                            }
                        } else {
                            System.out.println("Lambarka aad soo galisay maahan mid jira.");
                        }

                        break;


                    case 3:
                        System.out.println("1. Kiro\n2. Koronto\n3. Caafimaad\n4. Waxbarasho");
                        System.out.print("Fadlan dooro Bill-ka: ");
                        int billType = input.nextInt();
                        System.out.print("Geli lacagta: ");
                        double bill = input.nextDouble();
                        if (bill > haraa) {
                            System.out.println("Haraagaagu kugum a filna!");
                        } else {
                            haraa -= bill;
                            switch (billType) {
                                case 1:
                                    System.out.println("Waxaad ku bixisay Kiro: $" + bill);
                                    break;
                                case 2:
                                    System.out.println("Waxaad ku bixisay Koronto: $" + bill);
                                    break;
                                case 3:
                                    System.out.println("Waxaad ku bixisay Caafimaad: $" + bill);
                                    break;
                                case 4:
                                    System.out.println("Waxaad ku bixisay Waxbarasho: $" + bill);
                                    break;
                                default:
                                    System.out.println("lambarka aad doraty ma ahan mid jira.");
                            }
                            System.out.println("Haraagaaguna waa: $" + haraa);
                        }
                        break;

                    case 4:
                        System.out.print("Geli lambarka qofka aad u wareejinayso: ");
                        String lambar = input.next();
                        System.out.print("Geli lacagta: ");
                        double wareejin = input.nextDouble();

                        if (wareejin > haraa) {
                            System.out.println("Haraagaagu kuguma filna!");
                        } else {

                            System.out.println("Waxaad u wareejinaysaa $" + wareejin + " lambarka: " + lambar);
                            System.out.println("Ma hubtaa?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            System.out.print("Dooro: ");
                            int xaqiijin = input.nextInt();

                            if (xaqiijin == 1) {
                                haraa -= wareejin;
                                System.out.println("Waxaad u wareejisay $" + wareejin + " lambarka " + lambar);
                                System.out.println("Haraagaaguna waa: $" + haraa);
                            } else if (xaqiijin == 2) {
                                System.out.println("Waxaad ka laabatay wareejinta.");
                            } else {
                                System.out.println("Xulashada sax ma aha. Wareejinta waa la joojiyay.");
                            }
                        }
                        break;


                    case 5:
                        System.out.println("Warbixin Kooban:");
                        System.out.println("1.last action \n2.U wareejintii u danbese \n3.iibsashadii u danbese");
                        break;

                    case 6:
                        double bankBalance = 150;
                        String bankPassword = "654321";
                        input.nextLine();

                        System.out.println("== Salaam Bank ==");
                        System.out.println("1. Itus Haraaga");
                        System.out.println("2. Lacag Dhigasho");
                        System.out.println("3. Lacag Qaadasho");
                        System.out.println("4. Ka wareeji EVC");
                        System.out.println("5. Ka wareeji Account-kaaga");
                        System.out.print("Dooro adeeg: ");
                        int bankOption = input.nextInt();
                        input.nextLine();

                        switch (bankOption) {
                            case 1:
                                System.out.println("Haraagaaga Salaam Bank waa: $" + bankBalance);
                                break;

                            case 2:
                                System.out.print("Geli password-ka Salaam Bank: ");
                                String pass = input.next();

                                if (pass.equals(bankPassword)) {
                                    System.out.print("Geli lacagta aad dhigeyso: ");
                                    double deposit = input.nextDouble();
                                    bankBalance += deposit;
                                    System.out.println(" Waxaad dhigatay $" + deposit);
                                    System.out.println("Haraagaaga hadda waa: $" + bankBalance);
                                } else {
                                    System.out.println(" Password-ka waa khalad! Lacag lama dhigin.");
                                }
                                break;

                            case 3:
                                System.out.print("Geli password-ka Salaam Bank: ");
                                pass = input.next();

                                if (pass.equals(bankPassword)) {
                                    System.out.print("Geli lacagta aad rabto in aad ka qaadato: ");
                                    double withdraw = input.nextDouble();
                                    if (withdraw > bankBalance) {
                                        System.out.println(" Haraaga bank-ga kuma filna!");
                                    } else {
                                        bankBalance -= withdraw;
                                        System.out.println(" Waxaad ka qaadatay $" + withdraw);
                                        System.out.println("Haraagaaga hadda waa: $" + bankBalance);
                                    }
                                } else {
                                    System.out.println(" Password-ka waa khalad! Lacag lama qaadin.");
                                }
                                break;

                            case 4:
                                System.out.print("Geli lacagta aad rabto in aad ka wareejiso EVC: ");
                                double evcToBank = input.nextDouble();
                                if (evcToBank > haraa) {
                                    System.out.println(" Haraaga EVC kuma filna!");
                                } else {
                                    haraa -= evcToBank;
                                    bankBalance += evcToBank;
                                    System.out.println(" Waxaad ka wareejisay EVC $" + evcToBank + " una wareejisay Salaam Bank.");
                                    System.out.println("Haraaga EVC: $" + haraa);
                                    System.out.println("Haraaga Salaam Bank: $" + bankBalance);
                                }
                                break;

                            case 5:
                                System.out.print("Geli lacagta aad rabto in aad ka wareejiso Bank-ga: ");
                                double bankToEVC = input.nextDouble();
                                if (bankToEVC > bankBalance) {
                                    System.out.println(" Bank-ga kuma filna lacagtaas!");
                                } else {
                                    bankBalance -= bankToEVC;
                                    haraa += bankToEVC;
                                    System.out.println(" Waxaad ka wareejisay Bank-ga $" + bankToEVC + " una wareejisay EVC.");
                                    System.out.println("Haraaga EVC: $" + haraa);
                                    System.out.println("Haraaga Salaam Bank: $" + bankBalance);
                                }
                                break;

                            default:
                                System.out.println("Doorasho khaldan.");
                        }
                        break;



                    case 7:
                        System.out.println("maareynta");
                        System.out.print("Geli PIN-kii hore: ");
                        int oldPin = input.nextInt();
                        if (oldPin == pin) {
                            System.out.print("Fadlan Geli PIN cusub: ");
                            pin = input.nextInt();
                            System.out.println("PIN-ka waa la bedelay.");
                        } else {
                            System.out.println("PIN-ka aad galisay ma ahan mid jira.");
                        }
                        break;


                    case 8:
                        System.out.println("TAAJ ma aqaan side u shaqeyso!.");
                        break;

                    case 0:
                        System.out.println("Adeega waa ka baxday. mahadsanid!");
                        break;

                    default:
                        System.out.println("Xulashada aad dooratay ma jirto.");
                }

            } else {
                System.out.println("Pinkaaga waa khalad.");
            }

        } else {
            System.out.println("Dial-ka ma jiro.");
        }

        input.close();
    }
}
