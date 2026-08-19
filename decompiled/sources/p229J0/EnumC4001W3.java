package p229J0;

import p046Bk.p047Ep.QzvfuIgrngtl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J0.W3 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4001W3 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4001W3 f12552Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4001W3 f12553Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC4001W3[] f12554o0;

    static {
        EnumC4001W3 enumC4001W3 = new EnumC4001W3("Dismissed", 0);
        f12552Y = enumC4001W3;
        EnumC4001W3 enumC4001W4 = new EnumC4001W3(QzvfuIgrngtl.MBN, 1);
        f12553Z = enumC4001W4;
        f12554o0 = new EnumC4001W3[]{enumC4001W3, enumC4001W4};
    }

    public static EnumC4001W3 valueOf(String str) {
        return (EnumC4001W3) Enum.valueOf(EnumC4001W3.class, str);
    }

    public static EnumC4001W3[] values() {
        return (EnumC4001W3[]) f12554o0.clone();
    }
}
