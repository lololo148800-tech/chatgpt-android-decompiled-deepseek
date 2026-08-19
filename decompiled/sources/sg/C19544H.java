package sg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: sg.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C19544H extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62087Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f62088Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19575q f62089o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19578t f62090p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19544H(InterfaceC1436k interfaceC1436k, C19575q c19575q, C19578t c19578t, int i10) {
        super(0);
        this.f62087Y = i10;
        this.f62088Z = interfaceC1436k;
        this.f62089o0 = c19575q;
        this.f62090p0 = c19578t;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f62087Y) {
            case 0:
                this.f62088Z.invoke(new C19556U(this.f62089o0, this.f62090p0));
                break;
            default:
                this.f62088Z.invoke(new C19556U(this.f62089o0, this.f62090p0));
                break;
        }
        return C17296C.f55119a;
    }
}
