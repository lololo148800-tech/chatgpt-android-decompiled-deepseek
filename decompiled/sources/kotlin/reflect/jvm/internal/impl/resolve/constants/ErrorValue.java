package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import mm.C17296C;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ErrorValue extends ConstantValue<C17296C> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ErrorValue create(String message) {
            AbstractC16544l.m18094g(message, "message");
            return new ErrorValueWithMessage(message);
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {

        /* JADX INFO: renamed from: b */
        public final String f52881b;

        public ErrorValueWithMessage(String message) {
            AbstractC16544l.m18094g(message, "message");
            this.f52881b = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public String toString() {
            return this.f52881b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public ErrorType getType(ModuleDescriptor module) {
            AbstractC16544l.m18094g(module, "module");
            return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f52881b);
        }
    }

    public ErrorValue() {
        super(C17296C.f55119a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public C17296C getValue() {
        throw new UnsupportedOperationException();
    }
}
