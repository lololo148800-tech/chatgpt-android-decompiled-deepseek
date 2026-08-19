package p875ll;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ll.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17063a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17063a f54536Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC17063a[] f54537Z;

    static {
        EnumC17063a enumC17063a = new EnumC17063a("QUOTED_WHEN_REQUIRED", 0);
        f54536Y = enumC17063a;
        EnumC17063a[] enumC17063aArr = {enumC17063a, new EnumC17063a("QUOTED_ALWAYS", 1), new EnumC17063a("URI_ENCODE", 2)};
        f54537Z = enumC17063aArr;
        AbstractC7877E4.m8156j(enumC17063aArr);
    }

    public static EnumC17063a valueOf(String str) {
        return (EnumC17063a) Enum.valueOf(EnumC17063a.class, str);
    }

    public static EnumC17063a[] values() {
        return (EnumC17063a[]) f54537Z.clone();
    }
}
