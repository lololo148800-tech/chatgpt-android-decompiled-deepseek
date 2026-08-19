package p148Fi;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;
import p559Wn.C8969a;

/* JADX INFO: renamed from: Fi.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2815e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C2815e f8543Z = new C2815e(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2815e f8544o0 = new C2815e(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2815e f8545p0 = new C2815e(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C2815e f8546q0 = new C2815e(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C2815e f8547r0 = new C2815e(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C2815e f8548s0 = new C2815e(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8549Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2815e(int i10, int i11) {
        super(i10);
        this.f8549Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f8549Y) {
            case 0:
                return new C0961M1(EnumC2821g.f8559s0, C2824h.f8562Y);
            case 1:
                return new C0961M1(EnumC2756C.f8451p0, C2758D.f8455Y);
            case 2:
                return new C0961M1(EnumC2787S.f8509p0, C2789T.f8512Y);
            case 3:
                return new C8969a("com.openai.voice.api.Unknown", C2799Y.INSTANCE, new Annotation[0]);
            case 4:
                return new C0961M1(EnumC2753A0.f8446t0, C2755B0.f8448Y);
            default:
                return new C0961M1(EnumC2779N0.f8496q0, C2781O0.f8499Y);
        }
    }
}
