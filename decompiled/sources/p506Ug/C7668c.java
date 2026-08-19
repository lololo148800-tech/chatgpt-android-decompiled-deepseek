package p506Ug;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ug.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7668c {
    public static final C7667b Companion = new C7667b();

    /* JADX INFO: renamed from: a */
    public final String f24189a;

    public /* synthetic */ C7668c(String str) {
        this.f24189a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7668c) {
            return AbstractC16544l.m18089b(this.f24189a, ((C7668c) obj).f24189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24189a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f24189a, Separators.RPAREN, new StringBuilder("MemoryId(value="));
    }
}
