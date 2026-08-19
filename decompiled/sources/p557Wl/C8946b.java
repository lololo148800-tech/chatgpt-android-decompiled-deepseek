package p557Wl;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Wl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8946b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27353Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8949e f27354Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8946b(C8949e c8949e, int i10) {
        super(2);
        this.f27353Y = i10;
        this.f27354Z = c8949e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27353Y) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((Boolean) obj2).booleanValue();
                this.f27354Z.f27358a.setBypassFlagForCapturePost(zBooleanValue);
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ((Boolean) obj2).booleanValue();
                this.f27354Z.f27358a.setBypassFlagForRenderPre(zBooleanValue2);
                break;
        }
        return C17296C.f55119a;
    }
}
