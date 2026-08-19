package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p278L0.C4847K;

/* JADX INFO: renamed from: J0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C3992V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3880A3 f12529Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12530Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12531o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f12532p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3992V(C3880A3 c3880a3, float f10, float f11, float f12) {
        super(1);
        this.f12529Y = c3880a3;
        this.f12530Z = f10;
        this.f12531o0 = f11;
        this.f12532p0 = f12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C4847K c4847k = (C4847K) obj;
        C3880A3 c3880a3 = this.f12529Y;
        boolean z6 = c3880a3.f11735a;
        float f10 = this.f12531o0;
        float f11 = this.f12530Z;
        if (!z6) {
            c4847k.m5497a(EnumC3886B3.f11779o0, f11 - f10);
        }
        float f12 = this.f12532p0;
        if (f12 != f10) {
            c4847k.m5497a(EnumC3886B3.f11778Z, Math.max(f11 - f12, 0.0f));
        }
        if (!c3880a3.f11736b) {
            c4847k.m5497a(EnumC3886B3.f11777Y, f11);
        }
        return C17296C.f55119a;
    }
}
