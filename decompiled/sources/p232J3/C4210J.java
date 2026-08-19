package p232J3;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import p007A5.C0376k;
import p1073w3.AbstractC20800b;
import p1142z3.C21728A;
import p1142z3.C21743k;
import p1142z3.InterfaceC21740h;
import p310M9.C5311e;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p673c4.C11646b;
import p800i4.C14924d;

/* JADX INFO: renamed from: J3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C4210J {

    /* JADX INFO: renamed from: b */
    public final Uri f13682b;

    /* JADX INFO: renamed from: c */
    public final C21728A f13683c;

    /* JADX INFO: renamed from: d */
    public final C5311e f13684d;

    /* JADX INFO: renamed from: e */
    public final C4213M f13685e;

    /* JADX INFO: renamed from: f */
    public final C0376k f13686f;

    /* JADX INFO: renamed from: h */
    public volatile boolean f13688h;

    /* JADX INFO: renamed from: j */
    public long f13690j;

    /* JADX INFO: renamed from: l */
    public InterfaceC6316H f13692l;

    /* JADX INFO: renamed from: m */
    public boolean f13693m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C4213M f13694n;

    /* JADX INFO: renamed from: g */
    public final C6337s f13687g = new C6337s();

    /* JADX INFO: renamed from: i */
    public boolean f13689i = true;

    /* JADX INFO: renamed from: a */
    public final long f13681a = C4244p.f13870b.getAndIncrement();

    /* JADX INFO: renamed from: k */
    public C21743k f13691k = m4939a(0);

    public C4210J(C4213M c4213m, Uri uri, InterfaceC21740h interfaceC21740h, C5311e c5311e, C4213M c4213m2, C0376k c0376k) {
        this.f13694n = c4213m;
        this.f13682b = uri;
        this.f13683c = new C21728A(interfaceC21740h);
        this.f13684d = c5311e;
        this.f13685e = c4213m2;
        this.f13686f = c0376k;
    }

    /* JADX INFO: renamed from: a */
    public final C21743k m4939a(long j10) {
        Collections.emptyMap();
        this.f13694n.getClass();
        Map map = C4213M.f13699Z0;
        Uri uri = this.f13682b;
        AbstractC20800b.m21322j(uri, "The uri must be set.");
        return new C21743k(uri, 0L, 1, null, map, j10, -1L, null, 6);
    }

    /* JADX INFO: renamed from: b */
    public final void m4940b() {
        InterfaceC21740h c4243o;
        InterfaceC6333o interfaceC6333o;
        int i10;
        int iMo6859h = 0;
        while (iMo6859h == 0 && !this.f13688h) {
            try {
                long j10 = this.f13687g.f20561a;
                C21743k c21743kM4939a = m4939a(j10);
                this.f13691k = c21743kM4939a;
                long jMo926a = this.f13683c.mo926a(c21743kM4939a);
                if (this.f13688h) {
                    if (iMo6859h != 1 && this.f13684d.m5863s() != -1) {
                        this.f13687g.f20561a = this.f13684d.m5863s();
                    }
                    C21728A c21728a = this.f13683c;
                    if (c21728a != null) {
                        try {
                            c21728a.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (jMo926a != -1) {
                    jMo926a += j10;
                    C4213M c4213m = this.f13694n;
                    c4213m.f13702B0.post(new RunnableC4208H(c4213m, 0));
                }
                long j11 = jMo926a;
                this.f13694n.f13704D0 = C11646b.m13005a(this.f13683c.f68926Y.mo929h());
                C21728A c21728a2 = this.f13683c;
                C11646b c11646b = this.f13694n.f13704D0;
                if (c11646b == null || (i10 = c11646b.f35282r0) == -1) {
                    c4243o = c21728a2;
                } else {
                    c4243o = new C4243o(c21728a2, i10, this);
                    C4213M c4213m2 = this.f13694n;
                    c4213m2.getClass();
                    InterfaceC6316H interfaceC6316HM4956y = c4213m2.m4956y(new C4212L(0, true));
                    this.f13692l = interfaceC6316HM4956y;
                    interfaceC6316HM4956y.mo4971d(C4213M.f13700a1);
                }
                long jM5863s = j10;
                this.f13684d.m5866v(c4243o, this.f13682b, this.f13683c.f68926Y.mo929h(), j10, j11, this.f13685e);
                if (this.f13694n.f13704D0 != null && (interfaceC6333o = (InterfaceC6333o) this.f13684d.f17485o0) != null) {
                    InterfaceC6333o interfaceC6333oMo6855a = interfaceC6333o.mo6855a();
                    if (interfaceC6333oMo6855a instanceof C14924d) {
                        ((C14924d) interfaceC6333oMo6855a).f46505q = true;
                    }
                }
                if (this.f13689i) {
                    C5311e c5311e = this.f13684d;
                    long j12 = this.f13690j;
                    InterfaceC6333o interfaceC6333o2 = (InterfaceC6333o) c5311e.f17485o0;
                    interfaceC6333o2.getClass();
                    interfaceC6333o2.mo6857f(jM5863s, j12);
                    this.f13689i = false;
                }
                while (true) {
                    long j13 = jM5863s;
                    while (true) {
                        if (iMo6859h != 0 || this.f13688h) {
                            break;
                        }
                        try {
                            C0376k c0376k = this.f13686f;
                            synchronized (c0376k) {
                                while (!c0376k.f1278Z) {
                                    try {
                                        c0376k.wait();
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            C5311e c5311e2 = this.f13684d;
                            C6337s c6337s = this.f13687g;
                            InterfaceC6333o interfaceC6333o3 = (InterfaceC6333o) c5311e2.f17485o0;
                            interfaceC6333o3.getClass();
                            C6330l c6330l = (C6330l) c5311e2.f17486p0;
                            c6330l.getClass();
                            iMo6859h = interfaceC6333o3.mo6859h(c6330l, c6337s);
                            jM5863s = this.f13684d.m5863s();
                            if (jM5863s > this.f13694n.f13734u0 + j13) {
                                this.f13686f.m1012d();
                                C4213M c4213m3 = this.f13694n;
                                c4213m3.f13702B0.post(c4213m3.f13701A0);
                            }
                        } catch (InterruptedException unused2) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iMo6859h == 1) {
                    iMo6859h = 0;
                } else if (this.f13684d.m5863s() != -1) {
                    this.f13687g.f20561a = this.f13684d.m5863s();
                }
                C21728A c21728a3 = this.f13683c;
                if (c21728a3 != null) {
                    try {
                        c21728a3.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th3) {
                if (iMo6859h != 1 && this.f13684d.m5863s() != -1) {
                    this.f13687g.f20561a = this.f13684d.m5863s();
                }
                C21728A c21728a4 = this.f13683c;
                if (c21728a4 != null) {
                    try {
                        c21728a4.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th3;
            }
        }
    }
}
