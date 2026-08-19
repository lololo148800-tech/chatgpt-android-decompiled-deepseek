package p570X8;

import android.util.SparseArray;
import p011A9.p012Ra.ahZQMZ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X8.u */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9093u {

    /* JADX INFO: renamed from: Y */
    public static final SparseArray f27858Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC9093u[] f27859Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9093u EF3;

    public static EnumC9093u valueOf(String str) {
        return (EnumC9093u) Enum.valueOf(EnumC9093u.class, str);
    }

    public static EnumC9093u[] values() {
        return (EnumC9093u[]) f27859Z.clone();
    }

    static {
        EnumC9093u enumC9093u = new EnumC9093u("MOBILE", 0);
        EnumC9093u enumC9093u2 = new EnumC9093u("WIFI", 1);
        EnumC9093u enumC9093u3 = new EnumC9093u("MOBILE_MMS", 2);
        EnumC9093u enumC9093u4 = new EnumC9093u("MOBILE_SUPL", 3);
        EnumC9093u enumC9093u5 = new EnumC9093u("MOBILE_DUN", 4);
        EnumC9093u enumC9093u6 = new EnumC9093u("MOBILE_HIPRI", 5);
        EnumC9093u enumC9093u7 = new EnumC9093u("WIMAX", 6);
        EnumC9093u enumC9093u8 = new EnumC9093u(ahZQMZ.UuAM, 7);
        EnumC9093u enumC9093u9 = new EnumC9093u("DUMMY", 8);
        EnumC9093u enumC9093u10 = new EnumC9093u("ETHERNET", 9);
        EnumC9093u enumC9093u11 = new EnumC9093u("MOBILE_FOTA", 10);
        EnumC9093u enumC9093u12 = new EnumC9093u("MOBILE_IMS", 11);
        EnumC9093u enumC9093u13 = new EnumC9093u("MOBILE_CBS", 12);
        EnumC9093u enumC9093u14 = new EnumC9093u("WIFI_P2P", 13);
        EnumC9093u enumC9093u15 = new EnumC9093u("MOBILE_IA", 14);
        EnumC9093u enumC9093u16 = new EnumC9093u("MOBILE_EMERGENCY", 15);
        EnumC9093u enumC9093u17 = new EnumC9093u("PROXY", 16);
        EnumC9093u enumC9093u18 = new EnumC9093u("VPN", 17);
        EnumC9093u enumC9093u19 = new EnumC9093u("NONE", 18);
        f27859Z = new EnumC9093u[]{enumC9093u, enumC9093u2, enumC9093u3, enumC9093u4, enumC9093u5, enumC9093u6, enumC9093u7, enumC9093u8, enumC9093u9, enumC9093u10, enumC9093u11, enumC9093u12, enumC9093u13, enumC9093u14, enumC9093u15, enumC9093u16, enumC9093u17, enumC9093u18, enumC9093u19};
        SparseArray sparseArray = new SparseArray();
        f27858Y = sparseArray;
        sparseArray.put(0, enumC9093u);
        sparseArray.put(1, enumC9093u2);
        sparseArray.put(2, enumC9093u3);
        sparseArray.put(3, enumC9093u4);
        sparseArray.put(4, enumC9093u5);
        sparseArray.put(5, enumC9093u6);
        sparseArray.put(6, enumC9093u7);
        sparseArray.put(7, enumC9093u8);
        sparseArray.put(8, enumC9093u9);
        sparseArray.put(9, enumC9093u10);
        sparseArray.put(10, enumC9093u11);
        sparseArray.put(11, enumC9093u12);
        sparseArray.put(12, enumC9093u13);
        sparseArray.put(13, enumC9093u14);
        sparseArray.put(14, enumC9093u15);
        sparseArray.put(15, enumC9093u16);
        sparseArray.put(16, enumC9093u17);
        sparseArray.put(17, enumC9093u18);
        sparseArray.put(-1, enumC9093u19);
    }
}
