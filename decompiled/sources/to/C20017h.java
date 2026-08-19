package to;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p1048uo.C20407n;
import p298Lm.C5150L;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: to.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C20017h extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f63355e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f63356f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f63357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20017h(String str, Object obj, Object obj2, int i10) {
        super(str, true);
        this.f63355e = i10;
        this.f63356f = obj;
        this.f63357g = obj2;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        long jM20855a;
        C20030u[] c20030uArr;
        int i10 = 0;
        switch (this.f63355e) {
            case 0:
                C20022m c20022m = (C20022m) this.f63356f;
                c20022m.f63385Y.mo20070a(c20022m, (C20034y) ((C16525B) this.f63357g).f51262Y);
                return -1L;
            case 1:
                try {
                    ((C20022m) this.f63356f).f63385Y.mo20071b((C20030u) this.f63357g);
                    return -1L;
                } catch (IOException e10) {
                    C20407n c20407n = C20407n.f64525a;
                    C20407n c20407n2 = C20407n.f64525a;
                    String str = "Http2Connection.Listener failure for " + ((C20022m) this.f63356f).f63387o0;
                    c20407n2.getClass();
                    C20407n.m21074i(str, 4, e10);
                    try {
                        ((C20030u) this.f63357g).m20836c(2, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                C5150L c5150l = (C5150L) this.f63356f;
                C20034y c20034y = (C20034y) this.f63357g;
                c5150l.getClass();
                C16525B c16525b = new C16525B();
                C20022m c20022m2 = (C20022m) c5150l.f16792o0;
                synchronized (c20022m2.f63382I0) {
                    synchronized (c20022m2) {
                        try {
                            C20034y c20034y2 = c20022m2.f63376C0;
                            C20034y c20034y3 = new C20034y();
                            c20034y3.m20856b(c20034y2);
                            c20034y3.m20856b(c20034y);
                            c16525b.f51262Y = c20034y3;
                            jM20855a = ((long) c20034y3.m20855a()) - ((long) c20034y2.m20855a());
                            c20030uArr = (jM20855a == 0 || c20022m2.f63386Z.isEmpty()) ? null : (C20030u[]) c20022m2.f63386Z.values().toArray(new C20030u[0]);
                            C20034y c20034y4 = (C20034y) c16525b.f51262Y;
                            AbstractC16544l.m18094g(c20034y4, "<set-?>");
                            c20022m2.f63376C0 = c20034y4;
                            c20022m2.f63394v0.m19890c(new C20017h(c20022m2.f63387o0 + " onSettings", c20022m2, c16525b, i10), 0L);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        c20022m2.f63382I0.m20851a((C20034y) c16525b.f51262Y);
                    } catch (IOException e11) {
                        c20022m2.m20820a(2, 2, e11);
                    }
                    break;
                }
                if (c20030uArr == null) {
                    return -1L;
                }
                int length = c20030uArr.length;
                while (i10 < length) {
                    C20030u c20030u = c20030uArr[i10];
                    synchronized (c20030u) {
                        c20030u.f63433f += jM20855a;
                        if (jM20855a > 0) {
                            c20030u.notifyAll();
                        }
                        break;
                    }
                    i10++;
                }
                return -1L;
        }
    }
}
