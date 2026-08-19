package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: a */
    public final Map f51777a;

    /* JADX INFO: renamed from: b */
    public final MemoizedFunctionToNullable f51778b;

    public NullabilityAnnotationStatesImpl(Map<FqName, ? extends T> states) {
        AbstractC16544l.m18094g(states, "states");
        this.f51777a = states;
        MemoizedFunctionToNullable memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = new LockBasedStorageManager("Java nullability annotation states").createMemoizedFunctionWithNullableValues(new C1756x(this, 10));
        AbstractC16544l.m18093f(memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues, "createMemoizedFunctionWithNullableValues(...)");
        this.f51778b = memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    public T get(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return (T) this.f51778b.invoke(fqName);
    }
}
