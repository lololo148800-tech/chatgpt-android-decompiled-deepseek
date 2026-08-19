package p586Y0;

import kotlin.jvm.internal.AbstractC16544l;
import p415R0.InterfaceC6786d;

/* JADX INFO: renamed from: Y0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9568t extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public InterfaceC6786d f28777c;

    /* JADX INFO: renamed from: d */
    public int f28778d;

    public C9568t(InterfaceC6786d interfaceC6786d) {
        this.f28777c = interfaceC6786d;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C9568t c9568t = (C9568t) abstractC9544C;
        synchronized (AbstractC9567s.f28776b) {
            this.f28777c = c9568t.f28777c;
            this.f28778d = c9568t.f28778d;
        }
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C9568t(this.f28777c);
    }
}
