package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10351V extends AbstractC10357a0 {

    /* JADX INFO: renamed from: p0 */
    public final Throwable f30693p0;

    public C10351V(Throwable th2) {
        super(R.string.subscriptions_error_generic_unavailable, EnumC10353X.f30695Y, th2);
        this.f30693p0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10351V) && AbstractC16544l.m18089b(this.f30693p0, ((C10351V) obj).f30693p0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30693p0;
    }

    public final int hashCode() {
        Throwable th2 = this.f30693p0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
