package p046Bk;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1382g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3672Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1383g0 f3673Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19201o2 f3674o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1420z f3675p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1382g(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, C1420z c1420z, int i10) {
        super(1);
        this.f3672Y = i10;
        this.f3673Z = c1383g0;
        this.f3674o0 = interfaceC19201o2;
        this.f3675p0 = c1420z;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3672Y) {
            case 0:
                C1420z c1420z = this.f3675p0;
                return AbstractC8215v5.m8840b(new C1380f(this.f3673Z, this.f3674o0, (Number) obj, c1420z));
            case 1:
                C1420z c1420z2 = this.f3675p0;
                return AbstractC8215v5.m8840b(new C1386i(this.f3673Z, this.f3674o0, (String) obj, c1420z2));
            case 2:
                String newValue = (String) obj;
                AbstractC16544l.m18094g(newValue, "newValue");
                return AbstractC8215v5.m8840b(new C1388j(this.f3673Z, this.f3674o0, newValue, this.f3675p0));
            case 3:
                String newValue2 = (String) obj;
                AbstractC16544l.m18094g(newValue2, "newValue");
                return AbstractC8215v5.m8840b(new C1390k(this.f3673Z, this.f3674o0, newValue2, this.f3675p0));
            case 4:
                C1420z c1420z3 = this.f3675p0;
                return AbstractC8215v5.m8840b(new C1392l(this.f3673Z, this.f3674o0, (String) obj, c1420z3));
            case 5:
                C1420z c1420z4 = this.f3675p0;
                return AbstractC8215v5.m8840b(new C1394m(this.f3673Z, this.f3674o0, (String) obj, c1420z4));
            case 6:
                String newText = (String) obj;
                AbstractC16544l.m18094g(newText, "newText");
                return AbstractC8215v5.m8840b(new C1365a(this.f3673Z, this.f3674o0, newText, this.f3675p0));
            case 7:
                List newText2 = (List) obj;
                AbstractC16544l.m18094g(newText2, "newText");
                return AbstractC8215v5.m8840b(new C1400p(this.f3673Z, this.f3674o0, newText2, this.f3675p0));
            case 8:
                List newText3 = (List) obj;
                AbstractC16544l.m18094g(newText3, "newText");
                return AbstractC8215v5.m8840b(new C1402q(this.f3673Z, this.f3674o0, newText3, this.f3675p0));
            case 9:
                String newText4 = (String) obj;
                AbstractC16544l.m18094g(newText4, "newText");
                return AbstractC8215v5.m8840b(new C1404r(this.f3673Z, this.f3674o0, newText4, this.f3675p0));
            case 10:
                List selectedOptions = (List) obj;
                AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
                return AbstractC8215v5.m8840b(new C1396n(this.f3673Z, this.f3674o0, selectedOptions, this.f3675p0));
            case 11:
                Set stringSet = (Set) obj;
                AbstractC16544l.m18094g(stringSet, "stringSet");
                return AbstractC8215v5.m8840b(new C1406s(this.f3673Z, this.f3674o0, stringSet, this.f3675p0));
            case 12:
                String newText5 = (String) obj;
                AbstractC16544l.m18094g(newText5, "newText");
                return AbstractC8215v5.m8840b(new C1410u(this.f3673Z, this.f3674o0, newText5, this.f3675p0));
            case 13:
                String newText6 = (String) obj;
                AbstractC16544l.m18094g(newText6, "newText");
                return AbstractC8215v5.m8840b(new C1412v(this.f3673Z, this.f3674o0, newText6, this.f3675p0));
            case 14:
                String newText7 = (String) obj;
                AbstractC16544l.m18094g(newText7, "newText");
                return AbstractC8215v5.m8840b(new C1414w(this.f3673Z, this.f3674o0, newText7, this.f3675p0));
            case 15:
                String newText8 = (String) obj;
                AbstractC16544l.m18094g(newText8, "newText");
                return AbstractC8215v5.m8840b(new C1416x(this.f3673Z, this.f3674o0, newText8, this.f3675p0));
            default:
                String newText9 = (String) obj;
                AbstractC16544l.m18094g(newText9, "newText");
                return AbstractC8215v5.m8840b(new C1418y(this.f3673Z, this.f3674o0, newText9, this.f3675p0));
        }
    }
}
