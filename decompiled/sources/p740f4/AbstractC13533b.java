package p740f4;

import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;

/* JADX INFO: renamed from: f4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13533b implements InterfaceC19752B {
    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19788o mo10753k() {
        return null;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ byte[] mo10754r0() {
        return null;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
