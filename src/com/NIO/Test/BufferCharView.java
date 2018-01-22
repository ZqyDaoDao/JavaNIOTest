package com.NIO.Test;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
/*
*     byte 是字节数据类型 ，是有符号型的，占1 个字节；大小范围为-128—127 。
*     char 是字符数据类型 ，是无符号型的，占2字节(Unicode码 ）；大小范围 是0—65535 ；
*     char是一个16位二进制的Unicode字符，JAVA用char来表示一个字符
* */
public class BufferCharView {
    public static void main (String [] argv) throws Exception {
        ByteBuffer byteBuffer = ByteBuffer.allocate (8).order (ByteOrder.BIG_ENDIAN);
        CharBuffer charBuffer = byteBuffer.asCharBuffer( ); // Load the ByteBuffer with some bytes
        byteBuffer.put (0, (byte)0);
        byteBuffer.put (1, (byte)'H');
        byteBuffer.put (2, (byte)0);
        byteBuffer.put (3, (byte)'i');
        byteBuffer.put (4, (byte)'e');
        byteBuffer.put (5, (byte)'Q');
        byteBuffer.put (6, (byte)0);
        byteBuffer.put (7, (byte)'t');
        println (byteBuffer);
        println (charBuffer); } // Print info about a buffer
        private static void println (Buffer buffer) {
        System.out.println ("pos=" + buffer.position( ) + ", limit=" + buffer.limit( ) + ", capacity=" + buffer.capacity( ) + ": '" + buffer.toString( ) + "'");
    }
}