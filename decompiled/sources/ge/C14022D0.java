package ge;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8640h;
import p594Y9.AbstractC9698A4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17786u;
import p911o0.InterfaceC17740U;
import p990rg.C18982i;
import p990rg.C18983j;
import p990rg.EnumC18976c;

/* JADX INFO: renamed from: ge.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14022D0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44107Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18983j f44108Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f44109o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14022D0(C18983j c18983j, InterfaceC1436k interfaceC1436k, int i10) {
        super(3);
        this.f44107Y = i10;
        this.f44108Z = c18983j;
        this.f44109o0 = interfaceC1436k;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206  */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        long jM15626d;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1436k interfaceC1436k = this.f44109o0;
        C18983j c18983j = this.f44108Z;
        int i11 = 19;
        int i12 = 2;
        switch (this.f44107Y) {
            case 0:
                InterfaceC17740U FlowRow = (InterfaceC17740U) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(FlowRow, "$this$FlowRow");
                int i13 = 16;
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    for (Map.Entry entry : c18983j.f60550b.entrySet()) {
                        String str = (String) entry.getKey();
                        C18982i c18982i = (C18982i) AbstractC17680n.m19343S((List) entry.getValue());
                        c6021p.m6524S(733910378);
                        if (c18982i != null) {
                            EnumC18976c enumC18976c = c18982i.f60546e;
                            AbstractC16544l.m18094g(enumC18976c, "<this>");
                            switch (AbstractC14024E0.f44111a[enumC18976c.ordinal()]) {
                                case 1:
                                    i10 = R.drawable.brain;
                                    break;
                                case 2:
                                case 3:
                                    i10 = R.drawable.lightbulb_glow;
                                    break;
                                case 4:
                                    i10 = R.drawable.marker_code;
                                    break;
                                case 5:
                                    i10 = R.drawable.bar_chart;
                                    break;
                                case 6:
                                    i10 = R.drawable.eye;
                                    break;
                                case 7:
                                    i10 = R.drawable.graduation_cap;
                                    break;
                                case 8:
                                    i10 = R.drawable.newspaper;
                                    break;
                                case 9:
                                    i10 = R.drawable.stuff;
                                    break;
                                case 10:
                                    i10 = R.drawable.pasted_text;
                                    break;
                                case 11:
                                    i10 = R.drawable.calculator;
                                    break;
                                case 12:
                                    i10 = R.drawable.rainy_cloud;
                                    break;
                                case 13:
                                    i10 = R.drawable.airplane;
                                    break;
                                case 14:
                                    i10 = R.drawable.medal;
                                    break;
                                case 15:
                                case 16:
                                    i10 = R.drawable.search;
                                    break;
                                case 17:
                                    i10 = R.drawable.shop;
                                    break;
                                case 18:
                                    i10 = R.drawable.writing_2;
                                    break;
                                case 19:
                                    i10 = R.drawable.image_gen;
                                    break;
                                case 20:
                                    i10 = R.drawable.file_document;
                                    break;
                                case 21:
                                    i10 = R.drawable.map_pin;
                                    break;
                                default:
                                    throw new C0644w();
                            }
                            int iOrdinal = enumC18976c.ordinal();
                            if (iOrdinal == 0) {
                                jM15626d = AbstractC14334L.m15626d(4285297151L);
                            } else if (iOrdinal == i12) {
                                jM15626d = AbstractC14334L.m15626d(4281708103L);
                            } else if (iOrdinal == 8) {
                                jM15626d = AbstractC14334L.m15626d(4285976811L);
                            } else if (iOrdinal == i11) {
                                jM15626d = AbstractC14334L.m15626d(4293559364L);
                            } else if (iOrdinal == 4) {
                                jM15626d = AbstractC14334L.m15626d(4293286338L);
                            } else if (iOrdinal == 5) {
                                jM15626d = AbstractC14334L.m15626d(4293051713L);
                            } else if (iOrdinal == i13) {
                                jM15626d = AbstractC14334L.m15626d(4291529680L);
                            } else if (iOrdinal != 17) {
                                switch (iOrdinal) {
                                    case 12:
                                        jM15626d = AbstractC14334L.m15626d(4291529680L);
                                        break;
                                    case 13:
                                        jM15626d = AbstractC14334L.m15626d(4285976811L);
                                        break;
                                    case 14:
                                        jM15626d = AbstractC14334L.m15626d(4293051713L);
                                        break;
                                    default:
                                        jM15626d = AbstractC14334L.m15626d(4285976811L);
                                        break;
                                }
                            } else {
                                jM15626d = AbstractC14334L.m15626d(4285297151L);
                            }
                            long j10 = jM15626d;
                            c6021p.m6524S(1412891101);
                            boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6542f(c18982i);
                            Object objM6514H = c6021p.m6514H();
                            if (zM6542f || objM6514H == C6013l.f19514a) {
                                objM6514H = new C14020C0(interfaceC1436k, c18982i, 0);
                                c6021p.m6537c0(objM6514H);
                            }
                            c6021p.m6553p(false);
                            AbstractC8640h.m9303b((InterfaceC1426a) objM6514H, str, null, Integer.valueOf(i10), new C14365u(j10), c6021p, 0, 4);
                        }
                        c6021p.m6553p(false);
                        c6021p = c6021p;
                        i11 = 19;
                        i12 = 2;
                        i13 = 16;
                    }
                }
                return c17296c;
            default:
                C17786u BoxWithConstraints = (C17786u) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(BoxWithConstraints) ? 4 : 2;
                }
                if ((19 & iIntValue2) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    float fM19514a = BoxWithConstraints.m19514a() - AbstractC7313q.f23205j;
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM9122c = AbstractC8479G.m9122c(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC8479G.m9124e(c6021p2));
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23200e), C10444b.f30943v0, c6021p2, 0);
                    int i14 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM9122c);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p2, i14, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23198c));
                    c6021p2.m6524S(1375409627);
                    Iterator it = c18983j.f60549a.iterator();
                    while (it.hasNext()) {
                        AbstractC9698A4.m10290a((C18982i) it.next(), interfaceC1436k, AbstractC10844c.m11257q(c10456n, 0.0f, fM19514a, 1), c6021p2, 0);
                    }
                    c6021p2.m6553p(false);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23198c));
                    c6021p2.m6553p(true);
                }
                return c17296c;
        }
    }
}
