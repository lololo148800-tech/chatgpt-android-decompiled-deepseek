package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Wk.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8919d0 extends IllegalStateException {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f27290Y = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8919d0(String taskName, Throwable th2) {
        super("Concurrent " + taskName + " attempts", th2);
        AbstractC16544l.m18094g(taskName, "taskName");
    }
}
