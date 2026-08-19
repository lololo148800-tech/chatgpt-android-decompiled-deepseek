package p172Gi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Gi.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3060B {
    public static final C3059A Companion = new C3059A();

    /* JADX INFO: renamed from: a */
    public final String f9228a;

    public /* synthetic */ C3060B(String str) {
        this.f9228a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3060B) {
            return AbstractC16544l.m18089b(this.f9228a, ((C3060B) obj).f9228a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9228a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f9228a, Separators.RPAREN, new StringBuilder("VoiceSessionId(value="));
    }
}
