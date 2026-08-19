package p293Lh;

import io.sentry.AbstractC15152P0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1143z4.C21778h;
import p349O0.C6021p;
import p537W0.C8410b;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Lh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5056b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16522Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8410b f16523Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5056b(C8410b c8410b, int i10) {
        super(3);
        this.f16522Y = i10;
        this.f16523Z = c8410b;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16522Y) {
            case 0:
                InterfaceC17763i0 it = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(it) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    this.f16523Z.invoke(it, c6021p, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 1:
                C21778h backStackEntry = (C21778h) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
                AbstractC15152P0.m16327a("Rendering destination: " + backStackEntry.f69074Z.f69136s0);
                this.f16523Z.invoke(backStackEntry, (C6021p) obj2, Integer.valueOf(iIntValue2 & 14));
                break;
            default:
                C17794y OutlinedCard = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedCard, "$this$OutlinedCard");
                if ((iIntValue3 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    this.f16523Z.invoke(c6021p2, 6);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
