package p571X9;

import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import kotlin.jvm.internal.AbstractC16544l;
import nc.C17557d;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2134H;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2184i;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p404Qe.C6665a;
import p404Qe.C6679o;
import p427Rc.C6852i;

/* JADX INFO: renamed from: X9.S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9206S2 {
    /* JADX INFO: renamed from: a */
    public static final void m9770a(String content, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(content, "content");
        c6021p.m6526U(2030918738);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17557d c17557d = C17557d.f56166Z;
            c6021p.m6525T(1157118199);
            boolean zM6542f = c6021p.m6542f(content);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C6665a(content, 13);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b(c17557d, null, (InterfaceC1436k) objM6514H, c6021p, 6, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6679o(content, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2184i m9771b(InterfaceC1439n interfaceC1439n, InterfaceC2184i interfaceC2184i) {
        AbstractC16544l.m18094g(interfaceC2184i, "<this>");
        return AbstractC2124C.m3215n(new C2134H(interfaceC2184i, interfaceC1439n, 3));
    }

    /* JADX INFO: renamed from: c */
    public static final C6852i m9772c(InterfaceC1436k transform, InterfaceC2149O0 interfaceC2149O0) {
        AbstractC16544l.m18094g(interfaceC2149O0, "<this>");
        AbstractC16544l.m18094g(transform, "transform");
        return new C6852i(transform, interfaceC2149O0);
    }
}
