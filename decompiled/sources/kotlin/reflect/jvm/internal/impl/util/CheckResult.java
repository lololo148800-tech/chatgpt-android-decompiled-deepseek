package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a */
    public final boolean f53286a;

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName(false, null);
    }

    public static final class IllegalSignature extends CheckResult {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(String error) {
            super(false, null);
            AbstractC16544l.m18094g(error, "error");
        }
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck(true, null);
    }

    public CheckResult(boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53286a = z6;
    }

    public final boolean isSuccess() {
        return this.f53286a;
    }
}
