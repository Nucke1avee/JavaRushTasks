package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        /*int code = 58;
        int number = 501234567;
        String num = Integer.toString(number);
        while (num.length() < 10) {
            num = 0 + num;
        }

        String p = String.format("+%s(%s)%s-%s-%s",
                code,
                num.substring(0, 3),
                num.substring(3, 6),
                num.substring(6, 7),
                num.substring(8)
        );
        System.out.println(p);*/
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        //Customer
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        //Contact
        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String num = Integer.toString(data.getPhoneNumber());
            while (num.length() < 10) {
                num = 0 + num;
            }

            return String.format("+%s(%s)%s-%s-%s",
                    data.getCountryPhoneCode(),
                    num.substring(0, 3),
                    num.substring(3, 6),
                    num.substring(6, 8),
                    num.substring(8)
            );
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 0501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}