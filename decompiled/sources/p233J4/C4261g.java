package p233J4;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC16544l;
import p207I4.InterfaceC3618e;

/* JADX INFO: renamed from: J4.g */
/* JADX INFO: loaded from: classes.dex */
public class C4261g implements InterfaceC3618e {

    /* JADX INFO: renamed from: Y */
    public final SQLiteProgram f13924Y;

    public C4261g(SQLiteProgram delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f13924Y = delegate;
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: I */
    public final void mo3419I(int i10, double d10) {
        this.f13924Y.bindDouble(i10, d10);
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: V */
    public final void mo3420V(int i10, long j10) {
        this.f13924Y.bindLong(i10, j10);
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: Y */
    public final void mo3421Y(int i10, byte[] bArr) {
        this.f13924Y.bindBlob(i10, bArr);
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: c */
    public final void mo3422c(int i10, String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f13924Y.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13924Y.close();
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: s0 */
    public final void mo3426s0(int i10) {
        this.f13924Y.bindNull(i10);
    }
}
