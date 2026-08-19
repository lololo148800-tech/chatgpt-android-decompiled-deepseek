package p773h0;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p1014t1.AbstractC19736m;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1014t1.C19729f;
import p1014t1.EnumC19730g;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21697i0;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21704m;
import p1140z1.InterfaceC21707n0;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2960g;
import p156G1.C2963j;
import p225Im.InterfaceC3776x;
import p477Tb.AbstractC7294a;
import p479Td.AbstractC7360k;
import p523V9.AbstractC8088f6;
import p722e8.C13298H;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13511c;
import p894n0.C17402h;
import p894n0.C17403i;
import p894n0.C17407m;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p978r1.AbstractC18857c;
import p978r1.C18855a;
import p978r1.InterfaceC18858d;

/* JADX INFO: renamed from: h0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14289j extends AbstractC21706n implements InterfaceC21697i0, InterfaceC18858d, InterfaceC13511c, InterfaceC21701k0, InterfaceC21707n0 {

    /* JADX INFO: renamed from: S0 */
    public static final C14294l0 f44839S0 = new C14294l0(2);

    /* JADX INFO: renamed from: B0 */
    public InterfaceC17406l f44840B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC14274b0 f44841C0;

    /* JADX INFO: renamed from: D0 */
    public String f44842D0;

    /* JADX INFO: renamed from: E0 */
    public C2960g f44843E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f44844F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC1426a f44845G0;

    /* JADX INFO: renamed from: I0 */
    public final C14256K f44847I0;

    /* JADX INFO: renamed from: J0 */
    public C19723A f44848J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC21704m f44849K0;

    /* JADX INFO: renamed from: L0 */
    public C17409o f44850L0;

    /* JADX INFO: renamed from: M0 */
    public C17402h f44851M0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC17406l f44854P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f44855Q0;

    /* JADX INFO: renamed from: R0 */
    public final C14294l0 f44856R0;

    /* JADX INFO: renamed from: H0 */
    public final C14252G f44846H0 = new C14252G();

    /* JADX INFO: renamed from: N0 */
    public final LinkedHashMap f44852N0 = new LinkedHashMap();

    /* JADX INFO: renamed from: O0 */
    public long f44853O0 = 0;

    public AbstractC14289j(InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z6, String str, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        this.f44840B0 = interfaceC17406l;
        this.f44841C0 = interfaceC14274b0;
        this.f44842D0 = str;
        this.f44843E0 = c2960g;
        this.f44844F0 = z6;
        this.f44845G0 = interfaceC1426a;
        this.f44847I0 = new C14256K(interfaceC17406l);
        InterfaceC17406l interfaceC17406l2 = this.f44840B0;
        this.f44854P0 = interfaceC17406l2;
        this.f44855Q0 = interfaceC17406l2 == null && this.f44841C0 != null;
        this.f44856R0 = f44839S0;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        C2960g c2960g = this.f44843E0;
        if (c2960g != null) {
            AbstractC2973t.m3812g(c2963j, c2960g.f8849a);
        }
        String str = this.f44842D0;
        C13298H c13298h = new C13298H(this, 11);
        InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
        c2963j.m3787m(AbstractC2962i.f8855b, new C2954a(str, c13298h));
        if (this.f44844F0) {
            this.f44847I0.mo424B(c2963j);
        } else {
            AbstractC2973t.m3808c(c2963j);
        }
        mo15542N0(c2963j);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        long j11 = ((j10 >> 33) << 32) | (((j10 << 32) >> 33) & 4294967295L);
        this.f44853O0 = AbstractC8088f6.m8536b((int) (j11 >> 32), (int) (j11 & 4294967295L));
        m15574Q0();
        if (this.f44844F0 && enumC19730g == EnumC19730g.f62466Z) {
            int i10 = c19729f.f62464e;
            if (AbstractC19736m.m20682d(i10, 4)) {
                AbstractC0575H.m1156D(m10935y0(), null, null, new C14283g(this, null), 3);
            } else if (AbstractC19736m.m20682d(i10, 5)) {
                AbstractC0575H.m1156D(m10935y0(), null, null, new C14285h(this, null), 3);
            }
        }
        if (this.f44848J0 == null) {
            C19723A c19723aM20693a = AbstractC19744u.m20693a(new C14287i(this, null));
            m22223K0(c19723aM20693a);
            this.f44848J0 = c19723aM20693a;
        }
        C19723A c19723a = this.f44848J0;
        if (c19723a != null) {
            c19723a.mo15560C(c19729f, enumC19730g, j10);
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        if (!this.f44855Q0) {
            m15574Q0();
        }
        if (this.f44844F0) {
            m22223K0(this.f44846H0);
            m22223K0(this.f44847I0);
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        C17402h c17402h;
        InterfaceC17406l interfaceC17406l = this.f44840B0;
        if (interfaceC17406l != null && (c17402h = this.f44851M0) != null) {
            interfaceC17406l.mo7767a(new C17403i(c17402h));
        }
        this.f44851M0 = null;
        C19723A c19723a = this.f44848J0;
        if (c19723a != null) {
            c19723a.mo15561D();
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        m15573P0();
        if (this.f44854P0 == null) {
            this.f44840B0 = null;
        }
        InterfaceC21704m interfaceC21704m = this.f44849K0;
        if (interfaceC21704m != null) {
            m22224L0(interfaceC21704m);
        }
        this.f44849K0 = null;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    /* JADX INFO: renamed from: O0 */
    public abstract Object mo15543O0(C19723A c19723a, C14287i c14287i);

    /* JADX INFO: renamed from: P0 */
    public final void m15573P0() {
        InterfaceC17406l interfaceC17406l = this.f44840B0;
        LinkedHashMap linkedHashMap = this.f44852N0;
        if (interfaceC17406l != null) {
            C17409o c17409o = this.f44850L0;
            if (c17409o != null) {
                interfaceC17406l.mo7767a(new C17408n(c17409o));
            }
            C17402h c17402h = this.f44851M0;
            if (c17402h != null) {
                interfaceC17406l.mo7767a(new C17403i(c17402h));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                interfaceC17406l.mo7767a(new C17408n((C17409o) it.next()));
            }
        }
        this.f44850L0 = null;
        this.f44851M0 = null;
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m15574Q0() {
        InterfaceC14274b0 interfaceC14274b0;
        if (this.f44849K0 == null && (interfaceC14274b0 = this.f44841C0) != null) {
            if (this.f44840B0 == null) {
                this.f44840B0 = new C17407m();
            }
            this.f44847I0.m15555N0(this.f44840B0);
            InterfaceC17406l interfaceC17406l = this.f44840B0;
            AbstractC16544l.m18091d(interfaceC17406l);
            InterfaceC21704m interfaceC21704mMo11283a = interfaceC14274b0.mo11283a(interfaceC17406l);
            m22223K0(interfaceC21704mMo11283a);
            this.f44849K0 = interfaceC21704mMo11283a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX INFO: renamed from: R0 */
    public final void m15575R0(InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z6, String str, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        boolean z10;
        boolean z11;
        InterfaceC21704m interfaceC21704m;
        boolean z12 = false;
        if (AbstractC16544l.m18089b(this.f44854P0, interfaceC17406l)) {
            z10 = false;
        } else {
            m15573P0();
            this.f44854P0 = interfaceC17406l;
            this.f44840B0 = interfaceC17406l;
            z10 = true;
        }
        if (!AbstractC16544l.m18089b(this.f44841C0, interfaceC14274b0)) {
            this.f44841C0 = interfaceC14274b0;
            z10 = true;
        }
        boolean z13 = this.f44844F0;
        C14256K c14256k = this.f44847I0;
        if (z13 != z6) {
            InterfaceC21704m interfaceC21704m2 = this.f44846H0;
            if (z6) {
                m22223K0(interfaceC21704m2);
                m22223K0(c14256k);
            } else {
                m22224L0(interfaceC21704m2);
                m22224L0(c14256k);
                m15573P0();
            }
            AbstractC21690f.m22211p(this);
            this.f44844F0 = z6;
        }
        if (!AbstractC16544l.m18089b(this.f44842D0, str)) {
            this.f44842D0 = str;
            AbstractC21690f.m22211p(this);
        }
        if (!AbstractC16544l.m18089b(this.f44843E0, c2960g)) {
            this.f44843E0 = c2960g;
            AbstractC21690f.m22211p(this);
        }
        this.f44845G0 = interfaceC1426a;
        boolean z14 = this.f44855Q0;
        InterfaceC17406l interfaceC17406l2 = this.f44854P0;
        if (z14 != (interfaceC17406l2 == null && this.f44841C0 != null)) {
            if (interfaceC17406l2 == null && this.f44841C0 != null) {
                z12 = true;
            }
            this.f44855Q0 = z12;
            z11 = (z12 || this.f44849K0 != null) ? z10 : true;
        }
        if (z11 && ((interfaceC21704m = this.f44849K0) != null || !this.f44855Q0)) {
            if (interfaceC21704m != null) {
                m22224L0(interfaceC21704m);
            }
            this.f44849K0 = null;
            m15574Q0();
        }
        c14256k.m15555N0(this.f44840B0);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: l */
    public final boolean mo15576l(KeyEvent keyEvent) {
        return false;
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final Object mo14727o() {
        return this.f44856R0;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        mo15561D();
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final boolean mo432u0() {
        return true;
    }

    @Override // p737f1.InterfaceC13511c
    /* JADX INFO: renamed from: y */
    public final void mo15025y(EnumC13525q enumC13525q) {
        if (enumC13525q.m15074a()) {
            m15574Q0();
        }
        if (this.f44844F0) {
            this.f44847I0.mo15025y(enumC13525q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: z */
    public final boolean mo15577z(KeyEvent keyEvent) {
        int iM20157d;
        C17409o c17409o;
        int iM20157d2;
        m15574Q0();
        boolean z6 = this.f44844F0;
        LinkedHashMap linkedHashMap = this.f44852N0;
        if (z6) {
            int i10 = AbstractC14317x.f44941b;
            if (AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 2) && ((iM20157d2 = (int) (AbstractC18857c.m20157d(keyEvent) >> 32)) == 23 || iM20157d2 == 66 || iM20157d2 == 160)) {
                if (linkedHashMap.containsKey(new C18855a(AbstractC7360k.m7784a(keyEvent.getKeyCode())))) {
                    return false;
                }
                C17409o c17409o2 = new C17409o(this.f44853O0);
                linkedHashMap.put(new C18855a(AbstractC7360k.m7784a(keyEvent.getKeyCode())), c17409o2);
                if (this.f44840B0 != null) {
                    AbstractC0575H.m1156D(m10935y0(), null, null, new C14279e(this, c17409o2, null), 3);
                }
            } else {
                if (this.f44844F0) {
                    return false;
                }
                int i11 = AbstractC14317x.f44941b;
                if (AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 1)) {
                    return false;
                }
                iM20157d = (int) (AbstractC18857c.m20157d(keyEvent) >> 32);
                if (iM20157d == 23 && iM20157d != 66 && iM20157d != 160) {
                    return false;
                }
                c17409o = (C17409o) linkedHashMap.remove(new C18855a(AbstractC7360k.m7784a(keyEvent.getKeyCode())));
                if (c17409o != null && this.f44840B0 != null) {
                    AbstractC0575H.m1156D(m10935y0(), null, null, new C14281f(this, c17409o, null), 3);
                }
                this.f44845G0.invoke();
            }
        } else {
            if (this.f44844F0) {
                return false;
            }
            int i12 = AbstractC14317x.f44941b;
            if (AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 1)) {
                return false;
            }
            iM20157d = (int) (AbstractC18857c.m20157d(keyEvent) >> 32);
            if (iM20157d == 23) {
            }
            c17409o = (C17409o) linkedHashMap.remove(new C18855a(AbstractC7360k.m7784a(keyEvent.getKeyCode())));
            if (c17409o != null) {
                AbstractC0575H.m1156D(m10935y0(), null, null, new C14281f(this, c17409o, null), 3);
            }
            this.f44845G0.invoke();
        }
        return true;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public void mo15542N0(C2963j c2963j) {
    }
}
