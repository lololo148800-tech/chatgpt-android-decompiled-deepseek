package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.U1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21966U1 {
    public static final C21963T1 Companion = new C21963T1();

    /* JADX INFO: renamed from: a */
    public final String f69541a;

    public /* synthetic */ C21966U1(String str) {
        this.f69541a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21966U1) {
            return AbstractC16544l.m18089b(this.f69541a, ((C21966U1) obj).f69541a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69541a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69541a, Separators.RPAREN, new StringBuilder("SharedConversationId(value="));
    }
}
