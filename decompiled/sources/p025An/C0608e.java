package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: An.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0608e {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1850b = AtomicIntegerFieldUpdater.newUpdater(C0608e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final InterfaceC0581K[] f1851a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0608e(InterfaceC0581K[] interfaceC0581KArr) {
        this.f1851a = interfaceC0581KArr;
        this.notCompletedCount$volatile = interfaceC0581KArr.length;
    }
}
