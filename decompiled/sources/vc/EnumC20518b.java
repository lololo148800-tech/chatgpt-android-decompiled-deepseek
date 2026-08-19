package vc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20518b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20518b f65132Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20518b f65133Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20518b f65134o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC20518b[] f65135p0;

    static {
        EnumC20518b enumC20518b = new EnumC20518b("IDLE", 0);
        f65132Y = enumC20518b;
        EnumC20518b enumC20518b2 = new EnumC20518b("SYNCING", 1);
        f65133Z = enumC20518b2;
        EnumC20518b enumC20518b3 = new EnumC20518b("STOPPED", 2);
        f65134o0 = enumC20518b3;
        f65135p0 = new EnumC20518b[]{enumC20518b, enumC20518b2, enumC20518b3};
    }

    public static EnumC20518b valueOf(String str) {
        return (EnumC20518b) Enum.valueOf(EnumC20518b.class, str);
    }

    public static EnumC20518b[] values() {
        return (EnumC20518b[]) f65135p0.clone();
    }
}
