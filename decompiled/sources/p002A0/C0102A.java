package p002A0;

import androidx.navigation.AbstractC11122c;
import ge.C14069c0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.AbstractC0575H;
import p042Bf.C1278t;
import p046Bk.AbstractC1391k0;
import p046Bk.C1317B0;
import p046Bk.C1319C0;
import p046Bk.C1321D0;
import p046Bk.C1323E0;
import p046Bk.C1360X0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1783Q;
import p1071w0.EnumC20729S;
import p1082wd.C20909b;
import p1095x1.InterfaceC21098s;
import p1143z4.C21778h;
import p153Fn.C2925c;
import p269Kh.C4679f;
import p349O0.C5996c0;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p537W0.C8410b;
import p729ej.C13421l;
import p729ej.C13430u;
import p729ej.InterfaceC13410a;
import p758g0.C13740P;
import p758g0.C13767i0;
import p759g1.C13800b;
import p774h1.C14336N;
import p774h1.C14343V;
import p870le.C16874c0;
import p909nm.C17677k;
import p936p0.C18265e;
import p936p0.C18280t;

/* JADX INFO: renamed from: A0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0102A extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f435Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f436Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f437o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f438p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f439q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f440r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102A(C0120T c0120t, C16524A c16524a, C16524A c16524a2, EnumC20729S enumC20729S, boolean z6) {
        super(1);
        this.f435Y = 0;
        this.f437o0 = c16524a;
        this.f439q0 = c0120t;
        this.f436Z = z6;
        this.f440r0 = enumC20729S;
        this.f438p0 = c16524a2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.f435Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C0120T c0120t = (C0120T) this.f439q0;
                long jM2572a = AbstractC1783Q.m2572a(c0120t.m410o(this.f436Z));
                ((C16524A) this.f437o0).f51261Y = jM2572a;
                c0120t.m420y((EnumC20729S) this.f440r0, jM2572a);
                ((C16524A) this.f438p0).f51261Y = 0L;
                c0120t.f518t = -1;
                break;
            case 1:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                int iOrdinal = ((C8340J) this.f437o0).f25996a.f26059Z.ordinal();
                C13421l c13421l = (C13421l) this.f438p0;
                C1360X0 c1360x0 = (C1360X0) this.f439q0;
                InterfaceC13410a interfaceC13410a = c13421l.f42503Y;
                if (iOrdinal != 0) {
                    AbstractC1391k0 abstractC1391k0 = (AbstractC1391k0) this.f440r0;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1323E0(abstractC1391k0)));
                        }
                    } else if (this.f436Z) {
                        interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, C1319C0.f3482Y));
                    } else {
                        interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1321D0(abstractC1391k0)));
                    }
                } else {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, C1317B0.f3481Y));
                }
                break;
            case 2:
                C14336N c14336n = (C14336N) obj;
                C13740P c13740p = (C13740P) this.f437o0;
                float fFloatValue2 = 0.8f;
                C13767i0 c13767i0 = (C13767i0) this.f439q0;
                float fFloatValue3 = 1.0f;
                C6002f0 c6002f0 = c13740p.f43331c;
                boolean z6 = this.f436Z;
                if (z6) {
                    fFloatValue = ((Boolean) c6002f0.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) c13767i0.f43468t0.getValue()).floatValue();
                }
                c14336n.m15655g(fFloatValue);
                if (!z6) {
                    fFloatValue2 = ((Number) c13767i0.f43468t0.getValue()).floatValue();
                } else if (((Boolean) c6002f0.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                c14336n.m15656h(fFloatValue2);
                if (!z6) {
                    fFloatValue3 = ((Number) ((C13767i0) this.f440r0).f43468t0.getValue()).floatValue();
                } else if (!((Boolean) c6002f0.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                c14336n.m15649a(fFloatValue3);
                c14336n.m15660n(((C14343V) ((InterfaceC5985X) this.f438p0).getValue()).f45025a);
                break;
            case 3:
                InterfaceC21098s coords = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(coords, "coords");
                if (!this.f436Z && !((Boolean) ((InterfaceC5985X) this.f438p0).getValue()).booleanValue()) {
                    int iMo21524k = (int) (coords.mo21524k() & 4294967295L);
                    C5996c0 c5996c0 = (C5996c0) this.f439q0;
                    if (c5996c0.m6412g() == -1) {
                        c5996c0.m6413h(iMo21524k);
                    } else {
                        int iM6412g = c5996c0.m6412g() - iMo21524k;
                        if (iM6412g != 0) {
                            c5996c0.m6413h(iMo21524k);
                            AbstractC0575H.m1156D((C2925c) this.f437o0, null, null, new C14069c0((C18280t) this.f440r0, iM6412g, null), 3);
                        }
                    }
                }
                break;
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                List list = ((C4679f) this.f437o0).f15229b;
                LazyColumn.m19803p(list.size(), null, new C1278t(19, list), new C8410b(new C16874c0(list, (C20909b) this.f438p0, (InterfaceC1436k) this.f439q0, (InterfaceC1426a) this.f440r0, this.f436Z, 0), true, -632812321));
                break;
            default:
                C21778h entry = (C21778h) obj;
                AbstractC16544l.m18094g(entry, "entry");
                ((C16556x) this.f437o0).f51285Y = true;
                ((C16556x) this.f438p0).f51285Y = true;
                ((AbstractC11122c) this.f439q0).m12198s(entry, this.f436Z, (C17677k) this.f440r0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102A(C4679f c4679f, C20909b c20909b, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, boolean z6) {
        super(1);
        this.f435Y = 4;
        this.f437o0 = c4679f;
        this.f438p0 = c20909b;
        this.f439q0 = interfaceC1436k;
        this.f440r0 = interfaceC1426a;
        this.f436Z = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102A(Object obj, Object obj2, Object obj3, boolean z6, Object obj4, int i10) {
        super(1);
        this.f435Y = i10;
        this.f437o0 = obj;
        this.f438p0 = obj2;
        this.f439q0 = obj3;
        this.f436Z = z6;
        this.f440r0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102A(boolean z6, Object obj, InterfaceC5985X interfaceC5985X, InterfaceC5982V0 interfaceC5982V0, Object obj2, int i10) {
        super(1);
        this.f435Y = i10;
        this.f436Z = z6;
        this.f437o0 = obj;
        this.f438p0 = interfaceC5985X;
        this.f439q0 = interfaceC5982V0;
        this.f440r0 = obj2;
    }
}
