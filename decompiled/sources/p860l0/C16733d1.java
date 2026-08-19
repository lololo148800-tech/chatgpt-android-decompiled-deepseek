package p860l0;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p1001s1.C19434d;
import p1001s1.C19437g;
import p1013t0.C19721i;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.EnumC19730g;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21701k0;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p225Im.InterfaceC3776x;
import p477Tb.AbstractC7294a;
import p479Td.AbstractC7360k;
import p482Tg.C7443a0;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p588Y2.C9642z;
import p722e8.C13298H;
import p737f1.C13526r;
import p737f1.InterfaceC13517i;
import p737f1.InterfaceC13520l;
import p758g0.C13796x;
import p759g1.C13800b;
import p773h0.C14259N;
import p773h0.EnumC14284g0;
import p773h0.InterfaceC14300o0;
import p858ko.C16482A;
import p894n0.InterfaceC17406l;
import p978r1.AbstractC18857c;
import p978r1.C18855a;
import p978r1.InterfaceC18858d;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: l0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16733d1 extends AbstractC16777s0 implements InterfaceC21681a0, InterfaceC13520l, InterfaceC18858d, InterfaceC21701k0 {

    /* JADX INFO: renamed from: J0 */
    public InterfaceC14300o0 f53645J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC16661B0 f53646K0;

    /* JADX INFO: renamed from: L0 */
    public final C19434d f53647L0;

    /* JADX INFO: renamed from: M0 */
    public final C16697N0 f53648M0;

    /* JADX INFO: renamed from: N0 */
    public final C16684J f53649N0;

    /* JADX INFO: renamed from: O0 */
    public final C16757l1 f53650O0;

    /* JADX INFO: renamed from: P0 */
    public final C16711U0 f53651P0;

    /* JADX INFO: renamed from: Q0 */
    public final C16672F f53652Q0;

    /* JADX INFO: renamed from: R0 */
    public C16785v f53653R0;

    /* JADX INFO: renamed from: S0 */
    public C7443a0 f53654S0;

    /* JADX INFO: renamed from: T0 */
    public C16730c1 f53655T0;

    public C16733d1(InterfaceC14300o0 interfaceC14300o0, InterfaceC16794y interfaceC16794y, InterfaceC16661B0 interfaceC16661B0, EnumC16673F0 enumC16673F0, InterfaceC16736e1 interfaceC16736e1, InterfaceC17406l interfaceC17406l, boolean z6, boolean z10) {
        super(C16725b.f53602u0, z6, interfaceC17406l, enumC16673F0);
        this.f53645J0 = interfaceC14300o0;
        this.f53646K0 = interfaceC16661B0;
        C19434d c19434d = new C19434d();
        this.f53647L0 = c19434d;
        C16697N0 c16697n0 = new C16697N0();
        c16697n0.f53506z0 = z6;
        m22223K0(c16697n0);
        this.f53648M0 = c16697n0;
        C16684J c16684j = new C16684J(new C13796x(new C9642z(AbstractC10840a.f32470c)));
        this.f53649N0 = c16684j;
        InterfaceC14300o0 interfaceC14300o1 = this.f53645J0;
        InterfaceC16661B0 interfaceC16661B1 = this.f53646K0;
        C16757l1 c16757l1 = new C16757l1(interfaceC16736e1, interfaceC14300o1, interfaceC16661B1 == null ? c16684j : interfaceC16661B1, enumC16673F0, z10, c19434d);
        this.f53650O0 = c16757l1;
        C16711U0 c16711u0 = new C16711U0(c16757l1, z6);
        this.f53651P0 = c16711u0;
        C16672F c16672f = new C16672F(enumC16673F0, c16757l1, z10, interfaceC16794y);
        m22223K0(c16672f);
        this.f53652Q0 = c16672f;
        m22223K0(new C19437g(c16711u0, c19434d));
        m22223K0(new C13526r());
        C19721i c19721i = new C19721i();
        c19721i.f62434z0 = c16672f;
        m22223K0(c19721i);
        C16482A c16482a = new C16482A(this, 4);
        C14259N c14259n = new C14259N();
        c14259n.f44749z0 = c16482a;
        m22223K0(c14259n);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        if (this.f53841D0 && (this.f53654S0 == null || this.f53655T0 == null)) {
            this.f53654S0 = new C7443a0(this, 16);
            this.f53655T0 = new C16730c1(this, null);
        }
        C7443a0 c7443a0 = this.f53654S0;
        if (c7443a0 != null) {
            InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
            c2963j.m3787m(AbstractC2962i.f8857d, new C2954a(null, c7443a0));
        }
        C16730c1 c16730c1 = this.f53655T0;
        if (c16730c1 != null) {
            InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
            c2963j.m3787m(AbstractC2962i.f8858e, c16730c1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // p860l0.AbstractC16777s0, p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        long j11;
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) this.f53840C0.invoke((C19738o) r6.get(i10))).booleanValue()) {
                super.mo15560C(c19729f, enumC19730g, j10);
                break;
            }
        }
        if (enumC19730g == EnumC19730g.f62466Z && AbstractC19736m.m20682d(c19729f.f62464e, 6)) {
            ?? r10 = c19729f.f62460a;
            int size2 = r10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((C19738o) r10.get(i11)).m20692b()) {
                    return;
                }
            }
            AbstractC16544l.m18091d(this.f53653R0);
            InterfaceC7537b interfaceC7537b = AbstractC21690f.m22217v(this).f68633D0;
            C13800b c13800b = new C13800b(0L);
            int size3 = r10.size();
            int i12 = 0;
            while (true) {
                j11 = c13800b.f43584a;
                if (i12 >= size3) {
                    break;
                }
                c13800b = new C13800b(C13800b.m15311l(j11, ((C19738o) r10.get(i12)).f62487j));
                i12++;
            }
            AbstractC0575H.m1156D(m10935y0(), null, null, new C16724a1(this, C13800b.m15312m(-interfaceC7537b.mo7864b0(64), j11), null), 3);
            int size4 = r10.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ((C19738o) r10.get(i13)).m20691a();
            }
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC21690f.m22214s(this, new C13298H(this, 27));
        this.f53653R0 = C16785v.f53880a;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    @Override // p860l0.AbstractC16777s0
    /* JADX INFO: renamed from: R0 */
    public final Object mo18513R0(C16771q0 c16771q0, C16774r0 c16774r0) {
        EnumC14284g0 enumC14284g0 = EnumC14284g0.f44822Z;
        C16757l1 c16757l1 = this.f53650O0;
        Object objM18535e = c16757l1.m18535e(enumC14284g0, new C16713V0(c16771q0, c16757l1, null), c16774r0);
        return objM18535e == EnumC19250a.f61036Y ? objM18535e : C17296C.f55119a;
    }

    @Override // p860l0.AbstractC16777s0
    /* JADX INFO: renamed from: T0 */
    public final void mo18515T0(long j10) {
        AbstractC0575H.m1156D(this.f53647L0.m20514c(), null, null, new C16715W0(this, j10, null), 3);
    }

    @Override // p860l0.AbstractC16777s0
    /* JADX INFO: renamed from: U0 */
    public final boolean mo18516U0() {
        C16757l1 c16757l1 = this.f53650O0;
        if (!c16757l1.f53757a.mo5255a()) {
            InterfaceC14300o0 interfaceC14300o0 = c16757l1.f53758b;
            if (!(interfaceC14300o0 != null ? interfaceC14300o0.mo15580c() : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // p737f1.InterfaceC13520l
    /* JADX INFO: renamed from: g0 */
    public final void mo9604g0(InterfaceC13517i interfaceC13517i) {
        interfaceC13517i.mo15070c(false);
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        AbstractC21690f.m22214s(this, new C13298H(this, 27));
    }

    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: l */
    public final boolean mo15576l(KeyEvent keyEvent) {
        return false;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }

    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: z */
    public final boolean mo15577z(KeyEvent keyEvent) {
        long jM8536b;
        if (!this.f53841D0) {
            return false;
        }
        if ((!C18855a.m20153a(AbstractC18857c.m20157d(keyEvent), C18855a.f60075n) && !C18855a.m20153a(AbstractC7360k.m7784a(keyEvent.getKeyCode()), C18855a.f60074m)) || !AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z6 = this.f53650O0.f53760d == EnumC16673F0.f53401Y;
        C16672F c16672f = this.f53652Q0;
        if (z6) {
            int i10 = (int) (c16672f.f53398H0 & 4294967295L);
            jM8536b = AbstractC8088f6.m8536b(0.0f, C18855a.m20153a(AbstractC7360k.m7784a(keyEvent.getKeyCode()), C18855a.f60074m) ? i10 : -i10);
        } else {
            int i11 = (int) (c16672f.f53398H0 >> 32);
            jM8536b = AbstractC8088f6.m8536b(C18855a.m20153a(AbstractC7360k.m7784a(keyEvent.getKeyCode()), C18855a.f60074m) ? i11 : -i11, 0.0f);
        }
        AbstractC0575H.m1156D(m10935y0(), null, null, new C16719Y0(this, jM8536b, null), 3);
        return true;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }

    @Override // p860l0.AbstractC16777s0
    /* JADX INFO: renamed from: S0 */
    public final void mo18514S0(long j10) {
    }
}
