package p046Bk;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0254h0;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2085l;
import p100Dk.AbstractC2090q;
import p100Dk.C2088o;
import p100Dk.C2089p;
import p523V9.AbstractC8215v5;
import p994rk.InterfaceC19201o2;
import sk.C19664c;

/* JADX INFO: renamed from: Bk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1371c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3635Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1383g0 f3636Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19201o2 f3637o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1371c(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, int i10) {
        super(1);
        this.f3635Y = i10;
        this.f3636Z = c1383g0;
        this.f3637o0 = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3635Y) {
            case 0:
                AbstractC2085l response = (AbstractC2085l) obj;
                AbstractC16544l.m18094g(response, "response");
                return AbstractC8215v5.m8840b(new C1368b(response, this.f3636Z, this.f3637o0));
            case 1:
                AbstractC2090q response2 = (AbstractC2090q) obj;
                AbstractC16544l.m18094g(response2, "response");
                if (response2 instanceof C2089p) {
                    return AbstractC8215v5.m8840b(new C1374d(this.f3636Z, this.f3637o0, response2));
                }
                if (response2 instanceof C2088o) {
                    return AbstractC8215v5.m8840b(new C0254h0(response2, 8));
                }
                throw new C0644w();
            case 2:
                return AbstractC8215v5.m8840b(new C1377e(this.f3636Z, this.f3637o0, ((Boolean) obj).booleanValue()));
            case 3:
                return AbstractC8215v5.m8840b(new C1384h(this.f3636Z, this.f3637o0, (Bitmap) obj));
            case 4:
                return AbstractC8215v5.m8840b(new C1398o(this.f3636Z, this.f3637o0, (C19664c) obj));
            default:
                return AbstractC8215v5.m8840b(new C1408t(this.f3636Z, this.f3637o0, ((Boolean) obj).booleanValue()));
        }
    }
}
