package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10355Z extends AbstractC10357a0 {

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10345O f30700p0;

    public C10355Z(AbstractC10345O abstractC10345O) {
        super(R.string.subscriptions_error_receipt_already_in_use, EnumC10353X.f30696Z, abstractC10345O);
        this.f30700p0 = abstractC10345O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10355Z) && AbstractC16544l.m18089b(this.f30700p0, ((C10355Z) obj).f30700p0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30700p0;
    }

    public final int hashCode() {
        AbstractC10345O abstractC10345O = this.f30700p0;
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
