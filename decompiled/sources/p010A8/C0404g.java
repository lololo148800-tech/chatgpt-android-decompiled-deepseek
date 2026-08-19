package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0404g {

    /* JADX INFO: renamed from: a */
    public final String f1345a;

    public C0404g(String str) {
        this.f1345a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0404g) && AbstractC16544l.m18089b(this.f1345a, ((C0404g) obj).f1345a);
    }

    public final int hashCode() {
        String str = this.f1345a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f1345a, Separators.RPAREN, new StringBuilder("Session(id="));
    }
}
