package p570X8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X8.t */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9092t {

    /* JADX INFO: renamed from: Y */
    public static final SparseArray f27856Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC9092t[] f27857Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9092t EF5;

    static {
        EnumC9092t enumC9092t = new EnumC9092t("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC9092t enumC9092t2 = new EnumC9092t("GPRS", 1);
        EnumC9092t enumC9092t3 = new EnumC9092t("EDGE", 2);
        EnumC9092t enumC9092t4 = new EnumC9092t("UMTS", 3);
        EnumC9092t enumC9092t5 = new EnumC9092t("CDMA", 4);
        EnumC9092t enumC9092t6 = new EnumC9092t("EVDO_0", 5);
        EnumC9092t enumC9092t7 = new EnumC9092t("EVDO_A", 6);
        EnumC9092t enumC9092t8 = new EnumC9092t("RTT", 7);
        EnumC9092t enumC9092t9 = new EnumC9092t("HSDPA", 8);
        EnumC9092t enumC9092t10 = new EnumC9092t("HSUPA", 9);
        EnumC9092t enumC9092t11 = new EnumC9092t("HSPA", 10);
        EnumC9092t enumC9092t12 = new EnumC9092t("IDEN", 11);
        EnumC9092t enumC9092t13 = new EnumC9092t("EVDO_B", 12);
        EnumC9092t enumC9092t14 = new EnumC9092t("LTE", 13);
        EnumC9092t enumC9092t15 = new EnumC9092t("EHRPD", 14);
        EnumC9092t enumC9092t16 = new EnumC9092t("HSPAP", 15);
        EnumC9092t enumC9092t17 = new EnumC9092t("GSM", 16);
        EnumC9092t enumC9092t18 = new EnumC9092t("TD_SCDMA", 17);
        EnumC9092t enumC9092t19 = new EnumC9092t("IWLAN", 18);
        EnumC9092t enumC9092t20 = new EnumC9092t("LTE_CA", 19);
        f27857Z = new EnumC9092t[]{enumC9092t, enumC9092t2, enumC9092t3, enumC9092t4, enumC9092t5, enumC9092t6, enumC9092t7, enumC9092t8, enumC9092t9, enumC9092t10, enumC9092t11, enumC9092t12, enumC9092t13, enumC9092t14, enumC9092t15, enumC9092t16, enumC9092t17, enumC9092t18, enumC9092t19, enumC9092t20, new EnumC9092t("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f27856Y = sparseArray;
        sparseArray.put(0, enumC9092t);
        sparseArray.put(1, enumC9092t2);
        sparseArray.put(2, enumC9092t3);
        sparseArray.put(3, enumC9092t4);
        sparseArray.put(4, enumC9092t5);
        sparseArray.put(5, enumC9092t6);
        sparseArray.put(6, enumC9092t7);
        sparseArray.put(7, enumC9092t8);
        sparseArray.put(8, enumC9092t9);
        sparseArray.put(9, enumC9092t10);
        sparseArray.put(10, enumC9092t11);
        sparseArray.put(11, enumC9092t12);
        sparseArray.put(12, enumC9092t13);
        sparseArray.put(13, enumC9092t14);
        sparseArray.put(14, enumC9092t15);
        sparseArray.put(15, enumC9092t16);
        sparseArray.put(16, enumC9092t17);
        sparseArray.put(17, enumC9092t18);
        sparseArray.put(18, enumC9092t19);
        sparseArray.put(19, enumC9092t20);
    }

    public static EnumC9092t valueOf(String str) {
        return (EnumC9092t) Enum.valueOf(EnumC9092t.class, str);
    }

    public static EnumC9092t[] values() {
        return (EnumC9092t[]) f27857Z.clone();
    }
}
