package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6529n;

/* JADX INFO: renamed from: Nn.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5882W extends AbstractC6529n {

    /* JADX INFO: renamed from: d */
    public final C5884Y f19212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5882W(C5884Y names) {
        super(AbstractC5908l.f19239b, names.f19215a, "monthName");
        AbstractC16544l.m18094g(names, "names");
        this.f19212d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5882W) && AbstractC16544l.m18089b(this.f19212d.f19215a, ((C5882W) obj).f19212d.f19215a);
    }

    public final int hashCode() {
        return this.f19212d.f19215a.hashCode();
    }
}
