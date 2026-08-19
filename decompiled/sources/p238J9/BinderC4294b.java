package p238J9;

import android.app.PendingIntent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.AbstractC15256t;
import kotlin.jvm.internal.AbstractC16544l;
import p110E4.C2306d;
import p310M9.AbstractC5307a;
import p356O9.AbstractC6145c;
import p449S9.AbstractC7075j;
import p523V9.AbstractC7933L4;
import p746fa.C13599h;
import p868l9.C16833a;
import p868l9.C16834b;

/* JADX INFO: renamed from: J9.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4294b extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13970b;

    public BinderC4294b(C13599h c13599h, int i10) {
        this.f13969a = i10;
        switch (i10) {
            case 1:
                this.f13970b = c13599h;
                attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
                break;
            case 2:
                this.f13970b = c13599h;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                break;
            default:
                this.f13970b = c13599h;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i10 = this.f13969a;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m5039d(int i10, String[] tables) {
        AbstractC16544l.m18094g(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f13970b;
        synchronized (multiInstanceInvalidationService.f33688o0) {
            String str = (String) multiInstanceInvalidationService.f33687Z.get(Integer.valueOf(i10));
            if (str == null) {
                AbstractC15256t.m16482t("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f33688o0.beginBroadcast();
            for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f33688o0.getBroadcastCookie(i11);
                    AbstractC16544l.m18092e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f33687Z.get(num);
                    if (i10 != iIntValue && str.equals(str2)) {
                        try {
                            ((C2306d) multiInstanceInvalidationService.f33688o0.getBroadcastItem(i11)).m3390d(tables);
                        } catch (RemoteException e10) {
                            AbstractC15256t.m16483u("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                } catch (Throwable th2) {
                    multiInstanceInvalidationService.f33688o0.finishBroadcast();
                    throw th2;
                }
            }
            multiInstanceInvalidationService.f33688o0.finishBroadcast();
        }
    }

    /* JADX INFO: renamed from: i */
    public int m5040i(C2306d callback, String str) {
        AbstractC16544l.m18094g(callback, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f13970b;
        synchronized (multiInstanceInvalidationService.f33688o0) {
            try {
                int i11 = multiInstanceInvalidationService.f33686Y + 1;
                multiInstanceInvalidationService.f33686Y = i11;
                if (multiInstanceInvalidationService.f33688o0.register(callback, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f33687Z.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f33686Y--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z6 = false;
        C2306d callback = null;
        C2306d c2306d = null;
        switch (this.f13969a) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                if (i10 == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i12 = AbstractC7075j.f22551a;
                    Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    AbstractC7933L4.m8224b(statusCreateFromParcel, pendingIntent, (C13599h) this.f13970b);
                    z6 = true;
                }
                return z6;
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                if (i10 == 1) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i13 = AbstractC5307a.f17480a;
                    Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    C16834b c16834bCreateFromParcel = parcel.readInt() == 0 ? null : C16834b.CREATOR.createFromParcel(parcel);
                    AbstractC7933L4.m8224b(statusCreateFromParcel2, c16834bCreateFromParcel != null ? new C16833a(c16834bCreateFromParcel.f54006Y) : null, (C13599h) this.f13970b);
                    z6 = true;
                }
                return z6;
            case 2:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                if (i10 == 1) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i14 = AbstractC6145c.f20030a;
                    Status statusCreateFromParcel3 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    AbstractC7933L4.m8224b(statusCreateFromParcel3, null, (C13599h) this.f13970b);
                    z6 = true;
                }
                return z6;
            default:
                if (i10 >= 1 && i10 <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i10 == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i10 == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C2306d)) {
                            c2306d = new C2306d();
                            c2306d.f7156a = strongBinder;
                        } else {
                            c2306d = (C2306d) iInterfaceQueryLocalInterface;
                        }
                    }
                    int iM5040i = m5040i(c2306d, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iM5040i);
                    return true;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    m5039d(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C2306d)) {
                        callback = new C2306d();
                        callback.f7156a = strongBinder2;
                    } else {
                        callback = (C2306d) iInterfaceQueryLocalInterface2;
                    }
                }
                int i15 = parcel.readInt();
                AbstractC16544l.m18094g(callback, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f13970b;
                synchronized (multiInstanceInvalidationService.f33688o0) {
                    multiInstanceInvalidationService.f33688o0.unregister(callback);
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public BinderC4294b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f13969a = 3;
        this.f13970b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
