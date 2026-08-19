package p571X9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import nl.AbstractC17649c;
import nl.C17650d;
import nl.C17654h;
import p444S4.ThreadFactoryC6996b;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: X9.q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9351q3 {
    /* JADX INFO: renamed from: a */
    public static final ExecutorService m9941a(boolean z6) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC6996b(z6));
        AbstractC16544l.m18093f(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: renamed from: b */
    public static final C17650d m9942b(AbstractC17649c abstractC17649c, AbstractC17649c abstractC17649c2) {
        return new C17650d(AbstractC17681o.m19382k(abstractC17649c, abstractC17649c2));
    }

    /* JADX INFO: renamed from: c */
    public static final C17654h m9943c(AbstractC17649c abstractC17649c, AbstractC17649c abstractC17649c2) {
        return new C17654h(AbstractC17681o.m19382k(abstractC17649c, abstractC17649c2));
    }
}
