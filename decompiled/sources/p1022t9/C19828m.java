package p1022t9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: t9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C19828m extends BasePendingResult {

    /* JADX INFO: renamed from: k */
    public final Status f62885k;

    public C19828m(Status status) {
        super(null);
        this.f62885k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: d */
    public final InterfaceC19827l mo13184d(Status status) {
        return this.f62885k;
    }
}
