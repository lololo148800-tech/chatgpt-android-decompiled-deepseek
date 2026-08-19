package p201Hn;

/* JADX INFO: renamed from: Hn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3516e extends AbstractC3519h {

    /* JADX INFO: renamed from: o0 */
    public static final C3516e f10635o0;

    static {
        int i10 = AbstractC3522k.f10643c;
        int i11 = AbstractC3522k.f10644d;
        long j10 = AbstractC3522k.f10645e;
        String str = AbstractC3522k.f10641a;
        C3516e c3516e = new C3516e();
        c3516e.f10637Z = new ExecutorC3514c(j10, str, i10, i11);
        f10635o0 = c3516e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return "Dispatchers.Default";
    }
}
