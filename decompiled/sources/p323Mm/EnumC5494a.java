package p323Mm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5494a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5494a f17936Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5494a f17937Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5494a[] f17938o0;

    static {
        EnumC5494a enumC5494a = new EnumC5494a("CALL_BY_NAME", 0);
        f17936Y = enumC5494a;
        EnumC5494a enumC5494a2 = new EnumC5494a("POSITIONAL_CALL", 1);
        f17937Z = enumC5494a2;
        EnumC5494a[] enumC5494aArr = {enumC5494a, enumC5494a2};
        f17938o0 = enumC5494aArr;
        AbstractC7877E4.m8156j(enumC5494aArr);
    }

    public static EnumC5494a valueOf(String str) {
        return (EnumC5494a) Enum.valueOf(EnumC5494a.class, str);
    }

    public static EnumC5494a[] values() {
        return (EnumC5494a[]) f17938o0.clone();
    }
}
