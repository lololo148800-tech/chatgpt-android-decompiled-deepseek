package p697d5;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d5.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13026i implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13026i f41329Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC13026i[] f41330Z;

    static {
        EnumC13026i enumC13026i = new EnumC13026i("INSTANCE", 0);
        f41329Y = enumC13026i;
        f41330Z = new EnumC13026i[]{enumC13026i};
    }

    public static EnumC13026i valueOf(String str) {
        return (EnumC13026i) Enum.valueOf(EnumC13026i.class, str);
    }

    public static EnumC13026i[] values() {
        return (EnumC13026i[]) f41330Z.clone();
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
