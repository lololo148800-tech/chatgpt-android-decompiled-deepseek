package mm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mm.j */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17307j {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17307j f55133Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17307j f55134Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC17307j[] f55135o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17307j EF3;

    static {
        EnumC17307j enumC17307j = new EnumC17307j("SYNCHRONIZED", 0);
        EnumC17307j enumC17307j2 = new EnumC17307j("PUBLICATION", 1);
        f55133Y = enumC17307j2;
        EnumC17307j enumC17307j3 = new EnumC17307j("NONE", 2);
        f55134Z = enumC17307j3;
        EnumC17307j[] enumC17307jArr = {enumC17307j, enumC17307j2, enumC17307j3};
        f55135o0 = enumC17307jArr;
        AbstractC7877E4.m8156j(enumC17307jArr);
    }

    public static EnumC17307j valueOf(String str) {
        return (EnumC17307j) Enum.valueOf(EnumC17307j.class, str);
    }

    public static EnumC17307j[] values() {
        return (EnumC17307j[]) f55135o0.clone();
    }
}
