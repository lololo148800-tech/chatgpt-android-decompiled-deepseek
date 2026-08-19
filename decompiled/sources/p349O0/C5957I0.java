package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9544C;

/* JADX INFO: renamed from: O0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5957I0 extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public Object f19401c;

    public C5957I0(Object obj) {
        this.f19401c = obj;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f19401c = ((C5957I0) abstractC9544C).f19401c;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C5957I0(this.f19401c);
    }
}
