package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSubstitution$Companion$EMPTY$1 extends TypeSubstitution {
    public Void get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "Empty TypeSubstitution";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ TypeProjection mo22592get(KotlinType kotlinType) {
        return (TypeProjection) get(kotlinType);
    }
}
