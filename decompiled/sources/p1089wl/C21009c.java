package p1089wl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p265Kb.C4612e;
import p523V9.AbstractC8239y5;

/* JADX INFO: renamed from: wl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21009c {

    /* JADX INFO: renamed from: e */
    public static final ArrayList f66863e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C4612e f66864a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8239y5 f66865b;

    /* JADX INFO: renamed from: c */
    public List f66866c;

    /* JADX INFO: renamed from: d */
    public boolean f66867d;

    public C21009c(C4612e phase, AbstractC8239y5 abstractC8239y5) {
        AbstractC16544l.m18094g(phase, "phase");
        ArrayList arrayList = f66863e;
        AbstractC16544l.m18092e(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        List interceptors = AbstractC16529F.m18078b(arrayList);
        AbstractC16544l.m18094g(interceptors, "interceptors");
        this.f66864a = phase;
        this.f66865b = abstractC8239y5;
        this.f66866c = interceptors;
        this.f66867d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final String toString() {
        return "Phase `" + this.f66864a.f15034Z + "`, " + this.f66866c.size() + " handlers";
    }
}
