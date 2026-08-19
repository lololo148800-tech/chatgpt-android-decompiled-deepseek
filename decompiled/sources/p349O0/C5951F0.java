package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9544C;

/* JADX INFO: renamed from: O0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5951F0 extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public float f19389c;

    public C5951F0(float f10) {
        this.f19389c = f10;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f19389c = ((C5951F0) abstractC9544C).f19389c;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C5951F0(this.f19389c);
    }
}
