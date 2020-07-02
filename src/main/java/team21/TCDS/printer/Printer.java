package team21.TCDS.printer;

import team21.TCDS.server.util.*;

/*
    信息打印机
 */
public class Printer
{
    public static Printer instance;
    private static boolean isUIModel;

    public static void init(final boolean isUIModel) {
        Printer.instance = new Printer();
        if (isUIModel) {
            System.out.println("错误：无法以UI模式输出信息，自动切换至命令模式输出。详细信息：");
        }
    }

    public void print(final String context) {
        if (Printer.instance != null) {
                System.out.println("[" + new String(ServerTimeUtil.accurateToSecond().getBytes()) + "]" + new String(context.getBytes()) + "\r\n");
        }
    }
}
