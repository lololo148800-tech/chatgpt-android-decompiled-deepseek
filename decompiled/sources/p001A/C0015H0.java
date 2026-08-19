package p001A;

import android.util.Range;
import java.util.Set;
import java.util.UUID;
import p003A1.AbstractC0168G;
import p178H.C3175v;
import p228J.AbstractC3794B0;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3865u0;
import p228J.EnumC3803G;
import p228J.EnumC3804G0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3816S;
import p326N.InterfaceC5569k;

/* JADX INFO: renamed from: A.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015H0 implements InterfaceC3800E0 {

    /* JADX INFO: renamed from: Y */
    public final C3825a0 f57Y;

    public C0015H0() {
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        c3825a0M4558d.m4561x(InterfaceC3800E0.f11498x, new C0065h0());
        c3825a0M4558d.m4561x(InterfaceC3816S.f11560j, 34);
        c3825a0M4558d.m4561x(InterfaceC5569k.f18065a0, C0017I0.class);
        c3825a0M4558d.m4561x(InterfaceC5569k.f18064W, C0017I0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.f57Y = c3825a0M4558d;
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: D */
    public final EnumC3804G0 mo31D() {
        return EnumC3804G0.f11512r0;
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int mo32E() {
        return AbstractC3794B0.m4481f(this);
    }

    @Override // p326N.InterfaceC5569k
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String mo33F() {
        return AbstractC3794B0.m4479d(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public final Set mo34H(C3828c c3828c) {
        return this.f57Y.mo34H(c3828c);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int mo35K() {
        return AbstractC3794B0.m4477b(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object mo36M(C3828c c3828c, Object obj) {
        return AbstractC0168G.m520i(this, c3828c, obj);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean mo37O(C3828c c3828c) {
        return AbstractC0168G.m512a(this, c3828c);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ boolean mo38Q() {
        return AbstractC3794B0.m4483h(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public final Object mo39b(C3828c c3828c) {
        return this.f57Y.mo39b(c3828c);
    }

    @Override // p228J.InterfaceC3816S
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3175v mo40c() {
        return AbstractC0168G.m514c(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public final void mo41e(C0100z c0100z) {
        this.f57Y.mo41e(c0100z);
    }

    @Override // p228J.InterfaceC3849m0
    public final InterfaceC3805H getConfig() {
        return this.f57Y;
    }

    @Override // p228J.InterfaceC3816S
    public final int getInputFormat() {
        return ((Integer) mo39b(InterfaceC3816S.f11560j)).intValue();
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public final EnumC3803G mo42h(C3828c c3828c) {
        return this.f57Y.mo42h(c3828c);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: i */
    public final Range mo43i() {
        return (Range) mo36M(InterfaceC3800E0.f11490A, null);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public final Set mo44k() {
        return this.f57Y.mo44k();
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: l */
    public final C3865u0 mo45l() {
        return (C3865u0) mo39b(InterfaceC3800E0.f11496v);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int mo46m() {
        return AbstractC3794B0.m4478c(this);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: n */
    public final C0065h0 mo47n() {
        return (C0065h0) mo36M(InterfaceC3800E0.f11498x, null);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean mo48p() {
        return AbstractC3794B0.m4482g(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: q */
    public final Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        return this.f57Y.mo49q(c3828c, enumC3803G);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: u */
    public final C3865u0 mo50u() {
        return (C3865u0) mo36M(InterfaceC3800E0.f11496v, null);
    }

    @Override // p326N.InterfaceC5569k
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String mo51v(String str) {
        return AbstractC3794B0.m4480e(this, str);
    }
}
