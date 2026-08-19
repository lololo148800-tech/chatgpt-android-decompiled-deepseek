package p124Ei;

import af.C10567X;
import af.C10571a0;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import bf.C11349D;
import bf.C11363S;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0286s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p1000s0.C19430z;
import p1081wc.InterfaceC20904w;
import p1155zi.C21907E;
import p148Fi.AbstractC2792U0;
import p172Gi.C3077j;
import p294Li.AbstractC5088j;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8090g0;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.C13489g;
import p749fd.AbstractC13620e;
import p749fd.C13625j;
import p911o0.AbstractC17792x;
import p926of.C18173j;
import tf.C19899D;
import tf.C19906K;

/* JADX INFO: renamed from: Ei.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2451F0 extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7611Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7612o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7613p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7614q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f7615r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2451F0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(4);
        this.f7610Y = i10;
        this.f7612o0 = obj;
        this.f7611Z = obj2;
        this.f7613p0 = obj3;
        this.f7614q0 = obj4;
        this.f7615r0 = obj5;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        switch (this.f7610Y) {
            case 0:
                C13489g AnimatedContent = (C13489g) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6021p c6021p = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                C2532n1 c2532n1 = (C2532n1) this.f7612o0;
                if (zBooleanValue) {
                    c6021p.m6524S(-824925552);
                    InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC2511g1.f7807b, AbstractC2511g1.f7806a);
                    C3077j c3077j = c2532n1.f7875G;
                    boolean z6 = c3077j != null;
                    String strM19533p = (!AbstractC2792U0.m3710a(c2532n1.f7895b) || AbstractC16544l.m18089b(c2532n1.f7875G, c2532n1.f7877I)) ? AbstractC17792x.m19533p(c6021p, -824129782, R.string.voice_picker_action_button_done, c6021p, false) : AbstractC17792x.m19533p(c6021p, -824020352, R.string.voice_picker_action_button_start_new_chat, c6021p, false);
                    c6021p.m6524S(-303690063);
                    boolean zM6542f = c6021p.m6542f(c2532n1);
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f7611Z;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f2 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0286s(c2532n1, 20, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC5088j.m5658a(c3077j, interfaceC10459qM11234l, c2532n1.f7878J, strM19533p, z6, (InterfaceC1426a) objM6514H, c6021p, 0, 0);
                    c6021p.m6553p(false);
                } else {
                    if (((EnumC2444C) this.f7613p0) == EnumC2444C.f7593Y) {
                        c6021p.m6524S(-823820216);
                        AbstractC2511g1.m3599k(c2532n1, (InterfaceC1436k) this.f7611Z, (InterfaceC1426a) this.f7614q0, (InterfaceC1426a) this.f7615r0, null, c6021p, 0);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-823564590);
                        c6021p.m6553p(false);
                    }
                }
                return C17296C.f55119a;
            case 1:
                C10845a c10845a = (C10845a) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = (c6021p2.m6542f(c10845a) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= c6021p2.m6538d(iIntValue) ? 32 : 16;
                }
                int i11 = i10 & 147;
                C17296C c17296c = C17296C.f55119a;
                if (i11 == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C11349D c11349d = (C11349D) ((List) this.f7612o0).get(iIntValue);
                    c6021p2.m6524S(1633832881);
                    c6021p2.m6524S(-362937360);
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) this.f7613p0;
                    boolean zM6545h = c6021p2.m6545h(interfaceC20904w) | c6021p2.m6542f(c11349d);
                    C10571a0 c10571a0 = (C10571a0) this.f7614q0;
                    boolean zM6545h2 = zM6545h | c6021p2.m6545h(c10571a0);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6545h2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C10567X(interfaceC20904w, c11349d, c10571a0, null);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, c17296c);
                    AbstractC8090g0.m8546e(((C11363S) this.f7615r0).f34359a, c11349d, (InterfaceC1436k) this.f7611Z, null, AbstractC7312p.f23188e, null, false, false, c6021p2, 12582912, 104);
                    c6021p2.m6553p(false);
                }
                return c17296c;
            default:
                C19430z HorizontalPager = (C19430z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6021p c6021p3 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(HorizontalPager, "$this$HorizontalPager");
                String str = ((C21907E) ((ArrayList) this.f7611Z).get(iIntValue3)).f69451a;
                List list = (List) this.f7613p0;
                String str2 = ((C18173j) list.get(iIntValue3)).f57974g;
                String str3 = ((C18173j) list.get(iIntValue3)).f57975h;
                String str4 = ((C18173j) list.get(iIntValue3)).f57976i;
                C19906K c19906k = (C19906K) this.f7614q0;
                c6021p3.m6524S(-1054338260);
                Object objM6514H3 = c6021p3.m6514H();
                if (objM6514H3 == C6013l.f19514a) {
                    objM6514H3 = new C19899D((InterfaceC5985X) this.f7615r0, 0);
                    c6021p3.m6537c0(objM6514H3);
                }
                c6021p3.m6553p(false);
                AbstractC13620e.m15142b((C13625j) this.f7612o0, str, str2, str3, str4, c19906k.f63082g, (InterfaceC1436k) objM6514H3, AbstractC10844c.f32512c, c6021p3, 14155784);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451F0(List list, InterfaceC20904w interfaceC20904w, C10571a0 c10571a0, C11363S c11363s, InterfaceC1436k interfaceC1436k) {
        super(4);
        this.f7610Y = 1;
        this.f7612o0 = list;
        this.f7613p0 = interfaceC20904w;
        this.f7614q0 = c10571a0;
        this.f7615r0 = c11363s;
        this.f7611Z = interfaceC1436k;
    }
}
