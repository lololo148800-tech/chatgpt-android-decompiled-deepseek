package p193Hf;

import java.util.List;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17309l;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ye.C21522k;

/* JADX INFO: renamed from: Hf.o1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3390o1 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10335Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f10336Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1758z f10337o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f10338p0;

    public /* synthetic */ C3390o1(C16525B c16525b, InterfaceC1758z interfaceC1758z, C16525B c16525b2, int i10) {
        this.f10335Y = i10;
        this.f10336Z = c16525b;
        this.f10337o0 = interfaceC1758z;
        this.f10338p0 = c16525b2;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        switch (this.f10335Y) {
            case 0:
                C21522k c21522k = (C21522k) obj;
                this.f10336Z.f51262Y = c21522k;
                Object objMo2523o = ((C1757y) this.f10337o0).f5030p0.mo2523o(new C17309l(this.f10338p0.f51262Y, c21522k), interfaceC18770c);
                return objMo2523o == EnumC19250a.f61036Y ? objMo2523o : C17296C.f55119a;
            default:
                List list = (List) obj;
                this.f10336Z.f51262Y = list;
                Object objMo2523o2 = ((C1757y) this.f10337o0).f5030p0.mo2523o(new C17309l(list, this.f10338p0.f51262Y), interfaceC18770c);
                return objMo2523o2 == EnumC19250a.f61036Y ? objMo2523o2 : C17296C.f55119a;
        }
    }
}
