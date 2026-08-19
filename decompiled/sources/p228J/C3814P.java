package p228J;

import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p001A.C0065h0;
import p001A.C0100z;
import p003A1.AbstractC0168G;
import p178H.C3175v;
import p178H.InterfaceC3109B;
import p178H.InterfaceC3111D;
import p178H.InterfaceC3128V;
import p326N.InterfaceC5570l;
import p490U.C7531b;

/* JADX INFO: renamed from: J.P */
/* JADX INFO: loaded from: classes.dex */
public final class C3814P implements InterfaceC3800E0, InterfaceC3818U, InterfaceC5570l {

    /* JADX INFO: renamed from: Z */
    public static final C3828c f11541Z = new C3828c("camerax.core.imageAnalysis.backpressureStrategy", InterfaceC3109B.class, null);

    /* JADX INFO: renamed from: o0 */
    public static final C3828c f11542o0 = new C3828c("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);

    /* JADX INFO: renamed from: p0 */
    public static final C3828c f11543p0 = new C3828c("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC3128V.class, null);

    /* JADX INFO: renamed from: q0 */
    public static final C3828c f11544q0 = new C3828c("camerax.core.imageAnalysis.outputImageFormat", InterfaceC3111D.class, null);

    /* JADX INFO: renamed from: r0 */
    public static final C3828c f11545r0 = new C3828c("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: s0 */
    public static final C3828c f11546s0 = new C3828c("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: Y */
    public final C3835f0 f11547Y;

    public C3814P(C3835f0 c3835f0) {
        this.f11547Y = c3835f0;
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ int mo4541B() {
        return AbstractC3817T.m4556d(this);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: C */
    public final Size mo4542C() {
        int i10 = AbstractC3817T.f11562a;
        return (Size) mo36M(InterfaceC3818U.f11567p, null);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: D */
    public final /* synthetic */ EnumC3804G0 mo31D() {
        return AbstractC3794B0.m4476a(this);
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

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: G */
    public final boolean mo4543G() {
        int i10 = AbstractC3817T.f11562a;
        return mo37O(InterfaceC3818U.f11563l);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Set mo34H(C3828c c3828c) {
        return AbstractC0168G.m516e(this, c3828c);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: I */
    public final int mo4544I() {
        int i10 = AbstractC3817T.f11562a;
        return ((Integer) mo39b(InterfaceC3818U.f11563l)).intValue();
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

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: P */
    public final Size mo4545P() {
        int i10 = AbstractC3817T.f11562a;
        return (Size) mo36M(InterfaceC3818U.f11569r, null);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ boolean mo38Q() {
        return AbstractC3794B0.m4483h(this);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ int mo4546S() {
        return AbstractC3817T.m4553a(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo39b(C3828c c3828c) {
        return AbstractC0168G.m519h(this, c3828c);
    }

    @Override // p228J.InterfaceC3816S
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3175v mo40c() {
        return AbstractC0168G.m514c(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo41e(C0100z c0100z) {
        AbstractC0168G.m513b(this, c0100z);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: f */
    public final List mo4547f() {
        int i10 = AbstractC3817T.f11562a;
        return (List) mo36M(InterfaceC3818U.f11570s, null);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: g */
    public final C7531b mo4548g() {
        int i10 = AbstractC3817T.f11562a;
        return (C7531b) mo39b(InterfaceC3818U.f11571t);
    }

    @Override // p228J.InterfaceC3849m0
    public final InterfaceC3805H getConfig() {
        return this.f11547Y;
    }

    @Override // p228J.InterfaceC3816S
    public final int getInputFormat() {
        return 35;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ EnumC3803G mo42h(C3828c c3828c) {
        return AbstractC0168G.m515d(this, c3828c);
    }

    @Override // p228J.InterfaceC3800E0
    /* JADX INFO: renamed from: i */
    public final Range mo43i() {
        return (Range) mo36M(InterfaceC3800E0.f11490A, null);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int mo4549j() {
        return AbstractC3817T.m4555c(this);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set mo44k() {
        return AbstractC0168G.m517f(this);
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
    public final /* synthetic */ Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        return AbstractC0168G.m521j(this, c3828c, enumC3803G);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ ArrayList mo4550r() {
        return AbstractC3817T.m4554b(this);
    }

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: s */
    public final C7531b mo4551s() {
        int i10 = AbstractC3817T.f11562a;
        return (C7531b) mo36M(InterfaceC3818U.f11571t, null);
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

    @Override // p228J.InterfaceC3818U
    /* JADX INFO: renamed from: w */
    public final Size mo4552w() {
        int i10 = AbstractC3817T.f11562a;
        return (Size) mo36M(InterfaceC3818U.f11568q, null);
    }
}
