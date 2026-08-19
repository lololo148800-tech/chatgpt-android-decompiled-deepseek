package p949pj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pj.V */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18448V {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18448V f58867Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18448V f58868Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC18448V[] f58869o0;

    static {
        EnumC18448V enumC18448V = new EnumC18448V("Front", 0);
        f58867Y = enumC18448V;
        EnumC18448V enumC18448V2 = new EnumC18448V("Back", 1);
        f58868Z = enumC18448V2;
        EnumC18448V[] enumC18448VArr = {enumC18448V, enumC18448V2};
        f58869o0 = enumC18448VArr;
        AbstractC7877E4.m8156j(enumC18448VArr);
    }

    public static EnumC18448V valueOf(String str) {
        return (EnumC18448V) Enum.valueOf(EnumC18448V.class, str);
    }

    public static EnumC18448V[] values() {
        return (EnumC18448V[]) f58869o0.clone();
    }
}
