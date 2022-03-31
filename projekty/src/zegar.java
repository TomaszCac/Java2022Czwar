import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.concurrent.ThreadLocalRandom;

public class zegar {

    //tablica
    static HashMap<Integer, Integer> getFrequencyMap(int arr[])
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else {
                hashMap.put(arr[i], 1);
            }
        }
        return hashMap;
    }

    static boolean hasDigit(HashMap<Integer, Integer> hashMap, int digit)
    {

        if (hashMap.containsKey(digit) && hashMap.get(digit) > 0) {

            hashMap.put(digit, hashMap.get(digit) - 1);

            return true;
        }

        return false;
    }

    // funkcja zwracająca 24-godzinny format
    static String getMaxTime(int arr[])
    {
        HashMap<Integer, Integer> hashMap = getFrequencyMap(arr);
        int i;
        boolean flag;
        String time = "";

        flag = false;

        // pierwsza liczba w tablicy max wartość = 2
        for (i = 2; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }

        // jak nie da sie ulozyc to -1
        if (!flag) {
            return "19:29";
        }

        flag = false;

        // jeśli 1 wartość jest rowna 2 to druga nie moze byc wieksza niz 3
        if (time.charAt(0) == '2') {
            for (i = 3; i >= 0; i--) {
                if (hasDigit(hashMap, i)) {
                    flag = true;
                    time += i;
                    break;
                }
            }
        }

        // reszta wartosci moze byc do 9
        else {
            for (i = 9; i >= 0; i--) {
                if (hasDigit(hashMap, i)) {
                    flag = true;
                    time += i;
                    break;
                }
            }
        }
        if (!flag) {
            return "19:29";
        }

        // oddziela godziny od minut
        time += ":";

        flag = false;

        // pierwsza liczba minut moze wynosic max 5
        for (i = 5; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }
        if (!flag) {
            return "19:29";
        }

        flag = false;

        // druga wartosc minut moze wynosic max 9
        for (i = 9; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }
        if (!flag) {
            return "19:29";
        }

        // zwraca największy możliwy czas
        return time;
    }









    public static void main(String[] args)
    {
        //losowe wartosci
       // int minVal = 1;
        //int maxVal = 9;
       // int[] arr = new int[4];
       // for (int i = 0; i < arr.length; i++) {
           // arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
       // }

       // arr.notify();

        //stale wartosci
        int arr[] = { 2, 1, 9, 9};

        System.out.println(getMaxTime(arr));
    }
}

//sam rób lamusie a nie ściągasz