package p247Jj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Jj.u */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4458u {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4458u f14584Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4458u f14585Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC4458u[] f14586o0;

    static {
        EnumC4458u enumC4458u = new EnumC4458u("PRODUCTION", 0);
        f14584Y = enumC4458u;
        EnumC4458u enumC4458u2 = new EnumC4458u("SANDBOX", 1);
        f14585Z = enumC4458u2;
        EnumC4458u[] enumC4458uArr = {enumC4458u, enumC4458u2};
        f14586o0 = enumC4458uArr;
        AbstractC7877E4.m8156j(enumC4458uArr);
    }

    public static EnumC4458u valueOf(String str) {
        return (EnumC4458u) Enum.valueOf(EnumC4458u.class, str);
    }

    public static EnumC4458u[] values() {
        return (EnumC4458u[]) f14586o0.clone();
    }
}
