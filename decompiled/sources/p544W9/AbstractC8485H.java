package p544W9;

import android.content.Context;
import androidx.compose.foundation.gestures.AbstractC10840a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import p003A1.AbstractC0187M0;
import p094De.C2029l;
import p1000s0.C19418n;
import p349O0.C6013l;
import p349O0.C6021p;
import p403Qd.C6636i;
import p492U1.EnumC7546k;
import p635a1.InterfaceC10459q;
import p773h0.AbstractC14298n0;
import p773h0.AbstractC14319y;
import p773h0.C14294l0;
import p773h0.C14296m0;
import p773h0.C14297n;
import p773h0.InterfaceC14300o0;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16661B0;
import p860l0.InterfaceC16736e1;
import p894n0.C17407m;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8485H {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m9138a(InterfaceC10459q interfaceC10459q, InterfaceC16736e1 interfaceC16736e1, EnumC16673F0 enumC16673F0, boolean z6, boolean z10, InterfaceC16661B0 interfaceC16661B0, C17407m c17407m, C19418n c19418n, C6021p c6021p, int i10) {
        InterfaceC14300o0 interfaceC14300o0;
        C19418n c19418n2 = (i10 & 64) != 0 ? null : c19418n;
        Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
        C14296m0 c14296m0 = (C14296m0) c6021p.m6548k(AbstractC14298n0.f44893a);
        if (c14296m0 != null) {
            c6021p.m6524S(1586021609);
            boolean zM6542f = c6021p.m6542f(context) | c6021p.m6542f(c14296m0);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C14297n(context, c14296m0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            interfaceC14300o0 = (C14297n) objM6514H;
        } else {
            c6021p.m6524S(1586120933);
            c6021p.m6553p(false);
            interfaceC14300o0 = C14294l0.f44878o0;
        }
        EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
        InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(enumC16673F0 == enumC16673F1 ? AbstractC14319y.f44947c : AbstractC14319y.f44946b).mo428M(interfaceC14300o0.mo15579a());
        boolean z11 = !z10;
        if (((EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l)) == EnumC7546k.f23905Z && enumC16673F0 != enumC16673F1) {
            z11 = z10;
        }
        return AbstractC10840a.m11221g(interfaceC10459qMo428M, interfaceC16736e1, enumC16673F0, interfaceC14300o0, z6, z11, interfaceC16661B0, c17407m, c19418n2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m9139b(C2029l c2029l, C6636i c6636i, AbstractC19687c abstractC19687c) {
        return c2029l.m3176e(c6636i, true, abstractC19687c);
    }
}
