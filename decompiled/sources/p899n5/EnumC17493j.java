package p899n5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n5.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17493j {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17493j f55961Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC17493j[] f55962Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17493j EF3;

    static {
        EnumC17493j enumC17493j = new EnumC17493j("IGNORE", 0);
        EnumC17493j enumC17493j2 = new EnumC17493j("RESPECT_PERFORMANCE", 1);
        f55961Y = enumC17493j2;
        EnumC17493j[] enumC17493jArr = {enumC17493j, enumC17493j2, new EnumC17493j("RESPECT_ALL", 2)};
        f55962Z = enumC17493jArr;
        AbstractC7877E4.m8156j(enumC17493jArr);
    }

    public static EnumC17493j valueOf(String str) {
        return (EnumC17493j) Enum.valueOf(EnumC17493j.class, str);
    }

    public static EnumC17493j[] values() {
        return (EnumC17493j[]) f55962Z.clone();
    }
}
