package p1071w0;

import android.os.Bundle;
import androidx.navigation.AbstractC11122c;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p006A4.C0362w;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1143z4.AbstractC21790t;
import p1143z4.C21778h;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22165j0;
import p1156zj.AbstractC22180o0;
import p1156zj.C22097F0;
import p1156zj.C22107K0;
import p1156zj.C22139a1;
import p1156zj.C22148d1;
import p1156zj.C22150e0;
import p1156zj.C22177n0;
import p1156zj.C22195t0;
import p1156zj.EnumC22128V0;
import p140Fa.C2685e;
import p149Fj.C2869c;
import p149Fj.C2870d;
import p149Fj.C2871e;
import p149Fj.C2873g;
import p149Fj.C2874h;
import p149Fj.InterfaceC2872f;
import p149Fj.InterfaceC2875i;
import p173Gj.EnumC3098e;
import p350O1.C6045C;
import p350O1.C6046D;
import p350O1.C6049G;
import p350O1.C6065n;
import p350O1.InterfaceC6074w;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.C13430u;
import p860l0.C16663C;
import p909nm.C17689w;

/* JADX INFO: renamed from: w0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C20699B extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65564Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f65565Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f65566o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f65567p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f65568q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20699B(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f65564Y = i10;
        this.f65565Z = obj;
        this.f65566o0 = obj2;
        this.f65567p0 = obj3;
        this.f65568q0 = obj4;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f65564Y) {
            case 0:
                C20750g0 c20750g0 = (C20750g0) this.f65565Z;
                if (c20750g0.m21292b()) {
                    C16525B c16525b = new C16525B();
                    C16663C c16663c = new C16663C(c20750g0.f65813d, c20750g0.f65829t, c16525b, 15);
                    C6046D c6046d = (C6046D) this.f65566o0;
                    InterfaceC6074w interfaceC6074w = c6046d.f19685a;
                    interfaceC6074w.mo6619f((C6045C) this.f65567p0, (C6065n) this.f65568q0, c16663c, c20750g0.f65830u);
                    C6049G c6049g = new C6049G(c6046d, interfaceC6074w);
                    c6046d.f19686b.set(c6049g);
                    c16525b.f51262Y = c6049g;
                    c20750g0.f65814e = c6049g;
                }
                return new C20697A();
            case 1:
                C21778h it = (C21778h) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C16556x) this.f65565Z).f51285Y = true;
                ((AbstractC11122c) this.f65566o0).m12182a((AbstractC21790t) this.f65567p0, (Bundle) this.f65568q0, it, C17689w.f56480Y);
                return C17296C.f55119a;
            case 2:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22150e0 c22150e0 = obj2 instanceof C22150e0 ? (C22150e0) obj2 : null;
                if (c22150e0 != null) {
                    AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) this.f65565Z;
                    C22139a1 c22139a1 = ((C22150e0) abstractC22180o0).f70024Z;
                    List listMo22381h = abstractC22180o0.mo22381h();
                    C22150e0 c22150e1 = (C22150e0) abstractC22180o0;
                    EnumC22128V0 enumC22128V0 = c22150e1.f70024Z.f69986Y;
                    C22195t0 c22195t0 = (C22195t0) this.f65566o0;
                    action.f42521b = new C22177n0(c22139a1, listMo22381h, c22150e1.f70028r0, AbstractC22120R0.m22357d(c22195t0, enumC22128V0), c22150e0.f70026p0, c22150e0.f70027q0, AbstractC22120R0.m22355b(action, true), EnumC3098e.f9323o0, c22195t0.f70351q.f40641d, null, false, false, null, new C22097F0((C13421l) this.f65567p0, (C22107K0) this.f65568q0, 5), 7680);
                }
                return C17296C.f55119a;
            default:
                InterfaceC2875i it2 = (InterfaceC2875i) obj;
                AbstractC16544l.m18094g(it2, "it");
                boolean z6 = it2 instanceof C2873g;
                C13421l c13421l = (C13421l) this.f65565Z;
                if (z6) {
                    return AbstractC8215v5.m8840b(new C16663C(c13421l, it2, (C2685e) this.f65566o0, 21));
                }
                if (!(it2 instanceof C2874h)) {
                    throw new C0644w();
                }
                InterfaceC2872f interfaceC2872f = ((C2874h) it2).f8641a;
                if (interfaceC2872f instanceof C2869c) {
                    return AbstractC8215v5.m8840b(new C0362w(c13421l, (C22195t0) this.f65567p0, (AbstractC22165j0) this.f65568q0, interfaceC2872f, (C2685e) this.f65566o0, 19));
                }
                boolean z10 = interfaceC2872f instanceof C2870d;
                AbstractC22165j0 abstractC22165j0 = (AbstractC22165j0) this.f65568q0;
                if (z10) {
                    return AbstractC8215v5.m8840b(new C22148d1(abstractC22165j0, interfaceC2872f, 0));
                }
                if (interfaceC2872f instanceof C2871e) {
                    return AbstractC8215v5.m8840b(new C22148d1(abstractC22165j0, interfaceC2872f, 1));
                }
                throw new C0644w();
        }
    }
}
