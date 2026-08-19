package p204I1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1139z0.C21585H;
import p328N1.C5609y;
import p371P1.C6305a;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7199i;
import p467T1.C7200j;
import p467T1.C7201k;
import p467T1.C7205o;
import p467T1.C7206p;
import p492U1.C7548m;
import p492U1.C7549n;
import p562X0.C9008c;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.C14338P;
import p774h1.C14365u;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: I1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3610z extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11019Y;

    /* JADX INFO: renamed from: Z */
    public static final C3610z f11006Z = new C3610z(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3610z f11007o0 = new C3610z(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3610z f11008p0 = new C3610z(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3610z f11009q0 = new C3610z(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C3610z f11010r0 = new C3610z(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C3610z f11011s0 = new C3610z(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C3610z f11012t0 = new C3610z(2, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C3610z f11013u0 = new C3610z(2, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C3610z f11014v0 = new C3610z(2, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C3610z f11015w0 = new C3610z(2, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C3610z f11016x0 = new C3610z(2, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C3610z f11017y0 = new C3610z(2, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C3610z f11018z0 = new C3610z(2, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C3610z f10997A0 = new C3610z(2, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C3610z f10998B0 = new C3610z(2, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C3610z f10999C0 = new C3610z(2, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C3610z f11000D0 = new C3610z(2, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C3610z f11001E0 = new C3610z(2, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C3610z f11002F0 = new C3610z(2, 18);

    /* JADX INFO: renamed from: G0 */
    public static final C3610z f11003G0 = new C3610z(2, 19);

    /* JADX INFO: renamed from: H0 */
    public static final C3610z f11004H0 = new C3610z(2, 20);

    /* JADX INFO: renamed from: I0 */
    public static final C3610z f11005I0 = new C3610z(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3610z(int i10, int i11) {
        super(i10);
        this.f11019Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        EnumC3592h enumC3592h;
        int i10 = 0;
        switch (this.f11019Y) {
            case 0:
                C9008c c9008c = (C9008c) obj;
                C3590f c3590f = (C3590f) obj2;
                String str = c3590f.f10934Y;
                C21585H c21585h = AbstractC3572C.f10837a;
                List listM4299b = c3590f.m4299b();
                C21585H c21585h2 = AbstractC3572C.f10838b;
                Object objM4243a = AbstractC3572C.m4243a(listM4299b, c21585h2, c9008c);
                Object obj3 = c3590f.f10936o0;
                if (obj3 == null) {
                    obj3 = C17689w.f56480Y;
                }
                return AbstractC17681o.m19377f(str, objM4243a, AbstractC3572C.m4243a(obj3, c21585h2, c9008c), AbstractC3572C.m4243a(c3590f.f10937p0, c21585h2, c9008c));
            case 1:
                C9008c c9008c2 = (C9008c) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i10 < size) {
                    arrayList.add(AbstractC3572C.m4243a((C3588d) list.get(i10), AbstractC3572C.f10839c, c9008c2));
                    i10++;
                }
                return arrayList;
            case 2:
                C9008c c9008c3 = (C9008c) obj;
                C3588d c3588d = (C3588d) obj2;
                Object obj4 = c3588d.f10930a;
                if (obj4 instanceof C3604t) {
                    enumC3592h = EnumC3592h.f10939Y;
                } else if (obj4 instanceof C3573D) {
                    enumC3592h = EnumC3592h.f10940Z;
                } else if (obj4 instanceof C3584O) {
                    enumC3592h = EnumC3592h.f10941o0;
                } else if (obj4 instanceof C3583N) {
                    enumC3592h = EnumC3592h.f10942p0;
                } else if (obj4 instanceof C3596l) {
                    enumC3592h = EnumC3592h.f10943q0;
                } else {
                    enumC3592h = obj4 instanceof C3595k ? EnumC3592h.f10944r0 : EnumC3592h.f10945s0;
                }
                int iOrdinal = enumC3592h.ordinal();
                Object objM4243a2 = c3588d.f10930a;
                switch (iOrdinal) {
                    case 0:
                        AbstractC16544l.m18092e(objM4243a2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objM4243a2 = AbstractC3572C.m4243a((C3604t) objM4243a2, AbstractC3572C.f10844h, c9008c3);
                        break;
                    case 1:
                        AbstractC16544l.m18092e(objM4243a2, sVDIzpC.FOBeAFIJfDq);
                        objM4243a2 = AbstractC3572C.m4243a((C3573D) objM4243a2, AbstractC3572C.f10845i, c9008c3);
                        break;
                    case 2:
                        AbstractC16544l.m18092e(objM4243a2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objM4243a2 = AbstractC3572C.m4243a((C3584O) objM4243a2, AbstractC3572C.f10840d, c9008c3);
                        break;
                    case 3:
                        AbstractC16544l.m18092e(objM4243a2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objM4243a2 = AbstractC3572C.m4243a((C3583N) objM4243a2, AbstractC3572C.f10841e, c9008c3);
                        break;
                    case 4:
                        AbstractC16544l.m18092e(objM4243a2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objM4243a2 = AbstractC3572C.m4243a((C3596l) objM4243a2, AbstractC3572C.f10842f, c9008c3);
                        break;
                    case 5:
                        AbstractC16544l.m18092e(objM4243a2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objM4243a2 = AbstractC3572C.m4243a((C3595k) objM4243a2, AbstractC3572C.f10843g, c9008c3);
                        break;
                    case 6:
                        C21585H c21585h3 = AbstractC3572C.f10837a;
                        break;
                    default:
                        throw new C0644w();
                }
                return AbstractC17681o.m19377f(enumC3592h, objM4243a2, Integer.valueOf(c3588d.f10931b), Integer.valueOf(c3588d.f10932c), c3588d.f10933d);
            case 3:
                return Float.valueOf(((C7191a) obj2).f22846a);
            case 4:
                C3595k c3595k = (C3595k) obj2;
                return AbstractC17681o.m19377f(c3595k.f10948a, AbstractC3572C.m4243a(c3595k.f10949b, AbstractC3572C.f10846j, (C9008c) obj));
            case 5:
                long j10 = ((C14365u) obj2).f45062a;
                return j10 == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC14334L.m15617F(j10));
            case 6:
                return Integer.valueOf(((C5609y) obj2).f18160Y);
            case 7:
                C3596l c3596l = (C3596l) obj2;
                return AbstractC17681o.m19377f(c3596l.f10951a, AbstractC3572C.m4243a(c3596l.f10952b, AbstractC3572C.f10846j, (C9008c) obj));
            case 8:
                C9008c c9008c4 = (C9008c) obj;
                List list2 = ((C6306b) obj2).f20438Y;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i10 < size2) {
                    arrayList2.add(AbstractC3572C.m4243a((C6305a) list2.get(i10), AbstractC3572C.f10858v, c9008c4));
                    i10++;
                }
                return arrayList2;
            case 9:
                return ((C6305a) obj2).f20436a.toLanguageTag();
            case 10:
                long j11 = ((C13800b) obj2).f43584a;
                if (C13800b.m15303d(j11, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(C13800b.m15306g(j11));
                C21585H c21585h4 = AbstractC3572C.f10837a;
                return AbstractC17681o.m19377f(fValueOf, Float.valueOf(C13800b.m15307h(j11)));
            case 11:
                C9008c c9008c5 = (C9008c) obj;
                C3604t c3604t = (C3604t) obj2;
                C7199i c7199i = new C7199i(c3604t.f10978a);
                C21585H c21585h5 = AbstractC3572C.f10837a;
                C7201k c7201k = new C7201k(c3604t.f10979b);
                Object objM4243a3 = AbstractC3572C.m4243a(new C7548m(c3604t.f10980c), AbstractC3572C.f10855s, c9008c5);
                C7206p c7206p = C7206p.f22874c;
                return AbstractC17681o.m19377f(c7199i, c7201k, objM4243a3, AbstractC3572C.m4243a(c3604t.f10981d, AbstractC3572C.f10849m, c9008c5));
            case 12:
                C9008c c9008c6 = (C9008c) obj;
                C14338P c14338p = (C14338P) obj2;
                return AbstractC17681o.m19377f(AbstractC3572C.m4243a(new C14365u(c14338p.f45001a), AbstractC3572C.f10854r, c9008c6), AbstractC3572C.m4243a(new C13800b(c14338p.f45002b), AbstractC3572C.f10856t, c9008c6), Float.valueOf(c14338p.f45003c));
            case 13:
                C9008c c9008c7 = (C9008c) obj;
                C3573D c3573d = (C3573D) obj2;
                C14365u c14365u = new C14365u(c3573d.f10859a.mo7588b());
                C3571B c3571b = AbstractC3572C.f10854r;
                Object objM4243a4 = AbstractC3572C.m4243a(c14365u, c3571b, c9008c7);
                C7548m c7548m = new C7548m(c3573d.f10860b);
                C3571B c3571b2 = AbstractC3572C.f10855s;
                Object objM4243a5 = AbstractC3572C.m4243a(c7548m, c3571b2, c9008c7);
                C5609y c5609y = C5609y.f18151Z;
                Object objM4243a6 = AbstractC3572C.m4243a(c3573d.f10861c, AbstractC3572C.f10850n, c9008c7);
                Object objM4243a7 = AbstractC3572C.m4243a(new C7548m(c3573d.f10866h), c3571b2, c9008c7);
                Object objM4243a8 = AbstractC3572C.m4243a(c3573d.f10867i, AbstractC3572C.f10851o, c9008c7);
                Object objM4243a9 = AbstractC3572C.m4243a(c3573d.f10868j, AbstractC3572C.f10848l, c9008c7);
                C6306b c6306b = C6306b.f20437o0;
                Object objM4243a10 = AbstractC3572C.m4243a(c3573d.f10869k, AbstractC3572C.f10857u, c9008c7);
                Object objM4243a11 = AbstractC3572C.m4243a(new C14365u(c3573d.f10870l), c3571b, c9008c7);
                Object objM4243a12 = AbstractC3572C.m4243a(c3573d.f10871m, AbstractC3572C.f10847k, c9008c7);
                C14338P c14338p2 = C14338P.f45000d;
                return AbstractC17681o.m19377f(objM4243a4, objM4243a5, objM4243a6, c3573d.f10862d, c3573d.f10863e, -1, c3573d.f10865g, objM4243a7, objM4243a8, objM4243a9, objM4243a10, objM4243a11, objM4243a12, AbstractC3572C.m4243a(c3573d.f10872n, AbstractC3572C.f10853q, c9008c7));
            case 14:
                return Integer.valueOf(((C7200j) obj2).f22866a);
            case 15:
                C7205o c7205o = (C7205o) obj2;
                return AbstractC17681o.m19377f(Float.valueOf(c7205o.f22872a), Float.valueOf(c7205o.f22873b));
            case 16:
                C9008c c9008c8 = (C9008c) obj;
                C7206p c7206p2 = (C7206p) obj2;
                C7548m c7548m2 = new C7548m(c7206p2.f22875a);
                C3571B c3571b3 = AbstractC3572C.f10855s;
                return AbstractC17681o.m19377f(AbstractC3572C.m4243a(c7548m2, c3571b3, c9008c8), AbstractC3572C.m4243a(new C7548m(c7206p2.f22876b), c3571b3, c9008c8));
            case 17:
                C9008c c9008c9 = (C9008c) obj;
                C3579J c3579j = (C3579J) obj2;
                C3573D c3573d2 = c3579j.f10898a;
                C21585H c21585h6 = AbstractC3572C.f10845i;
                return AbstractC17681o.m19377f(AbstractC3572C.m4243a(c3573d2, c21585h6, c9008c9), AbstractC3572C.m4243a(c3579j.f10899b, c21585h6, c9008c9), AbstractC3572C.m4243a(c3579j.f10900c, c21585h6, c9008c9), AbstractC3572C.m4243a(c3579j.f10901d, c21585h6, c9008c9));
            case 18:
                long j12 = ((C3581L) obj2).f10908a;
                int i11 = C3581L.f10907c;
                Integer numValueOf = Integer.valueOf((int) (j12 >> 32));
                C21585H c21585h7 = AbstractC3572C.f10837a;
                return AbstractC17681o.m19377f(numValueOf, Integer.valueOf((int) (j12 & 4294967295L)));
            case 19:
                long j13 = ((C7548m) obj2).f23910a;
                if (C7548m.m7893a(j13, C7548m.f23909c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(C7548m.m7895c(j13));
                C21585H c21585h8 = AbstractC3572C.f10837a;
                return AbstractC17681o.m19377f(fValueOf2, new C7549n(C7548m.m7894b(j13)));
            case 20:
                String str2 = ((C3583N) obj2).f10913a;
                C21585H c21585h9 = AbstractC3572C.f10837a;
                return str2;
            default:
                String str3 = ((C3584O) obj2).f10914a;
                C21585H c21585h10 = AbstractC3572C.f10837a;
                return str3;
        }
    }
}
