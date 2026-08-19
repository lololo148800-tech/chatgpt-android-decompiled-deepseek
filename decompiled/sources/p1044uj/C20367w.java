package p1044uj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: uj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20367w extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64389Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20323Z f64390Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20367w(C20323Z c20323z, int i10) {
        super(0);
        this.f64389Y = i10;
        this.f64390Z = c20323z;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f64389Y) {
            case 0:
                this.f64390Z.f64252p.invoke();
                break;
            default:
                this.f64390Z.f64251o.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
