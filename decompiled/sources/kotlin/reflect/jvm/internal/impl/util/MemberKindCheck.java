package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MemberKindCheck implements Check {

    /* JADX INFO: renamed from: a */
    public final String f53292a;

    public static final class Member extends MemberKindCheck {
        public static final Member INSTANCE = new Member("must be a member function", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {
        public static final MemberOrExtension INSTANCE = new MemberOrExtension("must be a member or an extension function", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53292a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f53292a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
