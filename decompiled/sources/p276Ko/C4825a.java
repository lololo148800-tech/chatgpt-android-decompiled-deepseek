package p276Ko;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Ko.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4825a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C4825a f15715Z = new C4825a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4825a f15716o0 = new C4825a(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15717Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4825a(int i10, int i11) {
        super(i10);
        this.f15717Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15717Y) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() == ((Number) obj2).intValue());
            default:
                return Boolean.valueOf(((Number) obj).intValue() == ((Number) obj2).intValue());
        }
    }
}
