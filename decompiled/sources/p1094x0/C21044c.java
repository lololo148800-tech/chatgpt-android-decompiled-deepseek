package p1094x0;

import p049Bm.InterfaceC1426a;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1014t1.C19729f;
import p1014t1.EnumC19730g;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21697i0;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13511c;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: loaded from: classes.dex */
public class C21044c extends AbstractC21706n implements InterfaceC21697i0, InterfaceC13511c {

    /* JADX INFO: renamed from: B0 */
    public InterfaceC1426a f66930B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f66931C0;

    /* JADX INFO: renamed from: D0 */
    public final C19723A f66932D0;

    public C21044c(InterfaceC1426a interfaceC1426a) {
        this.f66930B0 = interfaceC1426a;
        C19723A c19723aM20693a = AbstractC19744u.m20693a(new C21043b(this, null));
        m22223K0(c19723aM20693a);
        this.f66932D0 = c19723aM20693a;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        this.f66932D0.mo15560C(c19729f, enumC19730g, j10);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        this.f66932D0.mo15561D();
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        mo15561D();
    }

    @Override // p737f1.InterfaceC13511c
    /* JADX INFO: renamed from: y */
    public final void mo15025y(EnumC13525q enumC13525q) {
        this.f66931C0 = enumC13525q.m15074a();
    }
}
