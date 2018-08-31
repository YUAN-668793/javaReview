package multilThread.chapter3.backup;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:28 AM
 */
public class BackupA extends Thread {
    private DBTools dbTools;
    public BackupA(DBTools dbTools){
        this.dbTools = dbTools;
    }
    @Override
    public void run(){
        dbTools.backupA();
    }
}
