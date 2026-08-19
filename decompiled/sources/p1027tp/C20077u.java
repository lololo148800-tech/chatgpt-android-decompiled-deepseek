package p1027tp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import mo.C17324A;
import mo.C17326C;
import mo.C17327D;
import mo.C17328E;
import mo.C17346m;
import mo.C17349p;
import mo.C17352s;
import mo.C17354u;
import mo.C17356w;
import mo.C17358y;
import mo.C17359z;
import mo.InterfaceC17337d;
import no.AbstractC17708b;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p228J.C3847l0;
import p658b5.C11232c;
import p658b5.C11242m;
import p712dp.C13187c;
import p791hj.C14522e;
import p974qo.C18792h;
import sk.C19665d;

/* JADX INFO: renamed from: tp.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C20077u implements InterfaceC20059c {

    /* JADX INFO: renamed from: Y */
    public final C20047L f63579Y;

    /* JADX INFO: renamed from: Z */
    public final Object[] f63580Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC17337d f63581o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC20067k f63582p0;

    /* JADX INFO: renamed from: q0 */
    public volatile boolean f63583q0;

    /* JADX INFO: renamed from: r0 */
    public C18792h f63584r0;

    /* JADX INFO: renamed from: s0 */
    public Throwable f63585s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f63586t0;

    public C20077u(C20047L c20047l, Object[] objArr, InterfaceC17337d interfaceC17337d, InterfaceC20067k interfaceC20067k) {
        this.f63579Y = c20047l;
        this.f63580Z = objArr;
        this.f63581o0 = interfaceC17337d;
        this.f63582p0 = interfaceC20067k;
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: E */
    public final void mo20893E(InterfaceC20062f interfaceC20062f) {
        C18792h c18792h;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f63586t0) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f63586t0 = true;
                c18792h = this.f63584r0;
                th2 = this.f63585s0;
                if (c18792h == null && th2 == null) {
                    try {
                        C18792h c18792hM20913a = m20913a();
                        this.f63584r0 = c18792hM20913a;
                        c18792h = c18792hM20913a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        AbstractC20056V.m20889o(th2);
                        this.f63585s0 = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            interfaceC20062f.mo3626s(this, th2);
            return;
        }
        if (this.f63583q0) {
            c18792h.cancel();
        }
        c18792h.m20062d(new C19665d(this, 1, interfaceC20062f));
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: P */
    public final synchronized C17358y mo20894P() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m20914b().f59722Z;
    }

    /* JADX INFO: renamed from: a */
    public final C18792h m20913a() {
        C17349p c17349pM14841c;
        C20047L c20047l = this.f63579Y;
        Object[] objArr = this.f63580Z;
        int length = objArr.length;
        AbstractC20056V[] abstractC20056VArr = c20047l.f63523j;
        if (length != abstractC20056VArr.length) {
            throw new IllegalArgumentException(AbstractC10763a.m11056n(AbstractC10763a.m11057o(length, "Argument count (", ") doesn't match expected count ("), abstractC20056VArr.length, Separators.RPAREN));
        }
        C20045J c20045j = new C20045J(c20047l.f63516c, c20047l.f63515b, c20047l.f63517d, c20047l.f63518e, c20047l.f63519f, c20047l.f63520g, c20047l.f63521h, c20047l.f63522i);
        if (c20047l.f63524k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC20056VArr[i10].mo20858a(c20045j, objArr[i10]);
        }
        C13187c c13187c = c20045j.f63481d;
        if (c13187c != null) {
            c17349pM14841c = c13187c.m14841c();
        } else {
            String link = c20045j.f63480c;
            C17349p c17349p = c20045j.f63479b;
            c17349p.getClass();
            AbstractC16544l.m18094g(link, "link");
            C13187c c13187cM19026g = c17349p.m19026g(link);
            c17349pM14841c = c13187cM19026g != null ? c13187cM19026g.m14841c() : null;
            if (c17349pM14841c == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c17349p + ", Relative: " + c20045j.f63480c);
            }
        }
        AbstractC17325B c17359z = c20045j.f63488k;
        if (c17359z == null) {
            C11232c c11232c = c20045j.f63487j;
            if (c11232c != null) {
                c17359z = new C17346m((ArrayList) c11232c.f33996Y, (ArrayList) c11232c.f33997Z);
            } else {
                C11242m c11242m = c20045j.f63486i;
                if (c11242m != null) {
                    ArrayList arrayList2 = (ArrayList) c11242m.f34020o0;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    c17359z = new C17354u((C0678l) c11242m.f34018Y, (C17352s) c11242m.f34019Z, AbstractC17708b.m19433y(arrayList2));
                } else if (c20045j.f63485h) {
                    long j10 = 0;
                    AbstractC17708b.m19411c(j10, j10, j10);
                    c17359z = new C17324A(null, 0, new byte[0], 0);
                }
            }
        }
        C17352s c17352s = c20045j.f63484g;
        C3847l0 c3847l0 = c20045j.f63483f;
        if (c17352s != null) {
            if (c17359z != null) {
                c17359z = new C17359z(c17359z, c17352s);
            } else {
                c3847l0.m4574a(SIPHeaderNames.CONTENT_TYPE, c17352s.f55298a);
            }
        }
        C14522e c14522e = c20045j.f63482e;
        c14522e.getClass();
        c14522e.f45762Z = c17349pM14841c;
        c14522e.m16025s(c3847l0.m4577d());
        c14522e.m16028v(c20045j.f63478a, c17359z);
        c14522e.m16032z(C20072p.class, new C20072p(c20047l.f63514a, arrayList));
        return ((C17356w) this.f63581o0).m19035b(c14522e.m16017i());
    }

    /* JADX INFO: renamed from: b */
    public final C18792h m20914b() throws IOException {
        C18792h c18792h = this.f63584r0;
        if (c18792h != null) {
            return c18792h;
        }
        Throwable th2 = this.f63585s0;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            C18792h c18792hM20913a = m20913a();
            this.f63584r0 = c18792hM20913a;
            return c18792hM20913a;
        } catch (IOException | Error | RuntimeException e10) {
            AbstractC20056V.m20889o(e10);
            this.f63585s0 = e10;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C20048M m20915c(C17327D c17327d) throws IOException {
        C17326C c17326cM18986e = c17327d.m18986e();
        AbstractC17329F abstractC17329F = c17327d.f55179s0;
        c17326cM18986e.f55166g = new C20076t(abstractC17329F.mo18990e(), abstractC17329F.mo18989a());
        C17327D c17327dM18984a = c17326cM18986e.m18984a();
        int i10 = c17327dM18984a.f55176p0;
        if (i10 < 200 || i10 >= 300) {
            try {
                C0675i c0675i = new C0675i();
                abstractC17329F.mo18988O0().mo1341F0(c0675i);
                C17328E c17328e = new C17328E(abstractC17329F.mo18990e(), abstractC17329F.mo18989a(), c0675i, 0);
                if (c17327dM18984a.m18985a()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                C20048M c20048m = new C20048M(c17327dM18984a, null, c17328e);
                abstractC17329F.close();
                return c20048m;
            } catch (Throwable th2) {
                abstractC17329F.close();
                throw th2;
            }
        }
        if (i10 == 204 || i10 == 205) {
            abstractC17329F.close();
            return C20048M.m20870c(null, c17327dM18984a);
        }
        C20075s c20075s = new C20075s(abstractC17329F);
        try {
            return C20048M.m20870c(this.f63582p0.mo15962a(c20075s), c17327dM18984a);
        } catch (RuntimeException e10) {
            IOException iOException = c20075s.f63576o0;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // p1027tp.InterfaceC20059c
    public final void cancel() {
        C18792h c18792h;
        this.f63583q0 = true;
        synchronized (this) {
            c18792h = this.f63584r0;
        }
        if (c18792h != null) {
            c18792h.cancel();
        }
    }

    public final Object clone() {
        return new C20077u(this.f63579Y, this.f63580Z, this.f63581o0, this.f63582p0);
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: m */
    public final boolean mo20895m() {
        boolean z6 = true;
        if (this.f63583q0) {
            return true;
        }
        synchronized (this) {
            C18792h c18792h = this.f63584r0;
            if (c18792h == null || !c18792h.f59718A0) {
                z6 = false;
            }
        }
        return z6;
    }

    @Override // p1027tp.InterfaceC20059c
    public final InterfaceC20059c clone() {
        return new C20077u(this.f63579Y, this.f63580Z, this.f63581o0, this.f63582p0);
    }
}
