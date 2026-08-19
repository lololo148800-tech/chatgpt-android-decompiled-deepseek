package p252Jo;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Jo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4486a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C4486a f14638Z = new C4486a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4486a f14639o0 = new C4486a(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14640Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4486a(int i10, int i11) {
        super(i10);
        this.f14640Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14640Y) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() == ((Number) obj2).intValue());
            default:
                return Boolean.valueOf(((Number) obj).intValue() == ((Number) obj2).intValue());
        }
    }
}
