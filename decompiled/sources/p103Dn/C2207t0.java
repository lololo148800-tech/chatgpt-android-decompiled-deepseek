package p103Dn;

import gd.AbstractC13881O1;
import kotlin.jvm.internal.AbstractC16546n;
import me.C17238a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p059C5.C1592j;
import p066Cc.C1625b;
import p086D6.C1970n;
import p092Dc.C1991h;
import p129En.AbstractC2592c;
import p268Kf.C4666u;
import p708dh.C13149c;
import p811ih.C15000g;
import p948pi.C18422e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2207t0 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6771Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f6772Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f6773o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f6774p0;

    public /* synthetic */ C2207t0(InterfaceC2184i interfaceC2184i, Object obj, Object obj2, int i10) {
        this.f6771Y = i10;
        this.f6772Z = interfaceC2184i;
        this.f6773o0 = obj;
        this.f6774p0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC2184i interfaceC2184i = this.f6772Z;
        ?? r6 = this.f6774p0;
        Object obj = this.f6773o0;
        switch (this.f6771Y) {
            case 0:
                Object objM3613a = AbstractC2592c.m3613a(C2209u0.f6778Y, new C1592j((InterfaceC1440o) r6, (InterfaceC18770c) null), interfaceC2186j, interfaceC18770c, new InterfaceC2184i[]{interfaceC2184i, (InterfaceC2184i) obj});
                return objM3613a == EnumC19250a.f61036Y ? objM3613a : c17296c;
            case 1:
                Object objMo3141d = ((C2180g) interfaceC2184i).mo3141d(new C1625b(interfaceC2186j, (C4666u) obj, (InterfaceC1436k) r6), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : c17296c;
            case 2:
                Object objMo3141d2 = ((C1970n) interfaceC2184i).mo3141d(new C1625b(interfaceC2186j, (C13149c) obj, (C18422e) r6, 9), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : c17296c;
            case 3:
                Object objMo3141d3 = ((C1970n) interfaceC2184i).mo3141d(new C1625b(interfaceC2186j, (AbstractC13881O1) obj, (C15000g) r6, 11), interfaceC18770c);
                return objMo3141d3 == EnumC19250a.f61036Y ? objMo3141d3 : c17296c;
            default:
                Object objMo3141d4 = ((C2217y0) interfaceC2184i).f6797Y.mo3141d(new C1625b(interfaceC2186j, (C17238a) obj, (C1991h) r6, 12), interfaceC18770c);
                return objMo3141d4 == EnumC19250a.f61036Y ? objMo3141d4 : c17296c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2207t0(C2180g c2180g, C4666u c4666u, InterfaceC1436k interfaceC1436k) {
        this.f6771Y = 1;
        this.f6772Z = c2180g;
        this.f6773o0 = c4666u;
        this.f6774p0 = (AbstractC16546n) interfaceC1436k;
    }
}
