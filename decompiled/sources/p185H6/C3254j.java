package p185H6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p005A3.C0326m;
import p094De.C2025h;
import p103Dn.C2130F;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1111xl.C21296a;
import p129En.C2602m;
import p427Rc.C6848e;
import p857kl.C16460h;
import p917o6.C17867t;
import p917o6.InterfaceC17842J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: H6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3254j implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9905Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f9906Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f9907o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f9908p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f9909q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f9910r0;

    public /* synthetic */ C3254j(InterfaceC2184i interfaceC2184i, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9905Y = i10;
        this.f9906Z = interfaceC2184i;
        this.f9907o0 = obj;
        this.f9908p0 = obj2;
        this.f9909q0 = obj3;
        this.f9910r0 = obj4;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        switch (this.f9905Y) {
            case 0:
                Object objMo3141d = ((C2130F) this.f9906Z).mo3141d(new C2602m(interfaceC2186j, (InterfaceC17842J) this.f9907o0, (C17867t) this.f9908p0, (C0326m) this.f9909q0, (C16525B) this.f9910r0), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            default:
                Object objMo3141d2 = ((C2025h) this.f9906Z).mo3141d(new C6848e(interfaceC2186j, (C16460h) this.f9907o0, (Charset) this.f9908p0, (C21296a) this.f9909q0, this.f9910r0), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
        }
    }
}
