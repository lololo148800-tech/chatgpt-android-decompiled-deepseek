package p999s;

import p976r.InterfaceC18800B;

/* JADX INFO: renamed from: s.E */
/* JADX INFO: loaded from: classes.dex */
public final class C19290E extends AbstractViewOnTouchListenerC19375r0 {

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C19300J f61128v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C19306M f61129w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19290E(C19306M c19306m, C19306M c19306m2, C19300J c19300j) {
        super(c19306m2);
        this.f61129w0 = c19306m;
        this.f61128v0 = c19300j;
    }

    @Override // p999s.AbstractViewOnTouchListenerC19375r0
    /* JADX INFO: renamed from: b */
    public final InterfaceC18800B mo20109b() {
        return this.f61128v0;
    }

    @Override // p999s.AbstractViewOnTouchListenerC19375r0
    /* JADX INFO: renamed from: c */
    public final boolean mo20110c() {
        C19306M c19306m = this.f61129w0;
        if (c19306m.getInternalPopup().mo20364a()) {
            return true;
        }
        c19306m.f61175t0.mo20373l(c19306m.getTextDirection(), c19306m.getTextAlignment());
        return true;
    }
}
