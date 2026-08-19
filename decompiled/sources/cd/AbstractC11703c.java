package cd;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1051v0.C20416d;
import p193Hf.C3353c0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4129s3;
import p229J0.C3949M0;
import p229J0.C4065i;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7306j;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13779o0;
import p758g0.AbstractC13785r0;
import p758g0.C13740P;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p758g0.C13781p0;
import p758g0.C13783q0;
import p758g0.InterfaceC13763g0;
import p758g0.InterfaceC13798z;

/* JADX INFO: renamed from: cd.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11703c {

    /* JADX INFO: renamed from: a */
    public static final float f35510a = 8;

    /* JADX INFO: renamed from: a */
    public static final void m13030a(C13740P c13740p, long j10, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        InterfaceC13798z interfaceC13798z;
        C13781p0 c13781p0M15255t;
        boolean z6;
        boolean z10;
        C13781p0 c13781p0M15255t2;
        c6021p.m6526U(-85568857);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c13740p) : c6021p.m6545h(c13740p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6540e(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C13771k0 c13771k0M15290c = AbstractC13779o0.m15290c(c13740p, "DropDownMenu", c6021p, (i11 & 14) | 48);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            boolean zBooleanValue = ((Boolean) c13771k0M15290c.m15272c()).booleanValue();
            c6021p.m6524S(-422849853);
            float f10 = zBooleanValue ? 1.0f : 0.8f;
            c6021p.m6553p(false);
            Float fValueOf = Float.valueOf(f10);
            C6002f0 c6002f0 = c13771k0M15290c.f43492d;
            boolean zBooleanValue2 = ((Boolean) c6002f0.getValue()).booleanValue();
            c6021p.m6524S(-422849853);
            float f11 = zBooleanValue2 ? 1.0f : 0.8f;
            c6021p.m6553p(false);
            Float fValueOf2 = Float.valueOf(f11);
            InterfaceC13763g0 animateFloat = c13771k0M15290c.m15275f();
            AbstractC16544l.m18094g(animateFloat, "$this$animateFloat");
            c6021p.m6524S(912310622);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (animateFloat.mo15005b(bool, bool2)) {
                c13781p0M15255t = AbstractC13758e.m15255t(120, 0, AbstractC13725A.f43289b, 2);
                z6 = false;
                interfaceC13798z = null;
            } else {
                interfaceC13798z = null;
                c13781p0M15255t = AbstractC13758e.m15255t(1, 74, null, 4);
                z6 = false;
            }
            c6021p.m6553p(z6);
            InterfaceC13798z interfaceC13798z2 = interfaceC13798z;
            C13767i0 c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0M15290c, fValueOf, fValueOf2, c13781p0M15255t, c13783q0, c6021p, 196608);
            boolean zBooleanValue3 = ((Boolean) c13771k0M15290c.m15272c()).booleanValue();
            c6021p.m6524S(-890139177);
            float f12 = zBooleanValue3 ? 1.0f : 0.0f;
            c6021p.m6553p(false);
            Float fValueOf3 = Float.valueOf(f12);
            boolean zBooleanValue4 = ((Boolean) c6002f0.getValue()).booleanValue();
            c6021p.m6524S(-890139177);
            float f13 = zBooleanValue4 ? 1.0f : 0.0f;
            c6021p.m6553p(false);
            Float fValueOf4 = Float.valueOf(f13);
            InterfaceC13763g0 animateFloat2 = c13771k0M15290c.m15275f();
            AbstractC16544l.m18094g(animateFloat2, "$this$animateFloat");
            c6021p.m6524S(445021298);
            if (animateFloat2.mo15005b(bool, bool2)) {
                z10 = false;
                c13781p0M15255t2 = AbstractC13758e.m15255t(30, 0, interfaceC13798z2, 6);
            } else {
                z10 = false;
                c13781p0M15255t2 = AbstractC13758e.m15255t(75, 0, interfaceC13798z2, 6);
            }
            c6021p.m6553p(z10);
            C13767i0 c13767i0M15289b2 = AbstractC13779o0.m15289b(c13771k0M15290c, fValueOf3, fValueOf4, c13781p0M15255t2, c13783q0, c6021p, 196608);
            c6021p.m6524S(1399679695);
            boolean zM6542f = c6021p.m6542f(c13767i0M15289b) | c6021p.m6542f(c13767i0M15289b2) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C3353c0(j10, c13767i0M15289b, c13767i0M15289b2, 2);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(c10456n, (InterfaceC1436k) objM6514H);
            C20416d c20416d = AbstractC4129s3.f13336b;
            long j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p;
            float f14 = AbstractC7306j.f23144b;
            AbstractC4034c4.m4725a(interfaceC10459qM11305a, c20416d, j11, 0L, f14, f14, null, AbstractC8411c.m8969c(-1969805268, c6021p, new C4065i(interfaceC10459q, c8410b, 2)), c6021p, 12804096, 72);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C11702b(c13740p, j10, interfaceC10459q, c8410b, i10);
        }
    }
}
