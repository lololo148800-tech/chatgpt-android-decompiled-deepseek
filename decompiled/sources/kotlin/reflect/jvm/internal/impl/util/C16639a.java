package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16639a implements Check {

    /* JADX INFO: renamed from: a */
    public static final C16639a f53307a = new C16639a();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.getValueParameters().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        AbstractC16544l.m18091d(valueParameterDescriptor);
        KotlinType kotlinTypeCreateKPropertyStarType = companion.createKPropertyStarType(DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (kotlinTypeCreateKPropertyStarType == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        return TypeUtilsKt.isSubtypeOf(kotlinTypeCreateKPropertyStarType, TypeUtilsKt.makeNotNullable(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
