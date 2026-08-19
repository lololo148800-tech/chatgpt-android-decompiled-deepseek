package p137F7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: F7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2675a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8213Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f8214Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2675a(int i10, float f10) {
        super(0);
        this.f8213Y = i10;
        this.f8214Z = f10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f8213Y) {
            case 0:
                return Float.valueOf(this.f8214Z);
            case 1:
                return "Sample rate value provided " + this.f8214Z + " is below 0, setting it to 0.";
            default:
                return "Sample rate value provided " + this.f8214Z + " is above 100, setting it to 100.";
        }
    }
}
