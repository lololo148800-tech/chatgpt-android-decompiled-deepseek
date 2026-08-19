package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17904I0 {

    /* JADX INFO: renamed from: a */
    public final List f57083a;

    public C17904I0(List list) {
        this.f57083a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17904I0) && AbstractC16544l.m18089b(this.f57083a, ((C17904I0) obj).f57083a);
    }

    public final int hashCode() {
        return this.f57083a.hashCode();
    }

    public final String toString() {
        return "Action(id=" + this.f57083a + Separators.RPAREN;
    }
}
