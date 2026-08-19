package cn;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.C16573a;

/* JADX INFO: renamed from: cn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C11794c extends AbstractC11792a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16573a f35757b;

    public C11794c(C16573a c16573a) {
        this.f35757b = c16573a;
    }

    @Override // cn.AbstractC11792a
    /* JADX INFO: renamed from: b */
    public final void mo13060b(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
        }
        this.f35757b.f52111a.f52107f = strArr;
    }
}
