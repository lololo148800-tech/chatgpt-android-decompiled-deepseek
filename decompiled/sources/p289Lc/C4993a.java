package p289Lc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p261K7.C4549b;

/* JADX INFO: renamed from: Lc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4993a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C4993a f16298Z = new C4993a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4993a f16299o0 = new C4993a(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16300Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4993a(int i10, int i11) {
        super(i10);
        this.f16300Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f16300Y) {
            case 0:
                AbstractC16544l.m18094g((C4549b) obj, "$this$createLogger");
                break;
            default:
                C4549b createLogger = (C4549b) obj;
                AbstractC16544l.m18094g(createLogger, "$this$createLogger");
                createLogger.f14870e = 0.2f;
                break;
        }
        return C17296C.f55119a;
    }
}
