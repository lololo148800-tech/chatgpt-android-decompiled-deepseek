package p201Hn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Hn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3513b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3513b f10616Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3513b f10617Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3513b f10618o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3513b f10619p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3513b f10620q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC3513b[] f10621r0;

    static {
        EnumC3513b enumC3513b = new EnumC3513b("CPU_ACQUIRED", 0);
        f10616Y = enumC3513b;
        EnumC3513b enumC3513b2 = new EnumC3513b("BLOCKING", 1);
        f10617Z = enumC3513b2;
        EnumC3513b enumC3513b3 = new EnumC3513b("PARKING", 2);
        f10618o0 = enumC3513b3;
        EnumC3513b enumC3513b4 = new EnumC3513b("DORMANT", 3);
        f10619p0 = enumC3513b4;
        EnumC3513b enumC3513b5 = new EnumC3513b("TERMINATED", 4);
        f10620q0 = enumC3513b5;
        EnumC3513b[] enumC3513bArr = {enumC3513b, enumC3513b2, enumC3513b3, enumC3513b4, enumC3513b5};
        f10621r0 = enumC3513bArr;
        AbstractC7877E4.m8156j(enumC3513bArr);
    }

    public static EnumC3513b valueOf(String str) {
        return (EnumC3513b) Enum.valueOf(EnumC3513b.class, str);
    }

    public static EnumC3513b[] values() {
        return (EnumC3513b[]) f10621r0.clone();
    }
}
