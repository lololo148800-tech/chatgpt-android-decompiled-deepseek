package p628Zk;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p050Bn.C1450d;
import p059C5.C1601s;
import p1045ul.C20387d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p253K.AbstractC4502m;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p857kl.C16452T;
import p857kl.C16464l;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10406e implements InterfaceC10407f {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1426a f30842Y = new C1601s(12);

    /* JADX INFO: renamed from: Z */
    public final ArrayList f30843Z = new ArrayList();
    private volatile /* synthetic */ long oldestCookie = 0;

    /* JADX INFO: renamed from: o0 */
    public final C4816c f30844o0 = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: e */
    public static Long m10900e(C16464l c16464l, long j10) {
        Integer num = c16464l.f51073d;
        if (num != null) {
            return Long.valueOf((((long) num.intValue()) * 1000) + j10);
        }
        C20387d c20387d = c16464l.f51074e;
        if (c20387d != null) {
            return Long.valueOf(c20387d.f64480u0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p628Zk.InterfaceC10407f
    /* JADX INFO: renamed from: A */
    public final Serializable mo7290A(C16452T c16452t, AbstractC19687c abstractC19687c) {
        C10405d c10405d;
        C4816c c4816c;
        C10406e c10406e;
        if (abstractC19687c instanceof C10405d) {
            c10405d = (C10405d) abstractC19687c;
            int i10 = c10405d.f30841r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10405d.f30841r0 = i10 - Integer.MIN_VALUE;
            } else {
                c10405d = new C10405d(this, abstractC19687c);
            }
        } else {
            c10405d = new C10405d(this, abstractC19687c);
        }
        Object obj = c10405d.f30839p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10405d.f30841r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c4816c = this.f30844o0;
            c10405d.f30836Y = this;
            c10405d.f30837Z = c16452t;
            c10405d.f30838o0 = c4816c;
            c10405d.f30841r0 = 1;
            if (c4816c.m5448e(null, c10405d) == enumC19250a) {
                return enumC19250a;
            }
            c10406e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4816c c4816c2 = c10405d.f30838o0;
            C16452T c16452t2 = c10405d.f30837Z;
            c10406e = c10405d.f30836Y;
            AbstractC9233X.m9807c(obj);
            c4816c = c4816c2;
            c16452t = c16452t2;
        }
        try {
            long jLongValue = ((Number) c10406e.f30842Y.invoke()).longValue();
            if (jLongValue >= c10406e.oldestCookie) {
                c10406e.m10901a(jLongValue);
            }
            ArrayList arrayList = c10406e.f30843Z;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (AbstractC4502m.m5244g(((C10403b) obj2).f30827a, c16452t)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C10403b) it.next()).f30827a);
            }
            return arrayList3;
        } finally {
            c4816c.m5450g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p628Zk.InterfaceC10407f
    /* JADX INFO: renamed from: K0 */
    public final Object mo7291K0(C16452T requestUrl, C16464l c16464l, AbstractC19687c abstractC19687c) {
        C10404c c10404c;
        C4816c c4816c;
        C10406e c10406e;
        if (abstractC19687c instanceof C10404c) {
            c10404c = (C10404c) abstractC19687c;
            int i10 = c10404c.f30835s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10404c.f30835s0 = i10 - Integer.MIN_VALUE;
            } else {
                c10404c = new C10404c(this, abstractC19687c);
            }
        } else {
            c10404c = new C10404c(this, abstractC19687c);
        }
        Object obj = c10404c.f30833q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10404c.f30835s0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (AbstractC21322p.m21681O(c16464l.f51070a)) {
                return c17296c;
            }
            c4816c = this.f30844o0;
            c10404c.f30829Y = this;
            c10404c.f30830Z = requestUrl;
            c10404c.f30831o0 = c16464l;
            c10404c.f30832p0 = c4816c;
            c10404c.f30835s0 = 1;
            if (c4816c.m5448e(null, c10404c) == enumC19250a) {
                return enumC19250a;
            }
            c10406e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4816c c4816c2 = c10404c.f30832p0;
            c16464l = c10404c.f30831o0;
            C16452T c16452t = c10404c.f30830Z;
            c10406e = c10404c.f30829Y;
            AbstractC9233X.m9807c(obj);
            c4816c = c4816c2;
            requestUrl = c16452t;
        }
        try {
            AbstractC17686t.m19393A(c10406e.f30843Z, new C1450d(c16464l, 6, requestUrl));
            long jLongValue = ((Number) c10406e.f30842Y.invoke()).longValue();
            ArrayList arrayList = c10406e.f30843Z;
            AbstractC16544l.m18094g(c16464l, "<this>");
            AbstractC16544l.m18094g(requestUrl, "requestUrl");
            String str = c16464l.f51076g;
            C16464l c16464lM18038a = (str == null || !AbstractC21329w.m21734u(str, Separators.SLASH, false)) ? C16464l.m18038a(c16464l, null, (String) requestUrl.f51044j.getValue(), 959) : c16464l;
            String str2 = c16464lM18038a.f51075f;
            if (str2 == null || AbstractC21322p.m21681O(str2)) {
                c16464lM18038a = C16464l.m18038a(c16464lM18038a, requestUrl.f51035a, null, 991);
            }
            arrayList.add(new C10403b(c16464lM18038a, jLongValue));
            Long lM10900e = m10900e(c16464l, jLongValue);
            if (lM10900e != null) {
                long jLongValue2 = lM10900e.longValue();
                if (c10406e.oldestCookie > jLongValue2) {
                    c10406e.oldestCookie = jLongValue2;
                }
            }
            return c17296c;
        } finally {
            c4816c.m5450g(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10901a(final long j10) {
        AbstractC17686t.m19393A(this.f30843Z, new InterfaceC1436k() { // from class: Zk.a
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C10403b c10403b = (C10403b) obj;
                AbstractC16544l.m18094g(c10403b, "<destruct>");
                C16464l c16464l = c10403b.f30827a;
                this.f30825Y.getClass();
                Long lM10900e = C10406e.m10900e(c16464l, c10403b.f30828b);
                boolean z6 = false;
                if (lM10900e != null && lM10900e.longValue() < j10) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            }
        });
        long jMin = Long.MAX_VALUE;
        for (C10403b c10403b : this.f30843Z) {
            Long lM10900e = m10900e(c10403b.f30827a, c10403b.f30828b);
            if (lM10900e != null) {
                jMin = Math.min(jMin, lM10900e.longValue());
            }
        }
        this.oldestCookie = jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
