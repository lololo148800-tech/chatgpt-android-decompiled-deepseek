package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p594Y9.AbstractC9751J3;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Lh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5057c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16524Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f16525Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f16526o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5057c(boolean z6, C8410b c8410b, int i10) {
        super(3);
        this.f16524Y = i10;
        this.f16525Z = z6;
        this.f16526o0 = c8410b;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16524Y) {
            case 0:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8662k3.m9353d(this.f16525Z, paddings, AbstractC8411c.m8969c(8170329, c6021p, new C5056b(this.f16526o0, 0)), c6021p, ((iIntValue << 3) & 112) | 384);
                }
                break;
            default:
                InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9751J3.m10350c(this.f16525Z, this.f16526o0, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
