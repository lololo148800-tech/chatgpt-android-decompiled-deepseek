package p586Y0;

import kotlin.jvm.internal.AbstractC16544l;
import p440S0.AbstractC6977c;

/* JADX INFO: renamed from: Y0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9565q extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public AbstractC6977c f28771c;

    /* JADX INFO: renamed from: d */
    public int f28772d;

    /* JADX INFO: renamed from: e */
    public int f28773e;

    public C9565q(AbstractC6977c abstractC6977c) {
        this.f28771c = abstractC6977c;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        synchronized (AbstractC9567s.f28775a) {
            AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f28771c = ((C9565q) abstractC9544C).f28771c;
            this.f28772d = ((C9565q) abstractC9544C).f28772d;
            this.f28773e = ((C9565q) abstractC9544C).f28773e;
        }
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C9565q(this.f28771c);
    }
}
