package p523V9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V9.S */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7983S {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7983S f25247Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC7983S[] f25248Z;

    static {
        EnumC7983S enumC7983S = new EnumC7983S("DEFAULT", 0);
        f25247Y = enumC7983S;
        f25248Z = new EnumC7983S[]{enumC7983S, new EnumC7983S("SIGNED", 1), new EnumC7983S("FIXED", 2)};
    }

    public static EnumC7983S[] values() {
        return (EnumC7983S[]) f25248Z.clone();
    }
}
