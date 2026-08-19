package sg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19568j {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19568j f62149Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19568j f62150Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19568j f62151o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC19568j f62152p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC19568j[] f62153q0;

    static {
        EnumC19568j enumC19568j = new EnumC19568j("URL", 0);
        f62149Y = enumC19568j;
        EnumC19568j enumC19568j2 = new EnumC19568j("MULTI_LINE_TEXT", 1);
        f62150Z = enumC19568j2;
        EnumC19568j enumC19568j3 = new EnumC19568j("SINGLE_LINE_TEXT", 2);
        f62151o0 = enumC19568j3;
        EnumC19568j enumC19568j4 = new EnumC19568j("EMAIL", 3);
        f62152p0 = enumC19568j4;
        EnumC19568j[] enumC19568jArr = {enumC19568j, enumC19568j2, enumC19568j3, enumC19568j4};
        f62153q0 = enumC19568jArr;
        AbstractC7877E4.m8156j(enumC19568jArr);
    }

    public static EnumC19568j valueOf(String str) {
        return (EnumC19568j) Enum.valueOf(EnumC19568j.class, str);
    }

    public static EnumC19568j[] values() {
        return (EnumC19568j[]) f62153q0.clone();
    }
}
