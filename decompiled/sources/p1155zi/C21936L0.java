package p1155zi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.L0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21936L0 {
    public static final C21932K0 Companion = new C21932K0();

    /* JADX INFO: renamed from: a */
    public final String f69488a;

    public /* synthetic */ C21936L0(String str) {
        this.f69488a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m22338a(String str) {
        return AbstractC10763a.m11054l("GizmoId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21936L0) {
            return AbstractC16544l.m18089b(this.f69488a, ((C21936L0) obj).f69488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69488a.hashCode();
    }

    public final String toString() {
        return m22338a(this.f69488a);
    }
}
