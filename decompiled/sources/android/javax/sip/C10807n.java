package android.javax.sip;

/* JADX INFO: renamed from: android.javax.sip.n */
/* JADX INFO: loaded from: classes.dex */
public class C10807n extends Exception {
    protected Throwable m_Cause;

    public C10807n() {
        this.m_Cause = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.m_Cause;
    }

    public C10807n(String str) {
        super(str);
        this.m_Cause = null;
    }

    public C10807n(String str, Throwable th2) {
        super(str);
        this.m_Cause = th2;
    }
}
