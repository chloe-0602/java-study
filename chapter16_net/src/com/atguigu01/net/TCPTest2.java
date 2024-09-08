package com.atguigu01.net;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Package: com.atguigu01.net
 * Description:
 *  例题2：客户端发送文件给服务端，服务端将文件保存在本地。
 * @Author Xu, Luqin
 * @Create 2024/9/8 15:04
 * @Version 1.0
 */
public class TCPTest2 {
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8989);

        File file = new File("pic.jpg");
        FileInputStream fis = new FileInputStream(file);
        OutputStream os = socket.getOutputStream();

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer))  != -1){
            os.write(buffer,0,len);
        }

        System.out.println("数据写出完毕！");

        os.close();
        fis.close();
        socket.close();
    }

    @Test
    public void serve() throws IOException{
        ServerSocket serverSocket = new ServerSocket(8989);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        File file = new File("pic_copy.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }

        System.out.println("数据接收完毕！");

        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
