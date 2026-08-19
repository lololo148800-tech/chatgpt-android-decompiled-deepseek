package p523V9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p571X9.AbstractC9306j0;
import p729ej.InterfaceC13427r;
import p895n1.C17425e;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: V9.s5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8191s5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25637a;

    /* JADX INFO: renamed from: a */
    public static Bundle m8773a(Parcel parcel, int i10) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM8787o);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m8774b(Parcel parcel, int i10) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM8787o);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: c */
    public static Parcelable m8775c(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM8787o);
        return parcelable;
    }

    /* JADX INFO: renamed from: d */
    public static String m8776d(Parcel parcel, int i10) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM8787o);
        return string;
    }

    /* JADX INFO: renamed from: e */
    public static String[] m8777e(Parcel parcel, int i10) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM8787o);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: f */
    public static Object[] m8778f(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM8787o);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m8779g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM8787o);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8780h(InterfaceC13427r interfaceC13427r, InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        Class<?> cls = otherWorker.getClass();
        C16527D c16527d = AbstractC16526C.f51263a;
        return c16527d.mo5693b(cls).equals(c16527d.mo5693b(interfaceC13427r.getClass()));
    }

    /* JADX INFO: renamed from: i */
    public static void m8781i(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new C0644w(AbstractC10763a.m11048f(i10, "Overread allowed size end="), parcel);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m8782j(Parcel parcel, int i10) {
        m8791s(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: k */
    public static float m8783k(Parcel parcel, int i10) {
        m8791s(parcel, i10, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: l */
    public static IBinder m8784l(Parcel parcel, int i10) {
        int iM8787o = m8787o(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM8787o == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM8787o);
        return strongBinder;
    }

    /* JADX INFO: renamed from: m */
    public static int m8785m(Parcel parcel, int i10) {
        m8791s(parcel, i10, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: n */
    public static long m8786n(Parcel parcel, int i10) {
        m8791s(parcel, i10, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: o */
    public static int m8787o(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: p */
    public static void m8788p(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m8787o(parcel, i10));
    }

    /* JADX INFO: renamed from: q */
    public static int m8789q(Parcel parcel) {
        int i10 = parcel.readInt();
        int iM8787o = m8787o(parcel, i10);
        char c9 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new C0644w("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iM8787o + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new C0644w(AbstractC17792x.m19534q("Size read is invalid start=", iDataPosition, i11, " end="), parcel);
        }
        return i11;
    }

    /* JADX INFO: renamed from: r */
    public static void m8790r(Parcel parcel, int i10, int i11) {
        if (i10 != i11) {
            throw new C0644w(AbstractC9306j0.m9891j(Integer.toHexString(i10), Separators.RPAREN, AbstractC0010F.m21e("Expected size ", i11, " got ", i10, " (0x")), parcel);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8791s(Parcel parcel, int i10, int i11) {
        int iM8787o = m8787o(parcel, i10);
        if (iM8787o != i11) {
            throw new C0644w(AbstractC9306j0.m9891j(Integer.toHexString(iM8787o), Separators.RPAREN, AbstractC0010F.m21e("Expected size ", i11, " got ", iM8787o, " (0x")), parcel);
        }
    }
}
