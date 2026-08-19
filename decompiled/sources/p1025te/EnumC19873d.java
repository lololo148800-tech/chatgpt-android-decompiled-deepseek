package p1025te;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: te.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19873d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19873d f63010Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19873d f63011Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC19873d[] f63012o0;

    static {
        EnumC19873d enumC19873d = new EnumC19873d("Camera", 0);
        f63010Y = enumC19873d;
        EnumC19873d enumC19873d2 = new EnumC19873d("Gallery", 1);
        f63011Z = enumC19873d2;
        EnumC19873d[] enumC19873dArr = {enumC19873d, enumC19873d2};
        f63012o0 = enumC19873dArr;
        AbstractC7877E4.m8156j(enumC19873dArr);
    }

    public static EnumC19873d valueOf(String str) {
        return (EnumC19873d) Enum.valueOf(EnumC19873d.class, str);
    }

    public static EnumC19873d[] values() {
        return (EnumC19873d[]) f63012o0.clone();
    }
}
