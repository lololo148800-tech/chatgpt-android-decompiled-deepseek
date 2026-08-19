package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p544W9.AbstractC8676n;
import p737f1.C13522n;
import p759g1.C13800b;

/* JADX INFO: renamed from: w0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C20715J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20750g0 f65674Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13522n f65675Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f65676o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f65677p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C1837w0 f65678q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC6073v f65679r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20715J(C20750g0 c20750g0, C13522n c13522n, boolean z6, boolean z10, C1837w0 c1837w0, InterfaceC6073v interfaceC6073v) {
        super(1);
        this.f65674Y = c20750g0;
        this.f65675Z = c13522n;
        this.f65676o0 = z6;
        this.f65677p0 = z10;
        this.f65678q0 = c1837w0;
        this.f65679r0 = interfaceC6073v;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC0300w1 interfaceC0300w1;
        long j10 = ((C13800b) obj).f43584a;
        C20750g0 c20750g0 = this.f65674Y;
        if (!c20750g0.m21292b()) {
            this.f65675Z.m15073b();
        } else if (!this.f65676o0 && (interfaceC0300w1 = c20750g0.f65812c) != null) {
            ((C0190N0) interfaceC0300w1).m572b();
        }
        if (c20750g0.m21292b() && this.f65677p0) {
            if (c20750g0.m21291a() != EnumC20730T.f65729Z) {
                C20710G0 c20710g0M21294d = c20750g0.m21294d();
                if (c20710g0M21294d != null) {
                    int iMo1765a = this.f65679r0.mo1765a(c20710g0M21294d.m21216b(j10, true));
                    c20750g0.f65829t.invoke(C6045C.m6612a((C6045C) c20750g0.f65813d.f46724Y, null, AbstractC8676n.m9365b(iMo1765a, iMo1765a), 5));
                    if (c20750g0.f65810a.f65943a.f10934Y.length() > 0) {
                        c20750g0.f65820k.setValue(EnumC20730T.f65730o0);
                    }
                }
            } else {
                this.f65678q0.m2681e(new C13800b(j10));
            }
        }
        return C17296C.f55119a;
    }
}
