package p501Ub;

import java.util.concurrent.Executor;
import p037B9.MeDP.MpoABj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ub.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7610l implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7610l f24056Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC7610l[] f24057Z;

    static {
        EnumC7610l enumC7610l = new EnumC7610l(MpoABj.rKzIQr, 0);
        f24056Y = enumC7610l;
        f24057Z = new EnumC7610l[]{enumC7610l};
    }

    public static EnumC7610l[] values() {
        return (EnumC7610l[]) f24057Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C7603e.m7948a().f24039a.post(runnable);
    }
}
