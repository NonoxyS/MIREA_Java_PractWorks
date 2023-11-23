package PractWork_17.task1;

public class INNValidator {
    public static void isValidINN(String inn) {
        try {
            if (!inn.matches("\\d+")) {
                throw new NonValidINN("Недействительный ИНН (может содержать только цифры)");
            }

            if (inn.equals(null) || inn.length() != 12) {
                throw new NonValidINN("ИНН недействителен (кол-во цифр != 12)");
            }

            int[] coefficients_1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
            int[] coefficients_2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
            int checksum_1 = 0;
            int checksum_2 = 0;

            for (int i = 0; i < coefficients_1.length; i++) {
                checksum_1 += Integer.parseInt(Character.toString(inn.charAt(i))) * coefficients_1[i];
            }

            for (int i = 0; i < coefficients_2.length; i++) {
                checksum_2 += Integer.parseInt(Character.toString(inn.charAt(i))) * coefficients_2[i];
            }

            int controlNumber_1 = checksum_1 % 11;
            int controlNumber_2 = checksum_2 % 11;

            if (controlNumber_1 > 9) {
                controlNumber_1 = controlNumber_1 % 10;
            }

            if (controlNumber_2 > 9) {
                controlNumber_2 = controlNumber_2 % 10;
            }

            int controlDigit_1 = Integer.parseInt(Character.toString(inn.charAt(10)));
            int controlDigit_2 = Integer.parseInt(Character.toString(inn.charAt(11)));

            if (!(controlNumber_1 == controlDigit_1 & controlNumber_2 == controlDigit_2)) {
                throw new NonValidINN("Недействительный ИНН, контрольные суммы не совпадают: " + inn);
            }
            else {
                System.out.println("ИНН действителен");
            }

        } catch (NumberFormatException e) {
            throw new NonValidINN("ИНН должен состоять из цифр. " + e.getMessage());
        }
    }
}