package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9544C;

/* JADX INFO: renamed from: O0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5949E0 extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public double f19388c;

    public C5949E0(double d10) {
        this.f19388c = d10;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f19388c = ((C5949E0) abstractC9544C).f19388c;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C5949E0(this.f19388c);
    }
}
