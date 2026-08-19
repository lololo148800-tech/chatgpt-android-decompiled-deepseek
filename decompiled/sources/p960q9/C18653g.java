package p960q9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p1022t9.InterfaceC19818c;
import p1022t9.InterfaceC19827l;
import p1036u9.C20173s;
import p1060v9.AbstractC20502t;
import p333N9.AbstractC5688i;
import p889m9.AbstractC17199a;

/* JADX INFO: renamed from: q9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18653g extends BasePendingResult {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f59410k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18653g(C20173s c20173s, int i10) {
        super(c20173s);
        this.f59410k = i10;
        AbstractC20502t.m21158i(c20173s, "GoogleApiClient must not be null");
        AbstractC20502t.m21158i(AbstractC17199a.f54907a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC19827l mo13184d(Status status) {
        int i10 = this.f59410k;
        return status;
    }

    /* JADX INFO: renamed from: h */
    public final void m20018h(InterfaceC19818c interfaceC19818c) {
        switch (this.f59410k) {
            case 0:
                C18651e c18651e = (C18651e) interfaceC19818c;
                C18657k c18657k = (C18657k) c18651e.m13209q();
                BinderC18652f binderC18652f = new BinderC18652f(this, 0);
                Parcel parcelM6113i = c18657k.m6113i();
                int i10 = AbstractC5688i.f18460a;
                parcelM6113i.writeStrongBinder(binderC18652f);
                AbstractC5688i.m6133c(parcelM6113i, c18651e.f59407y);
                c18657k.m6114k(parcelM6113i, 102);
                break;
            default:
                C18651e c18651e2 = (C18651e) interfaceC19818c;
                C18657k c18657k2 = (C18657k) c18651e2.m13209q();
                BinderC18652f binderC18652f2 = new BinderC18652f(this, 1);
                Parcel parcelM6113i2 = c18657k2.m6113i();
                int i11 = AbstractC5688i.f18460a;
                parcelM6113i2.writeStrongBinder(binderC18652f2);
                AbstractC5688i.m6133c(parcelM6113i2, c18651e2.f59407y);
                c18657k2.m6114k(parcelM6113i2, 103);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20019i(Status status) {
        AbstractC20502t.m21150a("Failed result must not be success", !status.m13182b());
        m13187g(mo13184d(status));
    }
}
