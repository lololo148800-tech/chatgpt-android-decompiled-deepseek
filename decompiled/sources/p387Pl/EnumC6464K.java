package p387Pl;

import p025An.C0644w;
import p523V9.AbstractC7877E4;
import p793ho.EnumC14686X2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pl.K */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6464K {
    public static final C6463J Companion;

    /* JADX INFO: renamed from: Y */
    public static final EnumC6464K f20969Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6464K f20970Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6464K f20971o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6464K f20972p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC6464K[] f20973q0;

    static {
        EnumC6464K enumC6464K = new EnumC6464K("CAMERA", 0);
        f20969Y = enumC6464K;
        EnumC6464K enumC6464K2 = new EnumC6464K("MICROPHONE", 1);
        f20970Z = enumC6464K2;
        EnumC6464K enumC6464K3 = new EnumC6464K("SCREEN_SHARE", 2);
        f20971o0 = enumC6464K3;
        EnumC6464K enumC6464K4 = new EnumC6464K("UNKNOWN", 3);
        f20972p0 = enumC6464K4;
        EnumC6464K[] enumC6464KArr = {enumC6464K, enumC6464K2, enumC6464K3, enumC6464K4};
        f20973q0 = enumC6464KArr;
        AbstractC7877E4.m8156j(enumC6464KArr);
        Companion = new C6463J();
    }

    public static EnumC6464K valueOf(String str) {
        return (EnumC6464K) Enum.valueOf(EnumC6464K.class, str);
    }

    public static EnumC6464K[] values() {
        return (EnumC6464K[]) f20973q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC14686X2 m7049a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return EnumC14686X2.CAMERA;
        }
        if (iOrdinal == 1) {
            return EnumC14686X2.MICROPHONE;
        }
        if (iOrdinal == 2) {
            return EnumC14686X2.SCREEN_SHARE;
        }
        if (iOrdinal == 3) {
            return EnumC14686X2.UNKNOWN;
        }
        throw new C0644w();
    }
}
