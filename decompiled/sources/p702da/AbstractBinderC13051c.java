package p702da;

import android.os.Parcel;
import io.sentry.android.core.RunnableC15195M;
import p1036u9.BinderC20179y;
import p333N9.AbstractBinderC5687h;
import p377P9.AbstractC6375a;

/* JADX INFO: renamed from: da.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC13051c extends AbstractBinderC5687h {
    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: k */
    public final boolean mo1028k(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                AbstractC6375a.m6988b(parcel);
                break;
            case 4:
                AbstractC6375a.m6988b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC6375a.m6988b(parcel);
                break;
            case 7:
                AbstractC6375a.m6988b(parcel);
                break;
            case 8:
                C13055g c13055g = (C13055g) AbstractC6375a.m6987a(parcel, C13055g.CREATOR);
                AbstractC6375a.m6988b(parcel);
                BinderC20179y binderC20179y = (BinderC20179y) this;
                binderC20179y.f63914c.post(new RunnableC15195M(binderC20179y, 17, c13055g));
                break;
            case 9:
                AbstractC6375a.m6988b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
