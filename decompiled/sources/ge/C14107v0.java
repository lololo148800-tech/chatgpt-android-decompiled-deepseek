package ge;

import bf.InterfaceC11374b0;
import gf.C14121f;
import gf.C14123h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19854E;
import p1025te.C19857H;
import p1025te.C19859J;
import p1025te.C19860K;
import p1025te.C19889t;
import p1053v3.p1054lN.IGDwkYw;
import p225Im.InterfaceC3759g;
import p269Kh.C4688o;
import p350O1.C6045C;
import ye.EnumC21517f;

/* JADX INFO: renamed from: ge.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14107v0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44362Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f44363Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14107v0(InterfaceC3759g interfaceC3759g, int i10) {
        super(1);
        this.f44362Y = i10;
        this.f44363Z = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44362Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C14017B(it));
                break;
            case 1:
                InterfaceC11374b0 it2 = (InterfaceC11374b0) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C14123h(it2));
                break;
            case 2:
                String it3 = (String) obj;
                AbstractC16544l.m18094g(it3, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C14121f(it3));
                break;
            case 3:
                ((InterfaceC1436k) this.f44363Z).invoke(new C19889t(((Boolean) obj).booleanValue()));
                break;
            case 4:
                C6045C it4 = (C6045C) obj;
                AbstractC16544l.m18094g(it4, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19860K(it4));
                break;
            case 5:
                C6045C it5 = (C6045C) obj;
                AbstractC16544l.m18094g(it5, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19860K(it5));
                break;
            case 6:
                C6045C it6 = (C6045C) obj;
                AbstractC16544l.m18094g(it6, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19860K(it6));
                break;
            case 7:
                EnumC21517f it7 = (EnumC21517f) obj;
                AbstractC16544l.m18094g(it7, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19857H(it7));
                break;
            case 8:
                ((InterfaceC1436k) this.f44363Z).invoke(new C19889t(((Boolean) obj).booleanValue()));
                break;
            case 9:
                C6045C it8 = (C6045C) obj;
                AbstractC16544l.m18094g(it8, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19860K(it8));
                break;
            case 10:
                C6045C it9 = (C6045C) obj;
                AbstractC16544l.m18094g(it9, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19860K(it9));
                break;
            case 11:
                EnumC21517f it10 = (EnumC21517f) obj;
                AbstractC16544l.m18094g(it10, "it");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19857H(it10));
                break;
            case 12:
                String url = (String) obj;
                AbstractC16544l.m18094g(url, "url");
                ((InterfaceC1436k) this.f44363Z).invoke(new C19854E(url));
                break;
            case 13:
                ((InterfaceC1436k) this.f44363Z).invoke(new C19859J(((Boolean) obj).booleanValue()));
                break;
            default:
                C4688o c4688o = (C4688o) obj;
                AbstractC16544l.m18094g(c4688o, IGDwkYw.oJxqTQmpGWDlE);
                ((InterfaceC1436k) this.f44363Z).invoke(new C14039M(c4688o));
                break;
        }
        return C17296C.f55119a;
    }
}
