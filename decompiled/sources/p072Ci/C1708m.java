package p072Ci;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ci.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1708m {
    public static final C1707l Companion = new C1707l();

    /* JADX INFO: renamed from: a */
    public final String f4890a;

    public /* synthetic */ C1708m(String str) {
        this.f4890a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1708m) {
            return AbstractC16544l.m18089b(this.f4890a, ((C1708m) obj).f4890a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4890a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f4890a, Separators.RPAREN, new StringBuilder("VoiceName(tag="));
    }
}
