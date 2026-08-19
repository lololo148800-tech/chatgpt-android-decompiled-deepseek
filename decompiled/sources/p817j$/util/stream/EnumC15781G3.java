package p817j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.G3 */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15781G3 {
    public static final EnumC15781G3 MAYBE_MORE;
    public static final EnumC15781G3 NO_MORE;
    public static final EnumC15781G3 UNLIMITED;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15781G3[] f49073a;

    static {
        EnumC15781G3 enumC15781G3 = new EnumC15781G3("NO_MORE", 0);
        NO_MORE = enumC15781G3;
        EnumC15781G3 enumC15781G4 = new EnumC15781G3("MAYBE_MORE", 1);
        MAYBE_MORE = enumC15781G4;
        EnumC15781G3 enumC15781G5 = new EnumC15781G3("UNLIMITED", 2);
        UNLIMITED = enumC15781G5;
        f49073a = new EnumC15781G3[]{enumC15781G3, enumC15781G4, enumC15781G5};
    }

    public static EnumC15781G3 valueOf(String str) {
        return (EnumC15781G3) Enum.valueOf(EnumC15781G3.class, str);
    }

    public static EnumC15781G3[] values() {
        return (EnumC15781G3[]) f49073a.clone();
    }
}
