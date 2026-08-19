package p254K0;

import com.google.protobuf.AbstractC12107L1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1000s0.C19408d;
import p349O0.C5994b0;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8506K2;
import p544W9.AbstractC8512L2;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.C14336N;
import p774h1.InterfaceC14339Q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: K0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4513j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4518o f14733Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4525v f14734Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f14735o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f14736p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4506c f14737q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC14339Q f14738r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f14739s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4513j(C4518o c4518o, C4525v c4525v, int i10, boolean z6, C4506c c4506c, InterfaceC14339Q interfaceC14339Q, boolean z10) {
        super(1);
        this.f14733Y = c4518o;
        this.f14734Z = c4525v;
        this.f14735o0 = i10;
        this.f14736p0 = z6;
        this.f14737q0 = c4506c;
        this.f14738r0 = interfaceC14339Q;
        this.f14739s0 = z10;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C4519p c4519p;
        C4519p c4519p2;
        float f10;
        C14336N c14336n = (C14336N) obj;
        C4525v c4525v = this.f14734Z;
        float fM5266a = c4525v.m5266a();
        float f11 = c4525v.f14793e;
        float f12 = fM5266a + f11;
        C4518o c4518o = this.f14733Y;
        float fM20498j = c4518o.f14761b.m20498j() * f12;
        C19408d c19408d = c4518o.f14761b;
        float fM6409g = ((((C5994b0) c19408d.f61440c.f207p0).m6409g() * f12) + fM20498j) - AbstractC8512L2.m9172b(c4525v, c19408d.m20498j(), c19408d.mo20500l());
        float fMo20500l = c19408d.mo20500l();
        float fM8915f = AbstractC8301I.m8915f(AbstractC12107L1.m13818i(fMo20500l, 1, f11, c4525v.m5266a() * fMo20500l) - c4525v.f14792d, 0.0f);
        int i10 = 0;
        C4520q c4520qM5267b = c4525v.m5267b(fM6409g, fM8915f, false);
        C4520q c4520qM5267b2 = c4525v.m5267b(fM6409g, fM8915f, true);
        float fM5266a2 = ((c4525v.m5266a() / 2.0f) + (this.f14735o0 * (c4525v.m5266a() + f11))) - fM6409g;
        int size = c4520qM5267b.f14770Y.size() - 1;
        if (size < 0) {
            c4519p = (C4519p) AbstractC17680n.m19341Q(c4520qM5267b);
            break;
        }
        while (true) {
            int i11 = size - 1;
            c4519p = c4520qM5267b.get(size);
            if (c4519p.f14764c < fM5266a2) {
                break;
            }
            if (i11 < 0) {
                c4519p = (C4519p) AbstractC17680n.m19341Q(c4520qM5267b);
                break;
            }
            size = i11;
        }
        int size2 = c4520qM5267b.f14770Y.size();
        while (true) {
            if (i10 >= size2) {
                c4519p2 = null;
                break;
            }
            c4519p2 = c4520qM5267b.get(i10);
            if (c4519p2.f14764c >= fM5266a2) {
                break;
            }
            i10++;
        }
        if (c4519p2 == null) {
            c4519p2 = (C4519p) AbstractC17680n.m19351a0(c4520qM5267b);
        }
        if (AbstractC16544l.m18089b(c4519p, c4519p2)) {
            f10 = 1.0f;
        } else {
            float f13 = c4519p2.f14764c;
            float f14 = c4519p.f14764c;
            f10 = (fM5266a2 - f14) / (f13 - f14);
        }
        C4519p c4519pM9167a = AbstractC8506K2.m9167a(c4519p, c4519p2, f10);
        boolean zEquals = c4519p.equals(c4519p2);
        boolean z6 = this.f14736p0;
        float fM15331c = (z6 ? C13803e.m15331c(c14336n.f44980D0) : c4525v.m5266a()) / 2.0f;
        float fM5266a3 = (z6 ? c4525v.m5266a() : C13803e.m15331c(c14336n.f44980D0)) / 2.0f;
        float f15 = c4519pM9167a.f14762a;
        float fM15333e = z6 ? C13803e.m15333e(c14336n.f44980D0) / 2.0f : f15 / 2.0f;
        float fM15331c2 = z6 ? f15 / 2.0f : C13803e.m15331c(c14336n.f44980D0) / 2.0f;
        C13801c c13801c = new C13801c(fM15331c - fM15333e, fM5266a3 - fM15331c2, fM15331c + fM15333e, fM5266a3 + fM15331c2);
        C4506c c4506c = this.f14737q0;
        c4506c.f14704a.m6410h(f15);
        Iterator it = c4520qM5267b2.f14770Y.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float f16 = ((C4519p) next).f14762a;
            do {
                Object next2 = it.next();
                float f17 = ((C4519p) next2).f14762a;
                if (Float.compare(f16, f17) > 0) {
                    next = next2;
                    f16 = f17;
                }
            } while (it.hasNext());
        }
        c4506c.f14705b.m6410h(((C4519p) next).f14762a);
        c4506c.f14706c.m6410h(c4520qM5267b2.m5261j().f14762a);
        c4506c.f14707d.setValue(c13801c);
        c14336n.m15651c(!c13801c.equals(new C13801c(0.0f, 0.0f, C13803e.m15333e(c14336n.f44980D0), C13803e.m15331c(c14336n.f44980D0))));
        c14336n.m15658k(this.f14738r0);
        float f18 = c4519pM9167a.f14763b - fM5266a2;
        if (zEquals) {
            f18 += (fM5266a2 - c4519pM9167a.f14764c) / f15;
        }
        if (z6) {
            c14336n.m15662p(f18);
        } else {
            if (this.f14739s0) {
                f18 = -f18;
            }
            c14336n.m15661o(f18);
        }
        return C17296C.f55119a;
    }
}
