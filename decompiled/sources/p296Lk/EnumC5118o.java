package p296Lk;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Lk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5118o {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5118o f16721Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC5118o[] f16722Z;

    static {
        EnumC5118o enumC5118o = new EnumC5118o("BOTH", 0);
        f16721Y = enumC5118o;
        EnumC5118o[] enumC5118oArr = {enumC5118o, new EnumC5118o("HORIZONTAL", 1), new EnumC5118o("VERTICAL", 2)};
        f16722Z = enumC5118oArr;
        AbstractC7877E4.m8156j(enumC5118oArr);
    }

    public static EnumC5118o valueOf(String str) {
        return (EnumC5118o) Enum.valueOf(EnumC5118o.class, str);
    }

    public static EnumC5118o[] values() {
        return (EnumC5118o[]) f16722Z.clone();
    }
}
