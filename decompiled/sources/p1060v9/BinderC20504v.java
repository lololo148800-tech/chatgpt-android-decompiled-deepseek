package p1060v9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AbstractC11852a;
import io.sentry.android.core.AbstractC15256t;
import p333N9.AbstractBinderC5687h;
import p424R9.AbstractC6827a;

/* JADX INFO: renamed from: v9.v */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC20504v extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public AbstractC11852a f65103b;

    /* JADX INFO: renamed from: c */
    public final int f65104c;

    public BinderC20504v(AbstractC11852a abstractC11852a, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 3);
        this.f65103b = abstractC11852a;
        this.f65104c = i10;
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: m */
    public final boolean mo6128m(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC6827a.m7268a(parcel, Bundle.CREATOR);
            AbstractC6827a.m7269b(parcel);
            AbstractC20502t.m21158i(this.f65103b, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC11852a abstractC11852a = this.f65103b;
            abstractC11852a.getClass();
            C20506x c20506x = new C20506x(abstractC11852a, i11, strongBinder, bundle);
            HandlerC20503u handlerC20503u = abstractC11852a.f36072e;
            handlerC20503u.sendMessage(handlerC20503u.obtainMessage(1, this.f65104c, -1, c20506x));
            this.f65103b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            AbstractC6827a.m7269b(parcel);
            AbstractC15256t.m16485w("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C20508z c20508z = (C20508z) AbstractC6827a.m7268a(parcel, C20508z.CREATOR);
            AbstractC6827a.m7269b(parcel);
            AbstractC11852a abstractC11852a2 = this.f65103b;
            AbstractC20502t.m21158i(abstractC11852a2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC20502t.m21157h(c20508z);
            abstractC11852a2.f36088u = c20508z;
            if (abstractC11852a2.mo5842v()) {
                C20486d c20486d = c20508z.f65113p0;
                C20491i c20491iM21138a = C20491i.m21138a();
                C20492j c20492j = c20486d == null ? null : c20486d.f65032Y;
                synchronized (c20491iM21138a) {
                    try {
                        if (c20492j == null) {
                            c20492j = C20491i.f65067o0;
                        } else {
                            C20492j c20492j2 = (C20492j) c20491iM21138a.f65068Y;
                            if (c20492j2 == null || c20492j2.f65069Y < c20492j.f65069Y) {
                            }
                        }
                        c20491iM21138a.f65068Y = c20492j;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Bundle bundle2 = c20508z.f65110Y;
            AbstractC20502t.m21158i(this.f65103b, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC11852a abstractC11852a3 = this.f65103b;
            abstractC11852a3.getClass();
            C20506x c20506x2 = new C20506x(abstractC11852a3, i12, strongBinder2, bundle2);
            HandlerC20503u handlerC20503u2 = abstractC11852a3.f36072e;
            handlerC20503u2.sendMessage(handlerC20503u2.obtainMessage(1, this.f65104c, -1, c20506x2));
            this.f65103b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
