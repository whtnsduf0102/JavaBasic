package sun;

import java.io.FileNotFoundException;

/**
*SungJukV8Interface
* 성적처리 인터페이스
*
* */

public interface SungJukV8Interface {
    void newSungJuk();
    void readSungJuk() throws FileNotFoundException;
    void readOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();
}
