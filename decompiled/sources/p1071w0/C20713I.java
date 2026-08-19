package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p1013t0.C19715c;
import p350O1.C6045C;
import p350O1.C6046D;
import p350O1.C6065n;
import p350O1.InterfaceC6073v;
import p737f1.EnumC13525q;

/* JADX INFO: renamed from: w0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C20713I extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20750g0 f65662Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f65663Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f65664o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6046D f65665p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6045C f65666q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6065n f65667r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC6073v f65668s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C1837w0 f65669t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC0571F f65670u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C19715c f65671v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20713I(C20750g0 c20750g0, boolean z6, boolean z10, C6046D c6046d, C6045C c6045c, C6065n c6065n, InterfaceC6073v interfaceC6073v, C1837w0 c1837w0, InterfaceC0571F interfaceC0571F, C19715c c19715c) {
        super(1);
        this.f65662Y = c20750g0;
        this.f65663Z = z6;
        this.f65664o0 = z10;
        this.f65665p0 = c6046d;
        this.f65666q0 = c6045c;
        this.f65667r0 = c6065n;
        this.f65668s0 = interfaceC6073v;
        this.f65669t0 = c1837w0;
        this.f65670u0 = interfaceC0571F;
        this.f65671v0 = c19715c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20710G0 c20710g0M21294d;
        EnumC13525q enumC13525q = (EnumC13525q) obj;
        C20750g0 c20750g0 = this.f65662Y;
        if (c20750g0.m21292b() != enumC13525q.m15074a()) {
            c20750g0.f65815f.setValue(Boolean.valueOf(enumC13525q.m15074a()));
            boolean zM21292b = c20750g0.m21292b();
            InterfaceC6073v interfaceC6073v = this.f65668s0;
            if (zM21292b && this.f65663Z && !this.f65664o0) {
                AbstractC20740b0.m21274o(this.f65665p0, c20750g0, this.f65666q0, this.f65667r0, interfaceC6073v);
            } else {
                AbstractC20740b0.m21270k(c20750g0);
            }
            if (enumC13525q.m15074a() && (c20710g0M21294d = c20750g0.m21294d()) != null) {
                AbstractC0575H.m1156D(this.f65670u0, null, null, new C20711H(this.f65671v0, this.f65666q0, c20750g0, c20710g0M21294d, interfaceC6073v, null), 3);
            }
            if (!enumC13525q.m15074a()) {
                this.f65669t0.m2681e(null);
            }
        }
        return C17296C.f55119a;
    }
}
