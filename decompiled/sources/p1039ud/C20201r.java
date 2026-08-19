package p1039ud;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1442q;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p547Wc.C8767K;
import p594Y9.AbstractC9746I4;
import p635a1.InterfaceC10459q;
import p911o0.InterfaceC17763i0;
import p928oh.C18194a;
import p936p0.AbstractC18283w;
import p936p0.C18280t;

/* JADX INFO: renamed from: ud.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20201r extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public static final C20201r f63971Y = new C20201r(5);

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C20194k state = (C20194k) obj2;
        InterfaceC1436k onIntent = (InterfaceC1436k) obj3;
        C6021p c6021p = (C6021p) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        if ((iIntValue & 6) == 0) {
            i10 = (c6021p.m6542f(paddings) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i10 |= c6021p.m6542f(state) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i10 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C18280t c18280tM19827a = AbstractC18283w.m19827a(0, c6021p, 0, 3);
            c6021p.m6524S(-1333452780);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6421H(new C8767K(c18280tM19827a, 1));
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H;
            c6021p.m6553p(false);
            Object value = interfaceC5982V0.getValue();
            Boolean boolValueOf = Boolean.valueOf(state.f63946a);
            c6021p.m6524S(-1333442681);
            int i11 = i10 & 112;
            int i12 = i10 & 896;
            boolean z6 = (i11 == 32) | (i12 == 256);
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == c5975s) {
                objM6514H2 = new C20197n(interfaceC5982V0, state, onIntent, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(value, boolValueOf, (InterfaceC1439n) objM6514H2, c6021p);
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings);
            c6021p.m6524S(-1333432713);
            boolean z10 = (i11 == 32) | (i12 == 256);
            Object objM6514H3 = c6021p.m6514H();
            if (z10 || objM6514H3 == c5975s) {
                objM6514H3 = new C18194a(state, 11, onIntent);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(interfaceC10459qM11232j, c18280tM19827a, null, false, null, null, null, false, (InterfaceC1436k) objM6514H3, c6021p, 0, 252);
        }
        return C17296C.f55119a;
    }
}
