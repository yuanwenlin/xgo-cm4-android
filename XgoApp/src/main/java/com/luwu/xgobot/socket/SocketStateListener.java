package com.luwu.xgobot.socket;

public interface SocketStateListener {
     void onStateChange(String newState,boolean connected);
     void onMsgReceived(String msg);
}
