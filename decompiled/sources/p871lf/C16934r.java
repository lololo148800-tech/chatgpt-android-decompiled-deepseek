package p871lf;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: lf.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16934r {
    public static final C16933q Companion = new C16933q();

    /* JADX INFO: renamed from: a */
    public final String f54382a;

    public /* synthetic */ C16934r(String str) {
        this.f54382a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16934r) {
            return AbstractC16544l.m18089b(this.f54382a, ((C16934r) obj).f54382a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54382a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f54382a, Separators.RPAREN, new StringBuilder("JawboneId(value="));
    }
}
