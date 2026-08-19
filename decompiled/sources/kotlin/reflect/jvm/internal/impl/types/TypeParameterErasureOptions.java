package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterErasureOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f53206a;

    /* JADX INFO: renamed from: b */
    public final boolean f53207b;

    public TypeParameterErasureOptions(boolean z6, boolean z10) {
        this.f53206a = z6;
        this.f53207b = z10;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f53207b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f53206a;
    }
}
