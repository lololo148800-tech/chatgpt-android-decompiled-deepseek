package p509Uk;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import il.C15038c;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.C15087m;
import io.ktor.utils.p815io.InterfaceC15088n;
import io.sentry.C15358g1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17285c;
import ml.AbstractC17286d;
import ml.AbstractC17287e;
import ml.AbstractC17288f;
import mm.C17314q;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import mo.C17324A;
import mo.C17327D;
import mo.C17352s;
import mo.C17356w;
import mo.C17358y;
import mo.EnumC17357x;
import no.AbstractC17708b;
import p008A6.C0383c;
import p008A6.C0386f;
import p025An.AbstractC0575H;
import p025An.C0565C;
import p025An.C0566C0;
import p025An.C0613g0;
import p025An.C0624m;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.C0644w;
import p025An.EnumC0573G;
import p025An.InterfaceC0627n0;
import p025An.InterfaceC0638t;
import p026Ao.InterfaceC0677k;
import p033B5.C0819c;
import p033B5.C0821e;
import p033B5.C0841y;
import p059C5.C1601s;
import p1045ul.AbstractC20384a;
import p1045ul.C20387d;
import p129En.C2585E;
import p185H6.C3255k;
import p334Na.AbstractC5695b;
import p482Tg.C7445b0;
import p485Tk.AbstractC7496e;
import p485Tk.AbstractC7501j;
import p485Tk.C7500i;
import p485Tk.InterfaceC7497f;
import p523V9.AbstractC8154o0;
import p523V9.AbstractC8162p0;
import p556Wk.C8906U;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p710dl.C13182a;
import p731el.C13443a;
import p754fl.AbstractC13695e;
import p754fl.C13694d;
import p754fl.C13697g;
import p791hj.C14522e;
import p817j$.util.DesugarCollections;
import p857kl.AbstractC16435B;
import p857kl.C16438E;
import p857kl.C16439F;
import p857kl.C16440G;
import p857kl.C16460h;
import p857kl.C16477y;
import p857kl.C16478z;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18776i;
import p974qo.C18792h;
import p996rm.EnumC19250a;
import sl.AbstractC19681p;
import sl.C19678m;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Uk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7713f extends AbstractC7496e {

    /* JADX INFO: renamed from: u0 */
    public static final C17314q f24302u0 = AbstractC9227W.m9800c(new C1601s(10));

    /* JADX INFO: renamed from: p0 */
    public final C7709b f24303p0;

    /* JADX INFO: renamed from: q0 */
    public final Set f24304q0 = AbstractC17678l.m19293P(new InterfaceC7497f[]{C8906U.f27257a, C13443a.f42567a, C13182a.f41835a});

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC18776i f24305r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC18776i f24306s0;

    /* JADX INFO: renamed from: t0 */
    public final Map f24307t0;

    public C7713f(C7709b c7709b) {
        this.f24303p0 = c7709b;
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new C19678m(new C7445b0(1, this, C7713f.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 1), new C0383c(11), c7709b.f24287b));
        AbstractC16544l.m18093f(mapSynchronizedMap, "synchronizedMap(...)");
        this.f24307t0 = mapSynchronizedMap;
        InterfaceC18774g interfaceC18774g = super.getCoroutineContext().get(C0625m0.f1875Y);
        AbstractC16544l.m18091d(interfaceC18774g);
        InterfaceC18776i interfaceC18776iM6138e = AbstractC5695b.m6138e(new C0566C0((InterfaceC0627n0) interfaceC18774g), new C0841y(C0565C.f1783Y, 5));
        this.f24305r0 = interfaceC18776iM6138e;
        this.f24306s0 = super.getCoroutineContext().plus(interfaceC18776iM6138e);
        AbstractC0575H.m1155C(C0613g0.f1858Y, super.getCoroutineContext(), EnumC0573G.f1792o0, new C7710c(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: a */
    public final Object m7975a(C13694d c13694d, AbstractC19687c abstractC19687c) {
        C7711d c7711d;
        C13694d c13694d2;
        C7713f c7713f;
        String strMo7982g;
        String strMo7982g2;
        C13694d c13694d3;
        C7711d c7711d2;
        AbstractC17325B abstractC17325B;
        AbstractC17325B c17324a;
        int i10 = 1;
        if (abstractC19687c instanceof C7711d) {
            c7711d = (C7711d) abstractC19687c;
            int i11 = c7711d.f24294q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c7711d.f24294q0 = i11 - Integer.MIN_VALUE;
            } else {
                c7711d = new C7711d(this, abstractC19687c);
            }
        } else {
            c7711d = new C7711d(this, abstractC19687c);
        }
        C7711d c7711d3 = c7711d;
        Object objM7976e = c7711d3.f24292o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c7711d3.f24294q0;
        if (i12 != 0) {
            if (i12 == 1) {
                C13694d c13694d4 = c7711d3.f24291Z;
                C7713f c7713f2 = c7711d3.f24290Y;
                AbstractC9233X.m9807c(objM7976e);
                c13694d2 = c13694d4;
                c7713f = c7713f2;
            } else {
                if (i12 == 2) {
                    AbstractC9233X.m9807c(objM7976e);
                    return objM7976e;
                }
                if (i12 == 3) {
                    AbstractC9233X.m9807c(objM7976e);
                    return objM7976e;
                }
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM7976e);
            }
        }
        AbstractC9233X.m9807c(objM7976e);
        c7711d3.f24290Y = this;
        c7711d3.f24291Z = c13694d;
        c7711d3.f24294q0 = 1;
        Set set = AbstractC7501j.f23804a;
        InterfaceC18774g interfaceC18774g = c7711d3.getContext().get(C7500i.f23802Z);
        AbstractC16544l.m18091d(interfaceC18774g);
        InterfaceC18776i interfaceC18776i = ((C7500i) interfaceC18774g).f23803Y;
        if (interfaceC18776i == enumC19250a) {
            return enumC19250a;
        }
        c13694d2 = c13694d;
        objM7976e = interfaceC18776i;
        c7713f = this;
        InterfaceC18776i callContext = (InterfaceC18776i) objM7976e;
        C14522e c14522e = new C14522e(3);
        c14522e.m16010B(c13694d2.f43201a.f51041g);
        C2585E c2585e = new C2585E(c14522e, 2);
        Set set2 = AbstractC7501j.f23804a;
        C16478z c16478z = c13694d2.f43203c;
        AbstractC17288f abstractC17288f = c13694d2.f43204d;
        C16477y c16477y = new C16477y();
        c16477y.m4530h(c16478z);
        c16477y.m4530h(abstractC17288f.mo7531c());
        c16477y.m18047Q().mo7980e(new C2585E(c2585e, 1));
        List list = AbstractC16435B.f50983a;
        if (c16478z.mo7982g(SIPHeaderNames.USER_AGENT) == null && abstractC17288f.mo7531c().mo7982g(SIPHeaderNames.USER_AGENT) == null) {
            int i13 = AbstractC19681p.f62375a;
            c2585e.invoke(SIPHeaderNames.USER_AGENT, "ktor-client");
        }
        C16460h c16460hMo7530b = abstractC17288f.mo7530b();
        if ((c16460hMo7530b == null || (strMo7982g = c16460hMo7530b.toString()) == null) && (strMo7982g = abstractC17288f.mo7531c().mo7982g(SIPHeaderNames.CONTENT_TYPE)) == null) {
            strMo7982g = c16478z.mo7982g(SIPHeaderNames.CONTENT_TYPE);
        }
        Long lMo7529a = abstractC17288f.mo7529a();
        if ((lMo7529a == null || (strMo7982g2 = lMo7529a.toString()) == null) && (strMo7982g2 = abstractC17288f.mo7531c().mo7982g(SIPHeaderNames.CONTENT_LENGTH)) == null) {
            strMo7982g2 = c16478z.mo7982g(SIPHeaderNames.CONTENT_LENGTH);
        }
        if (strMo7982g != null) {
            c2585e.invoke(SIPHeaderNames.CONTENT_TYPE, strMo7982g);
        }
        if (strMo7982g2 != null) {
            c2585e.invoke(SIPHeaderNames.CONTENT_LENGTH, strMo7982g2);
        }
        C16438E c16438e = c13694d2.f43202b;
        if (AbstractC8162p0.m8732d(c16438e.f50992a)) {
            AbstractC16544l.m18094g(callContext, "callContext");
            if (abstractC17288f instanceof AbstractC17285c) {
                byte[] bArrMo9568e = ((AbstractC17285c) abstractC17288f).mo9568e();
                Pattern pattern = C17352s.f55296e;
                C17352s c17352sM9858d = AbstractC9282f0.m9858d(String.valueOf(abstractC17288f.mo7530b()));
                int length = bArrMo9568e.length;
                c13694d3 = c13694d2;
                c7711d2 = c7711d3;
                AbstractC17708b.m19411c(bArrMo9568e.length, 0, length);
                c17324a = new C17324A(c17352sM9858d, length, bArrMo9568e, 0);
            } else {
                c13694d3 = c13694d2;
                c7711d2 = c7711d3;
                if (abstractC17288f instanceof AbstractC17286d) {
                    c17324a = new C7719l(abstractC17288f.mo7529a(), new C0819c(abstractC17288f, 9));
                } else if (abstractC17288f instanceof AbstractC17287e) {
                    c17324a = new C7719l(abstractC17288f.mo7529a(), new C0821e(callContext, i10, abstractC17288f));
                } else {
                    if (!(abstractC17288f instanceof C15038c)) {
                        throw new C0644w();
                    }
                    long j10 = 0;
                    AbstractC17708b.m19411c(j10, j10, j10);
                    c17324a = new C17324A(null, 0, new byte[0], 0);
                }
            }
            abstractC17325B = c17324a;
        } else {
            c13694d3 = c13694d2;
            c7711d2 = c7711d3;
            abstractC17325B = null;
        }
        c14522e.m16028v(c16438e.f50992a, abstractC17325B);
        C17358y c17358yM16017i = c14522e.m16017i();
        C17356w c17356w = (C17356w) c7713f.f24307t0.get(c13694d3.m15170a());
        if (c17356w == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        int i14 = AbstractC13695e.f43208a;
        C7711d c7711d4 = c7711d2;
        c7711d4.f24290Y = null;
        c7711d4.f24291Z = null;
        c7711d4.f24294q0 = 4;
        objM7976e = c7713f.m7976e(c17356w, c17358yM16017i, callContext, c13694d3, c7711d4);
        return objM7976e == enumC19250a ? enumC19250a : objM7976e;
    }

    @Override // p485Tk.AbstractC7496e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InterfaceC18774g interfaceC18774g = this.f24305r0.get(C0625m0.f1875Y);
        AbstractC16544l.m18092e(interfaceC18774g, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((C0631p0) ((InterfaceC0638t) interfaceC18774g)).m1279g0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: e */
    public final Object m7976e(C17356w c17356w, C17358y c17358y, InterfaceC18776i interfaceC18776i, C13694d c13694d, AbstractC19687c abstractC19687c) {
        C7712e c7712e;
        InterfaceC18776i interfaceC18776i2;
        C20387d c20387d;
        C7713f c7713f;
        Object obj;
        C16439F c16439f;
        C16439F c16439f2;
        InterfaceC0677k interfaceC0677kMo18988O0;
        C13694d requestData = c13694d;
        if (abstractC19687c instanceof C7712e) {
            c7712e = (C7712e) abstractC19687c;
            int i10 = c7712e.f24301s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7712e.f24301s0 = i10 - Integer.MIN_VALUE;
            } else {
                c7712e = new C7712e(this, abstractC19687c);
            }
        } else {
            c7712e = new C7712e(this, abstractC19687c);
        }
        Object obj2 = c7712e.f24299q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7712e.f24301s0;
        C0625m0 c0625m0 = C0625m0.f1875Y;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            C20387d c20387dM21048b = AbstractC20384a.m21048b();
            c7712e.f24295Y = this;
            c7712e.f24296Z = interfaceC18776i;
            c7712e.f24297o0 = requestData;
            c7712e.f24298p0 = c20387dM21048b;
            c7712e.f24301s0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c7712e));
            c0624m.m1262r();
            C18792h c18792hM19035b = c17356w.m19035b(c17358y);
            InterfaceC18774g interfaceC18774g = interfaceC18776i.get(c0625m0);
            AbstractC16544l.m18091d(interfaceC18774g);
            ((InterfaceC0627n0) interfaceC18774g).mo1270E(true, true, new C3255k(c18792hM19035b, 1));
            AbstractC16544l.m18094g(requestData, "requestData");
            C15358g1 c15358g1 = new C15358g1();
            c15358g1.f47945Y = requestData;
            c15358g1.f47946Z = c0624m;
            c18792hM19035b.m20062d(c15358g1);
            Object objM1261q = c0624m.m1261q();
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
            interfaceC18776i2 = interfaceC18776i;
            c20387d = c20387dM21048b;
            obj2 = objM1261q;
            c7713f = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20387d c20387d2 = c7712e.f24298p0;
            requestData = c7712e.f24297o0;
            InterfaceC18776i interfaceC18776i3 = c7712e.f24296Z;
            c7713f = c7712e.f24295Y;
            AbstractC9233X.m9807c(obj2);
            c20387d = c20387d2;
            interfaceC18776i2 = interfaceC18776i3;
        }
        C17327D c17327d = (C17327D) obj2;
        AbstractC17329F abstractC17329F = c17327d.f55179s0;
        InterfaceC18774g interfaceC18774g2 = interfaceC18776i2.get(c0625m0);
        AbstractC16544l.m18091d(interfaceC18774g2);
        ((InterfaceC0627n0) interfaceC18774g2).mo1271H0(new C0386f(abstractC17329F, 11));
        if (abstractC17329F == null || (interfaceC0677kMo18988O0 = abstractC17329F.mo18988O0()) == null) {
            InterfaceC15088n.f46873a.getClass();
            obj = C15087m.f46872b;
        } else {
            obj = (C15085k) AbstractC15070F.m16194v(C0613g0.f1858Y, interfaceC18776i2, new C7716i(interfaceC0677kMo18988O0, interfaceC18776i2, requestData, null), 2).f34001Z;
        }
        Object obj3 = obj;
        c7713f.getClass();
        C16440G c16440g = new C16440G(c17327d.f55176p0, c17327d.f55175o0);
        EnumC17357x enumC17357x = c17327d.f55174Z;
        AbstractC16544l.m18094g(enumC17357x, "<this>");
        int iOrdinal = enumC17357x.ordinal();
        if (iOrdinal == 0) {
            c16439f = C16439F.f50995f;
        } else if (iOrdinal == 1) {
            c16439f = C16439F.f50994e;
        } else {
            if (iOrdinal != 2) {
                C16439F c16439f3 = C16439F.f50993d;
                if (iOrdinal == 3 || iOrdinal == 4) {
                    c16439f2 = c16439f3;
                } else {
                    if (iOrdinal != 5) {
                        throw new C0644w();
                    }
                    c16439f = C16439F.f50997h;
                }
                return new C13697g(c16440g, c20387d, new C7717j(c17327d.f55178r0), c16439f2, obj3, interfaceC18776i2);
            }
            c16439f = C16439F.f50996g;
        }
        c16439f2 = c16439f;
        return new C13697g(c16440g, c20387d, new C7717j(c17327d.f55178r0), c16439f2, obj3, interfaceC18776i2);
    }

    @Override // p485Tk.AbstractC7496e, p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f24306s0;
    }
}
