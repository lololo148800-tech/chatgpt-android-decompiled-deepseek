package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1025te.C19891v;
import ye.EnumC21517f;

/* JADX INFO: renamed from: Ei.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7799Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f7800Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f7801o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2506f(InterfaceC1436k interfaceC1436k, boolean z6, int i10) {
        super(0);
        this.f7799Y = i10;
        this.f7800Z = interfaceC1436k;
        this.f7801o0 = z6;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f7799Y) {
            case 0:
                this.f7800Z.invoke(Boolean.valueOf(!this.f7801o0));
                break;
            case 1:
                this.f7800Z.invoke(Boolean.valueOf(!this.f7801o0));
                break;
            case 2:
                this.f7800Z.invoke(new C19891v(this.f7801o0));
                break;
            case 3:
                this.f7800Z.invoke(Boolean.valueOf(!this.f7801o0));
                break;
            case 4:
                this.f7800Z.invoke(Boolean.valueOf(!this.f7801o0));
                break;
            case 5:
                this.f7800Z.invoke(this.f7801o0 ? EnumC21517f.f68138Z : EnumC21517f.f68139o0);
                break;
            default:
                this.f7800Z.invoke(Boolean.valueOf(!this.f7801o0));
                break;
        }
        return C17296C.f55119a;
    }
}
