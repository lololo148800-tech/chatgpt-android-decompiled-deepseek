package p361Oe;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Oe.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6175b {

    /* JADX INFO: renamed from: a */
    public final List f20118a;

    public C6175b(List suggestedReplies) {
        AbstractC16544l.m18094g(suggestedReplies, "suggestedReplies");
        this.f20118a = suggestedReplies;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6175b) && AbstractC16544l.m18089b(this.f20118a, ((C6175b) obj).f20118a);
    }

    public final int hashCode() {
        return this.f20118a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
