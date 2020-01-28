package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            String currentFirstName;
            String currentLastName;
            Long currentBdate;
            boolean currentIsMale;
            String currentCountry;
            if (users.size() > 0) {
                for (int i = 0; i < users.size(); i++) {
                    currentFirstName = users.get(i).getFirstName();
                    currentLastName = users.get(i).getLastName();
                    currentBdate = users.get(i).getBirthDate().getTime();
                    currentIsMale = users.get(i).isMale();
                    currentCountry = users.get(i).getCountry().getDisplayName();
                    String strForWrite = currentFirstName + " ; " + currentLastName + " ; " + currentBdate + " ; " + currentIsMale + " ; " + currentCountry;
                    writer.write(strForWrite);
                    writer.newLine();
                    writer.flush();
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            if (reader.ready()) {
                String currentUser;
                String[] currentUserArr;
                List<User> currentUsers = new ArrayList<>();
                while ((currentUser = reader.readLine()) != null) {
                    currentUserArr = currentUser.split(" ; ");
                    User curUser = new User();

                    curUser.setFirstName(currentUserArr[0]);
                    curUser.setLastName(currentUserArr[1]);
                    long longDate = Long.parseLong(currentUserArr[2]);
                    Date birthDate = new Date(longDate);

                    curUser.setBirthDate(birthDate);
                    if (currentUserArr[3].equals("true")) {
                        curUser.setMale(true);
                    } else {
                        curUser.setMale(false);
                    }
                    //curUser.setCountry(currentUserArr[4]);
                    if (currentUserArr[4].equals("Ukraine")) {
                        curUser.setCountry(User.Country.UKRAINE);
                    } else if (currentUserArr[4].equals("Russia")) {
                        curUser.setCountry(User.Country.RUSSIA);
                    } else if (currentUserArr[4].equals("Other"))
                        curUser.setCountry(User.Country.OTHER);
                    currentUsers.add(curUser);
                }
                users = currentUsers;
            }


        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}