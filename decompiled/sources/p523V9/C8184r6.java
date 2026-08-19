package p523V9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p960q9.C18655i;

/* JADX INFO: renamed from: V9.r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C8184r6 {

    /* JADX INFO: renamed from: a */
    public final C7896H f25631a;

    public /* synthetic */ C8184r6(C18655i c18655i) {
        this.f25631a = (C7896H) c18655i.f59414Z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8184r6) {
            return AbstractC20502t.m21161l(this.f25631a, ((C8184r6) obj).f25631a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25631a});
    }
}
