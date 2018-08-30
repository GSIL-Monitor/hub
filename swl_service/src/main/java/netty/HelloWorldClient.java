package netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * Created by songweiliang on 2017/8/30.
 */
public class HelloWorldClient {
    static final String HOST = "127.0.0.1";
    static final int PORT = 8090;
    static final int SIZE = 256;
    public static void main(String[] args){
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap b = new Bootstrap();
        try{
            b.group(group)
                    .channel(NioSctpChannel.class)
                    .option(ChannelOption.TCP_NODELAY,true)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();
                            p.addLast("decoder",new StringDecoder());
                            p.addLast("encoder",new StringEncoder());
                            p.addLast(new HelloWorldClientHandler());
                        }
                    });
            ChannelFuture future = b.connect(HOST, PORT).sync();
            future.channel().writeAndFlush("Hello Netty Server ,I am a common client");
            future.channel().closeFuture().sync();
        }catch (Exception e){
            group.shutdownGracefully();
        }

    }
}
