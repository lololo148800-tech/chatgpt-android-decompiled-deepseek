package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9544C;

/* JADX INFO: renamed from: O0.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5955H0 extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public long f19395c;

    public C5955H0(long j10) {
        this.f19395c = j10;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f19395c = ((C5955H0) abstractC9544C).f19395c;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C5955H0(this.f19395c);
    }
}
