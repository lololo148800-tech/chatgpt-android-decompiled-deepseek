package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.H */
/* JADX INFO: loaded from: classes.dex */
public final class C17900H {

    /* JADX INFO: renamed from: a */
    public final List f57058a;

    public C17900H(List list) {
        this.f57058a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17900H) && AbstractC16544l.m18089b(this.f57058a, ((C17900H) obj).f57058a);
    }

    public final int hashCode() {
        return this.f57058a.hashCode();
    }

    public final String toString() {
        return "Action(id=" + this.f57058a + Separators.RPAREN;
    }
}
