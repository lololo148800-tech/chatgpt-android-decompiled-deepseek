package p233J4;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p031B3.AbstractC0797a;
import p197Hj.C3457c;
import p207I4.InterfaceC3617d;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: J4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4260f implements InterfaceC3617d {

    /* JADX INFO: renamed from: Y */
    public final Context f13917Y;

    /* JADX INFO: renamed from: Z */
    public final String f13918Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC0797a f13919o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f13920p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f13921q0;

    /* JADX INFO: renamed from: r0 */
    public final C17314q f13922r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f13923s0;

    public C4260f(Context context, String str, AbstractC0797a callback, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(callback, "callback");
        this.f13917Y = context;
        this.f13918Z = str;
        this.f13919o0 = callback;
        this.f13920p0 = z6;
        this.f13921q0 = z10;
        this.f13922r0 = AbstractC9227W.m9800c(new C3457c(this, 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C17314q c17314q = this.f13922r0;
        if (c17314q.isInitialized()) {
            ((C4259e) c17314q.getValue()).close();
        }
    }

    @Override // p207I4.InterfaceC3617d
    /* JADX INFO: renamed from: d0 */
    public final C4256b mo4328d0() {
        return ((C4259e) this.f13922r0.getValue()).m5029a(true);
    }

    @Override // p207I4.InterfaceC3617d
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        C17314q c17314q = this.f13922r0;
        if (c17314q.isInitialized()) {
            C4259e sQLiteOpenHelper = (C4259e) c17314q.getValue();
            AbstractC16544l.m18094g(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z6);
        }
        this.f13923s0 = z6;
    }
}
