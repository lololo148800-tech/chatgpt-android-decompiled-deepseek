package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4071j;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8159o5;
import p537W0.C8410b;
import p624Zg.AbstractC10374j;
import p946pc.AbstractC18351q;
import p953q0.AbstractC18551I;
import p962qc.AbstractC18671e;

/* JADX INFO: renamed from: D0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1834v extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5296Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8410b f5297Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f5298o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834v(C8410b c8410b, int i10) {
        super(2);
        this.f5296Y = 1;
        float f10 = AbstractC4071j.f12953a;
        float f11 = AbstractC4071j.f12953a;
        this.f5297Z = c8410b;
        this.f5298o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        C8410b c8410b = this.f5297Z;
        int i10 = this.f5298o0;
        int i11 = this.f5296Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                AbstractC1807h0.m2612a(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 1:
                int iM6447d0 = C5997d.m6447d0(i10 | 1);
                float f10 = AbstractC4071j.f12953a;
                float f11 = AbstractC4071j.f12953a;
                AbstractC4071j.m4740b(c8410b, c6021p, iM6447d0);
                break;
            case 2:
                AbstractC10374j.m10888b(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 3:
                AbstractC8159o5.m8720a(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 4:
                AbstractC8159o5.m8720a(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 5:
                AbstractC8159o5.m8721b(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 6:
                AbstractC18351q.m19859c(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            case 7:
                AbstractC18551I.m19923d(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
            default:
                AbstractC18671e.m20039b(c8410b, c6021p, C5997d.m6447d0(i10 | 1));
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1834v(C8410b c8410b, int i10, int i11) {
        super(2);
        this.f5296Y = i11;
        this.f5297Z = c8410b;
        this.f5298o0 = i10;
    }
}
