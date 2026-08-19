package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12000r0 implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC12000r0 f36313Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC12000r0[] f36314Z;

    static {
        EnumC12000r0 enumC12000r0 = new EnumC12000r0("INSTANCE", 0);
        f36313Y = enumC12000r0;
        f36314Z = new EnumC12000r0[]{enumC12000r0};
    }

    public static EnumC12000r0[] values() {
        return (EnumC12000r0[]) f36314Z.clone();
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
