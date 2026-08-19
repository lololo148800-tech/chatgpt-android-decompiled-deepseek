package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10349T extends AbstractC10357a0 {

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10345O f30691p0;

    public C10349T(AbstractC10345O abstractC10345O) {
        super(R.string.subscriptions_error_generic_unavailable, EnumC10353X.f30695Y, abstractC10345O);
        this.f30691p0 = abstractC10345O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10349T) && AbstractC16544l.m18089b(this.f30691p0, ((C10349T) obj).f30691p0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30691p0;
    }

    public final int hashCode() {
        AbstractC10345O abstractC10345O = this.f30691p0;
        if (abstractC10345O == null) {
            return 0;
        }
        return abstractC10345O.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
