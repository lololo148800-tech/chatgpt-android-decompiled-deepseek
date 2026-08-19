package p747fb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fb.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13607a implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13607a f42988Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC13607a[] f42989Z;

    static {
        EnumC13607a enumC13607a = new EnumC13607a("INSTANCE", 0);
        f42988Y = enumC13607a;
        f42989Z = new EnumC13607a[]{enumC13607a};
    }

    public static EnumC13607a valueOf(String str) {
        return (EnumC13607a) Enum.valueOf(EnumC13607a.class, str);
    }

    public static EnumC13607a[] values() {
        return (EnumC13607a[]) f42989Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
