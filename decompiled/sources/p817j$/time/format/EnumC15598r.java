package p817j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.r */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15598r implements InterfaceC15586f {
    public static final EnumC15598r INSENSITIVE;
    public static final EnumC15598r LENIENT;
    public static final EnumC15598r SENSITIVE;
    public static final EnumC15598r STRICT;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15598r[] f48698a;

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        return true;
    }

    public static EnumC15598r valueOf(String str) {
        return (EnumC15598r) Enum.valueOf(EnumC15598r.class, str);
    }

    public static EnumC15598r[] values() {
        return (EnumC15598r[]) f48698a.clone();
    }

    static {
        EnumC15598r enumC15598r = new EnumC15598r("SENSITIVE", 0);
        SENSITIVE = enumC15598r;
        EnumC15598r enumC15598r2 = new EnumC15598r("INSENSITIVE", 1);
        INSENSITIVE = enumC15598r2;
        EnumC15598r enumC15598r3 = new EnumC15598r("STRICT", 2);
        STRICT = enumC15598r3;
        EnumC15598r enumC15598r4 = new EnumC15598r("LENIENT", 3);
        LENIENT = enumC15598r4;
        f48698a = new EnumC15598r[]{enumC15598r, enumC15598r2, enumC15598r3, enumC15598r4};
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c15603w.m17093m(true);
        } else if (iOrdinal == 1) {
            c15603w.m17093m(false);
        } else if (iOrdinal == 2) {
            c15603w.m17097q(true);
        } else if (iOrdinal == 3) {
            c15603w.m17097q(false);
        }
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
