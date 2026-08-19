package p501Ub;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: renamed from: Ub.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7609k extends PhantomReference {

    /* JADX INFO: renamed from: a */
    public final Set f24054a;

    /* JADX INFO: renamed from: b */
    public final RunnableC7608j f24055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7609k(C7599a c7599a, ReferenceQueue referenceQueue, Set set) {
        super(c7599a, referenceQueue);
        RunnableC7608j runnableC7608j = RunnableC7608j.f24053Y;
        this.f24054a = set;
        this.f24055b = runnableC7608j;
    }
}
