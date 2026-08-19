package p344Nl;

import io.livekit.android.room.participant.Participant$Identity$Companion;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Nl.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C5846r {
    public static final Participant$Identity$Companion Companion = new Participant$Identity$Companion();

    /* JADX INFO: renamed from: a */
    public final String f19130a;

    public /* synthetic */ C5846r(String str) {
        this.f19130a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5846r) {
            return AbstractC16544l.m18089b(this.f19130a, ((C5846r) obj).f19130a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19130a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("Identity(value="), this.f19130a, ')');
    }
}
