package p648an;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: an.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10757e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31962Y;

    /* JADX INFO: renamed from: Z */
    public final String f31963Z;

    /* JADX INFO: renamed from: o0 */
    public final String f31964o0;

    public /* synthetic */ C10757e(int i10, String str, String str2) {
        this.f31962Y = i10;
        this.f31963Z = str;
        this.f31964o0 = str2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        String str = this.f31964o0;
        String str2 = this.f31963Z;
        SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
        switch (this.f31962Y) {
            case 0:
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f51990b;
                function.parameter(str2, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f51989a;
                function.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                function.returns(str2, javaTypeQualifiers3);
                break;
            case 1:
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.f51990b;
                function.parameter(str2, javaTypeQualifiers5);
                function.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                function.returns(str2, javaTypeQualifiers5);
                break;
            case 2:
                JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.f51990b;
                function.parameter(str2, javaTypeQualifiers7);
                JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.f51989a;
                function.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, PredefinedEnhancementInfoKt.f51991c, javaTypeQualifiers8);
                function.returns(str2, javaTypeQualifiers8);
                break;
            case 3:
                JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.f51990b;
                function.parameter(str2, javaTypeQualifiers10);
                JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.f51991c;
                function.parameter(str2, javaTypeQualifiers11);
                JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.f51989a;
                function.parameter(str, javaTypeQualifiers10, javaTypeQualifiers11, javaTypeQualifiers11, javaTypeQualifiers12);
                function.returns(str2, javaTypeQualifiers12);
                break;
            case 4:
                JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.f51991c;
                function.parameter(str2, javaTypeQualifiers14);
                function.returns(str, PredefinedEnhancementInfoKt.f51990b, javaTypeQualifiers14);
                break;
            default:
                JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                function.parameter(str2, PredefinedEnhancementInfoKt.f51989a);
                function.returns(str, PredefinedEnhancementInfoKt.f51990b, PredefinedEnhancementInfoKt.f51991c);
                break;
        }
        return c17296c;
    }
}
