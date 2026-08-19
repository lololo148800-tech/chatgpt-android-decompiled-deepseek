package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: An.v */
/* JADX INFO: loaded from: classes2.dex */
public class C0642v {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1899b = AtomicIntegerFieldUpdater.newUpdater(C0642v.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f1900a;

    public C0642v(Throwable th2, boolean z6) {
        this.f1900a = th2;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1900a + ']';
    }
}
