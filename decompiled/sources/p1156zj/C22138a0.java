package p1156zj;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: zj.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22138a0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C22138a0 f69982Z = new C22138a0(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C22138a0 f69983o0 = new C22138a0(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C22138a0 f69984p0 = new C22138a0(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69985Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22138a0(int i10, int i11) {
        super(i10);
        this.f69985Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69985Y) {
            case 0:
                return C17296C.f55119a;
            case 1:
                return C17296C.f55119a;
            default:
                EnumC22128V0[] enumC22128V0ArrValues = EnumC22128V0.values();
                int iM19257b = AbstractC17660E.m19257b(enumC22128V0ArrValues.length);
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (EnumC22128V0 enumC22128V0 : enumC22128V0ArrValues) {
                    linkedHashMap.put(enumC22128V0.f69952Y, enumC22128V0);
                }
                return linkedHashMap;
        }
    }
}
