package android.gov.nist.javax.sip.stack.timers;

import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public interface SipTimer {
    boolean cancel(SIPStackTimerTask sIPStackTimerTask);

    boolean isStarted();

    boolean schedule(SIPStackTimerTask sIPStackTimerTask, long j10);

    boolean scheduleWithFixedDelay(SIPStackTimerTask sIPStackTimerTask, long j10, long j11);

    void start(SipStackImpl sipStackImpl, Properties properties);

    void stop();
}
