package p570X8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X8.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9095w {

    /* JADX INFO: renamed from: Y */
    public static final EnumC9095w f27860Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC9095w[] f27861Z;

    static {
        EnumC9095w enumC9095w = new EnumC9095w("DEFAULT", 0);
        f27860Y = enumC9095w;
        EnumC9095w enumC9095w2 = new EnumC9095w("UNMETERED_ONLY", 1);
        EnumC9095w enumC9095w3 = new EnumC9095w("UNMETERED_OR_DAILY", 2);
        EnumC9095w enumC9095w4 = new EnumC9095w("FAST_IF_RADIO_AWAKE", 3);
        EnumC9095w enumC9095w5 = new EnumC9095w("NEVER", 4);
        EnumC9095w enumC9095w6 = new EnumC9095w("UNRECOGNIZED", 5);
        f27861Z = new EnumC9095w[]{enumC9095w, enumC9095w2, enumC9095w3, enumC9095w4, enumC9095w5, enumC9095w6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC9095w);
        sparseArray.put(1, enumC9095w2);
        sparseArray.put(2, enumC9095w3);
        sparseArray.put(3, enumC9095w4);
        sparseArray.put(4, enumC9095w5);
        sparseArray.put(-1, enumC9095w6);
    }

    public static EnumC9095w valueOf(String str) {
        return (EnumC9095w) Enum.valueOf(EnumC9095w.class, str);
    }

    public static EnumC9095w[] values() {
        return (EnumC9095w[]) f27861Z.clone();
    }
}
