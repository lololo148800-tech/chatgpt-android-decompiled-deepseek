package p344Nl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.livekit.android.room.participant.Participant$Sid$Companion;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Nl.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C5849u {
    public static final Participant$Sid$Companion Companion = new Participant$Sid$Companion();

    /* JADX INFO: renamed from: a */
    public final String f19138a;

    public /* synthetic */ C5849u(String str) {
        this.f19138a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m6256a(String str) {
        return AbstractC10763a.m11047e(')', "Sid(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5849u) {
            return AbstractC16544l.m18089b(this.f19138a, ((C5849u) obj).f19138a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19138a.hashCode();
    }

    public final String toString() {
        return m6256a(this.f19138a);
    }
}
