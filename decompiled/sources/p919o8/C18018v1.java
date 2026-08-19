package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18018v1 {

    /* JADX INFO: renamed from: a */
    public final String f57514a;

    public C18018v1(String str) {
        this.f57514a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18018v1) && AbstractC16544l.m18089b(this.f57514a, ((C18018v1) obj).f57514a);
    }

    public final int hashCode() {
        return this.f57514a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57514a, Separators.RPAREN, new StringBuilder("ContainerView(id="));
    }
}
