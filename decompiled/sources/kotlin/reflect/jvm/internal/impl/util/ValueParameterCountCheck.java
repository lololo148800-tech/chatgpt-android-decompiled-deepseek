package kotlin.reflect.jvm.internal.impl.util;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p001A.AbstractC0010F;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a */
    public final String f53304a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f53305b;

        /* JADX WARN: Illegal instructions before constructor call */
        public AtLeast(int i10) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "must have at least ", " value parameter");
            sbM11057o.append(i10 > 1 ? "s" : "");
            super(sbM11057o.toString(), null);
            this.f53305b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f53305b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f53306b;

        public Equals(int i10) {
            super(AbstractC0010F.m19c(i10, "must have exactly ", " value parameters"), null);
            this.f53306b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f53306b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters INSTANCE = new NoValueParameters("must have no value parameters", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter INSTANCE = new SingleValueParameter("must have a single value parameter", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53304a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f53304a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
