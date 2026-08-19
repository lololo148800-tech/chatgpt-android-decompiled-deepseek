package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public final class C11065A extends AbstractC11066B implements InterfaceC11110s {

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC11112u f33350q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC11067C f33351r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11065A(AbstractC11067C abstractC11067C, InterfaceC11112u interfaceC11112u, InterfaceC11070F interfaceC11070F) {
        super(abstractC11067C, interfaceC11070F);
        this.f33351r0 = abstractC11067C;
        this.f33350q0 = interfaceC11112u;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        InterfaceC11112u interfaceC11112u2 = this.f33350q0;
        EnumC11104m enumC11104mMo7807b = interfaceC11112u2.mo7809i().mo7807b();
        if (enumC11104mMo7807b == EnumC11104m.f33474Y) {
            this.f33351r0.mo12121i(this.f33354Y);
            return;
        }
        EnumC11104m enumC11104m = null;
        while (enumC11104m != enumC11104mMo7807b) {
            m12115a(mo12112d());
            enumC11104m = enumC11104mMo7807b;
            enumC11104mMo7807b = interfaceC11112u2.mo7809i().mo7807b();
        }
    }

    @Override // androidx.lifecycle.AbstractC11066B
    /* JADX INFO: renamed from: b */
    public final void mo12110b() {
        this.f33350q0.mo7809i().mo7808c(this);
    }

    @Override // androidx.lifecycle.AbstractC11066B
    /* JADX INFO: renamed from: c */
    public final boolean mo12111c(InterfaceC11112u interfaceC11112u) {
        return this.f33350q0 == interfaceC11112u;
    }

    @Override // androidx.lifecycle.AbstractC11066B
    /* JADX INFO: renamed from: d */
    public final boolean mo12112d() {
        return this.f33350q0.mo7809i().mo7807b().compareTo(EnumC11104m.f33477p0) >= 0;
    }
}
