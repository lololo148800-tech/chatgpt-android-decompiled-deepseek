package p523V9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p729ej.C13433x;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.t5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8199t5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25643a;

    /* JADX INFO: renamed from: a */
    public static C13433x m8802a(C0678l bytes) {
        C13433x c13433xM8802a;
        AbstractC16544l.m18094g(bytes, "bytes");
        C0675i c0675i = new C0675i();
        c0675i.m1432c1(bytes);
        try {
            String strM1452r = AbstractC8183r5.m8764b(c0675i).m1452r();
            byte b = c0675i.readByte();
            if (b == 0) {
                c13433xM8802a = null;
            } else {
                if (b != 1) {
                    throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                }
                c13433xM8802a = m8802a(c0675i.m1417C0(c0675i.f1970Z));
            }
            return new C13433x(AbstractC8138m0.m8670e(Class.forName(strM1452r)), c13433xM8802a, 4);
        } catch (EOFException unused) {
            throw new IllegalArgumentException("Invalid WorkflowIdentifier");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8803b(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeBundle(bundle);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: c */
    public static void m8804c(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeByteArray(bArr);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: d */
    public static void m8805d(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: e */
    public static void m8806e(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: f */
    public static void m8807f(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeString(str);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: g */
    public static void m8808g(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeStringArray(strArr);
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: h */
    public static void m8809h(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: i */
    public static void m8810i(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iM8811j = m8811j(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m8812k(parcel, iM8811j);
    }

    /* JADX INFO: renamed from: j */
    public static int m8811j(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: k */
    public static void m8812k(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: l */
    public static void m8813l(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
