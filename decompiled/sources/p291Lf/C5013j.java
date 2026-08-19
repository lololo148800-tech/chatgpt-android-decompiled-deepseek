package p291Lf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p316Mf.C5342i;
import p316Mf.C5343j;
import p926of.AbstractC18176m;
import p926of.C18174k;

/* JADX INFO: renamed from: Lf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5013j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16361Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f16362Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC18176m f16363o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5013j(InterfaceC1436k interfaceC1436k, AbstractC18176m abstractC18176m, int i10) {
        super(0);
        this.f16361Y = i10;
        this.f16362Z = interfaceC1436k;
        this.f16363o0 = abstractC18176m;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16361Y) {
            case 0:
                this.f16362Z.invoke(this.f16363o0);
                break;
            case 1:
                this.f16362Z.invoke(new C5343j((C18174k) this.f16363o0));
                break;
            default:
                this.f16362Z.invoke(new C5342i((C18174k) this.f16363o0));
                break;
        }
        return C17296C.f55119a;
    }
}
