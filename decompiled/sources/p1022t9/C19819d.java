package p1022t9;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: t9.d */
/* JADX INFO: loaded from: classes.dex */
public class C19819d extends Exception {

    /* JADX INFO: renamed from: Y */
    public final Status f62870Y;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19819d(Status status) {
        int i10 = status.f36052Y;
        String str = status.f36053Z;
        super(i10 + ": " + (str == null ? "" : str));
        this.f62870Y = status;
    }
}
