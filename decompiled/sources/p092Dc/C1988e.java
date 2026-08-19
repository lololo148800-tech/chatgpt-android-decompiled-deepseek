package p092Dc;

import fo.AbstractC13707d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import ni.C17628b;
import ni.C17632f;
import ni.C17641o;
import ni.C17642p;
import p025An.AbstractC0575H;
import p030B2.C0742X;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p190Hc.C3281b;
import p190Hc.C3282c;
import p195Hh.C3430e;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p708dh.C13149c;
import p948pi.C18418a;
import p948pi.EnumC18427j;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import tm.C20007b;

/* JADX INFO: renamed from: Dc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1988e {

    /* JADX INFO: renamed from: a */
    public final C1994k f5875a;

    /* JADX INFO: renamed from: b */
    public final C3430e f5876b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f5877c;

    /* JADX INFO: renamed from: d */
    public final C2217y0 f5878d;

    public C1988e(C13149c accountSessionRepository, C17641o userCoroutineScope, C17642p userReleaseCompletable, C1994k accountUserComponentFactory) {
        C1996m c1996mM3163a;
        AbstractC16544l.m18094g(accountSessionRepository, "accountSessionRepository");
        AbstractC16544l.m18094g(userCoroutineScope, "userCoroutineScope");
        AbstractC16544l.m18094g(userReleaseCompletable, "userReleaseCompletable");
        AbstractC16544l.m18094g(accountUserComponentFactory, "accountUserComponentFactory");
        this.f5875a = accountUserComponentFactory;
        this.f5876b = AbstractC8168p6.m8749b("AccountUserComponentManager", null);
        C18418a c18418a = (C18418a) AbstractC0575H.m1161I(C18777j.f59682Y, new C1986c(accountSessionRepository, null));
        if (c18418a != null) {
            c1996mM3163a = accountUserComponentFactory.m3163a(c18418a, new C17627a(userCoroutineScope));
            m3158b(null, c1996mM3163a);
        } else {
            c1996mM3163a = null;
        }
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(c1996mM3163a);
        this.f5877c = c2153q0M3204c;
        this.f5878d = new C2217y0(c2153q0M3204c);
        AbstractC2124C.m3226y(new C1970n(new C2146N(accountSessionRepository.f41743b, 2), 5, new C1984a(this, userCoroutineScope, null)), userCoroutineScope);
        userReleaseCompletable.m19237b(new C1985b(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m3157a(C1988e c1988e, C1996m c1996m, AbstractC19687c abstractC19687c) {
        C1987d c1987d;
        C1988e c1988e2;
        C1996m c1996m2;
        c1988e.getClass();
        if (abstractC19687c instanceof C1987d) {
            c1987d = (C1987d) abstractC19687c;
            int i10 = c1987d.f5874q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1987d.f5874q0 = i10 - Integer.MIN_VALUE;
            } else {
                c1987d = new C1987d(c1988e, abstractC19687c);
            }
        } else {
            c1987d = new C1987d(c1988e, abstractC19687c);
        }
        Object obj = c1987d.f5872o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1987d.f5874q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c1996m = c1987d.f5871Z;
                c1988e = c1987d.f5870Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1996m2 = c1987d.f5871Z;
                c1988e2 = c1987d.f5870Y;
                AbstractC9233X.m9807c(obj);
            }
            AbstractC8160o6.m8726a(c1988e2.f5876b, "Closed AccountUserReleaseCompletable for " + c1996m2.f5936a, null, 6);
            AbstractC13707d.f43256c.m15194i(c1996m2, "AccountUserComponentManager called close for " + c1996m2.f5936a);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC8160o6.m8726a(c1988e.f5876b, "Closing AccountUserComponent for " + c1996m.f5936a, null, 6);
        c1987d.f5870Y = c1988e;
        c1987d.f5871Z = c1996m;
        c1987d.f5874q0 = 1;
        if (c1996m.f5938b.m19232a(c1987d) == enumC19250a) {
            return enumC19250a;
        }
        AbstractC8160o6.m8726a(c1988e.f5876b, "Closed AccountUserCoroutineScope for " + c1996m.f5936a, null, 6);
        C17628b c17628b = (C17628b) c1996m.f5986z.get();
        c1987d.f5870Y = c1988e;
        c1987d.f5871Z = c1996m;
        c1987d.f5874q0 = 2;
        if (c17628b.m19236a(c1987d) == enumC19250a) {
            return enumC19250a;
        }
        C1996m c1996m3 = c1996m;
        c1988e2 = c1988e;
        c1996m2 = c1996m3;
        AbstractC8160o6.m8726a(c1988e2.f5876b, "Closed AccountUserReleaseCompletable for " + c1996m2.f5936a, null, 6);
        AbstractC13707d.f43256c.m15194i(c1996m2, "AccountUserComponentManager called close for " + c1996m2.f5936a);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final void m3158b(C1996m c1996m, C1996m c1996m2) {
        if (c1996m != null) {
            AbstractC8160o6.m8726a(this.f5876b, "Removing AccountUserComponent userId=" + c1996m.f5936a.f58777e, null, 6);
            synchronized (C17632f.f56419a) {
                C17632f.f56420b.remove(c1996m);
            }
        }
        AbstractC8160o6.m8726a(this.f5876b, "Adding AccountUserComponent userId=" + c1996m2.f5936a.f58777e, null, 6);
        C17632f.f56419a.m19234a(c1996m2);
        C3282c c3282c = (C3282c) c1996m2.f5939b0.get();
        if (c3282c.f10007d.getAndSet(true)) {
            throw new IllegalArgumentException("Initialize may only be called once!");
        }
        Set set = c3282c.f10005b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        C20007b c20007b = EnumC18427j.f58790Z;
        c20007b.getClass();
        C0742X c0742x = new C0742X(c20007b, 8);
        while (c0742x.hasNext()) {
            if (c0742x.next() != null) {
                throw new ClassCastException();
            }
            if (!linkedHashMap.containsKey(null)) {
                throw new IllegalArgumentException("There is no initializer for null!");
            }
            List list = (List) linkedHashMap.get(null);
            if (list == null || list.size() != 1) {
                throw new IllegalArgumentException("There are multiple initializers for null!");
            }
        }
        Iterator it2 = set.iterator();
        if (it2.hasNext()) {
            throw AbstractC3794B0.m4497v(it2);
        }
        AbstractC0575H.m1156D(c3282c.f10006c, null, null, new C3281b(c3282c, null), 3);
    }
}
