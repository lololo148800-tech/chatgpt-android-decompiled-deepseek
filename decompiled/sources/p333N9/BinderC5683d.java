package p333N9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p1036u9.InterfaceC20160f;
import p377P9.AbstractC6375a;
import p523V9.AbstractC7933L4;
import p746fa.C13599h;

/* JADX INFO: renamed from: N9.d */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5683d extends AbstractBinderC5687h implements InterfaceC20160f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13599h f18452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5683d(C13599h c13599h) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 2);
        this.f18452b = c13599h;
    }

    @Override // p1036u9.InterfaceC20160f
    /* JADX INFO: renamed from: b */
    public final void mo6125b(Status status) {
        AbstractC7933L4.m8224b(status, null, this.f18452b);
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: k */
    public final boolean mo1028k(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC6375a.m6987a(parcel, Status.CREATOR);
        AbstractC6375a.m6988b(parcel);
        mo6125b(status);
        return true;
    }
}
