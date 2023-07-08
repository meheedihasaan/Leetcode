/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sliding_window;

/**
 *
 * @author User
 */
public class MaximizeTheConfusionOfAnExam {
    
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int[] freqT = new int[n+1];
        int[] freqF = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (answerKey.charAt(i-1) == 'T') {
                freqT[i] = freqT[i-1] + 1;
                freqF[i] = freqF[i-1];
            }
            if(answerKey.charAt(i-1) == 'F') {
                freqF[i] = freqF[i-1] + 1;
                freqT[i] = freqT[i-1];
            }
            
        }
        
        int maxLength = 0;
        int length = 1;
        int i = 1; 
        int j = length;
        while (i <= n && j <= n) {
            int t = freqT[j] - freqT[i-1];
            int f = freqF[j]-freqF[i-1];
            if (Math.min(t, f) <= k) {
                maxLength = length;
                length++;
                i = 1;
                j = length; 
            }
            else {
                i++;
                j++;
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("FFTFFTFF", 1));
    }
    
}
