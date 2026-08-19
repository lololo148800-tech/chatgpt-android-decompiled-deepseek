package p355O7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: O7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6140b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C6140b f20016Z = new C6140b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6140b f20017o0 = new C6140b(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20018Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6140b(int i10, int i11) {
        super(i10);
        this.f20018Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20018Y) {
            case 0:
                return "Requested to write log, but Logs feature is not registered.";
            default:
                return "Requested to forward error log to RUM, but RUM feature is not registered.";
        }
    }
}
