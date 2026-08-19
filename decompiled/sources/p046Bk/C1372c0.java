package p046Bk;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p994rk.C19203p0;
import p994rk.C19207q0;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372c0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3638Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3639Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1375d0 f3640o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1372c0(int i10, C1375d0 c1375d0, InterfaceC19201o2 interfaceC19201o2) {
        super(0);
        this.f3638Y = i10;
        this.f3639Z = interfaceC19201o2;
        this.f3640o0 = c1375d0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3638Y) {
            case 0:
                InterfaceC19201o2 interfaceC19201o2 = this.f3639Z;
                C1375d0.m2037b(this.f3640o0, ((C19207q0) interfaceC19201o2).f60943v0, new C1369b0(interfaceC19201o2, 0));
                break;
            default:
                InterfaceC19201o2 interfaceC19201o3 = this.f3639Z;
                C19207q0 c19207q0 = (C19207q0) interfaceC19201o3;
                LinkedHashMap linkedHashMap = c19207q0.f60942u0;
                List list = linkedHashMap != null ? (List) linkedHashMap.get(c19207q0.f60935Z) : null;
                C1375d0.m2037b(this.f3640o0, list != null ? new C19203p0(c19207q0, list) : null, new C1369b0(interfaceC19201o3, 1));
                break;
        }
        return C17296C.f55119a;
    }
}
