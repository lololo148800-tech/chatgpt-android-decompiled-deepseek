package p674c5;

import java.util.HashMap;
import p028B.C0707n;
import p315Me.Myis.CxcULo;
import p444S4.C7011q;
import p658b5.C11239j;

/* JADX INFO: renamed from: c5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C11665r {

    /* JADX INFO: renamed from: e */
    public static final String f35321e = C7011q.m7409f("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final C0707n f35322a;

    /* JADX INFO: renamed from: b */
    public final HashMap f35323b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f35324c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f35325d = new Object();

    public C11665r(C0707n c0707n) {
        this.f35322a = c0707n;
    }

    /* JADX INFO: renamed from: a */
    public final void m13021a(C11239j c11239j) {
        String str = CxcULo.Dtf;
        synchronized (this.f35325d) {
            try {
                if (((RunnableC11664q) this.f35323b.remove(c11239j)) != null) {
                    C7011q.m7408d().m7410a(f35321e, str + c11239j);
                    this.f35324c.remove(c11239j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
