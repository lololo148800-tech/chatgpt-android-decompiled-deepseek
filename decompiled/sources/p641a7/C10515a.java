package p641a7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: a7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10515a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C10515a f31161Z = new C10515a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10515a f31162o0 = new C10515a(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31163Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10515a(int i10, int i11) {
        super(i10);
        this.f31163Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f31163Y) {
            case 0:
                return "The Datadog library has already been initialized.";
            default:
                return "Cannot create SDK instance ID, stopping SDK initialization.";
        }
    }
}
