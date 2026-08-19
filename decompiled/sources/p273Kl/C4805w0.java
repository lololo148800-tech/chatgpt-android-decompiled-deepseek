package p273Kl;

import io.livekit.android.room.Room$Sid$Companion;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Kl.w0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4805w0 {
    public static final Room$Sid$Companion Companion = new Room$Sid$Companion();

    /* JADX INFO: renamed from: a */
    public final String f15669a;

    public /* synthetic */ C4805w0(String str) {
        this.f15669a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4805w0) {
            return AbstractC16544l.m18089b(this.f15669a, ((C4805w0) obj).f15669a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15669a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("Sid(sid="), this.f15669a, ')');
    }
}
