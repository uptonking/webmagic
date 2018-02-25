package us.codecraft.webmagic.monitor;

import java.util.Date;
import java.util.List;

/**
 * spider状态bean的接口
 *
 * @author code4crafer@gmail.com
 * @since 0.5.0
 */
public interface SpiderStatusMXBean {

    String getName();

    String getStatus();

    int getThread();

    int getTotalPageCount();

    int getLeftPageCount();

    int getSuccessPageCount();

    int getErrorPageCount();

    List<String> getErrorPages();

    void start();

    void stop();

    Date getStartTime();

    int getPagePerSecond();
}
