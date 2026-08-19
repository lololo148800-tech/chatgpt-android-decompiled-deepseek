package p475T9;

import android.location.Location;
import android.os.Parcel;
import ba.C11272d;
import ba.C11273e;
import com.google.android.gms.common.api.Status;
import p333N9.AbstractBinderC5687h;
import p523V9.AbstractC7933L4;
import p746fa.C13599h;

/* JADX INFO: renamed from: T9.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7280c extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f23072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13599h f23073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7280c(C13599h c13599h, int i10) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 4);
        this.f23072b = i10;
        switch (i10) {
            case 1:
                this.f23073c = c13599h;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 4);
                break;
            default:
                this.f23073c = c13599h;
                break;
        }
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: n */
    public final boolean mo6129n(Parcel parcel, int i10) {
        switch (this.f23072b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                C11273e c11273e = (C11273e) AbstractC7279b.m7731a(parcel, C11273e.CREATOR);
                AbstractC7279b.m7732b(parcel);
                AbstractC7933L4.m8224b(c11273e.f34147Y, new C11272d(), this.f23073c);
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) AbstractC7279b.m7731a(parcel, Status.CREATOR);
                Location location = (Location) AbstractC7279b.m7731a(parcel, Location.CREATOR);
                AbstractC7279b.m7732b(parcel);
                AbstractC7933L4.m8224b(status, location, this.f23073c);
                return true;
        }
    }
}
