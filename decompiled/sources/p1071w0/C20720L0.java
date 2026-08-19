package p1071w0;

import androidx.navigation.AbstractC11122c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p003A1.C0256i;
import p003A1.InterfaceC0172H0;
import p030B2.C0781s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1139z0.C21582E0;
import p1139z0.C21619i;
import p1143z4.AbstractC21790t;
import p1143z4.C21760B;
import p1143z4.C21792v;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22180o0;
import p1156zj.C22107K0;
import p1156zj.C22150e0;
import p1156zj.C22206x0;
import p204I1.C3590f;
import p492U1.C7543h;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8640h;
import p729ej.C13421l;
import p729ej.C13430u;

/* JADX INFO: renamed from: w0.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20720L0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65695Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f65696Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f65697o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20720L0(Object obj, int i10, Object obj2) {
        super(1);
        this.f65695Y = i10;
        this.f65696Z = obj;
        this.f65697o0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21790t abstractC21790t;
        AbstractC21790t abstractC21790tM12188h;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f65697o0;
        Object obj3 = this.f65696Z;
        switch (this.f65695Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList = (ArrayList) obj3;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C17309l c17309l = (C17309l) arrayList.get(i10);
                        AbstractC21068W.m21537f(abstractC21068W, (AbstractC21069X) c17309l.f55136Y, ((C7543h) c17309l.f55137Z).f23897a);
                    }
                }
                ArrayList arrayList2 = (ArrayList) obj2;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        C17309l c17309l2 = (C17309l) arrayList2.get(i11);
                        AbstractC21069X abstractC21069X = (AbstractC21069X) c17309l2.f55136Y;
                        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) c17309l2.f55137Z;
                        AbstractC21068W.m21537f(abstractC21068W, abstractC21069X, interfaceC1426a != null ? ((C7543h) interfaceC1426a.invoke()).f23897a : 0L);
                    }
                }
                break;
            case 1:
                String formula = (String) obj;
                AbstractC16544l.m18094g(formula, "formula");
                ((C0256i) ((InterfaceC0172H0) obj3)).m827c(new C3590f(6, formula, null));
                ((InterfaceC1426a) obj2).invoke();
                break;
            case 2:
                ((C21582E0) obj3).f68337a.f67831f.m7110o((C21619i) obj2);
                break;
            case 3:
                C21760B navOptions = (C21760B) obj;
                AbstractC16544l.m18094g(navOptions, "$this$navOptions");
                C0781s c0781s = navOptions.f69029a;
                c0781s.f2192b = 0;
                c0781s.f2193c = 0;
                AbstractC21790t abstractC21790t2 = (AbstractC21790t) obj3;
                if (abstractC21790t2 instanceof C21792v) {
                    int i12 = AbstractC21790t.f69129t0;
                    Iterator it = AbstractC8634g.m9295i(abstractC21790t2).iterator();
                    do {
                        AbstractC11122c abstractC11122c = (AbstractC11122c) obj2;
                        if (it.hasNext()) {
                            abstractC21790t = (AbstractC21790t) it.next();
                            abstractC21790tM12188h = abstractC11122c.m12188h();
                        } else if (AbstractC11122c.f33524E) {
                            int i13 = C21792v.f69140y0;
                            navOptions.f69032d = AbstractC8640h.m9308g(abstractC11122c.m12190j()).f69135r0;
                            navOptions.f69033e = true;
                        }
                    } while (!AbstractC16544l.m18089b(abstractC21790t, abstractC21790tM12188h != null ? abstractC21790tM12188h.f69131Z : null));
                }
                break;
            case 4:
                AbstractC16544l.m18094g((C13430u) obj, "$this$action");
                AbstractC22120R0.m22362i((C13421l) obj2, C22206x0.f70395a, ((C22107K0) obj3).f69887m);
                break;
            default:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                ((C22107K0) obj3).f69878d.f20894b.mo10188b(new String[]{"image/*", "application/pdf"});
                action.f42521b = C22150e0.m22383i((C22150e0) ((AbstractC22180o0) obj2), true, null, 223);
                break;
        }
        return c17296c;
    }
}
