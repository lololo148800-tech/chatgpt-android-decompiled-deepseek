package p347No;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: No.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5936a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C5936a f19313Z = new C5936a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5936a f19314o0 = new C5936a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5936a f19315p0 = new C5936a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5936a f19316q0 = new C5936a(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19317Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5936a(int i10, int i11) {
        super(i10);
        this.f19317Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19317Y) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() > ((Number) obj2).intValue());
            case 1:
                return Boolean.valueOf(((Number) obj).intValue() >= ((Number) obj2).intValue());
            case 2:
                return Boolean.valueOf(((Number) obj).intValue() < ((Number) obj2).intValue());
            default:
                return Boolean.valueOf(((Number) obj).intValue() <= ((Number) obj2).intValue());
        }
    }
}
