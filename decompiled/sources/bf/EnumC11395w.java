package bf;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11395w {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11395w f34421Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11395w f34422Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC11395w[] f34423o0;

    static {
        EnumC11395w enumC11395w = new EnumC11395w("OAuth", 0);
        f34421Y = enumC11395w;
        EnumC11395w enumC11395w2 = new EnumC11395w("Unknown", 1);
        f34422Z = enumC11395w2;
        EnumC11395w[] enumC11395wArr = {enumC11395w, enumC11395w2};
        f34423o0 = enumC11395wArr;
        AbstractC7877E4.m8156j(enumC11395wArr);
    }

    public static EnumC11395w valueOf(String str) {
        return (EnumC11395w) Enum.valueOf(EnumC11395w.class, str);
    }

    public static EnumC11395w[] values() {
        return (EnumC11395w[]) f34423o0.clone();
    }
}
