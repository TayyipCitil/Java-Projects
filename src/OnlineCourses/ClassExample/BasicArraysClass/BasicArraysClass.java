package OnlineCourses.ClassExample.BasicArraysClass;

public class BasicArraysClass {

    static void tooString(int[] intlist) {
        System.out.print("[");
        for (int elements : intlist) {
            System.out.print(elements + ",");
        }
        System.out.print("\b]");// \b ile son virgülü sildik
    }

    //tooString() metot için overloading yaptık
    static void tooString(String[] strlist) {
        System.out.print("[");
        for (String elements : strlist) {
            System.out.print(elements + ",");
        }
        System.out.print("\b]");// \b ile son virgülü sildik
    }

    static void filll(int[] intList, int fromIndex, int toIndex, int value) {
        if (fromIndex < 0 || toIndex > intList.length - 1 || fromIndex > toIndex) {
            System.out.println("Hatalı giriş");
        } else {
            for (int i = fromIndex; i <= toIndex; i++) {
                intList[i] = value;
            }
        }
    }
    //filll() metot için overloading yaptık

    static void filll(int[] intList, int value) {
        for (int i = 0; i < intList.length; i++) {
            intList[i] = value;
        }
    }


    static int[] soort(int[] intList) {
        for (int i = 0; i < intList.length - 1; i++) {
            for (int j = i + 1; j < intList.length; j++) {
                if (intList[i] > intList[j]) {
                    int a = intList[i];
                    intList[i] = intList[j];
                    intList[j] = a;
                }
            }
        }
        return intList;
    }

    //soort() metot için overloading yaptık
    static String[] soort(String[] strList) {
        String[] alphabet = {"a", "b", "c", "ç", "d", "e", "f", "g", "ğ", "h", "ı", "i", "j", "k", "l", "m", "n", "o", "ö", "p", "r", "s", "ş", "t", "u", "ü", "v", "y", "z"};
        int[] indis = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (strList[i] == alphabet[j]) {
                    indis[i] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < indis.length - 1; i++) {
            for (int j = i + 1; j < indis.length; j++) {
                if (indis[i] > indis[j]) { //elamanların indislerini sıralarken kendilerini de sıralattık
                    int a = indis[i];
                    String b = strList[i];
                    indis[i] = indis[j];
                    strList[i] = strList[j];
                    indis[j] = a;
                    strList[j] = b;
                }
            }
        }
        return strList;
    }


    static int search(int[] intList, int value) {
        int i;
        for (i = 0; i < intList.length; i++) {
            if (value == intList[i]) {
                break;
            } else if (i == intList.length - 1) {
                System.out.println("Bu eleman dizide yok");//eleman olamyınca -1 dödürüyor
                i = -1;
            }
        }
        return i;
    }

    //search() metot için overloading yaptık
    static int search(String[] intList, String value) {
        int i;
        for (i = 0; i < intList.length; i++) {
            if (value == intList[i]) {
                break;
            } else if (i == intList.length - 1) {
                System.out.println("Bu eleman dizide yok");//eleman olamyınca -1 dödürüyor
                i = -1;
            }
        }
        return i;
    }



    static int[] coopy(int[] intList, int toIndis) {
        int[] copy = new int[toIndis + 1];
        for (int i = 0; i < toIndis + 1; i++) {
            copy[i] = intList[i];
        }
        return copy;
    }

    static int[] coopy(int[] intList, int fromIndex, int toIndex) {
        int[] copy = new int[0];
        if (fromIndex < 0 || toIndex > intList.length - 1 || fromIndex > toIndex) {
            System.out.println("Hatalı giriş");
        } else {
            copy = new int[toIndex - fromIndex + 1];
            for (int i = 0, j = fromIndex; j < toIndex + 1; i++, j++) {
                copy[i] = intList[j];
            }
        }
        return copy;
    }

    static String[] coopy(String[] intList, int toIndis) {
        String[] copy = new String[toIndis + 1];
        for (int i = 0; i < toIndis + 1; i++) {
            copy[i] = intList[i];
        }
        return copy;
    }

    static boolean equalss(int[] intList1,int[] intList2){
        boolean isEquals=false;
        if(intList1.length==intList2.length){
            for(int i=0;i< intList1.length;i++){
                if(intList1[i]==intList2[i]){
                    isEquals=true;
                }else{
                    isEquals=false;
                    break;
                }
            }
        }
        return isEquals;
    }

}
