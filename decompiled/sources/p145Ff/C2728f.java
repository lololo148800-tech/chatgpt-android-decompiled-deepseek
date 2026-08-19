package p145Ff;

import androidx.compose.foundation.layout.AbstractC10844c;
import bf.C11349D;
import bf.InterfaceC11374b0;
import cd.AbstractC11707g;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p006A4.C0339D;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3970Q1;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4094m4;
import p229J0.AbstractC4124r4;
import p229J0.C4161y;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p362Of.C6194i;
import p363Og.AbstractC6199c;
import p363Og.C6207k;
import p478Tc.AbstractC7313q;
import p492U1.C7544i;
import p523V9.AbstractC8103h5;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p587Y1.AbstractC9582h;
import p587Y1.C9576b;
import p594Y9.AbstractC9818V;
import p594Y9.AbstractC9973t4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p774h1.C14343V;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17440t;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17790w;
import p963qd.C18686o;
import td.C19849l;

/* JADX INFO: renamed from: Ff.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2728f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8380Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f8381Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2728f(InterfaceC5985X interfaceC5985X, int i10) {
        super(2);
        this.f8380Y = i10;
        this.f8381Z = interfaceC5985X;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0569  */
    /* JADX WARN: Code duplicated, block: B:168:0x0596  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        C17425e c17425eM19122b;
        float fMin2;
        float fMin3 = 1.0f;
        C5975S c5975s = C6013l.f19514a;
        C10456n c10456n = C10456n.f30959Y;
        int i10 = 0;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f8381Z;
        switch (this.f8380Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-360929849);
                    Object objM6514H = c6021p.m6514H();
                    if (objM6514H == c5975s) {
                        objM6514H = new C0339D(interfaceC5985X, 9);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, null, false, null, null, null, null, null, null, AbstractC2725c.f8367a, c6021p, 805306374, 510);
                }
                break;
            case 1:
                C7544i c7544i = (C7544i) obj;
                C7544i c7544i2 = (C7544i) obj2;
                float f10 = AbstractC3970Q1.f12404a;
                if (c7544i2.f23899a < c7544i.f23901c) {
                    int i11 = c7544i2.f23901c;
                    int i12 = c7544i.f23899a;
                    if (i11 <= i12) {
                        fMin = 1.0f;
                    } else if (c7544i2.m7885b() == 0) {
                        fMin = 0.0f;
                    } else {
                        int i13 = c7544i2.f23899a;
                        fMin = (((Math.min(c7544i.f23901c, i11) + Math.max(i12, i13)) / 2) - i13) / c7544i2.m7885b();
                    }
                } else {
                    fMin = 0.0f;
                }
                int i14 = c7544i2.f23900b;
                int i15 = c7544i.f23902d;
                if (i14 < i15) {
                    int i16 = c7544i2.f23902d;
                    int i17 = c7544i.f23900b;
                    if (i16 > i17) {
                        if (c7544i2.m7884a() == 0) {
                            fMin3 = 0.0f;
                        } else {
                            fMin3 = (((Math.min(i15, i16) + Math.max(i17, i14)) / 2) - i14) / c7544i2.m7884a();
                        }
                    }
                } else {
                    fMin3 = 0.0f;
                }
                interfaceC5985X.setValue(new C14343V(AbstractC14334L.m15632j(fMin, fMin3)));
                break;
            case 2:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(c10456n, false, C4161y.f13504y0);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i18 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM3789a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i18))) {
                        AbstractC0168G.m537z(i18, c6021p2, i18, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    ((InterfaceC1439n) interfaceC5985X.getValue()).invoke(c6021p2, 0);
                    c6021p2.m6553p(true);
                }
                break;
            case 3:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                        c17425eM19122b = AbstractC8111i5.f25446a;
                        if (c17425eM19122b == null) {
                            C17424d c17424d = new C17424d("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i19 = AbstractC17418F.f55636a;
                            C14341T c14341t = new C14341T(C14365u.f45052b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new C17433m(7.41f, 15.41f));
                            arrayList.add(new C17432l(12.0f, 10.83f));
                            arrayList.add(new C17440t(4.59f, 4.58f));
                            arrayList.add(new C17432l(18.0f, 14.0f));
                            arrayList.add(new C17440t(-6.0f, -6.0f));
                            arrayList.add(new C17440t(-6.0f, 6.0f));
                            arrayList.add(C17429i.f55733c);
                            C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                            c17425eM19122b = c17424d.m19122b();
                            AbstractC8111i5.f25446a = c17425eM19122b;
                        }
                    } else {
                        c17425eM19122b = AbstractC8103h5.f25439a;
                        if (c17425eM19122b == null) {
                            C17424d c17424d2 = new C17424d("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i20 = AbstractC17418F.f55636a;
                            C14341T c14341t2 = new C14341T(C14365u.f45052b);
                            ArrayList arrayList2 = new ArrayList(32);
                            arrayList2.add(new C17433m(7.41f, 8.59f));
                            arrayList2.add(new C17432l(12.0f, 13.17f));
                            arrayList2.add(new C17440t(4.59f, -4.58f));
                            arrayList2.add(new C17432l(18.0f, 10.0f));
                            arrayList2.add(new C17440t(-6.0f, 6.0f));
                            arrayList2.add(new C17440t(-6.0f, -6.0f));
                            arrayList2.add(new C17440t(1.41f, -1.41f));
                            arrayList2.add(C17429i.f55733c);
                            C17424d.m19121a(c17424d2, arrayList2, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                            c17425eM19122b = c17424d2.m19122b();
                            AbstractC8103h5.f25439a = c17425eM19122b;
                        }
                    }
                    AbstractC3878A1.m4597b(c17425eM19122b, ((Boolean) interfaceC5985X.getValue()).booleanValue() ? AbstractC17792x.m19533p(c6021p3, 1378811761, R.string.voice_debug_collapse, c6021p3, false) : AbstractC17792x.m19533p(c6021p3, 1378909907, R.string.voice_debug_expand, c6021p3, false), null, C14365u.f45058h, c6021p3, 3072, 4);
                }
                break;
            case 4:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    c6021p4.m6524S(-1038151027);
                    boolean zM6542f = c6021p4.m6542f(interfaceC5985X);
                    Object objM6514H2 = c6021p4.m6514H();
                    if (zM6542f || objM6514H2 == c5975s) {
                        objM6514H2 = new C6207k(interfaceC5985X, i10);
                        c6021p4.m6537c0(objM6514H2);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H2, null, false, null, null, null, null, null, null, AbstractC6199c.f20196e, c6021p4, 805306368, 510);
                }
                break;
            case 5:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    AbstractC3980S2.m4668b(AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23201f), 0L, AbstractC7313q.f23197b, 0L, 0, c6021p5, 0, 26);
                }
                break;
            case 6:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    ((InterfaceC1439n) interfaceC5985X.getValue()).invoke(c6021p6, 0);
                }
                break;
            case 7:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    AbstractC9973t4.m10618c(AbstractC2965l.m3789a(c10456n, false, C9576b.f28820Z), AbstractC8411c.m8969c(-533674951, c6021p7, new C2728f(interfaceC5985X, 6)), c6021p7, 48);
                }
                break;
            case 8:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    C6037x c6037x = AbstractC9582h.f28839a;
                    ((InterfaceC1439n) interfaceC5985X.getValue()).invoke(c6021p8, 0);
                }
                break;
            case 9:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p9, 0);
                    int i21 = c6021p9.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p9.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p9, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p9.m6528W();
                    if (c6021p9.f19563O) {
                        c6021p9.m6549l(c21696i2);
                    } else {
                        c6021p9.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p9, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p9, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p9.f19563O || !AbstractC16544l.m18089b(c6021p9.m6514H(), Integer.valueOf(i21))) {
                        AbstractC0168G.m537z(i21, c6021p9, i21, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p9, interfaceC10459qM10923d2);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.developer_option_token_override_description, c6021p9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p9, 0, 0, 131070);
                    String str = (String) interfaceC5985X.getValue();
                    c6021p9.m6524S(-64576072);
                    Object objM6514H3 = c6021p9.m6514H();
                    if (objM6514H3 == c5975s) {
                        objM6514H3 = new C6194i(interfaceC5985X, 7);
                        c6021p9.m6537c0(objM6514H3);
                    }
                    c6021p9.m6553p(false);
                    AbstractC4094m4.m4753a(str, (InterfaceC1436k) objM6514H3, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, 4, 0, null, null, null, c6021p9, 48, 100663296, 0, 8126460);
                    c6021p9.m6553p(true);
                }
                break;
            case 10:
                C7544i parentBounds = (C7544i) obj;
                C7544i menuBounds = (C7544i) obj2;
                AbstractC16544l.m18094g(parentBounds, "parentBounds");
                AbstractC16544l.m18094g(menuBounds, "menuBounds");
                float f11 = AbstractC11707g.f35518a;
                int i22 = parentBounds.f23901c;
                int i23 = menuBounds.f23899a;
                if (i23 < i22) {
                    int i24 = parentBounds.f23899a;
                    int i25 = menuBounds.f23901c;
                    if (i25 <= i24) {
                        fMin2 = 1.0f;
                    } else if (menuBounds.m7885b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i22, i25) + Math.max(i24, i23)) / 2) - i23) / menuBounds.m7885b();
                    }
                } else {
                    fMin2 = 0.0f;
                }
                int i26 = parentBounds.f23902d;
                int i27 = menuBounds.f23900b;
                if (i27 < i26) {
                    int i28 = parentBounds.f23900b;
                    int i29 = menuBounds.f23902d;
                    if (i29 > i28) {
                        if (menuBounds.m7884a() == 0) {
                            fMin3 = 0.0f;
                        } else {
                            fMin3 = (((Math.min(i26, i29) + Math.max(i28, i27)) / 2) - i27) / menuBounds.m7884a();
                        }
                    }
                } else {
                    fMin3 = 0.0f;
                }
                interfaceC5985X.setValue(new C14343V(AbstractC14334L.m15632j(fMin2, fMin3)));
                break;
            case 11:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else if (((C18686o) interfaceC5985X.getValue()).f59490d != null) {
                    InterfaceC11374b0 interfaceC11374b0 = ((C18686o) interfaceC5985X.getValue()).f59490d;
                    String str2 = interfaceC11374b0 != null ? ((C11349D) interfaceC11374b0).f34319b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p10, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p11 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_remove_from_project_button, c6021p11), AbstractC9818V.m10458b(c10456n, ((C19849l) interfaceC5985X.getValue()).f62940d, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p11, 0, 0, 131068);
                }
                break;
        }
        return c17296c;
    }
}
