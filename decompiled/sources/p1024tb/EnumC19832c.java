package p1024tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tb.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC19832c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19832c f62891Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC19832c[] f62892Z;

    static {
        EnumC19832c enumC19832c = new EnumC19832c("DEFAULT", 0);
        f62891Y = enumC19832c;
        f62892Z = new EnumC19832c[]{enumC19832c, new EnumC19832c("SIGNED", 1), new EnumC19832c("FIXED", 2)};
    }

    public static EnumC19832c valueOf(String str) {
        return (EnumC19832c) Enum.valueOf(EnumC19832c.class, str);
    }

    public static EnumC19832c[] values() {
        return (EnumC19832c[]) f62892Z.clone();
    }
}
