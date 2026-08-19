package p173Gj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Gj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3098e {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3098e f9321Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3098e f9322Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3098e f9323o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3098e[] f9324p0;

    static {
        EnumC3098e enumC3098e = new EnumC3098e("Connecting", 0);
        f9321Y = enumC3098e;
        EnumC3098e enumC3098e2 = new EnumC3098e("Connected", 1);
        f9322Z = enumC3098e2;
        EnumC3098e enumC3098e3 = new EnumC3098e("Disconnected", 2);
        f9323o0 = enumC3098e3;
        EnumC3098e[] enumC3098eArr = {enumC3098e, enumC3098e2, enumC3098e3};
        f9324p0 = enumC3098eArr;
        AbstractC7877E4.m8156j(enumC3098eArr);
    }

    public static EnumC3098e valueOf(String str) {
        return (EnumC3098e) Enum.valueOf(EnumC3098e.class, str);
    }

    public static EnumC3098e[] values() {
        return (EnumC3098e[]) f9324p0.clone();
    }
}
