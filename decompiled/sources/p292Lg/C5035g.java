package p292Lg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1442q;
import p349O0.C6013l;
import p349O0.C6021p;
import p594Y9.AbstractC9746I4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Lg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5035g extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public static final C5035g f16469Y = new C5035g(5);

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C5054z state = (C5054z) obj2;
        InterfaceC1436k onIntent = (InterfaceC1436k) obj3;
        C6021p c6021p = (C6021p) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(C10456n.f30959Y, paddings).mo428M(AbstractC10844c.f32512c);
        c6021p.m6524S(109140404);
        boolean zM6545h = ((((iIntValue & 896) ^ 384) > 256 && c6021p.m6542f(onIntent)) || (iIntValue & 384) == 256) | c6021p.m6545h(state);
        Object objM6514H = c6021p.m6514H();
        if (zM6545h || objM6514H == C6013l.f19514a) {
            objM6514H = new C5034f(state, 0, onIntent);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        AbstractC9746I4.m10337a(interfaceC10459qMo428M, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
        return C17296C.f55119a;
    }
}
