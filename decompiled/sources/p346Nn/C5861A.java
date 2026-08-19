package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6529n;

/* JADX INFO: renamed from: Nn.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C5861A extends AbstractC6529n {

    /* JADX INFO: renamed from: d */
    public final C5863C f19164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5861A(C5863C names) {
        super(AbstractC5908l.f19241d, names.f19167a, "dayOfWeekName");
        AbstractC16544l.m18094g(names, "names");
        this.f19164d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5861A) && AbstractC16544l.m18089b(this.f19164d.f19167a, ((C5861A) obj).f19164d.f19167a);
    }

    public final int hashCode() {
        return this.f19164d.f19167a.hashCode();
    }
}
