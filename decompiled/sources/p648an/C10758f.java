package p648an;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: an.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10758f implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31965Y;

    /* JADX INFO: renamed from: Z */
    public final String f31966Z;

    public /* synthetic */ C10758f(String str, int i10) {
        this.f31965Y = i10;
        this.f31966Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        String str = this.f31966Z;
        SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
        switch (this.f31965Y) {
            case 0:
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.returns(str, PredefinedEnhancementInfoKt.f51990b);
                break;
            case 1:
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f51990b;
                function.returns(str, javaTypeQualifiers3, javaTypeQualifiers3);
                break;
            case 2:
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.f51990b;
                function.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5);
                break;
            case 3:
                JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.parameter(str, PredefinedEnhancementInfoKt.f51990b);
                break;
            case 4:
                JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.parameter(str, PredefinedEnhancementInfoKt.f51990b);
                break;
            case 5:
                JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.returns(str, PredefinedEnhancementInfoKt.f51990b);
                break;
            default:
                JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.returns(str, PredefinedEnhancementInfoKt.f51990b);
                break;
        }
        return c17296c;
    }
}
