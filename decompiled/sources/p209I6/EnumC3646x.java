package p209I6;

import p011A9.p012Ra.ahZQMZ;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I6.x */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3646x {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3646x f11129Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC3646x[] f11130Z;

    static {
        EnumC3646x enumC3646x = new EnumC3646x(ahZQMZ.FQiIthZvxQPW, 0);
        f11129Y = enumC3646x;
        EnumC3646x[] enumC3646xArr = {enumC3646x, new EnumC3646x("Binary", 1)};
        f11130Z = enumC3646xArr;
        AbstractC7877E4.m8156j(enumC3646xArr);
    }

    public static EnumC3646x valueOf(String str) {
        return (EnumC3646x) Enum.valueOf(EnumC3646x.class, str);
    }

    public static EnumC3646x[] values() {
        return (EnumC3646x[]) f11130Z.clone();
    }
}
