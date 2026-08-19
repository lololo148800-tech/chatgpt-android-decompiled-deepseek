package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11103l {
    private static final /* synthetic */ EnumC11103l[] $VALUES;
    public static final C11101j Companion;
    public static final EnumC11103l ON_ANY;
    public static final EnumC11103l ON_CREATE;
    public static final EnumC11103l ON_DESTROY;
    public static final EnumC11103l ON_PAUSE;
    public static final EnumC11103l ON_RESUME;
    public static final EnumC11103l ON_START;
    public static final EnumC11103l ON_STOP;

    static {
        EnumC11103l enumC11103l = new EnumC11103l("ON_CREATE", 0);
        ON_CREATE = enumC11103l;
        EnumC11103l enumC11103l2 = new EnumC11103l("ON_START", 1);
        ON_START = enumC11103l2;
        EnumC11103l enumC11103l3 = new EnumC11103l("ON_RESUME", 2);
        ON_RESUME = enumC11103l3;
        EnumC11103l enumC11103l4 = new EnumC11103l("ON_PAUSE", 3);
        ON_PAUSE = enumC11103l4;
        EnumC11103l enumC11103l5 = new EnumC11103l("ON_STOP", 4);
        ON_STOP = enumC11103l5;
        EnumC11103l enumC11103l6 = new EnumC11103l("ON_DESTROY", 5);
        ON_DESTROY = enumC11103l6;
        EnumC11103l enumC11103l7 = new EnumC11103l("ON_ANY", 6);
        ON_ANY = enumC11103l7;
        $VALUES = new EnumC11103l[]{enumC11103l, enumC11103l2, enumC11103l3, enumC11103l4, enumC11103l5, enumC11103l6, enumC11103l7};
        Companion = new C11101j();
    }

    public static EnumC11103l valueOf(String str) {
        return (EnumC11103l) Enum.valueOf(EnumC11103l.class, str);
    }

    public static EnumC11103l[] values() {
        return (EnumC11103l[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC11104m m12162a() {
        switch (AbstractC11102k.f33473a[ordinal()]) {
            case 1:
            case 2:
                return EnumC11104m.f33476o0;
            case 3:
            case 4:
                return EnumC11104m.f33477p0;
            case 5:
                return EnumC11104m.f33478q0;
            case 6:
                return EnumC11104m.f33474Y;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
