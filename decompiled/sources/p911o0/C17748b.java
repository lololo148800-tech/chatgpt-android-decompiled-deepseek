package p911o0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p492U1.C7540e;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17748b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21094o f56671Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f56672Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f56673o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f56674p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f56675q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f56676r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f56677s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17748b(C21094o c21094o, float f10, int i10, int i11, int i12, AbstractC21069X abstractC21069X, int i13) {
        super(1);
        this.f56671Y = c21094o;
        this.f56672Z = f10;
        this.f56673o0 = i10;
        this.f56674p0 = i11;
        this.f56675q0 = i12;
        this.f56676r0 = abstractC21069X;
        this.f56677s0 = i13;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        boolean z6 = this.f56671Y instanceof C21094o;
        AbstractC21069X abstractC21069X = this.f56676r0;
        int i11 = this.f56675q0;
        int i12 = this.f56673o0;
        float f10 = this.f56672Z;
        if (z6) {
            i10 = 0;
        } else {
            i10 = !C7540e.m7873a(f10, Float.NaN) ? i12 : (this.f56674p0 - i11) - abstractC21069X.f66981Y;
        }
        if (!z6) {
            i12 = 0;
        } else if (C7540e.m7873a(f10, Float.NaN)) {
            i12 = (this.f56677s0 - i11) - abstractC21069X.f66982Z;
        }
        abstractC21068W.m21546g(abstractC21069X, i10, i12, 0.0f);
        return C17296C.f55119a;
    }
}
