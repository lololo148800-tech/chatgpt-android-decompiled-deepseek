package p911o0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;

/* JADX INFO: renamed from: o0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C17729I extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56606Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int[] f56607Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17729I(int[] iArr, int i10) {
        super(3);
        this.f56606Y = i10;
        this.f56607Z = iArr;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56606Y) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f56607Z[iIntValue]);
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f56607Z[iIntValue2]);
        }
    }
}
