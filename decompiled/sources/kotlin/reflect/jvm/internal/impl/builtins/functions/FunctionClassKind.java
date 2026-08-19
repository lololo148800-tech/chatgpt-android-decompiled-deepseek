package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassKind {
    public static final Companion Companion;
    public static final FunctionClassKind Function;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    public static final FunctionClassKind SuspendFunction;
    public static final FunctionClassKind UNKNOWN;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ FunctionClassKind[] f51331Y;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionClassKind getFunctionClassKind(FunctionTypeKind functionTypeKind) {
            AbstractC16544l.m18094g(functionTypeKind, "functionTypeKind");
            if (functionTypeKind.equals(FunctionTypeKind.Function.INSTANCE)) {
                return FunctionClassKind.Function;
            }
            if (functionTypeKind.equals(FunctionTypeKind.SuspendFunction.INSTANCE)) {
                return FunctionClassKind.SuspendFunction;
            }
            if (functionTypeKind.equals(FunctionTypeKind.KFunction.INSTANCE)) {
                return FunctionClassKind.KFunction;
            }
            return functionTypeKind.equals(FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }
    }

    static {
        FunctionClassKind functionClassKind = new FunctionClassKind("Function", 0);
        Function = functionClassKind;
        FunctionClassKind functionClassKind2 = new FunctionClassKind("SuspendFunction", 1);
        SuspendFunction = functionClassKind2;
        FunctionClassKind functionClassKind3 = new FunctionClassKind("KFunction", 2);
        KFunction = functionClassKind3;
        FunctionClassKind functionClassKind4 = new FunctionClassKind("KSuspendFunction", 3);
        KSuspendFunction = functionClassKind4;
        FunctionClassKind functionClassKind5 = new FunctionClassKind("UNKNOWN", 4);
        UNKNOWN = functionClassKind5;
        FunctionClassKind[] functionClassKindArr = {functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4, functionClassKind5};
        f51331Y = functionClassKindArr;
        AbstractC7877E4.m8156j(functionClassKindArr);
        Companion = new Companion(null);
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) f51331Y.clone();
    }
}
