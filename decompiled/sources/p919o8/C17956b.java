package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17956b {

    /* JADX INFO: renamed from: a */
    public final String f57314a;

    public C17956b(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f57314a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17956b) && AbstractC16544l.m18089b(this.f57314a, ((C17956b) obj).f57314a);
    }

    public final int hashCode() {
        return this.f57314a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57314a, Separators.RPAREN, new StringBuilder("ActionEventActionTarget(name="));
    }
}
