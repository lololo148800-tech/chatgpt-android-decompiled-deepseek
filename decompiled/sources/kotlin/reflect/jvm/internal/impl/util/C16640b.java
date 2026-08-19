package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16640b implements Check {

    /* JADX INFO: renamed from: a */
    public static final C16640b f53308a = new C16640b();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            AbstractC16544l.m18091d(valueParameterDescriptor);
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
