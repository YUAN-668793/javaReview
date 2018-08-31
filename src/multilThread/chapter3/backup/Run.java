package multilThread.chapter3.backup;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:29 AM
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i=0;i<20;i++){
            BackupA a = new BackupA(dbTools);
            BackupB b = new BackupB(dbTools);
            a.start();
            b.start();
        }

    }
}
