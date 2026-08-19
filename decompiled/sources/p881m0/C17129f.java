package p881m0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: m0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17129f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54769Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16557y f54770Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f54771o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17129f(C16557y c16557y, InterfaceC1436k interfaceC1436k, int i10) {
        super(1);
        this.f54769Y = i10;
        switch (i10) {
            case 1:
                this.f54770Z = c16557y;
                this.f54771o0 = (AbstractC16546n) interfaceC1436k;
                super(1);
                break;
            default:
                this.f54770Z = c16557y;
                this.f54771o0 = (AbstractC16546n) interfaceC1436k;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54769Y) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C16557y c16557y = this.f54770Z;
                float f10 = c16557y.f51286Y - fFloatValue;
                c16557y.f51286Y = f10;
                this.f54771o0.invoke(Float.valueOf(f10));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                C16557y c16557y2 = this.f54770Z;
                float f11 = c16557y2.f51286Y - fFloatValue2;
                c16557y2.f51286Y = f11;
                this.f54771o0.invoke(Float.valueOf(f11));
                break;
        }
        return C17296C.f55119a;
    }
}
