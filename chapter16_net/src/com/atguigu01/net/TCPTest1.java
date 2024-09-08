package com.atguigu01.net;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest1
 * Package: com.atguigu01.net
 * Description:
 *   例题1：客户端发送内容给服务端，服务端将内容打印到控制台上。
 * @Author Xu, Luqin
 * @Create 2024/9/8 14:45
 * @Version 1.0
 */
public class TCPTest1 {
    /**
     * 注意：因为涉及到相关资源的关闭，需要使用try-catch-finally处理异常
     * @throws IOException
     */
    @Test
    public void client() throws IOException {
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inetAddress, 8989);

        OutputStream os = socket.getOutputStream();
        os.write("你好, I'm 客户端".getBytes());

        os.close();
        socket.close();

    }

    @Test
    public void server() throws IOException{
        ServerSocket serverSocket = new ServerSocket(8989);

        Socket socket = serverSocket.accept();

        System.out.println("服务端已开启");
        System.out.println("接收来自" + socket.getInetAddress().getHostAddress()+"的数据");

        InputStream is = socket.getInputStream();


        byte[] buffer = new byte[5];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len = is.read(buffer)) != -1){
            baos.write(buffer, 0,len);
        }
        System.out.println(baos);

        System.out.println("数据接收完毕！");

        socket.close();
        serverSocket.close();
        is.close();
    }
}
