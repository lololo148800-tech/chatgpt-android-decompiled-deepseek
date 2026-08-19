package p904nb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nb.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17553j implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17553j f56156Y;

    /* JADX INFO: renamed from: Z */
    public static final Handler f56157Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC17553j[] f56158o0;

    static {
        EnumC17553j enumC17553j = new EnumC17553j("INSTANCE", 0);
        f56156Y = enumC17553j;
        f56158o0 = new EnumC17553j[]{enumC17553j};
        f56157Z = new Handler(Looper.getMainLooper());
    }

    public static EnumC17553j valueOf(String str) {
        return (EnumC17553j) Enum.valueOf(EnumC17553j.class, str);
    }

    public static EnumC17553j[] values() {
        return (EnumC17553j[]) f56158o0.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f56157Z.post(runnable);
    }
}
