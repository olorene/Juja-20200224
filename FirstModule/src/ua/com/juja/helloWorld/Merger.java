package ua.com.juja.helloWorld;
import java.util.Arrays;

/**
 * Created by Vlad on 28.10.2017.
 */
public class Merger {
    // wrong
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        if (snd == null || snd.length == 0) {
            return fst;
        }
        if (fst == null || fst.length == 0) {
            return snd;
        }

        while (fstIndex + sndIndex != result.length) {
            if (fstIndex < fst.length && fst[fstIndex] <= snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }

        return result;
    }
}