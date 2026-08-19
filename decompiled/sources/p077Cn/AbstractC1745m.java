package p077Cn;

import com.statsig.androidsdk.ErrorBoundaryKt;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1440o;
import p153Fn.AbstractC2923a;
import p153Fn.C2942t;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: Cn.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1745m {

    /* JADX INFO: renamed from: a */
    public static final C1751s f4997a = new C1751s(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f4998b = AbstractC2923a.m3740n("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c */
    public static final int f4999c = AbstractC2923a.m3740n("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ErrorBoundaryKt.SAMPLING_RATE, 0, 0, 12);

    /* JADX INFO: renamed from: d */
    public static final C2942t f5000d = new C2942t("BUFFERED", 0);

    /* JADX INFO: renamed from: e */
    public static final C2942t f5001e = new C2942t("SHOULD_BUFFER", 0);

    /* JADX INFO: renamed from: f */
    public static final C2942t f5002f = new C2942t("S_RESUMING_BY_RCV", 0);

    /* JADX INFO: renamed from: g */
    public static final C2942t f5003g = new C2942t("RESUMING_BY_EB", 0);

    /* JADX INFO: renamed from: h */
    public static final C2942t f5004h = new C2942t("POISONED", 0);

    /* JADX INFO: renamed from: i */
    public static final C2942t f5005i = new C2942t("DONE_RCV", 0);

    /* JADX INFO: renamed from: j */
    public static final C2942t f5006j = new C2942t("INTERRUPTED_SEND", 0);

    /* JADX INFO: renamed from: k */
    public static final C2942t f5007k = new C2942t(bQBnquXS.PQBztrfkp, 0);

    /* JADX INFO: renamed from: l */
    public static final C2942t f5008l = new C2942t("CHANNEL_CLOSED", 0);

    /* JADX INFO: renamed from: m */
    public static final C2942t f5009m = new C2942t("SUSPEND", 0);

    /* JADX INFO: renamed from: n */
    public static final C2942t f5010n = new C2942t("SUSPEND_NO_WAITER", 0);

    /* JADX INFO: renamed from: o */
    public static final C2942t f5011o = new C2942t("FAILED", 0);

    /* JADX INFO: renamed from: p */
    public static final C2942t f5012p = new C2942t("NO_RECEIVE_RESULT", 0);

    /* JADX INFO: renamed from: q */
    public static final C2942t f5013q = new C2942t("CLOSE_HANDLER_CLOSED", 0);

    /* JADX INFO: renamed from: r */
    public static final C2942t f5014r = new C2942t("CLOSE_HANDLER_INVOKED", 0);

    /* JADX INFO: renamed from: s */
    public static final C2942t f5015s = new C2942t("NO_CLOSE_CAUSE", 0);

    /* JADX INFO: renamed from: a */
    public static final boolean m2558a(InterfaceC0620k interfaceC0620k, Object obj, InterfaceC1440o interfaceC1440o) {
        C2942t c2942tMo1245h = interfaceC0620k.mo1245h(obj, interfaceC1440o);
        if (c2942tMo1245h == null) {
            return false;
        }
        interfaceC0620k.mo1247t(c2942tMo1245h);
        return true;
    }
}
