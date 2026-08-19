package p124Ei;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.foundation.selection.AbstractC10852c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import bf.InterfaceC11374b0;
import com.openai.chatgpt.R;
import com.openai.feature.subscriptions.SubscriptionsViewModel;
import ge.C14107v0;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0122V;
import p003A1.AbstractC0168G;
import p003A1.C0155B1;
import p003A1.C0286s;
import p017Af.C0459F;
import p021Aj.C0537v;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1000s0.C19408d;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21965U0;
import p1155zi.C22011h0;
import p1155zi.EnumC21895B;
import p1155zi.EnumC22080y1;
import p148Fi.AbstractC2792U0;
import p156G1.C2960g;
import p225Im.AbstractC3751J;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3995V2;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p269Kh.C4688o;
import p291Lf.AbstractC5018o;
import p291Lf.C5019p;
import p294Li.AbstractC5094p;
import p324Mn.C5521B;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p365Oi.C6256d;
import p437Rn.C6959q;
import p478Tc.AbstractC7313q;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7373x;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8126k4;
import p594Y9.AbstractC9806T;
import p594Y9.AbstractC9839Y2;
import p624Zg.AbstractC10381m0;
import p624Zg.AbstractC10391w;
import p624Zg.C10337G;
import p624Zg.C10379l0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p706df.C13087g;
import p706df.C13104x;
import p736f0.C13489g;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p810ig.AbstractC14993l;
import p872lg.C16946f;
import p882m1.AbstractC17140a;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p926of.C18174k;

/* JADX INFO: renamed from: Ei.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C2456I extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7633Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7634Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7635o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7636p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7637q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2456I(int i10, Object obj, Object obj2, Object obj3, List list) {
        super(4);
        this.f7633Y = i10;
        this.f7636p0 = list;
        this.f7634Z = obj;
        this.f7637q0 = obj2;
        this.f7635o0 = obj3;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue;
        C10456n c10456n = C10456n.f30959Y;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        Object obj5 = this.f7635o0;
        Object obj6 = this.f7637q0;
        Object obj7 = this.f7634Z;
        Object obj8 = this.f7636p0;
        switch (this.f7633Y) {
            case 0:
                C10845a c10845a = (C10845a) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C6021p c6021p = (C6021p) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                int i10 = (iIntValue3 & 6) == 0 ? iIntValue3 | (c6021p.m6542f(c10845a) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i10 |= c6021p.m6538d(iIntValue2) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC7343b0 abstractC7343b0 = (AbstractC7343b0) ((List) obj8).get(iIntValue2);
                    c6021p.m6524S(766485448);
                    boolean z6 = abstractC7343b0 instanceof C7373x;
                    C10449g c10449g = C10444b.f30947z0;
                    ArrayList arrayList = (ArrayList) obj6;
                    String str = ((C2532n1) obj7).f7894a;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj5;
                    if (z6) {
                        c6021p.m6524S(766497568);
                        C18174k c18174k = new C18174k(str, null, ((C7373x) abstractC7343b0).f23373c);
                        c6021p.m6524S(-2053478747);
                        boolean zM6545h = c6021p.m6545h(arrayList) | c6021p.m6545h(abstractC7343b0) | c6021p.m6542f(interfaceC1436k);
                        Object objM6514H = c6021p.m6514H();
                        if (zM6545h || objM6514H == c5975s) {
                            objM6514H = new C0155B1(arrayList, interfaceC1436k, (C7373x) abstractC7343b0, 10);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        AbstractC5018o.m5646a(c18174k, (InterfaceC1426a) objM6514H, AbstractC10844c.m11260t(AbstractC10842a.m11237o(AbstractC10844c.f32512c, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23198c, 7), c10449g, 2), null, 0.0f, null, null, c6021p, 0, 120);
                        c6021p.m6553p(false);
                    } else if (abstractC7343b0 instanceof C7315A) {
                        c6021p.m6524S(767685147);
                        List list = ((C7315A) abstractC7343b0).f23212c;
                        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new C18174k(str, null, (C21965U0) it.next()));
                        }
                        C5019p c5019p = new C5019p(arrayList2);
                        c6021p.m6524S(-2053434292);
                        boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(arrayList);
                        Object objM6514H2 = c6021p.m6514H();
                        if (zM6542f || objM6514H2 == c5975s) {
                            objM6514H2 = new C0122V(interfaceC1436k, 24, arrayList);
                            c6021p.m6537c0(objM6514H2);
                        }
                        c6021p.m6553p(false);
                        AbstractC5018o.m5649d(c5019p, (InterfaceC1436k) objM6514H2, AbstractC10844c.m11260t(AbstractC10844c.m11244d(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), 1.0f), c10449g, 2), c6021p, 0, 0);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(768945049);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(false);
                }
                break;
            case 1:
                C13489g AnimatedContent = (C13489g) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6021p c6021p2 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                if (zBooleanValue) {
                    boolean zM3710a = AbstractC2792U0.m3710a(((C2532n1) obj7).f7895b);
                    c6021p2.m6524S(787520846);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj5;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H3 == c5975s) {
                        objM6514H3 = new C0537v(4, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    AbstractC5094p.m5660b((C6256d) obj8, zM3710a, (C19408d) obj6, (InterfaceC1436k) objM6514H3, null, null, c6021p2, 8, 48);
                }
                break;
            case 2:
                C13489g AnimatedContent2 = (C13489g) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                C6021p c6021p3 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent2, "$this$AnimatedContent");
                if (zBooleanValue2) {
                    AbstractC2511g1.m3598j((C2532n1) obj7, (InterfaceC1436k) obj5, (InterfaceC1426a) obj8, (InterfaceC1426a) obj6, null, c6021p3, 0);
                }
                break;
            case 3:
                C13489g AnimatedContent3 = (C13489g) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                C6021p c6021p4 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent3, "$this$AnimatedContent");
                InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC8071d5.m8483b((InterfaceC10459q) obj8, 0.5f), AbstractC7313q.f23199d, 0.0f, 2);
                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) obj5;
                if (!zBooleanValue3) {
                    c6021p4.m6524S(-1263259484);
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.settings_slider, c6021p4, 0);
                    c6021p4.m6524S(-40740709);
                    EnumC21895B enumC21895B = (EnumC21895B) obj6;
                    boolean zM6542f3 = c6021p4.m6542f(enumC21895B) | c6021p4.m6542f(interfaceC1436k3);
                    Object objM6514H4 = c6021p4.m6514H();
                    if (zM6542f3 || objM6514H4 == c5975s) {
                        objM6514H4 = new C0286s(enumC21895B, 23, interfaceC1436k3);
                        c6021p4.m6537c0(objM6514H4);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H4;
                    c6021p4.m6553p(false);
                    c6021p4.m6524S(-40743492);
                    boolean zM6542f4 = c6021p4.m6542f(interfaceC1436k3);
                    Object objM6514H5 = c6021p4.m6514H();
                    if (zM6542f4 || objM6514H5 == c5975s) {
                        objM6514H5 = new C0459F(12, interfaceC1436k3);
                        c6021p4.m6537c0(objM6514H5);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10833a.m11211f(interfaceC10459qM11235m, interfaceC1426a, (InterfaceC1426a) objM6514H5), 0L, c6021p4, 48, 8);
                    c6021p4.m6553p(false);
                } else {
                    c6021p4.m6524S(-1263646054);
                    AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.snowflake, c6021p4, 0);
                    c6021p4.m6524S(-40757035);
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj7;
                    boolean zM6545h2 = c6021p4.m6545h(interfaceC20904w) | c6021p4.m6542f(interfaceC1436k3);
                    Object objM6514H6 = c6021p4.m6514H();
                    if (zM6545h2 || objM6514H6 == c5975s) {
                        objM6514H6 = new C2493a1(interfaceC20904w, interfaceC1436k3, 0);
                        c6021p4.m6537c0(objM6514H6);
                    }
                    c6021p4.m6553p(false);
                    AbstractC9806T.m10431a(abstractC17140aM8631b2, null, AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H6, 7), c6021p4, 48);
                    c6021p4.m6553p(false);
                }
                break;
            case 4:
                C10845a c10845a2 = (C10845a) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C6021p c6021p5 = (C6021p) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                int i11 = (iIntValue5 & 6) == 0 ? iIntValue5 | (c6021p5.m6542f(c10845a2) ? 4 : 2) : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i11 |= c6021p5.m6538d(iIntValue4) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    C10337G c10337g = (C10337G) ((List) obj8).get(iIntValue4);
                    c6021p5.m6524S(2110633109);
                    C10379l0 c10379l0 = (C10379l0) ((AbstractC10381m0) obj7);
                    String strM10894a = AbstractC10391w.m10894a((Context) c6021p5.m6548k(AndroidCompositionLocals_androidKt.f32825b), c10337g, c10379l0.f30753b);
                    String str2 = c10337g.f30669a;
                    String str3 = c10379l0.f30754c;
                    boolean zEquals = str3 == null ? false : str3.equals(str2);
                    Integer num = c10379l0.f30755d;
                    if (zEquals && num != null) {
                        iIntValue = num.intValue();
                    } else if (c10379l0.f30753b && c10337g.f30670b) {
                        iIntValue = R.string.subscriptions_free_trial_subscribe_cta;
                    } else {
                        iIntValue = c10379l0.f30756e == EnumC22080y1.f69796q0 ? R.string.subscriptions_subscribe_get_pro_cta : R.string.subscriptions_subscribe_cta;
                    }
                    int i12 = iIntValue;
                    boolean z10 = (str3 == null ? false : str3.equals(str2)) && num != null;
                    boolean z11 = !(str3 == null ? false : str3.equals(str2));
                    c6021p5.m6524S(-901731913);
                    SubscriptionsViewModel subscriptionsViewModel = (SubscriptionsViewModel) obj6;
                    AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) obj5;
                    boolean zM6542f5 = c6021p5.m6542f(subscriptionsViewModel) | c6021p5.m6545h(abstractActivityC17375g) | c6021p5.m6542f(c10337g);
                    Object objM6514H7 = c6021p5.m6514H();
                    if (zM6542f5 || objM6514H7 == c5975s) {
                        objM6514H7 = new C6959q(subscriptionsViewModel, abstractActivityC17375g, c10337g, 8);
                        c6021p5.m6537c0(objM6514H7);
                    }
                    c6021p5.m6553p(false);
                    AbstractC3751J.m4439d(strM10894a, i12, (InterfaceC1426a) objM6514H7, z11, z10, null, c6021p5, 0);
                    c6021p5.m6553p(false);
                }
                break;
            case 5:
                C10845a c10845a3 = (C10845a) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C6021p c6021p6 = (C6021p) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                int i13 = (iIntValue7 & 6) == 0 ? iIntValue7 | (c6021p6.m6542f(c10845a3) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i13 |= c6021p6.m6538d(iIntValue6) ? 32 : 16;
                }
                if ((i13 & 147) == 146 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    C13087g c13087g = (C13087g) ((List) obj8).get(iIntValue6);
                    c6021p6.m6524S(-1885448954);
                    C13104x c13104x = (C13104x) obj7;
                    AbstractC8047a5.m8430c(c13087g, c13104x.f41618f.contains(new C22011h0(c13087g.f41579a)), c13104x.f41619g, (InterfaceC1436k) obj5, (InterfaceC1436k) ((InterfaceC3759g) obj6), c6021p6, 0);
                    c6021p6.m6553p(false);
                }
                break;
            case 6:
                C10845a c10845a4 = (C10845a) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                C6021p c6021p7 = (C6021p) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i14 = (iIntValue9 & 6) == 0 ? iIntValue9 | (c6021p7.m6542f(c10845a4) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i14 |= c6021p7.m6538d(iIntValue8) ? 32 : 16;
                }
                if ((i14 & 147) == 146 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) ((List) obj8).get(iIntValue8);
                    c6021p7.m6524S(724902823);
                    c6021p7.m6524S(-2054822022);
                    InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj7;
                    boolean zM6542f6 = c6021p7.m6542f(interfaceC3759g);
                    Object objM6514H8 = c6021p7.m6514H();
                    if (zM6542f6 || objM6514H8 == c5975s) {
                        objM6514H8 = new C14107v0(interfaceC3759g, 1);
                        c6021p7.m6537c0(objM6514H8);
                    }
                    c6021p7.m6553p(false);
                    AbstractC9839Y2.m10485b(interfaceC11374b0, (InterfaceC1436k) objM6514H8, null, false, false, true, (C5521B) obj6, (C5521B) obj5, null, c6021p7, 196608, 284);
                    c6021p7.m6553p(false);
                }
                break;
            case 7:
                C10845a c10845a5 = (C10845a) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                C6021p c6021p8 = (C6021p) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                int i15 = (iIntValue11 & 6) == 0 ? iIntValue11 | (c6021p8.m6542f(c10845a5) ? 4 : 2) : iIntValue11;
                if ((iIntValue11 & 48) == 0) {
                    i15 |= c6021p8.m6538d(iIntValue10) ? 32 : 16;
                }
                if ((i15 & 147) == 146 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    C16946f c16946f = (C16946f) ((ArrayList) obj6).get(iIntValue10);
                    c6021p8.m6524S(-2010562629);
                    boolean zM18089b = AbstractC16544l.m18089b(c16946f, (C16946f) obj8);
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p8.m6524S(-1034680249);
                    long j10 = zM18089b ? ((C3949M0) c6021p8.m6548k(AbstractC3959O0.f12302a)).f12236r : C14365u.f45060j;
                    c6021p8.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM11244d, j10, AbstractC14334L.f44973a);
                    c6021p8.m6524S(-1034671401);
                    InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) obj5;
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj7;
                    boolean zM6542f7 = c6021p8.m6542f(interfaceC1436k4) | c6021p8.m6545h(c16946f) | c6021p8.m6542f(interfaceC1426a2);
                    Object objM6514H9 = c6021p8.m6514H();
                    if (zM6542f7 || objM6514H9 == c5975s) {
                        objM6514H9 = new C6959q(interfaceC1436k4, c16946f, interfaceC1426a2, 28);
                        c6021p8.m6537c0(objM6514H9);
                    }
                    c6021p8.m6553p(false);
                    AbstractC14993l.m16131b(c16946f, AbstractC10852c.m11273b(interfaceC10459qM11207b, zM18089b, null, (InterfaceC1426a) objM6514H9, 6), c6021p8, 0);
                    c6021p8.m6553p(false);
                }
                break;
            default:
                C10845a c10845a6 = (C10845a) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                C6021p c6021p9 = (C6021p) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                int i16 = (iIntValue13 & 6) == 0 ? iIntValue13 | (c6021p9.m6542f(c10845a6) ? 4 : 2) : iIntValue13;
                if ((iIntValue13 & 48) == 0) {
                    i16 |= c6021p9.m6538d(iIntValue12) ? 32 : 16;
                }
                if ((i16 & 147) == 146 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    C4688o c4688o = (C4688o) ((List) obj8).get(iIntValue12);
                    c6021p9.m6524S(-1203766898);
                    C4688o c4688o2 = (C4688o) obj7;
                    boolean zM18089b2 = AbstractC16544l.m18089b(c4688o.f15253b, c4688o2 != null ? c4688o2.f15253b : null);
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C2960g c2960g = new C2960g(3);
                    c6021p9.m6524S(-731558764);
                    InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj6;
                    InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) obj5;
                    boolean zM6542f8 = c6021p9.m6542f(interfaceC1426a3) | c6021p9.m6542f(interfaceC1436k5) | c6021p9.m6542f(c4688o);
                    Object objM6514H10 = c6021p9.m6514H();
                    if (zM6542f8 || objM6514H10 == c5975s) {
                        objM6514H10 = new C15272c(interfaceC1426a3, interfaceC1436k5, c4688o, 15);
                        c6021p9.m6537c0(objM6514H10);
                    }
                    c6021p9.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10852c.m11273b(interfaceC10459qM11244d2, zM18089b2, c2960g, (InterfaceC1426a) objM6514H10, 2), 0.0f, AbstractC7313q.f23199d, 1);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23201f), C10444b.f30944w0, c6021p9, 48);
                    int i17 = c6021p9.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p9.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p9, interfaceC10459qM11235m2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p9.m6528W();
                    if (c6021p9.f19563O) {
                        c6021p9.m6549l(c21696i);
                    } else {
                        c6021p9.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p9, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p9, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p9.f19563O || !AbstractC16544l.m18089b(c6021p9.m6514H(), Integer.valueOf(i17))) {
                        AbstractC0168G.m537z(i17, c6021p9, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p9, interfaceC10459qM10923d);
                    AbstractC3995V2.m4711a(zM18089b2, null, false, null, null, c6021p9, 48, 60);
                    AbstractC4124r4.m4768b(c4688o.f15253b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p9, 0, 0, 131070);
                    c6021p9.m6553p(true);
                    c6021p9.m6553p(false);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456I(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        super(4);
        this.f7633Y = 2;
        this.f7634Z = c2532n1;
        this.f7635o0 = interfaceC1436k;
        this.f7636p0 = interfaceC1426a;
        this.f7637q0 = interfaceC1426a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456I(C2532n1 c2532n1, C6256d c6256d, C19408d c19408d, InterfaceC1436k interfaceC1436k) {
        super(4);
        this.f7633Y = 1;
        this.f7634Z = c2532n1;
        this.f7636p0 = c6256d;
        this.f7637q0 = c19408d;
        this.f7635o0 = interfaceC1436k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2456I(Object obj, Object obj2, InterfaceC1436k interfaceC1436k, Object obj3, int i10) {
        super(4);
        this.f7633Y = i10;
        this.f7636p0 = obj;
        this.f7634Z = obj2;
        this.f7635o0 = interfaceC1436k;
        this.f7637q0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456I(ArrayList arrayList, C16946f c16946f, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a) {
        super(4);
        this.f7633Y = 7;
        this.f7637q0 = arrayList;
        this.f7636p0 = c16946f;
        this.f7635o0 = interfaceC1436k;
        this.f7634Z = interfaceC1426a;
    }
}
