package p974qo;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17338e;
import no.AbstractC17708b;
import p005A3.C0326m;
import p1048uo.C20407n;
import p117Eb.C2391u;
import p178H.C3179x;
import p887m7.C17180f;
import p909nm.AbstractC17686t;
import p933oo.C18251b;
import p950po.C18528b;
import p950po.C18529c;
import ro.C19257a;
import ro.C19261e;
import ro.InterfaceC19259c;

/* JADX INFO: renamed from: qo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C18792h implements Cloneable {

    /* JADX INFO: renamed from: A0 */
    public volatile boolean f59718A0;

    /* JADX INFO: renamed from: B0 */
    public volatile C0326m f59719B0;

    /* JADX INFO: renamed from: C0 */
    public volatile C18795k f59720C0;

    /* JADX INFO: renamed from: Y */
    public final C17356w f59721Y;

    /* JADX INFO: renamed from: Z */
    public final C17358y f59722Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f59723o0;

    /* JADX INFO: renamed from: p0 */
    public final C3179x f59724p0;

    /* JADX INFO: renamed from: q0 */
    public final C18791g f59725q0;

    /* JADX INFO: renamed from: r0 */
    public final AtomicBoolean f59726r0;

    /* JADX INFO: renamed from: s0 */
    public Object f59727s0;

    /* JADX INFO: renamed from: t0 */
    public C18788d f59728t0;

    /* JADX INFO: renamed from: u0 */
    public C18795k f59729u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f59730v0;

    /* JADX INFO: renamed from: w0 */
    public C0326m f59731w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f59732x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f59733y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f59734z0;

    public C18792h(C17356w client, C17358y originalRequest, boolean z6) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(originalRequest, "originalRequest");
        this.f59721Y = client;
        this.f59722Z = originalRequest;
        this.f59723o0 = z6;
        this.f59724p0 = (C3179x) client.f55358Z.f47885Y;
        client.f55361q0.getClass();
        C18791g c18791g = new C18791g(this);
        c18791g.mo1389g(client.f55351I0, TimeUnit.MILLISECONDS);
        this.f59725q0 = c18791g;
        this.f59726r0 = new AtomicBoolean();
        this.f59734z0 = true;
    }

    /* JADX INFO: renamed from: a */
    public static final String m20059a(C18792h c18792h) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c18792h.f59718A0 ? "canceled " : "");
        sb2.append(c18792h.f59723o0 ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(c18792h.f59722Z.f55379a.m19027h());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m20060b(C18795k c18795k) {
        byte[] bArr = AbstractC17708b.f56536a;
        if (this.f59729u0 != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f59729u0 = c18795k;
        c18795k.f59753p.add(new C18790f(this, this.f59727s0));
    }

    /* JADX INFO: renamed from: c */
    public final IOException m20061c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM20068j;
        byte[] bArr = AbstractC17708b.f56536a;
        C18795k c18795k = this.f59729u0;
        if (c18795k != null) {
            synchronized (c18795k) {
                socketM20068j = m20068j();
            }
            if (this.f59729u0 == null) {
                if (socketM20068j != null) {
                    AbstractC17708b.m19413e(socketM20068j);
                }
            } else if (socketM20068j != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f59730v0 && this.f59725q0.m1414j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC16544l.m18091d(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.f59718A0) {
            return;
        }
        this.f59718A0 = true;
        C0326m c0326m = this.f59719B0;
        if (c0326m != null) {
            ((InterfaceC19259c) c0326m.f1142d).cancel();
        }
        C18795k c18795k = this.f59720C0;
        if (c18795k == null || (socket = c18795k.f59740c) == null) {
            return;
        }
        AbstractC17708b.m19413e(socket);
    }

    public final Object clone() {
        return new C18792h(this.f59721Y, this.f59722Z, this.f59723o0);
    }

    /* JADX INFO: renamed from: d */
    public final void m20062d(InterfaceC17338e interfaceC17338e) {
        RunnableC18789e runnableC18789e;
        if (!this.f59726r0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C20407n c20407n = C20407n.f64525a;
        this.f59727s0 = C20407n.f64525a.mo21057g();
        C2391u c2391u = this.f59721Y.f55357Y;
        RunnableC18789e runnableC18789e2 = new RunnableC18789e(this, interfaceC17338e);
        c2391u.getClass();
        synchronized (c2391u) {
            ((ArrayDeque) c2391u.f7432q0).add(runnableC18789e2);
            if (!this.f59723o0) {
                String str = this.f59722Z.f55379a.f55289d;
                Iterator it = ((ArrayDeque) c2391u.f7430o0).iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c2391u.f7432q0).iterator();
                        do {
                            if (!it2.hasNext()) {
                                runnableC18789e = null;
                                break;
                            }
                            runnableC18789e = (RunnableC18789e) it2.next();
                        } while (!AbstractC16544l.m18089b(runnableC18789e.f59715o0.f59722Z.f55379a.f55289d, str));
                    } else {
                        runnableC18789e = (RunnableC18789e) it.next();
                    }
                } while (!AbstractC16544l.m18089b(runnableC18789e.f59715o0.f59722Z.f55379a.f55289d, str));
                if (runnableC18789e != null) {
                    runnableC18789e2.f59714Z = runnableC18789e.f59714Z;
                }
            }
        }
        c2391u.m3507D();
    }

    /* JADX INFO: renamed from: e */
    public final C17327D m20063e() {
        if (!this.f59726r0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f59725q0.m1413i();
        C20407n c20407n = C20407n.f64525a;
        this.f59727s0 = C20407n.f64525a.mo21057g();
        try {
            C2391u c2391u = this.f59721Y.f55357Y;
            synchronized (c2391u) {
                ((ArrayDeque) c2391u.f7431p0).add(this);
            }
            C17327D c17327dM20065g = m20065g();
            C2391u c2391u2 = this.f59721Y.f55357Y;
            c2391u2.getClass();
            c2391u2.m3525w((ArrayDeque) c2391u2.f7431p0, this);
            return c17327dM20065g;
        } catch (Throwable th2) {
            C2391u c2391u3 = this.f59721Y.f55357Y;
            c2391u3.getClass();
            c2391u3.m3525w((ArrayDeque) c2391u3.f7431p0, this);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20064f(boolean z6) {
        C0326m c0326m;
        synchronized (this) {
            if (!this.f59734z0) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (c0326m = this.f59719B0) != null) {
            ((InterfaceC19259c) c0326m.f1142d).cancel();
            ((C18792h) c0326m.f1140b).m20066h(c0326m, true, true, null);
        }
        this.f59731w0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX INFO: renamed from: g */
    public final C17327D m20065g() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC17686t.m19398v(this.f59721Y.f55359o0, arrayList);
        arrayList.add(new C17180f(this.f59721Y));
        arrayList.add(new C17180f(this.f59721Y.f55366v0));
        this.f59721Y.getClass();
        arrayList.add(new C18251b());
        arrayList.add(C18785a.f59692a);
        if (!this.f59723o0) {
            AbstractC17686t.m19398v(this.f59721Y.f55360p0, arrayList);
        }
        arrayList.add(new C19257a(this.f59723o0));
        C17358y c17358y = this.f59722Z;
        C17356w c17356w = this.f59721Y;
        boolean z6 = false;
        try {
            C17327D c17327dM20335b = new C19261e(this, arrayList, 0, null, c17358y, c17356w.f55352J0, c17356w.f55353K0, c17356w.f55354L0).m20335b(this.f59722Z);
            if (this.f59718A0) {
                AbstractC17708b.m19412d(c17327dM20335b);
                throw new IOException("Canceled");
            }
            m20067i(null);
            return c17327dM20335b;
        } catch (IOException e10) {
            try {
                IOException iOExceptionM20067i = m20067i(e10);
                AbstractC16544l.m18092e(iOExceptionM20067i, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM20067i;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (!z6) {
                    m20067i(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (!z6) {
                m20067i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    /* JADX INFO: renamed from: h */
    public final IOException m20066h(C0326m exchange, boolean z6, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC16544l.m18094g(exchange, "exchange");
        if (!exchange.equals(this.f59719B0)) {
            return iOException;
        }
        synchronized (this) {
            z11 = false;
            if (z6) {
                try {
                    if (this.f59732x0) {
                        if (z6) {
                            this.f59732x0 = false;
                        }
                        if (z10) {
                            this.f59733y0 = false;
                        }
                        z13 = this.f59732x0;
                        if (z13) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (!z13) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                    } else if (z10 || !this.f59733y0) {
                        z12 = false;
                    } else {
                        if (z6) {
                            this.f59732x0 = false;
                        }
                        if (z10) {
                            this.f59733y0 = false;
                        }
                        z13 = this.f59732x0;
                        if (z13 || this.f59733y0) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (!z13 && !this.f59733y0 && !this.f59734z0) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (z10) {
                }
                z12 = false;
            }
        }
        if (z11) {
            this.f59719B0 = null;
            C18795k c18795k = this.f59729u0;
            if (c18795k != null) {
                c18795k.m20076h();
            }
        }
        return z12 ? m20061c(iOException) : iOException;
    }

    /* JADX INFO: renamed from: i */
    public final IOException m20067i(IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f59734z0) {
                this.f59734z0 = false;
                if (!this.f59732x0 && !this.f59733y0) {
                    z6 = true;
                }
            }
        }
        return z6 ? m20061c(iOException) : iOException;
    }

    /* JADX INFO: renamed from: j */
    public final Socket m20068j() {
        C18795k c18795k = this.f59729u0;
        AbstractC16544l.m18091d(c18795k);
        byte[] bArr = AbstractC17708b.f56536a;
        ArrayList arrayList = c18795k.f59753p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC16544l.m18089b(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f59729u0 = null;
        if (arrayList.isEmpty()) {
            c18795k.f59754q = System.nanoTime();
            C3179x c3179x = this.f59724p0;
            c3179x.getClass();
            byte[] bArr2 = AbstractC17708b.f56536a;
            boolean z6 = c18795k.f59747j;
            C18529c c18529c = (C18529c) c3179x.f9587Z;
            if (z6) {
                c18795k.f59747j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c3179x.f9589p0;
                concurrentLinkedQueue.remove(c18795k);
                if (concurrentLinkedQueue.isEmpty()) {
                    c18529c.m19888a();
                }
                Socket socket = c18795k.f59741d;
                AbstractC16544l.m18091d(socket);
                return socket;
            }
            c18529c.m19890c((C18528b) c3179x.f9588o0, 0L);
        }
        return null;
    }
}
