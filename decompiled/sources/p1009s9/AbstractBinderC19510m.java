package p1009s9;

import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.AbstractC15256t;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1060v9.InterfaceC20500r;
import p139F9.BinderC2679b;
import p333N9.AbstractBinderC5687h;
import p424R9.AbstractC6827a;

/* JADX INFO: renamed from: s9.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC19510m extends AbstractBinderC5687h implements InterfaceC20500r {

    /* JADX INFO: renamed from: b */
    public final int f61969b;

    public AbstractBinderC19510m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 3);
        AbstractC20502t.m21151b(bArr.length == 25);
        this.f61969b = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m20616p(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC20500r)) {
            try {
                InterfaceC20500r interfaceC20500r = (InterfaceC20500r) obj;
                if (((AbstractBinderC19510m) interfaceC20500r).f61969b != this.f61969b) {
                    return false;
                }
                return Arrays.equals(mo20615q(), (byte[]) BinderC2679b.m3656q(new BinderC2679b(((AbstractBinderC19510m) interfaceC20500r).mo20615q())));
            } catch (RemoteException e10) {
                AbstractC15256t.m16466d("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f61969b;
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: m */
    public final boolean mo6128m(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            BinderC2679b binderC2679b = new BinderC2679b(mo20615q());
            parcel2.writeNoException();
            AbstractC6827a.m7270c(parcel2, binderC2679b);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f61969b);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public abstract byte[] mo20615q();
}
