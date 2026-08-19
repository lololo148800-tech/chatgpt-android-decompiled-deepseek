package p936p0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p977r0.C18852x;

/* JADX INFO: renamed from: p0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C18282v extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58368Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f58369Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f58370o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18282v(int i10, int i11, int i12) {
        super(0);
        this.f58368Y = i12;
        this.f58369Z = i10;
        this.f58370o0 = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f58368Y) {
            case 0:
                return new C18280t(this.f58369Z, this.f58370o0);
            default:
                return new C18852x(new int[]{this.f58369Z}, new int[]{this.f58370o0});
        }
    }
}
