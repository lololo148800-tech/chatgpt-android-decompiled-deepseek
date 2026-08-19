package p946pc;

import androidx.compose.foundation.AbstractC10833a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p204I1.C3582M;
import p229J0.C3991U3;
import p328N1.AbstractC5599o;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p571X9.AbstractC9119D4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p664bc.AbstractC11336c;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18341g {

    /* JADX INFO: renamed from: a */
    public static final C3582M f58548a = new C3582M(0, 0, null, null, AbstractC5599o.f18133o0, 16777183);

    /* JADX INFO: renamed from: b */
    public static final long f58549b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q f58550c;

    /* JADX INFO: renamed from: d */
    public static final long f58551d;

    static {
        long jM15774b = C14365u.m15774b(0.5f, C14365u.f45054d);
        f58549b = jM15774b;
        f58550c = AbstractC10833a.m11207b(C10456n.f30959Y, jM15774b, AbstractC14334L.f44973a);
        f58551d = AbstractC9119D4.m9650c(16);
    }

    /* JADX INFO: renamed from: a */
    public static final void m19855a(C18320E c18320e, Boolean bool, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        boolean zBooleanValue;
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(-112929136);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(bool) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = i11 & 14;
            C18342h c18342h = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58485e;
            AbstractC16544l.m18091d(c18342h);
            C3582M c3582mM4280g = AbstractC18319D.m19846e(c18320e, c6021p).m4280g(c18342h.f58553a);
            InterfaceC10459q interfaceC10459q = c18342h.f58554b;
            AbstractC16544l.m18091d(interfaceC10459q);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C7548m c7548m = c18342h.f58555c;
            AbstractC16544l.m18091d(c7548m);
            float fMo7870w = interfaceC7537b.mo7870w(c7548m.f23910a);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Boolean bool2 = c18342h.f58556d;
                AbstractC16544l.m18091d(bool2);
                zBooleanValue = bool2.booleanValue();
            }
            AbstractC11336c.m12771a(c18320e, zBooleanValue, AbstractC8411c.m8968b(-1189457944, c6021p, new C18340f(interfaceC10459q, fMo7870w, c3582mM4280g, c8410b)), c6021p, i12 | 384);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a((Object) c18320e, (Object) bool, c8410b, i10, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19856b(C18320E c18320e, String text, Boolean bool, C6021p c6021p, int i10) {
        int i11;
        Boolean bool2;
        AbstractC16544l.m18094g(c18320e, "<this>");
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(-1183188838);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(text) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            bool2 = bool;
        } else {
            m19855a(c18320e, null, AbstractC8411c.m8968b(1557188131, c6021p, new C3991U3(text, 13)), c6021p, ((i12 >> 3) & 112) | (i12 & 14) | 384);
            bool2 = null;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c18320e, text, bool2, i10, 21);
        }
    }
}
