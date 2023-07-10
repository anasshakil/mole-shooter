
import java.io.*;
import javax.swing.JOptionPane;

class File_Class {

    private int HighScore;

    public void setScore(String name, int currentScore) {
        try {
            File f = new File(name + ".txt");
            if (f.exists() == true) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = br.readLine();
                br.close();
                int socreInFile = Integer.parseInt(line);
                if (currentScore > socreInFile) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    bw.write("" + currentScore);
                    bw.close();
                }
            } else {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write("" + currentScore);
                bw.close();
            }
        } catch (Exception e) {
        }
    }

    public void getScore(String name) {
        try{
            File f = new File(name  + ".txt");
            if(f.exists() == true){
        BufferedReader br = new BufferedReader (new FileReader(f));
        String line = br.readLine();
        br.close();
        JOptionPane.showMessageDialog(null, name  + " your high score is " + line);
            }else{
                JOptionPane.showMessageDialog(null, "No score found");
            }
        }catch(IOException e){
        }
    }

}
