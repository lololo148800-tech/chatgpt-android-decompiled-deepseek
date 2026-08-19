package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: le.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16900p0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f54269Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f54270Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16900p0(boolean z6, boolean z10) {
        super(0);
        this.f54269Y = z6;
        this.f54270Z = z10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return Boolean.valueOf(this.f54269Y && this.f54270Z);
    }
}
