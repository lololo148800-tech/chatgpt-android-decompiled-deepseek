package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p077Cn.C1743k;

/* JADX INFO: renamed from: l0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16756l0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53755Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16777s0 f53756Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16756l0(AbstractC16777s0 abstractC16777s0, int i10) {
        super(0);
        this.f53755Y = i10;
        this.f53756Z = abstractC16777s0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f53755Y) {
            case 0:
                C1743k c1743k = this.f53756Z.f53843F0;
                if (c1743k != null) {
                    c1743k.mo2524p(C16699O.f53513a);
                }
                return C17296C.f55119a;
            default:
                return Boolean.valueOf(!this.f53756Z.mo18516U0());
        }
    }
}
