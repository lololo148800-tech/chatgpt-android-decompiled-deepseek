package p1155zi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.h0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22011h0 {
    public static final C22007g0 Companion = new C22007g0();

    /* JADX INFO: renamed from: a */
    public final String f69652a;

    public /* synthetic */ C22011h0(String str) {
        this.f69652a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m22343a(String str) {
        return AbstractC10763a.m11054l("ConversationId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22011h0) {
            return AbstractC16544l.m18089b(this.f69652a, ((C22011h0) obj).f69652a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69652a.hashCode();
    }

    public final String toString() {
        return m22343a(this.f69652a);
    }
}
