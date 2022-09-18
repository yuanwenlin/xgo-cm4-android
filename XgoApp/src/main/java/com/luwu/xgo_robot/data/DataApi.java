package com.luwu.xgo_robot.data;

import com.luwu.xgo_robot.AppContext;

public interface DataApi {
    //发送数据
    void sendData(byte[] datas);
    //供外界调用
    void MsgThreadStop();

    void MsgThreadWork();

    int getMsgListState();

    void sendHugeMessage(byte[] msg);

    void addMessage(byte[] msg);

    void addMessageRespond(byte[] msg);

    void addMessageRead(byte[] msg);

    //消息会被覆盖 不靠谱 仅在TestBtActivity中使用
    byte[] getMessageRespond();

    //消息会被覆盖 不靠谱 仅在仅在TestBtActivity中使用
    byte[] getMessageRead();

}
