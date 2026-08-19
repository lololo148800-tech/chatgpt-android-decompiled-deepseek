package p610Z1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z1.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10146m implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10146m f30071Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC10146m[] f30072Z;

    static {
        EnumC10146m enumC10146m = new EnumC10146m("INSTANCE", 0);
        f30071Y = enumC10146m;
        f30072Z = new EnumC10146m[]{enumC10146m};
    }

    public static EnumC10146m valueOf(String str) {
        return (EnumC10146m) Enum.valueOf(EnumC10146m.class, str);
    }

    public static EnumC10146m[] values() {
        return (EnumC10146m[]) f30072Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
