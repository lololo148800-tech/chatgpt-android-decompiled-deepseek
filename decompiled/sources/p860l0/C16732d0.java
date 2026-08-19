package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;

/* JADX INFO: renamed from: l0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16732d0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53643Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16557y f53644Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16732d0(C16557y c16557y, int i10) {
        super(2);
        this.f53643Y = i10;
        this.f53644Z = c16557y;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53643Y) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                ((C19738o) obj).m20691a();
                this.f53644Z.f51286Y = fFloatValue;
                break;
            default:
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((C19738o) obj).m20691a();
                this.f53644Z.f51286Y = fFloatValue2;
                break;
        }
        return C17296C.f55119a;
    }
}
