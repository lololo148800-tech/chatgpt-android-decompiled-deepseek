package p178H;

import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: H.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3146g0 {

    /* JADX INFO: renamed from: d */
    public static final C3146g0 f9465d = new C3146g0(0, false, false);

    /* JADX INFO: renamed from: e */
    public static final C3146g0 f9466e = new C3146g0(500, true, false);

    /* JADX INFO: renamed from: f */
    public static final C3146g0 f9467f;

    /* JADX INFO: renamed from: a */
    public final long f9468a;

    /* JADX INFO: renamed from: b */
    public final boolean f9469b;

    /* JADX INFO: renamed from: c */
    public final boolean f9470c;

    static {
        new C3146g0(100L, true, false);
        f9467f = new C3146g0(0L, false, true);
    }

    public C3146g0(long j10, boolean z6, boolean z10) {
        this.f9469b = z6;
        this.f9468a = j10;
        if (z10) {
            AbstractC4941g.m5554M("shouldRetry must be false when completeWithoutFailure is set to true", !z6);
        }
        this.f9470c = z10;
    }
}
