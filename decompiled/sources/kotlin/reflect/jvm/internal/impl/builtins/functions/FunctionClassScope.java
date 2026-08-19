package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(StorageManager storageManager, FunctionClassDescriptor containingClass) {
        super(storageManager, containingClass);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    /* JADX INFO: renamed from: a */
    public final List mo5681a() {
        String str = SfpOlmlMATQ.WHg;
        ClassDescriptor classDescriptor = this.f52931a;
        AbstractC16544l.m18092e(classDescriptor, str);
        FunctionTypeKind functionTypeKind = ((FunctionClassDescriptor) classDescriptor).getFunctionTypeKind();
        if (AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.Function.INSTANCE)) {
            return AbstractC9393x3.m9974d(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, false));
        }
        return AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? AbstractC9393x3.m9974d(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, true)) : C17689w.f56480Y;
    }
}
