package p006A4;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p562X0.C9013h;

/* JADX INFO: renamed from: A4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0356q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1229Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9013h f1230Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f1231o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f1232p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0356q(C9013h c9013h, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f1229Y = i11;
        this.f1230Z = c9013h;
        this.f1231o0 = c8410b;
        this.f1232p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1229Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    int i10 = ((this.f1232p0 >> 3) & 112) | 8;
                    AbstractC0357r.m992b(this.f1230Z, this.f1231o0, c6021p, i10);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f1232p0 | 1);
                C8410b c8410b = this.f1231o0;
                AbstractC0357r.m992b(this.f1230Z, c8410b, (C6021p) obj, iM6447d0);
                break;
        }
        return C17296C.f55119a;
    }
}
