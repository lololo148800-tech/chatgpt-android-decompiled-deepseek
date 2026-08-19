package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10352W extends AbstractC10357a0 {

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10345O f30694p0;

    public C10352W(AbstractC10345O abstractC10345O) {
        super(R.string.subscriptions_error_payment_pending, EnumC10353X.f30697o0, abstractC10345O);
        this.f30694p0 = abstractC10345O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10352W) && AbstractC16544l.m18089b(this.f30694p0, ((C10352W) obj).f30694p0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30694p0;
    }

    public final int hashCode() {
        AbstractC10345O abstractC10345O = this.f30694p0;
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
