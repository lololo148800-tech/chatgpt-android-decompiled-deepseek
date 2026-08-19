package p333N9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: N9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5680a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18444a;

    /* JADX INFO: renamed from: b */
    public final IBinder f18445b;

    /* JADX INFO: renamed from: c */
    public final String f18446c;

    public /* synthetic */ AbstractC5680a(IBinder iBinder, String str, int i10) {
        this.f18444a = i10;
        this.f18445b = iBinder;
        this.f18446c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f18444a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return this.f18445b;
    }

    /* JADX INFO: renamed from: d */
    public void m6112d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f18445b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public Parcel m6113i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f18446c);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: k */
    public void m6114k(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f18445b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public Parcel m6115l(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f18445b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public Parcel m6116m() {
        switch (this.f18444a) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f18446c);
                return parcelObtain;
            case 3:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f18446c);
                return parcelObtain2;
            case 4:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f18446c);
                return parcelObtain3;
            default:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f18446c);
                return parcelObtain4;
        }
    }

    /* JADX INFO: renamed from: n */
    public Parcel m6117n(Parcel parcel, int i10) {
        switch (this.f18444a) {
            case 3:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        this.f18445b.transact(i10, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        parcel.recycle();
                        return parcelObtain;
                    } catch (RuntimeException e10) {
                        parcelObtain.recycle();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    parcel.recycle();
                    throw th2;
                }
            case 4:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.f18445b.transact(i10, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcel.recycle();
                        return parcelObtain2;
                    } catch (Throwable th3) {
                        parcel.recycle();
                        throw th3;
                    }
                } catch (RuntimeException e11) {
                    parcelObtain2.recycle();
                    throw e11;
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    try {
                        this.f18445b.transact(i10, parcel, parcelObtain3, 0);
                        parcelObtain3.readException();
                        parcel.recycle();
                        return parcelObtain3;
                    } catch (RuntimeException e12) {
                        parcelObtain3.recycle();
                        throw e12;
                    }
                } catch (Throwable th4) {
                    parcel.recycle();
                    throw th4;
                }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6118o(Parcel parcel, int i10) {
        switch (this.f18444a) {
            case 3:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f18445b.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            case 4:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    this.f18445b.transact(i10, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    this.f18445b.transact(i10, parcel, parcelObtain3, 0);
                    parcelObtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public Parcel m6119p() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f18446c);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: q */
    public Parcel m6120q(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f18445b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m6121r(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f18445b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
