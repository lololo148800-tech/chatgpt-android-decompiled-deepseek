package p817j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.F */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15579F {
    public static final EnumC15579F ALWAYS;
    public static final EnumC15579F EXCEEDS_PAD;
    public static final EnumC15579F NEVER;
    public static final EnumC15579F NORMAL;
    public static final EnumC15579F NOT_NEGATIVE;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15579F[] f48649a;

    public static EnumC15579F valueOf(String str) {
        return (EnumC15579F) Enum.valueOf(EnumC15579F.class, str);
    }

    public static EnumC15579F[] values() {
        return (EnumC15579F[]) f48649a.clone();
    }

    static {
        EnumC15579F enumC15579F = new EnumC15579F("NORMAL", 0);
        NORMAL = enumC15579F;
        EnumC15579F enumC15579F2 = new EnumC15579F("ALWAYS", 1);
        ALWAYS = enumC15579F2;
        EnumC15579F enumC15579F3 = new EnumC15579F("NEVER", 2);
        NEVER = enumC15579F3;
        EnumC15579F enumC15579F4 = new EnumC15579F("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC15579F4;
        EnumC15579F enumC15579F5 = new EnumC15579F("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC15579F5;
        f48649a = new EnumC15579F[]{enumC15579F, enumC15579F2, enumC15579F3, enumC15579F4, enumC15579F5};
    }

    /* JADX INFO: renamed from: m */
    final boolean m17050m(boolean z6, boolean z10, boolean z11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return (z6 && z10) ? false : true;
        }
        if (iOrdinal == 1 || iOrdinal == 4) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }
}
