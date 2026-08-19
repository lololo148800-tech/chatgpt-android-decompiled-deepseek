package p838jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC16225f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16225f f50340Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC16225f[] f50341Z;

    static {
        EnumC16225f enumC16225f = new EnumC16225f("POSITIVE", 0);
        f50340Y = enumC16225f;
        f50341Z = new EnumC16225f[]{enumC16225f, new EnumC16225f("NEGATIVE", 1), new EnumC16225f("NEUTRAL", 2)};
    }

    public static EnumC16225f valueOf(String str) {
        return (EnumC16225f) Enum.valueOf(EnumC16225f.class, str);
    }

    public static EnumC16225f[] values() {
        return (EnumC16225f[]) f50341Z.clone();
    }
}
