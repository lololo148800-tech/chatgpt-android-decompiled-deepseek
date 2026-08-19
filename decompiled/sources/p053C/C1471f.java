package p053C;

import android.hardware.camera2.params.InputConfiguration;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.f */
/* JADX INFO: loaded from: classes.dex */
public class C1471f {

    /* JADX INFO: renamed from: a */
    public final InputConfiguration f3881a;

    public C1471f(Object obj) {
        this.f3881a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1471f)) {
            return false;
        }
        return Objects.equals(this.f3881a, ((C1471f) obj).f3881a);
    }

    public final int hashCode() {
        return this.f3881a.hashCode();
    }

    public final String toString() {
        return this.f3881a.toString();
    }
}
