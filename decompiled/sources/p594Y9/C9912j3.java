package p594Y9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p658b5.C11248s;

/* JADX INFO: renamed from: Y9.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C9912j3 {

    /* JADX INFO: renamed from: a */
    public final EnumC9906i3 f29438a;

    /* JADX INFO: renamed from: b */
    public final Integer f29439b;

    public /* synthetic */ C9912j3(C11248s c11248s) {
        this.f29438a = (EnumC9906i3) c11248s.f34081Z;
        this.f29439b = (Integer) c11248s.f34082o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9912j3)) {
            return false;
        }
        C9912j3 c9912j3 = (C9912j3) obj;
        return AbstractC20502t.m21161l(this.f29438a, c9912j3.f29438a) && AbstractC20502t.m21161l(this.f29439b, c9912j3.f29439b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29438a, this.f29439b, null, null});
    }
}
