package p1068vo;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: vo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C20654d extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C20654d f65533a = new C20654d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        int iMin;
        AbstractC16544l.m18094g(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC20653c.f65531a;
        String loggerName = record.getLoggerName();
        AbstractC16544l.m18093f(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        AbstractC16544l.m18093f(message, "record.message");
        Throwable thrown = record.getThrown();
        String strM21709q0 = (String) AbstractC20653c.f65532b.get(loggerName);
        if (strM21709q0 == null) {
            strM21709q0 = AbstractC21322p.m21709q0(23, loggerName);
        }
        if (Log.isLoggable(strM21709q0, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iM21678L = AbstractC21322p.m21678L(message, '\n', i11, false, 4);
                if (iM21678L == -1) {
                    iM21678L = length;
                }
                while (true) {
                    iMin = Math.min(iM21678L, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strM21709q0, strSubstring);
                    if (iMin >= iM21678L) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
