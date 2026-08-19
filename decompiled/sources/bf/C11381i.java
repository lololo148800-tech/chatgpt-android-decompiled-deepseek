package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: bf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11381i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C11381i f34389Z = new C11381i(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11381i f34390o0 = new C11381i(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C11381i f34391p0 = new C11381i(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34392Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11381i(int i10, int i11) {
        super(i10);
        this.f34392Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f34392Y) {
            case 0:
                return AbstractC11153a0.m12383f("com.openai.feature.gizmos.model.Gizmo.ShareRecipient", EnumC11383k.values());
            case 1:
                return AbstractC11153a0.m12383f("com.openai.feature.gizmos.model.Gizmo.SocialSite", EnumC11388p.values());
            default:
                return new C0961M1(EnumC11347B.f34310v0, C11348C.f34312Y);
        }
    }
}
