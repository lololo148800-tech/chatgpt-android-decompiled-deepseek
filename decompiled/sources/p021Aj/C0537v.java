package p021Aj;

import android.view.MotionEvent;
import ge.C14039M;
import ge.C14041N;
import ge.EnumC14097q0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p1149zc.C21837F;
import p1155zi.C21936L0;
import p1155zi.C22057s2;
import p124Ei.C2460K;
import p124Ei.C2479U;
import p124Ei.C2495b0;
import p124Ei.C2504e0;
import p124Ei.C2525l0;
import p124Ei.C2542s0;
import p172Gi.C3077j;
import p269Kh.C4688o;
import p292Lg.C5043o;
import p292Lg.C5044p;
import p292Lg.C5045q;
import p360Od.C6172d;
import p492U1.C7543h;
import p492U1.C7545j;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p575Xd.InterfaceC9461t;
import p586Y0.AbstractC9562n;
import p586Y0.C9554f;
import p586Y0.C9560l;
import p623Zf.C10317m;
import p759g1.C13800b;
import p909nm.AbstractC17680n;
import p926of.C18148K;
import p926of.C18186w;
import p994rk.C19067A1;

/* JADX INFO: renamed from: Aj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C0537v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1711Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f1712Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0537v(int i10, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f1711Y = i10;
        this.f1712Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f1711Y) {
            case 0:
                List selectedItems = (List) obj;
                AbstractC16544l.m18094g(selectedItems, "selectedItems");
                C19067A1 c19067a1 = (C19067A1) AbstractC17680n.m19343S(selectedItems);
                if (c19067a1 != null) {
                    this.f1712Z.invoke(c19067a1);
                }
                return C17296C.f55119a;
            case 1:
                long j10 = ((C7543h) obj).f23897a;
                this.f1712Z.invoke(C2479U.f7725a);
                return C17296C.f55119a;
            case 2:
                C2460K effect = (C2460K) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect instanceof C2460K) {
                    this.f1712Z.invoke(effect.f7650a);
                }
                return C17296C.f55119a;
            case 3:
                long j11 = ((C13800b) obj).f43584a;
                this.f1712Z.invoke(C2542s0.f7934a);
                return C17296C.f55119a;
            case 4:
                C3077j it = (C3077j) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f1712Z.invoke(new C2495b0(it));
                return C17296C.f55119a;
            case 5:
                this.f1712Z.invoke(new C2504e0(((Boolean) obj).booleanValue()));
                return C17296C.f55119a;
            case 6:
                C22057s2 it2 = (C22057s2) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f1712Z.invoke(new C2525l0(it2));
                return C17296C.f55119a;
            case 7:
                C17309l it3 = (C17309l) obj;
                AbstractC16544l.m18094g(it3, "it");
                this.f1712Z.invoke(new C18186w((C6172d) it3.f55136Y, (InterfaceC9461t) it3.f55137Z));
                return C17296C.f55119a;
            case 8:
                this.f1712Z.invoke(new C5045q(((Boolean) obj).booleanValue()));
                return C17296C.f55119a;
            case 9:
                this.f1712Z.invoke(new C5044p(((Boolean) obj).booleanValue()));
                return C17296C.f55119a;
            case 10:
                this.f1712Z.invoke(new C5043o(((Boolean) obj).booleanValue()));
                return C17296C.f55119a;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f1712Z.invoke(bool);
                return C17296C.f55119a;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f1712Z.invoke(bool2);
                return C17296C.f55119a;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f1712Z.invoke(bool3);
                return C17296C.f55119a;
            case 14:
                C9560l c9560l = (C9560l) obj;
                synchronized (AbstractC9562n.f28759b) {
                    i10 = AbstractC9562n.f28761d;
                    AbstractC9562n.f28761d = i10 + 1;
                }
                return new C9554f(i10, c9560l, this.f1712Z);
            case 15:
                String it4 = (String) obj;
                AbstractC16544l.m18094g(it4, "it");
                this.f1712Z.invoke(it4);
                return C17296C.f55119a;
            case 16:
                C21837F it5 = (C21837F) obj;
                AbstractC16544l.m18094g(it5, "it");
                this.f1712Z.invoke(new C10317m(it5));
                return C17296C.f55119a;
            case 17:
                long j12 = ((C7545j) obj).f23903a;
                return new C7545j(AbstractC9113C4.m9643a(((Number) this.f1712Z.invoke(Integer.valueOf((int) (j12 >> 32)))).intValue(), (int) (j12 & 4294967295L)));
            case 18:
                long j13 = ((C7545j) obj).f23903a;
                return new C7545j(AbstractC9113C4.m9643a((int) (j13 >> 32), ((Number) this.f1712Z.invoke(Integer.valueOf((int) (j13 & 4294967295L)))).intValue()));
            case 19:
                long j14 = ((C7545j) obj).f23903a;
                return new C7545j(AbstractC9113C4.m9643a(((Number) this.f1712Z.invoke(Integer.valueOf((int) (j14 >> 32)))).intValue(), (int) (j14 & 4294967295L)));
            case 20:
                long j15 = ((C7545j) obj).f23903a;
                return new C7545j(AbstractC9113C4.m9643a((int) (j15 >> 32), ((Number) this.f1712Z.invoke(Integer.valueOf((int) (j15 & 4294967295L)))).intValue()));
            case 21:
                return new C7543h(AbstractC9101A4.m9631a(((Number) this.f1712Z.invoke(Integer.valueOf((int) (((C7545j) obj).f23903a >> 32)))).intValue(), 0));
            case 22:
                return new C7543h(AbstractC9101A4.m9631a(0, ((Number) this.f1712Z.invoke(Integer.valueOf((int) (((C7545j) obj).f23903a & 4294967295L)))).intValue()));
            case 23:
                return new C7543h(AbstractC9101A4.m9631a(((Number) this.f1712Z.invoke(Integer.valueOf((int) (((C7545j) obj).f23903a >> 32)))).intValue(), 0));
            case 24:
                return new C7543h(AbstractC9101A4.m9631a(0, ((Number) this.f1712Z.invoke(Integer.valueOf((int) (((C7545j) obj).f23903a & 4294967295L)))).intValue()));
            case 25:
                String gizmoId = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(gizmoId, "gizmoId");
                this.f1712Z.invoke(new C18148K(gizmoId));
                return C17296C.f55119a;
            case 26:
                MotionEvent it6 = (MotionEvent) obj;
                AbstractC16544l.m18094g(it6, "it");
                if (it6.getAction() == 0) {
                    this.f1712Z.invoke(new C14041N(EnumC14097q0.f44337o0));
                }
                return Boolean.FALSE;
            case 27:
                InterfaceC21098s it7 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it7, "it");
                this.f1712Z.invoke(Integer.valueOf((int) (it7.mo21524k() & 4294967295L)));
                return C17296C.f55119a;
            case 28:
                InterfaceC21098s it8 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it8, "it");
                this.f1712Z.invoke(Integer.valueOf((int) (it8.mo21524k() & 4294967295L)));
                return C17296C.f55119a;
            default:
                C4688o it9 = (C4688o) obj;
                AbstractC16544l.m18094g(it9, "it");
                this.f1712Z.invoke(new C14039M(it9));
                return C17296C.f55119a;
        }
    }
}
