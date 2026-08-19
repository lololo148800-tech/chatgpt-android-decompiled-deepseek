package p103Dn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Dn.F0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2131F0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC2131F0 f6526Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC2131F0 f6527Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC2131F0 f6528o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC2131F0[] f6529p0;

    static {
        EnumC2131F0 enumC2131F0 = new EnumC2131F0("START", 0);
        f6526Y = enumC2131F0;
        EnumC2131F0 enumC2131F1 = new EnumC2131F0("STOP", 1);
        f6527Z = enumC2131F1;
        EnumC2131F0 enumC2131F2 = new EnumC2131F0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f6528o0 = enumC2131F2;
        EnumC2131F0[] enumC2131F0Arr = {enumC2131F0, enumC2131F1, enumC2131F2};
        f6529p0 = enumC2131F0Arr;
        AbstractC7877E4.m8156j(enumC2131F0Arr);
    }

    public static EnumC2131F0 valueOf(String str) {
        return (EnumC2131F0) Enum.valueOf(EnumC2131F0.class, str);
    }

    public static EnumC2131F0[] values() {
        return (EnumC2131F0[]) f6529p0.clone();
    }
}
