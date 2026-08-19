package ph;

import android.content.Context;
import com.openai.chatgpt.R;
import com.openai.feature.widget.impl.ConversationAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p042Bf.C1281w;
import p1071w0.AbstractC20734X;
import p195Hh.C3430e;
import p229J0.C3991U3;
import p229J0.C4087l3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p473T7.AbstractC7262c;
import p477Tb.AbstractC7294a;
import p478Tc.AbstractC7313q;
import p492U1.C7540e;
import p492U1.C7542g;
import p523V9.AbstractC7849B0;
import p523V9.AbstractC8062c4;
import p523V9.AbstractC8168p6;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8491I;
import p544W9.AbstractC8497J;
import p544W9.AbstractC8739x2;
import p571X9.AbstractC9233X;
import p637a3.AbstractC10491h;
import p637a3.C10484a;
import p637a3.C10487d;
import p637a3.C10499p;
import p637a3.InterfaceC10497n;
import p656b3.AbstractC11225d;
import p656b3.C11223b;
import p672c3.AbstractC11579L;
import p672c3.C11642y0;
import p672c3.C11643z;
import p695d3.C13000e;
import p706df.C13098r;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p776h3.C14398l;
import p776h3.C14399m;
import p776h3.C14400n;
import p776h3.C14404r;
import p884m3.C17144c;
import p884m3.C17146e;
import p884m3.C17149h;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ph.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18417e extends AbstractC11579L {

    /* JADX INFO: renamed from: e */
    public static final C3430e f58762e = AbstractC8168p6.m8749b("Widget", null);

    /* JADX INFO: renamed from: f */
    public static final float f58763f = 20;

    /* JADX INFO: renamed from: g */
    public static final float f58764g;

    /* JADX INFO: renamed from: h */
    public static final float f58765h;

    /* JADX INFO: renamed from: i */
    public static final float f58766i;

    /* JADX INFO: renamed from: j */
    public static final float f58767j;

    /* JADX INFO: renamed from: k */
    public static final long f58768k;

    /* JADX INFO: renamed from: l */
    public static final C18414b f58769l;

    /* JADX INFO: renamed from: m */
    public static final C18414b f58770m;

    /* JADX INFO: renamed from: n */
    public static final Set f58771n;

    /* JADX INFO: renamed from: d */
    public final C11642y0 f58772d;

    static {
        float f10 = 56;
        float f11 = 48;
        f58764g = f11;
        float f12 = AbstractC7313q.f23199d;
        f58765h = f12;
        f58766i = 44;
        float f13 = AbstractC7313q.f23201f;
        f58767j = f13;
        f58768k = AbstractC14334L.m15626d(4291085259L);
        C18414b c18414b = new C18414b(true, 4, 64, f13, f10);
        C18414b c18414b2 = new C18414b(true, 4, f10, f13);
        C18414b c18414b3 = new C18414b(true, 3, f10, f13);
        C18414b c18414b4 = new C18414b(true, 2, f10, f12);
        C18414b c18414b5 = new C18414b(true, 1, f10, f12);
        C18414b c18414b6 = new C18414b(false, 4, f10, f13);
        C18414b c18414b7 = new C18414b(false, 3, f10, f13);
        f58769l = c18414b7;
        C18414b c18414b8 = new C18414b(false, 2, f10, f12);
        C18414b c18414b9 = new C18414b(false, 1, f10, f12);
        C18414b c18414b10 = new C18414b(true, 3, f11, f13);
        C18414b c18414b11 = new C18414b(true, 2, f11, f13);
        C18414b c18414b12 = new C18414b(true, 1, f11, f12);
        C18414b c18414b13 = new C18414b(false, 4, f11, f12);
        C18414b c18414b14 = new C18414b(false, 3, f11, f12);
        C18414b c18414b15 = new C18414b(false, 2, f11, f12);
        C18414b c18414b16 = new C18414b(false, 1, f11, f12);
        f58770m = c18414b16;
        f58771n = AbstractC17678l.m19293P(new C18414b[]{c18414b, c18414b2, c18414b3, c18414b4, c18414b5, c18414b6, c18414b7, c18414b8, c18414b9, c18414b10, c18414b11, c18414b12, c18414b13, c18414b14, c18414b15, c18414b16});
    }

    public C18417e() {
        Set set = f58771n;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7542g(((C18414b) it.next()).f58755f));
        }
        this.f58772d = new C11642y0(AbstractC17680n.m19328G0(arrayList));
    }

    /* JADX INFO: renamed from: d */
    public static final void m19871d(C18417e c18417e, int i10, float f10, Class cls, C6021p c6021p, int i11) {
        int i12;
        c18417e.getClass();
        c6021p.m6526U(1740081021);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6536c(f10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(cls) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10484a c10484a = new C10484a(i10);
            C10487d c10487d = new C10487d(new C10499p(new C17149h(C14365u.f45055e)));
            InterfaceC10497n interfaceC10497nMo10952b = new C14404r(new C17144c(f10)).mo10952b(new C14398l(new C17144c(f10)));
            C14399m c14399mM9162d = AbstractC8497J.m9162d(AbstractC7313q.f23201f);
            AbstractC7294a.m7744a(c10484a, AbstractC7262c.m7712a(interfaceC10497nMo10952b.mo10952b(new C14400n(c14399mM9162d, c14399mM9162d, c14399mM9162d, c14399mM9162d)).mo10952b(new C11643z(new C17144c(20))), new C10484a(R.drawable.button_background)).mo10952b(new C11223b(new C13000e(cls, AbstractC7849B0.m8107b((AbstractC11225d[]) Arrays.copyOf(new AbstractC11225d[0], 0))))), 0, c10487d, c6021p, 32816, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13098r(c18417e, i10, f10, cls, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19872e(C18417e c18417e, float f10, String str, C6021p c6021p, int i10) {
        int i11;
        c18417e.getClass();
        c6021p.m6526U(-694562753);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6536c(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z6 = Float.compare(f10, (float) 56) >= 0;
            AbstractC8739x2.m9474c(AbstractC8497J.m9161c(AbstractC7262c.m7712a(new C14404r(C17146e.f54816a).mo10952b(new C14398l(new C17144c(f10))).mo10952b(new C11643z(new C17144c(z6 ? 26 : 22))), new C10484a(z6 ? R.drawable.search_background_xl : R.drawable.search_background)), AbstractC7313q.f23201f).mo10952b(new C11223b(new C13000e(ConversationAction.class, AbstractC7849B0.m8107b((AbstractC11225d[]) Arrays.copyOf(new AbstractC11225d[0], 0))))), 0, 1, AbstractC8411c.m8969c(-409776221, c6021p, new C3991U3(str, 14)), c6021p, 3072, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4087l3(c18417e, f10, str, i10, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p672c3.AbstractC11579L
    /* JADX INFO: renamed from: b */
    public final void mo12975b(Context context, AbstractC19687c abstractC19687c) {
        C18415c c18415c;
        if (abstractC19687c instanceof C18415c) {
            c18415c = (C18415c) abstractC19687c;
            int i10 = c18415c.f58758o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18415c.f58758o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18415c = new C18415c(this, abstractC19687c);
            }
        } else {
            c18415c = new C18415c(this, abstractC19687c);
        }
        Object obj = c18415c.f58756Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18415c.f58758o0;
        if (i11 != 0) {
            if (i11 == 1) {
                throw AbstractC20734X.m21252w(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        C8410b c8410b = new C8410b(new C18416d(this, 0, context), true, 1026586785);
        c18415c.f58758o0 = 1;
        AbstractC8062c4.m8457c(c8410b, c18415c);
    }

    /* JADX INFO: renamed from: c */
    public final void m19873c(Context context, C6021p c6021p, int i10) {
        int i11;
        Object next;
        int i12;
        C18414b c18414b;
        AbstractC16544l.m18094g(context, "context");
        c6021p.m6526U(435603239);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(context) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(this) : c6021p.m6545h(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            long j10 = ((C7542g) c6021p.m6548k(AbstractC10491h.f31086a)).f23896a;
            Iterator it = f58771n.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    c18414b = (C18414b) next;
                }
            } while (!(C7540e.m7873a(C7542g.m7877b(c18414b.f58755f), C7542g.m7877b(j10)) && C7540e.m7873a(C7542g.m7876a(c18414b.f58755f), C7542g.m7876a(j10))));
            C18414b c18414b2 = (C18414b) next;
            if (c18414b2 == null) {
                c18414b2 = f58770m;
            }
            boolean z6 = Float.compare(c18414b2.f58752c, f58764g) <= 0;
            if (z6) {
                i12 = R.drawable.surface_background_small;
            } else {
                if (z6) {
                    throw new C0644w();
                }
                i12 = R.drawable.surface_background;
            }
            C14399m c14399mM9162d = AbstractC8497J.m9162d(c18414b2.f58753d);
            AbstractC8491I.m9150a(AbstractC7262c.m7712a(new C14400n(c14399mM9162d, c14399mM9162d, c14399mM9162d, c14399mM9162d), new C10484a(i12)).mo10952b(new C14404r(C17146e.f54816a)), 1, 1, AbstractC8411c.m8969c(-1284069987, c6021p, new C1281w(c18414b2, this, context, 26)), c6021p, 3072);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(this, context, i10, 28);
        }
    }
}
