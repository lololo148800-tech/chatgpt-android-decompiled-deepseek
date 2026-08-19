package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes2.dex */
public final class ExcludedTypeAnnotations {
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    /* JADX INFO: renamed from: a */
    public static final Set f52840a = AbstractC17678l.m19293P(new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    public final Set<FqName> getInternalAnnotationsForResolve() {
        return f52840a;
    }
}
