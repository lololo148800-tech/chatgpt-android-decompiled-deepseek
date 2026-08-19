package p553Wh;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Wh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8867c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C8867c f27138Z = new C8867c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8867c f27139o0 = new C8867c(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27140Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8867c(int i10, int i11) {
        super(i10);
        this.f27140Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f27140Y) {
            case 0:
                return C17296C.f55119a;
            default:
                throw new IllegalStateException("AppState not provided");
        }
    }
}
