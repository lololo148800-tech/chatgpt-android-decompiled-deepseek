package mm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mm.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17301d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17301d f55126Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC17301d[] f55127Z;

    static {
        EnumC17301d enumC17301d = new EnumC17301d("WARNING", 0);
        f55126Y = enumC17301d;
        EnumC17301d[] enumC17301dArr = {enumC17301d, new EnumC17301d("ERROR", 1), new EnumC17301d("HIDDEN", 2)};
        f55127Z = enumC17301dArr;
        AbstractC7877E4.m8156j(enumC17301dArr);
    }

    public static EnumC17301d valueOf(String str) {
        return (EnumC17301d) Enum.valueOf(EnumC17301d.class, str);
    }

    public static EnumC17301d[] values() {
        return (EnumC17301d[]) f55127Z.clone();
    }
}
