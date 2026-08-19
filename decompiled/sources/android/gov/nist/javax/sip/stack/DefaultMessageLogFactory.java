package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.LogRecord;
import android.gov.nist.javax.sip.LogRecordFactory;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMessageLogFactory implements LogRecordFactory {
    public LogRecord createLogRecord(String str, String str2, String str3, String str4, boolean z6, String str5, String str6, String str7, long j10) {
        return new MessageLog(str, str2, str3, str4, z6, str5, str6, str7, j10);
    }

    @Override // android.gov.nist.javax.sip.LogRecordFactory
    public LogRecord createLogRecord(String str, String str2, String str3, long j10, boolean z6, String str4, String str5, String str6, long j11) {
        return new MessageLog(str, str2, str3, j10, z6, str4, str5, str6, j11);
    }
}
