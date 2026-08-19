package p523V9;

import io.sentry.internal.debugmeta.C15384c;
import java.util.Arrays;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: V9.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8222w4 {

    /* JADX INFO: renamed from: a */
    public final EnumC8214v4 f25676a;

    /* JADX INFO: renamed from: b */
    public final Integer f25677b;

    public /* synthetic */ C8222w4(C15384c c15384c) {
        this.f25676a = (EnumC8214v4) c15384c.f47967Z;
        this.f25677b = (Integer) c15384c.f47968o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8222w4)) {
            return false;
        }
        C8222w4 c8222w4 = (C8222w4) obj;
        return AbstractC20502t.m21161l(this.f25676a, c8222w4.f25676a) && AbstractC20502t.m21161l(this.f25677b, c8222w4.f25677b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25676a, this.f25677b, null, null});
    }
}
