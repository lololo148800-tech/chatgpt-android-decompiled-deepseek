package p1044uj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13421l;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: uj.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20339h0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64310Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20359r0 f64311Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f64312o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20339h0(C20359r0 c20359r0, C13421l c13421l, int i10) {
        super(1);
        this.f64310Y = i10;
        this.f64311Z = c20359r0;
        this.f64312o0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f64310Y) {
            case 0:
                InterfaceC19201o2 it = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20312N.f64199b);
                break;
            case 1:
                InterfaceC19201o2 it2 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it2, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20313O.f64200b);
                break;
            case 2:
                InterfaceC19201o2 it3 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it3, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20315Q.f64202b);
                break;
            case 3:
                InterfaceC19201o2 it4 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it4, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20310L.f64197b);
                break;
            case 4:
                InterfaceC19201o2 it5 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it5, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20312N.f64199b);
                break;
            case 5:
                InterfaceC19201o2 it6 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it6, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20313O.f64200b);
                break;
            case 6:
                InterfaceC19201o2 it7 = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it7, "it");
                C20359r0.m21042e(this.f64311Z, this.f64312o0, C20315Q.f64202b);
                break;
            default:
                C20338h document = (C20338h) obj;
                AbstractC16544l.m18094g(document, "document");
                C20311M c20311m = new C20311M(document);
                C20359r0.m21042e(this.f64311Z, this.f64312o0, c20311m);
                break;
        }
        return C17296C.f55119a;
    }
}
