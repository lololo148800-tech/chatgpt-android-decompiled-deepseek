package p622Ze;

import androidx.compose.foundation.layout.AbstractC10842a;
import bf.C11349D;
import bf.C11390r;
import bf.C11391s;
import bf.C11398z;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC4124r4;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p550We.C8826g;
import p550We.C8829j;
import p552Wg.C8847i;
import p594Y9.AbstractC9745I3;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17763i0;
import p978r1.AbstractC18857c;

/* JADX INFO: renamed from: Ze.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10290h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30564Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10298p f30565Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f30566o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10290h(C10298p c10298p, InterfaceC3759g interfaceC3759g, int i10) {
        super(3);
        this.f30564Y = i10;
        this.f30565Z = c10298p;
        this.f30566o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C11391s c11391s;
        List list;
        Object next;
        C11398z c11398z;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC3759g interfaceC3759g = this.f30566o0;
        C10298p c10298p = this.f30565Z;
        C10456n c10456n = C10456n.f30959Y;
        int i10 = 6;
        switch (this.f30564Y) {
            case 0:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    C11349D c11349d = c10298p.f30584c;
                    String str = c11349d != null ? c11349d.f34319b : null;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.gizmos_accounts_description, new Object[]{str}, c6021p), AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131068);
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.gizmos_accounts_section_header, c6021p), null, 0L, c6021p, 0, 6);
                    if (c10298p.f30582a) {
                        c6021p.m6524S(-1523411186);
                        AbstractC18857c.m20156c(null, c6021p, 0);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1523338894);
                        C8826g c8826g = c10298p.f30585d;
                        List<C8829j> list2 = c8826g != null ? c8826g.f27012a : null;
                        if (list2 != null) {
                            for (C8829j c8829j : list2) {
                                C11349D c11349d2 = c10298p.f30584c;
                                if (c11349d2 == null || (list = c11349d2.f34340w) == null) {
                                    c11391s = null;
                                } else {
                                    Iterator it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            c11398z = ((C11391s) next).f34417c;
                                        } else {
                                            next = null;
                                        }
                                        c11391s = (C11391s) next;
                                    } while (!AbstractC16544l.m18089b(c11398z != null ? c11398z.f34425a : null, c8829j.f27015a));
                                    c11391s = (C11391s) next;
                                }
                                String str2 = c8829j.f27015a;
                                C11390r c11390r = C11391s.Companion;
                                AbstractC18857c.m20155b(c10298p.f30583b.contains(str2), c8829j, c11391s, (InterfaceC1436k) interfaceC3759g, null, c6021p, 0);
                            }
                        }
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(true);
                }
                break;
            default:
                InterfaceC17763i0 paddings2 = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings2, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j2 = AbstractC10842a.m11232j(c10456n, paddings2);
                    c6021p2.m6524S(-1931108586);
                    boolean zM6542f = c6021p2.m6542f(c10298p) | c6021p2.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p2.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C8847i(c10298p, i10, interfaceC3759g);
                        c6021p2.m6537c0(objM6514H);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qM11232j2, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p2, 0, 254);
                }
                break;
        }
        return c17296c;
    }
}
