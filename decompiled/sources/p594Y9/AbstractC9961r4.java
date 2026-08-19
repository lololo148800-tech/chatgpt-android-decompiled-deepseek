package p594Y9;

import ao.C11149X;
import ao.C11158d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;

/* JADX INFO: renamed from: Y9.r4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9961r4 {
    /* JADX INFO: renamed from: a */
    public static final C11158d m10614a(KSerializer elementSerializer) {
        AbstractC16544l.m18094g(elementSerializer, "elementSerializer");
        return new C11158d(elementSerializer, 0);
    }

    /* JADX INFO: renamed from: b */
    public static final KSerializer m10615b(KSerializer kSerializer) {
        AbstractC16544l.m18094g(kSerializer, "<this>");
        return kSerializer.getDescriptor().mo10680c() ? kSerializer : new C11149X(kSerializer);
    }
}
