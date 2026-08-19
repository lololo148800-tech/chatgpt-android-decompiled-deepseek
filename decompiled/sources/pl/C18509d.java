package pl;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import mm.C17296C;
import p094De.C2025h;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1111xl.C21296a;
import p112E6.C2344c;
import p129En.C2602m;
import p209I6.C3645w;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: pl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18509d implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58984Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f58985Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f58986o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f58987p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f58988q0;

    public /* synthetic */ C18509d(InterfaceC2184i interfaceC2184i, Object obj, Object obj2, Object obj3, int i10) {
        this.f58984Y = i10;
        this.f58985Z = interfaceC2184i;
        this.f58986o0 = obj;
        this.f58987p0 = obj2;
        this.f58988q0 = obj3;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        switch (this.f58984Y) {
            case 0:
                Object objMo3141d = ((C2025h) this.f58985Z).mo3141d(new C18508c(interfaceC2186j, (Charset) this.f58986o0, (C21296a) this.f58987p0, (InterfaceC15088n) this.f58988q0, 0), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            case 1:
                Object objMo3141d2 = ((C2025h) this.f58985Z).mo3141d(new C18508c(interfaceC2186j, (Charset) this.f58986o0, (C21296a) this.f58987p0, (InterfaceC15088n) this.f58988q0, 1), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
            default:
                Object objMo3141d3 = ((C2219z0) this.f58985Z).mo3141d(new C2602m(interfaceC2186j, (C17852e) this.f58986o0, (C2344c) this.f58987p0, (C3645w) this.f58988q0), interfaceC18770c);
                return objMo3141d3 == EnumC19250a.f61036Y ? objMo3141d3 : C17296C.f55119a;
        }
    }
}
