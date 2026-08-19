package p974qo;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import mo.InterfaceC17338e;
import p1048uo.C20407n;
import p117Eb.C2391u;
import p571X9.AbstractC9221V;

/* JADX INFO: renamed from: qo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC18789e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17338e f59713Y;

    /* JADX INFO: renamed from: Z */
    public volatile AtomicInteger f59714Z = new AtomicInteger(0);

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18792h f59715o0;

    public RunnableC18789e(C18792h c18792h, InterfaceC17338e interfaceC17338e) {
        this.f59715o0 = c18792h;
        this.f59713Y = interfaceC17338e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2391u c2391u;
        String strConcat = "OkHttp ".concat(this.f59715o0.f59722Z.f55379a.m19027h());
        C18792h c18792h = this.f59715o0;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c18792h.f59725q0.m1413i();
            boolean z6 = false;
            try {
                try {
                    try {
                        this.f59713Y.mo1006b(c18792h, c18792h.m20065g());
                        c2391u = c18792h.f59721Y.f55357Y;
                    } catch (IOException e10) {
                        e = e10;
                        z6 = true;
                        if (z6) {
                            C20407n c20407n = C20407n.f64525a;
                            C20407n c20407n2 = C20407n.f64525a;
                            String str = "Callback failure for " + C18792h.m20059a(c18792h);
                            c20407n2.getClass();
                            C20407n.m21074i(str, 4, e);
                        } else {
                            this.f59713Y.mo1007h(c18792h, e);
                        }
                        c2391u = c18792h.f59721Y.f55357Y;
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = true;
                        c18792h.cancel();
                        if (!z6) {
                            IOException iOException = new IOException("canceled due to " + th);
                            AbstractC9221V.m9789a(iOException, th);
                            this.f59713Y.mo1007h(c18792h, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    c18792h.f59721Y.f55357Y.m3526x(this);
                    throw th3;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
            }
            c2391u.m3526x(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th5) {
            threadCurrentThread.setName(name);
            throw th5;
        }
    }
}
