package team21.TCDS.mc;

/**
 * TCDS主类（启动类）
 *
 * @author 高级软件21组(team21)
 * @version 1.0
 */

public class MC {
    /**
     * <h2>主方法</h2>
     *
     * @param args java.lang.String[] 接收控制台传入参数，例如“-console“
     * @author 高级软件21组(team21)
     */
    public static void main(final String[] args) {
        if (args == null || args.length == 0) {
            System.out.println(new String(
                    "错误！无法以图形界面模式启动TCDS，您的操作系统可能不支持图形界面。您可以尝试使用命令模式参数“-console”来启动并开始使用TCDS。".getBytes()));
        } else {
            ConsoleRunner.build(args);// 以控制台模式启动TCDS。
        }
    }
}
