package p531Vj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vj.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8363d0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8363d0 f26046Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8363d0 f26047Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8363d0 f26048o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC8363d0[] f26049p0;

    static {
        EnumC8363d0 enumC8363d0 = new EnumC8363d0("PermissionGranted", 0);
        f26046Y = enumC8363d0;
        EnumC8363d0 enumC8363d1 = new EnumC8363d0("PermissionRejected", 1);
        f26047Z = enumC8363d1;
        EnumC8363d0 enumC8363d2 = new EnumC8363d0("SettingsLaunched", 2);
        f26048o0 = enumC8363d2;
        EnumC8363d0[] enumC8363d0Arr = {enumC8363d0, enumC8363d1, enumC8363d2};
        f26049p0 = enumC8363d0Arr;
        AbstractC7877E4.m8156j(enumC8363d0Arr);
    }

    public static EnumC8363d0 valueOf(String str) {
        return (EnumC8363d0) Enum.valueOf(EnumC8363d0.class, str);
    }

    public static EnumC8363d0[] values() {
        return (EnumC8363d0[]) f26049p0.clone();
    }
}
