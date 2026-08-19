package p000;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes.dex */
public final class C19281s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61087Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f61088Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f61089o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19281s(List list, int i10, int i11) {
        super(0);
        this.f61087Y = i11;
        switch (i11) {
            case 1:
                this.f61088Z = list;
                this.f61089o0 = i10;
                super(0);
                break;
            case 2:
                this.f61088Z = list;
                this.f61089o0 = i10;
                super(0);
                break;
            default:
                this.f61088Z = list;
                this.f61089o0 = i10;
                break;
        }
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f61087Y) {
            case 0:
                return AbstractC17680n.m19336L(this.f61088Z, this.f61089o0);
            case 1:
                return AbstractC17680n.m19337M(this.f61089o0, this.f61088Z);
            default:
                return (Float) this.f61088Z.get(this.f61089o0);
        }
    }
}
