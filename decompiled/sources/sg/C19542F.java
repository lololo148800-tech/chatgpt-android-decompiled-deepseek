package sg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: sg.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C19542F extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62082Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f62083Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19575q f62084o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19542F(InterfaceC1436k interfaceC1436k, C19575q c19575q, int i10) {
        super(0);
        this.f62082Y = i10;
        this.f62083Z = interfaceC1436k;
        this.f62084o0 = c19575q;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f62082Y) {
            case 0:
                this.f62083Z.invoke(new C19553Q(C19575q.m20626a(this.f62084o0, 6)));
                break;
            default:
                this.f62083Z.invoke(new C19553Q(C19575q.m20626a(this.f62084o0, 1)));
                break;
        }
        return C17296C.f55119a;
    }
}
