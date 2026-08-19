package p983r7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: r7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18884b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18884b f60200Z = new C18884b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18884b f60201o0 = new C18884b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18884b f60202p0 = new C18884b(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18884b f60203q0 = new C18884b(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18884b f60204r0 = new C18884b(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C18884b f60205s0 = new C18884b(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60206Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18884b(int i10, int i11) {
        super(i10);
        this.f60206Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60206Y) {
            case 0:
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            case 1:
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            case 2:
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            case 3:
                return "We couldn't unregister the Network Callback";
            case 4:
                return "We couldn't unregister the Network Callback";
            default:
                return "We couldn't unregister the Network Callback";
        }
    }
}
