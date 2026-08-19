package p672c3;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: c3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C11633u extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C11633u f35253Z = new C11633u(0, 0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35254Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11633u(int i10, int i11) {
        super(i10);
        this.f35254Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f35254Y) {
            case 0:
                return new Bundle();
            default:
                int i10 = C11598c0.f35089Y;
                return new C11564B();
        }
    }
}
