package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10354Y extends AbstractC10357a0 {

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10345O f30699p0;

    public C10354Y(AbstractC10345O abstractC10345O) {
        super(R.string.subscriptions_error_purchase_failed, EnumC10353X.f30696Z, abstractC10345O);
        this.f30699p0 = abstractC10345O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10354Y) && AbstractC16544l.m18089b(this.f30699p0, ((C10354Y) obj).f30699p0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30699p0;
    }

    public final int hashCode() {
        AbstractC10345O abstractC10345O = this.f30699p0;
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
