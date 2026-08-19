package p025An;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: An.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0629o0 extends CancellationException implements InterfaceC0648y {

    /* JADX INFO: renamed from: Y */
    public final transient C0641u0 f1879Y;

    public C0629o0(String str, Throwable th2, C0641u0 c0641u0) {
        super(str);
        this.f1879Y = c0641u0;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // p025An.InterfaceC0648y
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo1152a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0629o0) {
                C0629o0 c0629o0 = (C0629o0) obj;
                if (AbstractC16544l.m18089b(c0629o0.getMessage(), getMessage())) {
                    Object obj2 = c0629o0.f1879Y;
                    if (obj2 == null) {
                        obj2 = C0647x0.f1902Y;
                    }
                    Object obj3 = this.f1879Y;
                    if (obj3 == null) {
                        obj3 = C0647x0.f1902Y;
                    }
                    if (!AbstractC16544l.m18089b(obj2, obj3) || !AbstractC16544l.m18089b(c0629o0.getCause(), getCause())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC16544l.m18091d(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f1879Y;
        if (obj == null) {
            obj = C0647x0.f1902Y;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f1879Y;
        if (obj == null) {
            obj = C0647x0.f1902Y;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
