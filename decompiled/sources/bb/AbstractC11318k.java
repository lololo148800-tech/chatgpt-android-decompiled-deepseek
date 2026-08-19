package bb;

import p523V9.C8121k;
import p523V9.C8217w;

/* JADX INFO: renamed from: bb.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11318k {

    /* JADX INFO: renamed from: Y */
    public transient C11305c f34232Y;

    /* JADX INFO: renamed from: Z */
    public transient C8217w f34233Z;

    /* JADX INFO: renamed from: o0 */
    public transient C8121k f34234o0;

    /* JADX INFO: renamed from: a */
    public abstract C8121k mo12709a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11318k) {
            return ((C11290O) this).mo12709a().equals(((C11290O) ((AbstractC11318k) obj)).mo12709a());
        }
        return false;
    }

    public final int hashCode() {
        return mo12709a().f25458p0.hashCode();
    }

    public final String toString() {
        return mo12709a().f25458p0.toString();
    }
}
