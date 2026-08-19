package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17987l0 {

    /* JADX INFO: renamed from: a */
    public final List f57430a;

    public C17987l0(List list) {
        this.f57430a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17987l0) && AbstractC16544l.m18089b(this.f57430a, ((C17987l0) obj).f57430a);
    }

    public final int hashCode() {
        return this.f57430a.hashCode();
    }

    public final String toString() {
        return "Action(id=" + this.f57430a + Separators.RPAREN;
    }
}
