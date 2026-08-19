package p011A9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p1147z9.C21815a;
import p1147z9.C21817c;
import p333N9.AbstractBinderC5687h;
import p377P9.AbstractC6375a;
import p523V9.AbstractC7933L4;
import p746fa.C13599h;

/* JADX INFO: renamed from: A9.g */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0416g extends AbstractBinderC5687h implements InterfaceC0413d {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13599h f1373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0416g(C13599h c13599h, int i10) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 2);
        this.f1372b = i10;
        this.f1373c = c13599h;
    }

    @Override // p011A9.InterfaceC0413d
    /* JADX INFO: renamed from: a */
    public void mo1023a(Status status, C21817c c21817c) {
        switch (this.f1372b) {
            case 1:
                AbstractC7933L4.m8225c(status, c21817c, this.f1373c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p011A9.InterfaceC0413d
    /* JADX INFO: renamed from: j */
    public void mo1024j(Status status, C21815a c21815a) {
        switch (this.f1372b) {
            case 0:
                AbstractC7933L4.m8225c(status, c21815a, this.f1373c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: k */
    public final boolean mo1028k(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) AbstractC6375a.m6987a(parcel, Status.CREATOR);
            C21815a c21815a = (C21815a) AbstractC6375a.m6987a(parcel, C21815a.CREATOR);
            AbstractC6375a.m6988b(parcel);
            mo1024j(status, c21815a);
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    AbstractC6375a.m6988b(parcel);
                    throw new UnsupportedOperationException();
                }
                if (i10 != 4) {
                    return false;
                }
                AbstractC6375a.m6988b(parcel);
                throw new UnsupportedOperationException();
            }
            Status status2 = (Status) AbstractC6375a.m6987a(parcel, Status.CREATOR);
            C21817c c21817c = (C21817c) AbstractC6375a.m6987a(parcel, C21817c.CREATOR);
            AbstractC6375a.m6988b(parcel);
            mo1023a(status2, c21817c);
        }
        return true;
    }
}
