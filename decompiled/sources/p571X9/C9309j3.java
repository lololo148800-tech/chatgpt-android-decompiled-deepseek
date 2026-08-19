package p571X9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p658b5.C11248s;

/* JADX INFO: renamed from: X9.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C9309j3 {

    /* JADX INFO: renamed from: a */
    public final EnumC9303i3 f28110a;

    /* JADX INFO: renamed from: b */
    public final Integer f28111b;

    public /* synthetic */ C9309j3(C11248s c11248s) {
        this.f28110a = (EnumC9303i3) c11248s.f34081Z;
        this.f28111b = (Integer) c11248s.f34082o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9309j3)) {
            return false;
        }
        C9309j3 c9309j3 = (C9309j3) obj;
        return AbstractC20502t.m21161l(this.f28110a, c9309j3.f28110a) && AbstractC20502t.m21161l(this.f28111b, c9309j3.f28111b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28110a, this.f28111b, null, null});
    }
}
