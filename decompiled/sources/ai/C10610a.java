package ai;

import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ai.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10610a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C10610a f31485Z = new C10610a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10610a f31486o0 = new C10610a(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31487Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10610a(int i10, int i11) {
        super(i10);
        this.f31487Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31487Y) {
            case 0:
                return new C0961M1(EnumC10612c.f31491r0, C10613d.f31494Y);
            default:
                return new C0961M1(EnumC10617h.f31499q0, C10618i.f31501Y);
        }
    }
}
