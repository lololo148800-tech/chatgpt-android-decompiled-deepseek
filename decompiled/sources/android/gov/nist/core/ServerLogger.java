package android.gov.nist.core;

import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.InterfaceC10811r;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public interface ServerLogger extends LogLevels {
    void closeLogFile();

    void logException(Exception exc);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z6);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z6, long j10);

    void logMessage(SIPMessage sIPMessage, String str, String str2, boolean z6, long j10);

    void setSipStack(InterfaceC10811r interfaceC10811r);

    void setStackProperties(Properties properties);
}
