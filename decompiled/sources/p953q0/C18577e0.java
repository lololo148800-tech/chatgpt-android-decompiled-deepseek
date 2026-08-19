package p953q0;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0254h0;
import p1140z1.InterfaceC21701k0;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2955b;
import p156G1.C2961h;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3771s;
import p225Im.InterfaceC3776x;
import p635a1.AbstractC10458p;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: q0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18577e0 extends AbstractC10458p implements InterfaceC21701k0 {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC18569a0 f59171A0;

    /* JADX INFO: renamed from: B0 */
    public EnumC16673F0 f59172B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f59173C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f59174D0;

    /* JADX INFO: renamed from: E0 */
    public C2961h f59175E0;

    /* JADX INFO: renamed from: F0 */
    public final C18573c0 f59176F0 = new C18573c0(this, 0);

    /* JADX INFO: renamed from: G0 */
    public C18573c0 f59177G0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC3771s f59178z0;

    public C18577e0(InterfaceC3771s interfaceC3771s, InterfaceC18569a0 interfaceC18569a0, EnumC16673F0 enumC16673F0, boolean z6, boolean z10) {
        this.f59178z0 = interfaceC3771s;
        this.f59171A0 = interfaceC18569a0;
        this.f59172B0 = enumC16673F0;
        this.f59173C0 = z6;
        this.f59174D0 = z10;
        m19945K0();
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        AbstractC2973t.m3813h(c2963j);
        c2963j.m3787m(C2971r.f8912E, this.f59176F0);
        if (this.f59172B0 == EnumC16673F0.f53401Y) {
            C2961h c2961h = this.f59175E0;
            if (c2961h == null) {
                AbstractC16544l.m18103p("scrollAxisRange");
                throw null;
            }
            C2974u c2974u = C2971r.f8930p;
            InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[11];
            c2974u.m3814a(c2963j, c2961h);
        } else {
            C2961h c2961h2 = this.f59175E0;
            if (c2961h2 == null) {
                AbstractC16544l.m18103p("scrollAxisRange");
                throw null;
            }
            C2974u c2974u2 = C2971r.f8929o;
            InterfaceC3776x interfaceC3776x2 = AbstractC2973t.f8942a[10];
            c2974u2.m3814a(c2963j, c2961h2);
        }
        C18573c0 c18573c0 = this.f59177G0;
        if (c18573c0 != null) {
            c2963j.m3787m(AbstractC2962i.f8859f, new C2954a(null, c18573c0));
        }
        c2963j.m3787m(AbstractC2962i.f8853A, new C2954a(null, new C0254h0(new C18571b0(this, 0), 19)));
        C2955b c2955bMo19795f = this.f59171A0.mo19795f();
        C2974u c2974u3 = C2971r.f8920f;
        InterfaceC3776x interfaceC3776x3 = AbstractC2973t.f8942a[20];
        c2974u3.m3814a(c2963j, c2955bMo19795f);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m19945K0() {
        this.f59175E0 = new C2961h(new C18571b0(this, 1), this.f59174D0, new C18571b0(this, 2));
        this.f59177G0 = this.f59173C0 ? new C18573c0(this, 1) : null;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
