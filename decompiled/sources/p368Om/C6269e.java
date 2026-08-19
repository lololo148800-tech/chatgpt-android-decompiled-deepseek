package p368Om;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import mm.C17309l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Om.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6269e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20365Y;

    /* JADX INFO: renamed from: Z */
    public final JvmBuiltInsCustomizer f20366Z;

    public /* synthetic */ C6269e(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, int i10) {
        this.f20365Y = i10;
        this.f20366Z = jvmBuiltInsCustomizer;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6 = false;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f20366Z;
        switch (this.f20365Y) {
            case 0:
                C17309l c17309l = (C17309l) obj;
                InterfaceC3776x[] interfaceC3776xArr = JvmBuiltInsCustomizer.f51371i;
                AbstractC16544l.m18094g(c17309l, "<destruct>");
                String str = (String) c17309l.f55136Y;
                String str2 = (String) c17309l.f55137Z;
                return Annotations.Companion.create(AbstractC9393x3.m9974d(AnnotationUtilKt.createDeprecatedAnnotation(jvmBuiltInsCustomizer.f51372a.getBuiltIns(), AbstractC0010F.m20d(Separators.QUOTE, str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), AbstractC10763a.m11052j(str2, "()"), "HIDDEN", false)));
            default:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                InterfaceC3776x[] interfaceC3776xArr2 = JvmBuiltInsCustomizer.f51371i;
                if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
                    JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.f51373b;
                    DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
