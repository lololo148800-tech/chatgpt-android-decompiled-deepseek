package p1036u9;

import android.gov.nist.core.Separators;
import io.sentry.android.core.RunnableC15195M;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17348o;
import mo.C17358y;
import mo.InterfaceC17338e;
import no.AbstractC17708b;
import p005A3.C0326m;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1096x2.C21111f;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1139z0.C21585H;
import p1139z0.C21639s;
import p1140z1.C21658D;
import p1159zo.C22221g;
import p1159zo.C22222h;
import p200Hm.C3508g;
import p372P3.AbstractC6320b;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p392Q0.C6546d;
import p468T2.RunnableC7216h;
import p734ep.C13458b;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.ExecutorC13605n;
import p746fa.InterfaceC13594c;
import p784hb.C14438g;
import p974qo.C18792h;
import p974qo.C18794j;

/* JADX INFO: renamed from: u9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C20168n implements InterfaceC13594c, InterfaceC17338e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63874Y;

    /* JADX INFO: renamed from: Z */
    public Object f63875Z;

    /* JADX INFO: renamed from: o0 */
    public Object f63876o0;

    public /* synthetic */ C20168n(Object obj, int i10, Object obj2) {
        this.f63874Y = i10;
        this.f63875Z = obj;
        this.f63876o0 = obj2;
    }

    /* JADX INFO: renamed from: f */
    public static void m20986f(C21658D c21658d) {
        c21658d.m22043j();
        int i10 = 0;
        c21658d.f68646Q0 = false;
        C6546d c6546dM22014L = c21658d.m22014L();
        int i11 = c6546dM22014L.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            do {
                m20986f((C21658D) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20987a(C21639s c21639s, int i10, int i11, int i12) {
        int i13;
        if (((C6546d) this.f63876o0).m7108m()) {
            i13 = 0;
        } else {
            C6546d c6546d = (C6546d) this.f63876o0;
            if (c6546d.m7108m()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C21639s c21639s2 = (C21639s) c6546d.f21182Y[c6546d.f21184o0 - 1];
            i13 = c21639s2.f68547b - c21639s2.f68549d;
        }
        if (c21639s == null) {
            int i14 = i10 - i13;
            c21639s = new C21639s(i10, i11 + i12, i14, (i11 - i10) + i14);
        } else {
            if (c21639s.f68546a > i10) {
                c21639s.f68546a = i10;
                c21639s.f68548c = i10;
            }
            int i15 = c21639s.f68547b;
            if (i11 > i15) {
                int i16 = i15 - c21639s.f68549d;
                c21639s.f68547b = i11;
                c21639s.f68549d = i11 - i16;
            }
            c21639s.f68547b += i12;
        }
        ((C6546d) this.f63876o0).m7099c(c21639s);
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h call, C17327D c17327d) {
        AbstractC16544l.m18094g(call, "call");
        C0326m c0326m = c17327d.f55185y0;
        try {
            ((C22221g) this.f63875Z).m22405a(c17327d, c0326m);
            C18794j c18794jM959s = c0326m.m959s();
            C17348o c17348o = c17327d.f55178r0;
            int size = c17348o.size();
            int i10 = 0;
            int i11 = 0;
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            Integer numM21736w = null;
            Integer numM21736w2 = null;
            while (i11 < size) {
                if (AbstractC21329w.m21726m(c17348o.m19014m(i11), "Sec-WebSocket-Extensions")) {
                    String strM19018s = c17348o.m19018s(i11);
                    int i12 = i10;
                    while (i12 < strM19018s.length()) {
                        int iM19416h = AbstractC17708b.m19416h(strM19018s, ',', i12, i10, 4);
                        int iM19414f = AbstractC17708b.m19414f(strM19018s, ';', i12, iM19416h);
                        String strM19408A = AbstractC17708b.m19408A(i12, iM19414f, strM19018s);
                        int i13 = iM19414f + 1;
                        if (strM19408A.equalsIgnoreCase("permessage-deflate")) {
                            if (z6) {
                                z12 = true;
                            }
                            i12 = i13;
                            while (i12 < iM19416h) {
                                int iM19414f2 = AbstractC17708b.m19414f(strM19018s, ';', i12, iM19416h);
                                int iM19414f3 = AbstractC17708b.m19414f(strM19018s, '=', i12, iM19414f2);
                                String strM19408A2 = AbstractC17708b.m19408A(i12, iM19414f3, strM19018s);
                                String strM21691Y = iM19414f3 < iM19414f2 ? AbstractC21322p.m21691Y(AbstractC17708b.m19408A(iM19414f3 + 1, iM19414f2, strM19018s)) : null;
                                i12 = iM19414f2 + 1;
                                if (strM19408A2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (numM21736w != null) {
                                        z12 = true;
                                    }
                                    numM21736w = strM21691Y != null ? AbstractC21329w.m21736w(strM21691Y) : null;
                                    if (numM21736w == null) {
                                        z12 = true;
                                    }
                                } else if (strM19408A2.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (z10) {
                                        z12 = true;
                                    }
                                    if (strM21691Y != null) {
                                        z12 = true;
                                    }
                                    z10 = true;
                                } else if (strM19408A2.equalsIgnoreCase("server_max_window_bits")) {
                                    if (numM21736w2 != null) {
                                        z12 = true;
                                    }
                                    numM21736w2 = strM21691Y != null ? AbstractC21329w.m21736w(strM21691Y) : null;
                                    if (numM21736w2 == null) {
                                        z12 = true;
                                    }
                                } else if (strM19408A2.equalsIgnoreCase("server_no_context_takeover")) {
                                    if (z11) {
                                        z12 = true;
                                    }
                                    if (strM21691Y != null) {
                                        z12 = true;
                                    }
                                    z11 = true;
                                } else {
                                    z12 = true;
                                }
                            }
                            z6 = true;
                        } else {
                            z12 = true;
                            i12 = i13;
                        }
                        i10 = 0;
                    }
                }
                i11++;
                i10 = 0;
            }
            ((C22221g) this.f63875Z).f70420d = new C22222h(z6, numM21736w, z10, numM21736w2, z11, z12);
            if (z12 || numM21736w != null || (numM21736w2 != null && !new C3508g(8, 15, 1).m4200j(numM21736w2.intValue()))) {
                C22221g c22221g = (C22221g) this.f63875Z;
                synchronized (c22221g) {
                    c22221g.f70431o.clear();
                    c22221g.m22406b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                ((C22221g) this.f63875Z).m22408d(AbstractC17708b.f56542g + " WebSocket " + ((C17358y) this.f63876o0).f55379a.m19027h(), c18794jM959s);
                C22221g c22221g2 = (C22221g) this.f63875Z;
                c22221g2.f70417a.mo4342j(c22221g2, c17327d);
                ((C22221g) this.f63875Z).m22409e();
            } catch (Exception e10) {
                ((C22221g) this.f63875Z).m22407c(e10, null);
            }
        } catch (IOException e11) {
            ((C22221g) this.f63875Z).m22407c(e11, c17327d);
            AbstractC17708b.m19412d(c17327d);
            if (c0326m != null) {
                c0326m.m955m(true, true, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20988c() {
        ((C6546d) this.f63875Z).m7104i();
    }

    /* JADX INFO: renamed from: d */
    public void m20989d(long j10, C20811m c20811m) {
        if (c20811m.m21346a() < 9) {
            return;
        }
        int iM21352g = c20811m.m21352g();
        int iM21352g2 = c20811m.m21352g();
        int iM21365t = c20811m.m21365t();
        if (iM21352g == 434 && iM21352g2 == 1195456820 && iM21365t == 3) {
            AbstractC6320b.m6889e(j10, c20811m, (InterfaceC6316H[]) this.f63876o0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20990e(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        int i10 = 0;
        while (true) {
            InterfaceC6316H[] interfaceC6316HArr = (InterfaceC6316H[]) this.f63876o0;
            if (i10 >= interfaceC6316HArr.length) {
                return;
            }
            c13458b.m14981c();
            c13458b.m14986h();
            InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 3);
            C19788o c19788o = (C19788o) ((List) this.f63875Z).get(i10);
            String str = c19788o.f62752m;
            AbstractC20800b.m21315c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C19787n c19787n = new C19787n();
            c13458b.m14986h();
            c19787n.f62703a = (String) c13458b.f42596e;
            c19787n.f62714l = AbstractC19754D.m20711i(str);
            c19787n.f62707e = c19788o.f62744e;
            c19787n.f62706d = c19788o.f62743d;
            c19787n.f62698E = c19788o.f62734F;
            c19787n.f62717o = c19788o.f62755p;
            interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
            interfaceC6316HArr[i10] = interfaceC6316HMo3044D;
            i10++;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m20991g(C21111f c21111f) {
        int i10 = c21111f.f67058b;
        ExecutorC13605n executorC13605n = (ExecutorC13605n) this.f63876o0;
        C14438g c14438g = (C14438g) this.f63875Z;
        if (i10 != 0) {
            executorC13605n.execute(new RunnableC7216h(c14438g, i10, 5));
        } else {
            executorC13605n.execute(new RunnableC15195M(c14438g, c21111f.f67057a, false, 21));
        }
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h call, IOException iOException) {
        AbstractC16544l.m18094g(call, "call");
        ((C22221g) this.f63875Z).m22407c(iOException, null);
    }

    /* JADX INFO: renamed from: i */
    public void m20992i(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11 && i12 == 0) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i14 = i12 - (iMax - iMin);
        int i15 = 0;
        C21639s c21639s = null;
        boolean z6 = false;
        while (true) {
            C6546d c6546d = (C6546d) this.f63875Z;
            if (i15 >= c6546d.f21184o0) {
                break;
            }
            C21639s c21639s2 = (C21639s) c6546d.f21182Y[i15];
            int i16 = c21639s2.f68546a;
            if ((iMin > i16 || i16 > iMax) && (iMin > (i13 = c21639s2.f68547b) || i13 > iMax)) {
                if (i16 > iMax && !z6) {
                    m20987a(c21639s, iMin, iMax, i14);
                    z6 = true;
                }
                if (z6) {
                    c21639s2.f68546a += i14;
                    c21639s2.f68547b += i14;
                }
                ((C6546d) this.f63876o0).m7099c(c21639s2);
            } else if (c21639s == null) {
                c21639s = c21639s2;
            } else {
                c21639s.f68547b = c21639s2.f68547b;
                c21639s.f68549d = c21639s2.f68549d;
            }
            i15++;
        }
        if (!z6) {
            m20987a(c21639s, iMin, iMax, i14);
        }
        C6546d c6546d2 = (C6546d) this.f63875Z;
        this.f63875Z = (C6546d) this.f63876o0;
        this.f63876o0 = c6546d2;
        c6546d2.m7104i();
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        ((Map) ((C21585H) this.f63876o0).f68345o0).remove((C13599h) this.f63875Z);
    }

    public String toString() {
        switch (this.f63874Y) {
            case 4:
                StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
                C6546d c6546d = (C6546d) this.f63875Z;
                int i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    int i11 = 0;
                    do {
                        C21639s c21639s = (C21639s) objArr[i11];
                        sb2.append(Separators.LPAREN + c21639s.f68548c + ',' + c21639s.f68549d + ")->(" + c21639s.f68546a + ',' + c21639s.f68547b + ')');
                        if (i11 < ((C6546d) this.f63875Z).f21184o0 - 1) {
                            sb2.append(", ");
                        }
                        i11++;
                    } while (i11 < i10);
                }
                sb2.append("])");
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public C20168n(C21585H c21585h, C13599h c13599h) {
        this.f63874Y = 0;
        this.f63876o0 = c21585h;
        this.f63875Z = c13599h;
    }

    public C20168n() {
        this.f63874Y = 5;
        this.f63875Z = new C6546d(new C21658D[16]);
    }

    public C20168n(C20168n c20168n) {
        C6546d c6546d;
        int i10;
        this.f63874Y = 4;
        this.f63875Z = new C6546d(new C21639s[16]);
        this.f63876o0 = new C6546d(new C21639s[16]);
        if (c20168n == null || (c6546d = (C6546d) c20168n.f63875Z) == null || (i10 = c6546d.f21184o0) <= 0) {
            return;
        }
        Object[] objArr = c6546d.f21182Y;
        int i11 = 0;
        do {
            C21639s c21639s = (C21639s) objArr[i11];
            ((C6546d) this.f63875Z).m7099c(new C21639s(c21639s.f68546a, c21639s.f68547b, c21639s.f68548c, c21639s.f68549d));
            i11++;
        } while (i11 < i10);
    }

    public C20168n(List list) {
        this.f63874Y = 1;
        this.f63875Z = list;
        this.f63876o0 = new InterfaceC6316H[list.size()];
    }
}
