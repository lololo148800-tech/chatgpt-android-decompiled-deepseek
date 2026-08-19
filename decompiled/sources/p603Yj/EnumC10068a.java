package p603Yj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10068a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10068a f29813Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10068a f29814Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC10068a[] f29815o0;

    static {
        EnumC10068a enumC10068a = new EnumC10068a("Failed", 0);
        f29813Y = enumC10068a;
        EnumC10068a enumC10068a2 = new EnumC10068a("Passed", 1);
        f29814Z = enumC10068a2;
        EnumC10068a[] enumC10068aArr = {enumC10068a, enumC10068a2};
        f29815o0 = enumC10068aArr;
        AbstractC7877E4.m8156j(enumC10068aArr);
    }

    public static EnumC10068a valueOf(String str) {
        return (EnumC10068a) Enum.valueOf(EnumC10068a.class, str);
    }

    public static EnumC10068a[] values() {
        return (EnumC10068a[]) f29815o0.clone();
    }
}
