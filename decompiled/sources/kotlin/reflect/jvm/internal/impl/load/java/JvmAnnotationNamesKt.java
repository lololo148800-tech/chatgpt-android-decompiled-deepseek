package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.C17309l;
import p009A7.FlM.nkFZpTrMPpn;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a */
    public static final FqName f51758a;

    /* JADX INFO: renamed from: b */
    public static final FqName f51759b;

    /* JADX INFO: renamed from: c */
    public static final FqName f51760c;

    /* JADX INFO: renamed from: d */
    public static final FqName f51761d;

    /* JADX INFO: renamed from: e */
    public static final FqName f51762e;

    /* JADX INFO: renamed from: f */
    public static final FqName f51763f;

    /* JADX INFO: renamed from: g */
    public static final FqName f51764g;

    /* JADX INFO: renamed from: h */
    public static final FqName f51765h;

    /* JADX INFO: renamed from: i */
    public static final FqName f51766i;

    /* JADX INFO: renamed from: j */
    public static final Set f51767j;

    /* JADX INFO: renamed from: k */
    public static final Set f51768k;

    /* JADX INFO: renamed from: l */
    public static final Set f51769l;

    /* JADX INFO: renamed from: m */
    public static final Set f51770m;

    /* JADX INFO: renamed from: n */
    public static final Set f51771n;

    /* JADX INFO: renamed from: o */
    public static final Set f51772o;

    /* JADX INFO: renamed from: p */
    public static final Object f51773p;

    /* JADX INFO: renamed from: q */
    public static final FqName f51774q;

    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return f51767j;
    }

    public static final Set<FqName> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return f51770m;
    }

    public static final FqName getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return f51764g;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return f51765h;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return f51766i;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return f51761d;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return f51763f;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return f51762e;
    }

    public static final FqName getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f51759b;
    }

    public static final FqName getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return f51760c;
    }

    public static final FqName getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f51758a;
    }

    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return f51772o;
    }

    public static final Set<FqName> getNOT_NULL_ANNOTATIONS() {
        return f51768k;
    }

    public static final Set<FqName> getNULLABLE_ANNOTATIONS() {
        return f51769l;
    }

    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return f51771n;
    }

    public static final FqName getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return f51774q;
    }

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f51758a = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f51759b = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f51760c = fqName8;
        f51761d = new FqName("javax.annotation.meta.TypeQualifier");
        f51762e = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f51763f = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f51764g = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f51765h = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f51766i = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f51767j = AbstractC17678l.m19293P(new FqName[]{fqName9, fqName11});
        Set setM19293P = AbstractC17678l.m19293P(new FqName[]{JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull")});
        f51768k = setM19293P;
        Set setM19293P2 = AbstractC17678l.m19293P(new FqName[]{JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName(nkFZpTrMPpn.YdUxiP), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable")});
        f51769l = setM19293P2;
        f51770m = AbstractC17678l.m19293P(new FqName[]{fqName3, fqName7});
        AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19266f(AbstractC17665J.m19266f(new LinkedHashSet(), setM19293P), setM19293P2), fqName9), fqName2), fqName6), fqName8);
        f51771n = AbstractC17678l.m19293P(new FqName[]{JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION});
        f51772o = AbstractC17678l.m19293P(new FqName[]{JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION});
        f51773p = AbstractC17659D.m19244f(new C17309l(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), new C17309l(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), new C17309l(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), new C17309l(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
        f51774q = new FqName("kotlin.annotations.jvm.UnderMigration");
    }
}
