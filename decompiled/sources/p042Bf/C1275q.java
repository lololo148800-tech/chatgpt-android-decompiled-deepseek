package p042Bf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.anonymous.AnonymousSidebarViewModel;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.conversations.impl.input.AbstractC12341a;
import com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModel;
import com.openai.feature.messages.MessagesViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1832u;
import p1025te.C19866Q;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1152zf.AbstractC21881c;
import p145Ff.EnumC2731i;
import p204I1.C3582M;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p291Lf.AbstractC5018o;
import p291Lf.AbstractC5023t;
import p324Mn.C5521B;
import p324Mn.C5554x;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p362Of.AbstractC6196k;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.C6658t;
import p429Re.C6877k;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8167p5;
import p523V9.AbstractC8206u4;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8626e3;
import p544W9.AbstractC8640h;
import p544W9.AbstractC8652j;
import p547Wc.C8775T;
import p571X9.AbstractC9236X2;
import p575Xd.C9436E;
import p575Xd.InterfaceC9461t;
import p587Y1.AbstractC9582h;
import p587Y1.C9596v;
import p587Y1.InterfaceC9595u;
import p594Y9.AbstractC9751J3;
import p594Y9.AbstractC9757K3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.C14322z0;
import p810ig.AbstractC14982a;
import p817j$.time.Clock;
import p858ko.C16482A;
import p882m1.AbstractC17140a;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17790w;
import p911o0.C17794y;
import p926of.AbstractC18176m;
import p964qe.AbstractC18689b;
import p964qe.C18698k;
import p990rg.C18983j;

/* JADX INFO: renamed from: Bf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1275q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3387Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3388Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f3389o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f3390p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f3391q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f3392r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f3393s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275q(int i10, int i11, InterfaceC10459q interfaceC10459q, String str, String str2, List list) {
        super(2);
        this.f3387Y = 14;
        this.f3391q0 = str;
        this.f3392r0 = str2;
        this.f3393s0 = list;
        this.f3389o0 = i10;
        this.f3388Z = interfaceC10459q;
        this.f3390p0 = i11;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0136  */
    /* JADX WARN: Code duplicated, block: B:26:0x013a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0155  */
    /* JADX WARN: Code duplicated, block: B:35:0x0171  */
    /* JADX WARN: Code duplicated, block: B:37:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0207  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01df A[SYNTHETIC] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int i11;
        Iterator it;
        boolean zHasNext;
        InterfaceC3759g interfaceC3759g;
        int i12;
        boolean zM6542f;
        Object objM6514H;
        AbstractC6601G abstractC6601G;
        MessagesViewModel messagesViewModel;
        boolean zM6545h;
        Object objM6514H2;
        int i13 = this.f3390p0;
        int i14 = this.f3389o0;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f3388Z;
        Object obj4 = this.f3392r0;
        Object obj5 = this.f3391q0;
        Object obj6 = this.f3393s0;
        switch (this.f3387Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC1277s.m1990b((Clock) obj5, (C1166t) obj4, (InterfaceC10459q) obj3, (C3582M) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC8167p5.m8741a((String) obj5, (EnumC2731i) obj4, (InterfaceC1426a) obj6, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC5018o.m5647b((AbstractC18176m) obj5, (InterfaceC1436k) obj4, (InterfaceC10459q) obj3, (AbstractC17140a) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC6196k.m6727d((InterfaceC9461t) obj5, (InterfaceC1436k) obj4, (C6172d) obj6, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC9236X2.m9809b((C6877k) obj5, (InterfaceC1426a) obj4, (InterfaceC1426a) obj3, (C3880A3) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 5:
                ((Number) obj2).intValue();
                AbstractC9757K3.m10358a((InterfaceC1426a) obj5, (InterfaceC10459q) obj3, (String) obj4, (String) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 6:
                ((Number) obj2).intValue();
                InterfaceC9595u interfaceC9595u = (InterfaceC9595u) obj5;
                AbstractC9582h.m10129a(interfaceC9595u, (InterfaceC1426a) obj4, (C9596v) obj3, (C8410b) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 7:
                ((Number) obj2).intValue();
                AbstractC8206u4.m8819a((C8775T) obj5, (InterfaceC10459q) obj3, (AnonymousSidebarViewModel) obj4, (ConversationViewModel) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 8:
                ((Number) obj2).intValue();
                AbstractC8640h.m9302a((InterfaceC1436k) obj5, (C18983j) obj4, (InterfaceC10459q) obj3, this.f3389o0, (C14322z0) obj6, (C6021p) obj, C5997d.m6447d0(i13 | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                AbstractC8652j.m9330c((C5521B) obj5, (C5521B) obj4, (InterfaceC10459q) obj3, (SnorlaxListViewModel) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 10:
                ((Number) obj2).intValue();
                AbstractC14982a.m16128a((InterfaceC10459q) obj3, (C5554x) obj5, (String) obj4, (InterfaceC1436k) obj6, (C6021p) obj, C5997d.m6447d0(1 | i14), this.f3390p0);
                break;
            case 11:
                ((Number) obj2).intValue();
                AbstractC8626e3.m9274c((InterfaceC10459q) obj3, (InterfaceC1436k) obj5, (InterfaceC1426a) obj4, (String) obj6, this.f3389o0, (C6021p) obj, C5997d.m6447d0(1 | i13));
                break;
            case 12:
                ((Number) obj2).intValue();
                AbstractC12341a.m14267d((C19866Q) obj5, this.f3389o0, (InterfaceC1436k) obj4, (InterfaceC1439n) obj6, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(1 | i13));
                break;
            case 13:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    FillElement fillElement = AbstractC10844c.f32512c;
                    float f10 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(fillElement, 0.0f, f10, 1);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
                    C10449g c10449g = C10444b.f30946y0;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, c10449g, c6021p, 0);
                    int i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C21694h c21694h = C21698j.f68873f;
                    C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                    C21694h c21694h2 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (!c6021p.f19563O) {
                        i10 = i13;
                        if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        }
                        C21694h c21694h4 = C21698j.f68871d;
                        C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                        C17794y c17794y = C17794y.f56777a;
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.conversation_variants_header, new Object[]{Integer.valueOf(i14 + 1)}, c6021p), AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 0, 0, 65532);
                        InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(c17794y.m19544b(c10456n, true), AbstractC8479G.m9124e(c6021p), 14);
                        C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p, 0);
                        i11 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
                        C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                            AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                        }
                        C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                        c6021p.m6524S(730826625);
                        it = ((List) obj3).iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            C5975S c5975s = C6013l.f19514a;
                            if (zHasNext) {
                                c6021p.m6553p(false);
                                c6021p.m6553p(true);
                                c6021p.m6524S(-1023589207);
                                interfaceC3759g = (InterfaceC3759g) obj5;
                                i12 = i10;
                                zM6542f = c6021p.m6542f(interfaceC3759g) | c6021p.m6538d(i12);
                                objM6514H = c6021p.m6514H();
                                if (zM6542f || objM6514H == c5975s) {
                                    objM6514H = new C1832u(interfaceC3759g, i12, 3);
                                    c6021p.m6537c0(objM6514H);
                                }
                                c6021p.m6553p(false);
                                InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2);
                                boolean z6 = ((C18698k) obj4).f59520a;
                                AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11235m2, null, z6, !z6, AbstractC18689b.f59505c, c6021p, 196608, 4);
                                c6021p.m6553p(true);
                            } else {
                                abstractC6601G = (AbstractC6601G) it.next();
                                c6021p.m6524S(730828265);
                                if (abstractC6601G instanceof AbstractC6659u) {
                                    C9436E c9436e = new C9436E(3, (Set) null);
                                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                                    AbstractC6659u abstractC6659u = (AbstractC6659u) abstractC6601G;
                                    c6021p.m6524S(2137048585);
                                    messagesViewModel = (MessagesViewModel) obj6;
                                    zM6545h = c6021p.m6545h(messagesViewModel);
                                    objM6514H2 = c6021p.m6514H();
                                    if (zM6545h || objM6514H2 == c5975s) {
                                        objM6514H2 = new C16482A(messagesViewModel, 19);
                                        c6021p.m6537c0(objM6514H2);
                                    }
                                    c6021p.m6553p(false);
                                    C6658t c6658t = AbstractC6659u.Companion;
                                    AbstractC5023t.m5650a(null, null, abstractC6659u, false, c9436e, (InterfaceC1436k) objM6514H2, interfaceC10459qM11244d, null, false, false, false, false, false, null, null, c6021p, 1600566, 0, 32640);
                                }
                                c6021p.m6553p(false);
                            }
                        }
                    } else {
                        i10 = i13;
                    }
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
                    C21694h c21694h5 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
                    C17794y c17794y2 = C17794y.f56777a;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.conversation_variants_header, new Object[]{Integer.valueOf(i14 + 1)}, c6021p), AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 0, 0, 65532);
                    InterfaceC10459q interfaceC10459qM9126g2 = AbstractC8479G.m9126g(c17794y2.m19544b(c10456n, true), AbstractC8479G.m9124e(c6021p), 14);
                    C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p, 0);
                    i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g2);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, c17790wM19515a3);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                    } else {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                    }
                    C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d3);
                    c6021p.m6524S(730826625);
                    it = ((List) obj3).iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        C5975S c5975s2 = C6013l.f19514a;
                        if (zHasNext) {
                            c6021p.m6553p(false);
                            c6021p.m6553p(true);
                            c6021p.m6524S(-1023589207);
                            interfaceC3759g = (InterfaceC3759g) obj5;
                            i12 = i10;
                            zM6542f = c6021p.m6542f(interfaceC3759g) | c6021p.m6538d(i12);
                            objM6514H = c6021p.m6514H();
                            if (zM6542f) {
                                objM6514H = new C1832u(interfaceC3759g, i12, 3);
                                c6021p.m6537c0(objM6514H);
                            } else {
                                objM6514H = new C1832u(interfaceC3759g, i12, 3);
                                c6021p.m6537c0(objM6514H);
                            }
                            c6021p.m6553p(false);
                            InterfaceC10459q interfaceC10459qM11235m3 = AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2);
                            boolean z10 = ((C18698k) obj4).f59520a;
                            AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11235m3, null, z10, !z10, AbstractC18689b.f59505c, c6021p, 196608, 4);
                            c6021p.m6553p(true);
                        } else {
                            abstractC6601G = (AbstractC6601G) it.next();
                            c6021p.m6524S(730828265);
                            if (abstractC6601G instanceof AbstractC6659u) {
                                C9436E c9436e2 = new C9436E(3, (Set) null);
                                InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                                AbstractC6659u abstractC6659u2 = (AbstractC6659u) abstractC6601G;
                                c6021p.m6524S(2137048585);
                                messagesViewModel = (MessagesViewModel) obj6;
                                zM6545h = c6021p.m6545h(messagesViewModel);
                                objM6514H2 = c6021p.m6514H();
                                if (zM6545h) {
                                    objM6514H2 = new C16482A(messagesViewModel, 19);
                                    c6021p.m6537c0(objM6514H2);
                                } else {
                                    objM6514H2 = new C16482A(messagesViewModel, 19);
                                    c6021p.m6537c0(objM6514H2);
                                }
                                c6021p.m6553p(false);
                                C6658t c6658t2 = AbstractC6659u.Companion;
                                AbstractC5023t.m5650a(null, null, abstractC6659u2, false, c9436e2, (InterfaceC1436k) objM6514H2, interfaceC10459qM11244d2, null, false, false, false, false, false, null, null, c6021p, 1600566, 0, 32640);
                            }
                            c6021p.m6553p(false);
                        }
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC21881c.m22319a((String) obj5, (String) obj4, (List) obj6, this.f3389o0, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i13 | 1));
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275q(int i10, InterfaceC3759g interfaceC3759g, int i11, C18698k c18698k, List list, MessagesViewModel messagesViewModel) {
        super(2);
        this.f3387Y = 13;
        this.f3389o0 = i10;
        this.f3391q0 = interfaceC3759g;
        this.f3390p0 = i11;
        this.f3392r0 = c18698k;
        this.f3388Z = list;
        this.f3393s0 = messagesViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275q(InterfaceC1436k interfaceC1436k, C18983j c18983j, InterfaceC10459q interfaceC10459q, int i10, C14322z0 c14322z0, int i11) {
        super(2);
        this.f3387Y = 8;
        this.f3391q0 = interfaceC1436k;
        this.f3392r0 = c18983j;
        this.f3388Z = interfaceC10459q;
        this.f3389o0 = i10;
        this.f3393s0 = c14322z0;
        this.f3390p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1275q(InterfaceC10459q interfaceC10459q, Object obj, Object obj2, Object obj3, int i10, int i11, int i12) {
        super(2);
        this.f3387Y = i12;
        this.f3388Z = interfaceC10459q;
        this.f3391q0 = obj;
        this.f3392r0 = obj2;
        this.f3393s0 = obj3;
        this.f3389o0 = i10;
        this.f3390p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1275q(Object obj, InterfaceC10459q interfaceC10459q, Object obj2, Object obj3, int i10, int i11, int i12) {
        super(2);
        this.f3387Y = i12;
        this.f3391q0 = obj;
        this.f3388Z = interfaceC10459q;
        this.f3392r0 = obj2;
        this.f3393s0 = obj3;
        this.f3389o0 = i10;
        this.f3390p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1275q(Object obj, Object obj2, Object obj3, InterfaceC10459q interfaceC10459q, int i10, int i11, int i12) {
        super(2);
        this.f3387Y = i12;
        this.f3391q0 = obj;
        this.f3392r0 = obj2;
        this.f3393s0 = obj3;
        this.f3388Z = interfaceC10459q;
        this.f3389o0 = i10;
        this.f3390p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1275q(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        super(2);
        this.f3387Y = i12;
        this.f3391q0 = obj;
        this.f3392r0 = obj2;
        this.f3388Z = obj3;
        this.f3393s0 = obj4;
        this.f3389o0 = i10;
        this.f3390p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275q(C19866Q c19866q, int i10, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, int i11) {
        super(2);
        this.f3387Y = 12;
        this.f3391q0 = c19866q;
        this.f3389o0 = i10;
        this.f3392r0 = interfaceC1436k;
        this.f3393s0 = interfaceC1439n;
        this.f3388Z = interfaceC10459q;
        this.f3390p0 = i11;
    }
}
