package Comparable;

public class Fourth {


        public static boolean check(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            String c = str1 + str1;
            if (c.contains(str2)) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";
            System.out.println(check(str1, str2));
        }
    }


