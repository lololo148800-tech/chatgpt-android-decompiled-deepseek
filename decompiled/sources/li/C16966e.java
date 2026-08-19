package li;

import io.sentry.AbstractC15152P0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;

/* JADX INFO: renamed from: li.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16966e extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C16966e f54449Y = new C16966e(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        String message = (String) obj2;
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g((Map) obj4, "<anonymous parameter 3>");
        if (iIntValue == 2) {
            str = "VERBOSE";
        } else if (iIntValue == 3) {
            str = "DEBUG";
        } else if (iIntValue == 4) {
            str = "INFO";
        } else if (iIntValue != 5) {
            str = iIntValue != 6 ? "UNKNOWN" : "ERROR";
        } else {
            str = "WARN";
        }
        AbstractC15152P0.m16327a("[" + str + "] " + message);
        return C17296C.f55119a;
    }
}
