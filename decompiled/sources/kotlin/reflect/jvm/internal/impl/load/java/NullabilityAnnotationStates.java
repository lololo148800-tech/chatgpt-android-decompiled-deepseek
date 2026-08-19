package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public interface NullabilityAnnotationStates<T> {
    public static final Companion Companion = Companion.f51775a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51775a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final NullabilityAnnotationStatesImpl f51776b = new NullabilityAnnotationStatesImpl(C17690x.f56481Y);

        public final NullabilityAnnotationStates getEMPTY() {
            return f51776b;
        }
    }

    T get(FqName fqName);
}
