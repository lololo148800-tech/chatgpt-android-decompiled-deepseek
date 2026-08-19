package to;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import no.AbstractC17708b;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: to.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C20030u {

    /* JADX INFO: renamed from: a */
    public final int f63428a;

    /* JADX INFO: renamed from: b */
    public final C20022m f63429b;

    /* JADX INFO: renamed from: c */
    public long f63430c;

    /* JADX INFO: renamed from: d */
    public long f63431d;

    /* JADX INFO: renamed from: e */
    public long f63432e;

    /* JADX INFO: renamed from: f */
    public long f63433f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f63434g;

    /* JADX INFO: renamed from: h */
    public boolean f63435h;

    /* JADX INFO: renamed from: i */
    public final C20028s f63436i;

    /* JADX INFO: renamed from: j */
    public final C20027r f63437j;

    /* JADX INFO: renamed from: k */
    public final C20029t f63438k;

    /* JADX INFO: renamed from: l */
    public final C20029t f63439l;

    /* JADX INFO: renamed from: m */
    public int f63440m;

    /* JADX INFO: renamed from: n */
    public IOException f63441n;

    public C20030u(int i10, C20022m connection, boolean z6, boolean z10, C17348o c17348o) {
        AbstractC16544l.m18094g(connection, "connection");
        this.f63428a = i10;
        this.f63429b = connection;
        this.f63433f = connection.f63376C0.m20855a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f63434g = arrayDeque;
        this.f63436i = new C20028s(this, connection.f63375B0.m20855a(), z10);
        this.f63437j = new C20027r(this, z6);
        this.f63438k = new C20029t(this);
        this.f63439l = new C20029t(this);
        if (c17348o == null) {
            if (!m20841h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m20841h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c17348o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    /* JADX INFO: renamed from: a */
    public final void m20834a() {
        boolean z6;
        boolean zM20842i;
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (this) {
            try {
                C20028s c20028s = this.f63436i;
                if (c20028s.f63422Z || !c20028s.f63425q0) {
                    z6 = false;
                } else {
                    C20027r c20027r = this.f63437j;
                    if (c20027r.f63417Y || c20027r.f63419o0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                zM20842i = m20842i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z6) {
            m20836c(9, null);
        } else {
            if (zM20842i) {
                return;
            }
            this.f63429b.m20823m(this.f63428a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20835b() throws IOException {
        C20027r c20027r = this.f63437j;
        if (c20027r.f63419o0) {
            throw new IOException("stream closed");
        }
        if (c20027r.f63417Y) {
            throw new IOException("stream finished");
        }
        if (this.f63440m != 0) {
            IOException iOException = this.f63441n;
            if (iOException != null) {
                throw iOException;
            }
            int i10 = this.f63440m;
            AbstractC14376f.m15824C(i10);
            throw new C20035z(i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20836c(int i10, IOException iOException) {
        AbstractC14376f.m15825D(i10, "rstStatusCode");
        if (m20837d(i10, iOException)) {
            C20022m c20022m = this.f63429b;
            c20022m.getClass();
            AbstractC14376f.m15825D(i10, "statusCode");
            c20022m.f63382I0.m20848S(this.f63428a, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20837d(int i10, IOException iOException) {
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (this) {
            if (this.f63440m != 0) {
                return false;
            }
            this.f63440m = i10;
            this.f63441n = iOException;
            notifyAll();
            if (this.f63436i.f63422Z && this.f63437j.f63417Y) {
                return false;
            }
            this.f63429b.m20823m(this.f63428a);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20838e(int i10) {
        AbstractC14376f.m15825D(i10, "errorCode");
        if (m20837d(i10, null)) {
            this.f63429b.m20818T(this.f63428a, i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized int m20839f() {
        return this.f63440m;
    }

    /* JADX INFO: renamed from: g */
    public final C20027r m20840g() {
        synchronized (this) {
            if (!this.f63435h && !m20841h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f63437j;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20841h() {
        boolean z6 = (this.f63428a & 1) == 1;
        this.f63429b.getClass();
        return true == z6;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m20842i() {
        if (this.f63440m != 0) {
            return false;
        }
        C20028s c20028s = this.f63436i;
        if (c20028s.f63422Z || c20028s.f63425q0) {
            C20027r c20027r = this.f63437j;
            if ((c20027r.f63417Y || c20027r.f63419o0) && this.f63435h) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m20843j(C17348o headers, boolean z6) {
        boolean zM20842i;
        AbstractC16544l.m18094g(headers, "headers");
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (this) {
            try {
                if (this.f63435h && z6) {
                    this.f63436i.getClass();
                } else {
                    this.f63435h = true;
                    this.f63434g.add(headers);
                }
                if (z6) {
                    this.f63436i.f63422Z = true;
                }
                zM20842i = m20842i();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zM20842i) {
            return;
        }
        this.f63429b.m20823m(this.f63428a);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m20844k(int i10) {
        AbstractC14376f.m15825D(i10, "errorCode");
        if (this.f63440m == 0) {
            this.f63440m = i10;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m20845l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
