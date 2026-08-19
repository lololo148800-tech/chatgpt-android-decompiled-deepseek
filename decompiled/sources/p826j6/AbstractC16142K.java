package p826j6;

import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11915U1;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11921W1;
import com.google.android.gms.internal.play_billing.C11924X1;
import com.google.android.gms.internal.play_billing.C11927Y1;
import com.google.android.gms.internal.play_billing.C11930Z1;

/* JADX INFO: renamed from: j6.K */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC16142K {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f50071a = 0;

    static {
        int i10 = InterfaceC16143L.f50072i0;
    }

    /* JADX INFO: renamed from: a */
    public static String m17716a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i10 = AbstractC11988o0.f36308a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11918V1 m17717b(int i10, int i11, C16155i c16155i) {
        try {
            C11915U1 c11915u1M13360r = C11918V1.m13360r();
            C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
            c11927y1M13380r.m13369e(c16155i.f50151a);
            String str = c16155i.f50152b;
            c11927y1M13380r.m13473d();
            C11930Z1.m13377o((C11930Z1) c11927y1M13380r.f36278Z, str);
            c11927y1M13380r.m13370f(i10);
            c11915u1M13360r.m13354e(c11927y1M13380r);
            c11915u1M13360r.m13355f(i11);
            return (C11918V1) c11915u1M13360r.m13471b();
        } catch (Exception e10) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C11918V1 m17718c(int i10, int i11, C16155i c16155i, String str) {
        try {
            C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
            c11927y1M13380r.m13369e(c16155i.f50151a);
            String str2 = c16155i.f50152b;
            c11927y1M13380r.m13473d();
            C11930Z1.m13377o((C11930Z1) c11927y1M13380r.f36278Z, str2);
            c11927y1M13380r.m13370f(i10);
            if (str != null) {
                c11927y1M13380r.m13473d();
                C11930Z1.m13376n((C11930Z1) c11927y1M13380r.f36278Z, str);
            }
            C11915U1 c11915u1M13360r = C11918V1.m13360r();
            c11915u1M13360r.m13354e(c11927y1M13380r);
            c11915u1M13360r.m13355f(i11);
            return (C11918V1) c11915u1M13360r.m13471b();
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C11924X1 m17719d(int i10) {
        try {
            C11921W1 c11921w1M13365q = C11924X1.m13365q();
            c11921w1M13365q.m13473d();
            C11924X1.m13364p((C11924X1) c11921w1M13365q.f36278Z, i10);
            return (C11924X1) c11921w1M13365q.m13471b();
        } catch (Exception e10) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
