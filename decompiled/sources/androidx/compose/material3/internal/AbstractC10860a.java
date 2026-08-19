package androidx.compose.material3.internal;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p278L0.C4866c;
import p278L0.C4872f;
import p278L0.C4874g;
import p278L0.C4882k;
import p571X9.AbstractC9233X;
import p635a1.InterfaceC10459q;
import p658b5.C11246q;
import p773h0.EnumC14284g0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.compose.material3.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10860a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m11286a(InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C4874g c4874g;
        if (abstractC19687c instanceof C4874g) {
            c4874g = (C4874g) abstractC19687c;
            int i10 = c4874g.f15886Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4874g.f15886Z = i10 - Integer.MIN_VALUE;
            } else {
                c4874g = new C4874g(abstractC19687c);
            }
        } else {
            c4874g = new C4874g(abstractC19687c);
        }
        Object obj = c4874g.f15885Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4874g.f15886Z;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C4882k c4882k = new C4882k(interfaceC1426a, interfaceC1439n, null);
                c4874g.f15886Z = 1;
                if (AbstractC0575H.m1183l(c4882k, c4874g) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (C4866c unused) {
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m11287b(C11246q c11246q, Object obj, float f10, AbstractC19694j abstractC19694j) {
        Object objM12634d = c11246q.m12634d(obj, EnumC14284g0.f44821Y, new C4872f(c11246q, f10, null), abstractC19694j);
        return objM12634d == EnumC19250a.f61036Y ? objM12634d : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m11288c(InterfaceC10459q interfaceC10459q, C11246q c11246q, InterfaceC1439n interfaceC1439n) {
        return interfaceC10459q.mo428M(new DraggableAnchorsElement(c11246q, interfaceC1439n));
    }
}
